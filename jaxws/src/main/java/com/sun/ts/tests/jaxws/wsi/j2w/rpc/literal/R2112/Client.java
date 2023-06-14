/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jaxws.wsi.j2w.rpc.literal.R2112;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.sun.javatest.Status;
import com.sun.ts.tests.jaxws.sharedclients.ClientFactory;
import com.sun.ts.tests.jaxws.sharedclients.SOAPClient;
import com.sun.ts.tests.jaxws.sharedclients.rpclitclient.*;
import com.sun.ts.tests.jaxws.wsi.constants.DescriptionConstants;
import com.sun.ts.tests.jaxws.wsi.constants.SchemaConstants;
import com.sun.ts.tests.jaxws.wsi.utils.DescriptionUtils;
import com.sun.ts.lib.harness.*;

public class Client extends ServiceEETest
    implements DescriptionConstants, SchemaConstants {
  /**
   * The client.
   */
  private SOAPClient client;

  static J2WRLShared service = null;

  /**
   * Test entry point.
   * 
   * @param args
   *          the command-line arguments.
   */
  public static void main(String[] args) {
    Client tests = new Client();
    Status status = tests.run(args, System.out, System.err);
    status.exit();
  }

  /**
   * @class.testArgs: -ap jaxws-url-props.dat
   * @class.setup_props: webServerHost; webServerPort; platform.mode;
   *
   * @param args
   * @param properties
   *
   * @throws Fault
   */
  public void setup(String[] args, Properties properties) throws Fault {
    client = ClientFactory.getClient(J2WRLSharedClient.class, properties, this,
        service);
    logMsg("setup ok");
  }

  public void cleanup() {
    logMsg("cleanup");
  }

  /**
   * @testName: testArrayTypeNames
   *
   * @assertion_ids: WSI:SPEC:R2007
   *
   * @test_Strategy: Retrieve the WSDL, generated by the Java-to-WSDL tool, and
   *                 examine all xsd:complexType elements, making sure that they
   *                 are not named ArrayOf[XXX].
   * 
   * @throws Fault
   */
  @Test
  public void testArrayTypeNames() throws Fault {
    Document document = client.getDocument();
    Element[] types = DescriptionUtils.getChildElements(
        document.getDocumentElement(), WSDL_NAMESPACE_URI,
        WSDL_TYPES_LOCAL_NAME);
    if (types.length != 0) {
      verifyTypes(types[0]);
    }
  }

  protected void verifyTypes(Element types) throws Fault {
    NodeList list = types.getElementsByTagNameNS(XSD_NAMESPACE_URI,
        XSD_COMPLEXTYPE_LOCAL_NAME);
    for (int i = 0; i < list.getLength(); i++) {
      verifyComplexType((Element) list.item(i));
    }
  }

  protected void verifyComplexType(Element complexType) throws Fault {
    String name = complexType.getAttribute(XSD_NAME_ATTR);
    if (name.startsWith("ArrayOf")) {
      throw new Fault("xsd:complexType element encountered named '" + name
          + "' (BP-R2112)");
    }
  }
}
