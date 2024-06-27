/*
 * Copyright (c) 2013, 2023 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */
package com.sun.ts.tests.jms.core20.connectionfactorytests;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.ts.lib.util.TestUtil;
import com.sun.ts.tests.jms.common.JmsTool;

import jakarta.jms.Connection;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSContext;
import jakarta.jms.JMSRuntimeException;
import jakarta.jms.JMSSecurityException;
import jakarta.jms.JMSSecurityRuntimeException;
import jakarta.jms.QueueConnection;
import jakarta.jms.QueueConnectionFactory;
import jakarta.jms.TopicConnection;
import jakarta.jms.TopicConnectionFactory;


public class ClientIT {
	private static final String testName = "com.sun.ts.tests.jms.core20.connectionfactorytests.ClientIT";

	private static final String testDir = System.getProperty("user.dir");

	private static final long serialVersionUID = 1L;

	private static final Logger logger = (Logger) System.getLogger(ClientIT.class.getName());

	// JMS tool which creates and/or looks up the JMS administered objects
	private transient JmsTool tool = null;

	// JMS objects
	private transient ConnectionFactory cf = null;

	private transient QueueConnectionFactory qcf = null;

	private transient TopicConnectionFactory tcf = null;

	private transient JMSContext context = null;

	// Harness req's
	private Properties props = null;

	// properties read
	long timeout;

	String user;

	String password;

	String mode;

	ArrayList connections = null;

	String vehicle = null;

	/*
	 * Utility method to return the session mode as a String
	 */
	private String printSessionMode(int sessionMode) {
		switch (sessionMode) {
		case JMSContext.SESSION_TRANSACTED:
			return "SESSION_TRANSACTED";
		case JMSContext.AUTO_ACKNOWLEDGE:
			return "AUTO_ACKNOWLEDGE";
		case JMSContext.CLIENT_ACKNOWLEDGE:
			return "CLIENT_ACKNOWLEDGE";
		case JMSContext.DUPS_OK_ACKNOWLEDGE:
			return "DUPS_OK_ACKNOWLEDGE";
		default:
			return "UNEXPECTED_SESSIONMODE";
		}
	}

	/* Test setup: */

	/*
	 * setup() is called before each test
	 * 
	 * @class.setup_props: jms_timeout; user; password; platform.mode;
	 * 
	 * @exception Fault
	 */
	@BeforeEach
	public void setup() throws Exception {
		try {

			// get props
			timeout = Long.parseLong(System.getProperty("jms_timeout"));
			user = System.getProperty("user");
			password = System.getProperty("password");
			mode = System.getProperty("platform.mode");

			// check props for errors
			if (timeout < 1) {
				throw new Exception("'jms_timeout' (milliseconds) in must be > 0");
			}
			if (user == null) {
				throw new Exception("'user' is null ");
			}
			if (password == null) {
				throw new Exception("'password' is null ");
			}
			if (mode == null) {
				throw new Exception("'platform.mode' is null");
			}
			connections = new ArrayList(5);
			vehicle = System.getProperty("vehicle");
		} catch (Exception e) {
			TestUtil.printStackTrace(e);
			throw new Exception("Setup failed!", e);
		}
	}

	/* cleanup */

	/*
	 * cleanup() is called after each test
	 * 
	 * @exception Fault
	 */
	@AfterEach
	public void cleanup() throws Exception {
	}

	/*
	 * @testName: qcfCreateJMSContextTest1
	 *
	 * @assertion_ids: JMS:JAVADOC:841;
	 *
	 * @test_Strategy: Creates a JMSContext with the default user identity and an
	 * unspecified sessionMode. Tests API:
	 *
	 * QueueConnectionFactory.createContext() JMSContext.getSessionMode()
	 */
	@Test
	public void qcfCreateJMSContextTest1() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for QUEUE_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for QUEUE_FACTORY");
			tool = new JmsTool(JmsTool.QUEUE_FACTORY, user, password, mode);
			qcf = tool.getQueueConnectionFactory();

			logger.log(Logger.Level.INFO, "Test QueueConnectionFactory.createContext()");
			context = qcf.createContext();
			logger.log(Logger.Level.INFO,
					"Verify that JMSContext.getSessionMode() returns JMSContext.AUTO_ACKNOWLEDGE");
			int expSessionMode = JMSContext.AUTO_ACKNOWLEDGE;
			int actSessionMode = context.getSessionMode();
			if (actSessionMode != expSessionMode) {
				logger.log(Logger.Level.ERROR, "getSessionMode() returned " + printSessionMode(actSessionMode)
						+ ", expected " + printSessionMode(expSessionMode));
				pass = false;
			}
			context.close();
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			TestUtil.printStackTrace(e);
			throw new Exception("qcfCreateJMSContextTest1");
		}

		if (!pass) {
			throw new Exception("qcfCreateJMSContextTest1 failed");
		}
	}

	/*
	 * @testName: qcfCreateJMSContextTest3
	 *
	 * @assertion_ids: JMS:JAVADOC:844;
	 *
	 * @test_Strategy: Creates a JMSContext with the specified user identity and an
	 * unspecified sessionMode. Tests API:
	 *
	 * QueueConnectionFactory.createContext(String, String)
	 * JMSContext.getSessionMode()
	 */
	@Test
	public void qcfCreateJMSContextTest3() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for QUEUE_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for QUEUE_FACTORY");
			tool = new JmsTool(JmsTool.QUEUE_FACTORY, user, password, mode);
			qcf = tool.getQueueConnectionFactory();

			logger.log(Logger.Level.INFO, "Test QueueConnectionFactory.createContext(String, String)");
			context = qcf.createContext(user, password);
			logger.log(Logger.Level.INFO,
					"Verify that JMSContext.getSessionMode() returns JMSContext.AUTO_ACKNOWLEDGE");
			int expSessionMode = JMSContext.AUTO_ACKNOWLEDGE;
			int actSessionMode = context.getSessionMode();
			if (actSessionMode != expSessionMode) {
				logger.log(Logger.Level.ERROR, "getSessionMode() returned " + printSessionMode(actSessionMode)
						+ ", expected " + printSessionMode(expSessionMode));
				pass = false;
			}
			context.close();
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			TestUtil.printStackTrace(e);
			throw new Exception("qcfCreateJMSContextTest3");
		}

		if (!pass) {
			throw new Exception("qcfCreateJMSContextTest3 failed");
		}
	}

	/*
	 * @testName: qcfCreateConnectionTest
	 *
	 * @assertion_ids: JMS:JAVADOC:502;JMS:JAVADOC:504;
	 *
	 * @test_Strategy: Create a connection with the default user identity. Create a
	 * connection with the specified user identity. Tests the following API's:
	 *
	 * QueueConnectionFactory.createConnection()
	 * QueueConnectionFactory.createConnection(String, String)
	 * QueueConnectionFactory.createQueueConnection()
	 * QueueConnectionFactory.createQueueConnection(String, String)
	 */
	@Test
	public void qcfCreateConnectionTest() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for QUEUE_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for QUEUE_FACTORY");
			tool = new JmsTool(JmsTool.QUEUE_FACTORY, user, password, mode);
			qcf = tool.getQueueConnectionFactory();

			logger.log(Logger.Level.INFO, "Test QueueConnectionFactory.createQueueConnection()");
			QueueConnection qc = qcf.createQueueConnection();
			qc.close();

			logger.log(Logger.Level.INFO,
					"Test QueueConnectionFactory.createQueueConnection(String, String) with valid credentials");
			qc = qcf.createQueueConnection(user, password);
			qc.close();

			logger.log(Logger.Level.INFO, "Test QueueConnectionFactory.createConnection()");
			Connection c = qcf.createConnection();
			c.close();

			logger.log(Logger.Level.INFO,
					"Test QueueConnectionFactory.createConnection(String, String) with valid credentials");
			c = qcf.createConnection(user, password);
			c.close();
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			TestUtil.printStackTrace(e);
			throw new Exception("qcfCreateConnectionTest");
		}

		if (!pass) {
			throw new Exception("qcfCreateConnectionTest failed");
		}
	}

	/*
	 * @testName: tcfCreateJMSContextTest1
	 *
	 * @assertion_ids: JMS:JAVADOC:841;
	 *
	 * @test_Strategy: Creates a JMSContext with the default user identity and an
	 * unspecified sessionMode. Tests API:
	 *
	 * TopicConnectionFactory.createContext() JMSContext.getSessionMode()
	 */
	@Test
	public void tcfCreateJMSContextTest1() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for TOPIC_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for TOPIC_FACTORY");
			tool = new JmsTool(JmsTool.TOPIC_FACTORY, user, password, mode);
			tcf = tool.getTopicConnectionFactory();

			logger.log(Logger.Level.INFO, "Test TopicConnectionFactory.createContext()");
			context = tcf.createContext();
			logger.log(Logger.Level.INFO,
					"Verify that JMSContext.getSessionMode() returns JMSContext.AUTO_ACKNOWLEDGE");
			int expSessionMode = JMSContext.AUTO_ACKNOWLEDGE;
			int actSessionMode = context.getSessionMode();
			if (actSessionMode != expSessionMode) {
				logger.log(Logger.Level.ERROR, "getSessionMode() returned " + printSessionMode(actSessionMode)
						+ ", expected " + printSessionMode(expSessionMode));
				pass = false;
			}
			context.close();
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			TestUtil.printStackTrace(e);
			throw new Exception("tcfCreateJMSContextTest1");
		}

		if (!pass) {
			throw new Exception("tcfCreateJMSContextTest1 failed");
		}
	}

	/*
	 * @testName: tcfCreateJMSContextTest3
	 *
	 * @assertion_ids: JMS:JAVADOC:844;
	 *
	 * @test_Strategy: Creates a JMSContext with the specified user identity and an
	 * unspecified sessionMode. Tests API:
	 *
	 * TopicConnectionFactory.createContext(String, String)
	 * JMSContext.getSessionMode()
	 */
	@Test
	public void tcfCreateJMSContextTest3() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for TOPIC_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for TOPIC_FACTORY");
			tool = new JmsTool(JmsTool.TOPIC_FACTORY, user, password, mode);
			tcf = tool.getTopicConnectionFactory();

			logger.log(Logger.Level.INFO, "Test TopicConnectionFactory.createContext(String, String)");
			context = tcf.createContext(user, password);
			logger.log(Logger.Level.INFO,
					"Verify that JMSContext.getSessionMode() returns JMSContext.AUTO_ACKNOWLEDGE");
			int expSessionMode = JMSContext.AUTO_ACKNOWLEDGE;
			int actSessionMode = context.getSessionMode();
			if (actSessionMode != expSessionMode) {
				logger.log(Logger.Level.ERROR, "getSessionMode() returned " + printSessionMode(actSessionMode)
						+ ", expected " + printSessionMode(expSessionMode));
				pass = false;
			}
			context.close();
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			TestUtil.printStackTrace(e);
			throw new Exception("tcfCreateJMSContextTest3");
		}

		if (!pass) {
			throw new Exception("tcfCreateJMSContextTest3 failed");
		}
	}

	/*
	 * @testName: tcfCreateConnectionTest
	 *
	 * @assertion_ids: JMS:JAVADOC:502;JMS:JAVADOC:504;
	 *
	 * @test_Strategy: Create a connection with the default user identity. Create a
	 * connection with the specified user identity. Tests tye following API's:
	 *
	 * TopicConnectionFactory.createConnection()
	 * TopicConnectionFactory.createConnection(String, String)
	 * TopicConnectionFactory.createTopicConnection()
	 * TopicConnectionFactory.createTopicConnection(String, String)
	 */
	@Test
	public void tcfCreateConnectionTest() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for TOPIC_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for TOPIC_FACTORY");
			tool = new JmsTool(JmsTool.TOPIC_FACTORY, user, password, mode);
			tcf = tool.getTopicConnectionFactory();

			logger.log(Logger.Level.INFO, "Test TopicConnectionFactory.createTopicConnection()");
			TopicConnection tc = tcf.createTopicConnection();
			tc.close();

			logger.log(Logger.Level.INFO,
					"Test TopicConnectionFactory.createTopicConnection(String, String) with valid credentials");
			tc = tcf.createTopicConnection(user, password);
			tc.close();

			logger.log(Logger.Level.INFO, "Test TopicConnectionFactory.createConnection()");
			Connection c = tcf.createConnection();
			c.close();

			logger.log(Logger.Level.INFO,
					"Test TopicConnectionFactory.createConnection(String, String) with valid credentials");
			c = tcf.createConnection(user, password);
			c.close();
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			throw new Exception("tcfCreateConnectionTest");
		}

		if (!pass) {
			throw new Exception("tcfCreateConnectionTest failed");
		}
	}

	/*
	 * @testName: createConnectionExceptionTests
	 *
	 * @assertion_ids: JMS:JAVADOC:596;
	 *
	 * @test_Strategy: Try and create a connection with invalid user credentials.
	 * Tests for JMSSecurityException.
	 *
	 * QueueConnectionFactory.createQueueConnection(String, String)
	 * TopicConnectionFactory.createTopicConnection(String, String)
	 */
	@Test
	public void createConnectionExceptionTests() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for QUEUE_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for QUEUE_FACTORY");
			tool = new JmsTool(JmsTool.QUEUE_FACTORY, user, password, mode);
			qcf = tool.getQueueConnectionFactory();

			logger.log(Logger.Level.INFO,
					"Test QueueConnectionFactory.createQueueConnection(String, String) with invalid credentials");
			logger.log(Logger.Level.INFO, "Verify JMSSecurityException is thrown");
			QueueConnection c = qcf.createQueueConnection("invalid", "invalid");
			logger.log(Logger.Level.ERROR, "Didn't throw expected JMSSecurityException");
			pass = false;
			c.close();
		} catch (JMSSecurityException e) {
			logger.log(Logger.Level.INFO, "Caught expected JMSSecurityException");
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Expected JMSSecurityException, received " + e);
			pass = false;
		}

		try {
			// set up JmsTool for TOPIC_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for TOPIC_FACTORY");
			tool = new JmsTool(JmsTool.TOPIC_FACTORY, user, password, mode);
			tcf = tool.getTopicConnectionFactory();

			logger.log(Logger.Level.INFO,
					"Test TopicConnectionFactory.createTopicConnection(String, String) with invalid credentials");
			logger.log(Logger.Level.INFO, "Verify JMSSecurityException is thrown");
			TopicConnection c = tcf.createTopicConnection("invalid", "invalid");
			logger.log(Logger.Level.ERROR, "Didn't throw expected JMSSecurityException");
			pass = false;
			c.close();
		} catch (JMSSecurityException e) {
			logger.log(Logger.Level.INFO, "Caught expected JMSSecurityException");
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			pass = false;
		}

		if (!pass) {
			throw new Exception("createConnectionExceptionTests failed");
		}
	}

	/*
	 * @testName: createJMSContextExceptionTests
	 *
	 * @assertion_ids: JMS:JAVADOC:842; JMS:JAVADOC:843; JMS:JAVADOC:845;
	 * JMS:JAVADOC:846; JMS:JAVADOC:848; JMS:JAVADOC:849; JMS:JAVADOC:850;
	 * JMS:JAVADOC:851;
	 *
	 * @test_Strategy: Try and create a JMSContext with invalid user credentials and
	 * invalid session mode. Tests for the exceptions: JMSRuntimeException and
	 * JMSSecurityRuntimeException.
	 *
	 * QueueConnectionFactory.createContext(String, String)
	 * QueueConnectionFactory.createContext(int)
	 * TopicConnectionFactory.createContext(String, String)
	 * TopicConnectionFactory.createContext(int)
	 */
	@Test
	public void createJMSContextExceptionTests() throws Exception {
		boolean pass = true;
		try {
			// set up JmsTool for QUEUE_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for QUEUE_FACTORY");
			tool = new JmsTool(JmsTool.QUEUE_FACTORY, user, password, mode);
			qcf = tool.getQueueConnectionFactory();

			logger.log(Logger.Level.INFO,
					"Test QueueConnectionFactory.createContext(String, String) with bad credentials");
			logger.log(Logger.Level.INFO, "Verify JMSRuntimeSecurityException is thrown");
			try {
				context = qcf.createContext("invalid", "invalid");
				logger.log(Logger.Level.ERROR, "Didn't throw expected JMSSecurityRuntimeException");
				pass = false;
				context.close();
			} catch (JMSSecurityRuntimeException e) {
				logger.log(Logger.Level.INFO, "Caught expected JMSRuntimeSecurityException");
			} catch (Exception e) {
				logger.log(Logger.Level.ERROR, "Expected JMSSecurityRuntimeException, received " + e);
				pass = false;
			}

			logger.log(Logger.Level.INFO, "Test QueueConnectionFactory.createContext(int) with bad session mode");
			logger.log(Logger.Level.INFO, "Verify JMSRuntimeException is thrown");
			try {
				context = qcf.createContext(-1);
				logger.log(Logger.Level.ERROR, "Didn't throw expected JMSRuntimeException");
				pass = false;
				context.close();
			} catch (JMSRuntimeException e) {
				logger.log(Logger.Level.INFO, "Caught expected JMSRuntimeException");
			} catch (Exception e) {
				logger.log(Logger.Level.ERROR, "Expected JMSRuntimeException, received " + e);
				pass = false;
			}

			// set up JmsTool for TOPIC_FACTORY setup
			logger.log(Logger.Level.INFO, "Setup JmsTool for TOPIC_FACTORY");
			tool = new JmsTool(JmsTool.TOPIC_FACTORY, user, password, mode);
			tcf = tool.getTopicConnectionFactory();

			logger.log(Logger.Level.INFO,
					"Test TopicConnectionFactory.createContext(String, String) with bad credentials");
			logger.log(Logger.Level.INFO, "Verify JMSSecurityRuntimeException is thrown");
			try {
				context = tcf.createContext("invalid", "invalid");
				logger.log(Logger.Level.ERROR, "Didn't throw expected JMSSecurityRuntimeException");
				pass = false;
				context.close();
			} catch (JMSSecurityRuntimeException e) {
				logger.log(Logger.Level.INFO, "Caught expected JMSRuntimeSecurityException");
			} catch (Exception e) {
				logger.log(Logger.Level.ERROR, "Caught unexpected exception: " + e);
				pass = false;
			}

			logger.log(Logger.Level.INFO, "Test TopicConnectionFactory.createContext(int) with bad session mode");
			logger.log(Logger.Level.INFO, "Verify JMSRuntimeException is thrown");
			try {
				context = tcf.createContext(-1);
				logger.log(Logger.Level.ERROR, "Didn't throw expected JMSRuntimeException");
				pass = false;
				context.close();
			} catch (JMSRuntimeException e) {
				logger.log(Logger.Level.INFO, "Caught expected JMSRuntimeException");
			} catch (Exception e) {
				logger.log(Logger.Level.ERROR, "Caught unexpected exception: " + e);
				pass = false;
			}
		} catch (Exception e) {
			logger.log(Logger.Level.ERROR, "Caught exception: " + e);
			throw new Exception("createJMSContextExceptionTests");
		}

		if (!pass) {
			throw new Exception("createJMSContextExceptionTests failed");
		}
	}
}
