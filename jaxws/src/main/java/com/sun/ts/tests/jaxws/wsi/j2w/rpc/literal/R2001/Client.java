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

package com.sun.ts.tests.jaxws.wsi.j2w.rpc.literal.R2001;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.javatest.Status;
import com.sun.ts.tests.jaxws.sharedclients.ClientFactory;
import com.sun.ts.tests.jaxws.sharedclients.SOAPClient;
import com.sun.ts.tests.jaxws.sharedclients.rpclitclient.*;
import com.sun.ts.tests.jaxws.wsi.constants.DescriptionConstants;
import com.sun.ts.tests.jaxws.wsi.utils.DescriptionUtils;
import com.sun.ts.lib.harness.*;

public class Client extends ServiceEETest implements DescriptionConstants {
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
    Client test = new Client();
    Status status = test.run(args, System.out, System.err);
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
   * @testName: testWSDLImports
   *
   * @assertion_ids: WSI:SPEC:R2001
   *
   * @test_Strategy: Retrieve the WSDL, generated by the Java-to-WSDL tool, and
   *                 examine all wsdl:import statements, ensuring that the
   *                 resource at the specified location is a WSDL document.
   *
   * @throws Fault
   */
  @Test
  public void testWSDLImports() throws Fault {
    Document document = client.getDocument();
    Element[] imports = DescriptionUtils.getImports(document);
    for (int i = 0; i < imports.length; i++) {
      verifyImport(imports[i]);
    }
  }

  protected void verifyImport(Element element) throws Fault {
    String location = element.getAttribute(WSDL_LOCATION_ATTR);
    Document document = DescriptionUtils.getDocumentFromLocation(location);
    if (!DescriptionUtils.isDescription(document)) {
      throw new Fault("Document imported from '" + location
          + "' is not a description (BP-R2001)");
    }
  }
}
