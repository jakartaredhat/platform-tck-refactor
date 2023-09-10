/*
 * Copyright (c) 2009, 2020 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jpa.core.criteriaapi.From;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.ts.lib.harness.SetupMethod;
import com.sun.ts.lib.util.TestUtil;
import com.sun.ts.tests.jpa.common.schema30.Address;
import com.sun.ts.tests.jpa.common.schema30.Customer;
import com.sun.ts.tests.jpa.common.schema30.Customer_;
import com.sun.ts.tests.jpa.common.schema30.Department;
import com.sun.ts.tests.jpa.common.schema30.Department_;
import com.sun.ts.tests.jpa.common.schema30.Employee;
import com.sun.ts.tests.jpa.common.schema30.Order;
import com.sun.ts.tests.jpa.common.schema30.Util;

import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CollectionJoin;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.From;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.ListJoin;
import jakarta.persistence.criteria.MapJoin;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.SetJoin;
import jakarta.persistence.criteria.Subquery;

public class ClientIT2 extends Util {

  /*
   * @testName: joinStringTest
   * 
   * @assertion_ids: PERSISTENCE:JAVADOC:997;
   * 
   * @test_Strategy: This query is defined on a one-many relationship. Verify
   * the results were accurately returned.
   *
   * SELECT c FROM Customer c JOIN c.work o WHERE (o.id in (4))
   */
  @SetupMethod(name = "setupCustomerData")
  @Test
  public void joinStringTest() throws Exception {
    boolean pass = false;
    String expectedPKs[];

    try {
      CriteriaBuilder cbuilder = getEntityManager().getCriteriaBuilder();

      getEntityTransaction().begin();
      CriteriaQuery<Customer> cquery = cbuilder.createQuery(Customer.class);
      From<Customer, Customer> customer = cquery.from(Customer.class);
      Join<Customer, Address> address = customer.join("work");
      Expression e = cbuilder.literal("4");
      cquery.where(address.get("id").in(e)).select(customer);
      TypedQuery<Customer> tquery = getEntityManager().createQuery(cquery);
      List<Customer> clist = tquery.getResultList();

      expectedPKs = new String[1];
      expectedPKs[0] = "2";

      if (!checkEntityPK(clist, expectedPKs)) {
        TestUtil
            .logErr("Did not get expected results.  Expected 1 reference, got: "
                + clist.size());
      } else {
        TestUtil.logTrace("Expected results received");
        pass = true;
      }
      getEntityTransaction().commit();
    } catch (Exception e) {
      TestUtil.logErr("Caught unexpected exception", e);

    }

    if (!pass) {
      throw new Exception("joinStringTest failed");
    }
  }

  /*
   * @testName: joinStringJoinTypeTest
   * 
   * @assertion_ids: PERSISTENCE:JAVADOC:999;
   * 
   * @test_Strategy: This query is defined on a one-many relationship. Verify
   * the results were accurately returned.
   *
   * SELECT c FROM Customer c INNER JOIN c.work o WHERE (o.id in (4))
   */
  @SetupMethod(name = "setupCustomerData")
  @Test
  public void joinStringJoinTypeTest() throws Exception {
    boolean pass = false;
    String expectedPKs[];

    try {
      CriteriaBuilder cbuilder = getEntityManager().getCriteriaBuilder();

      getEntityTransaction().begin();
      CriteriaQuery<Customer> cquery = cbuilder.createQuery(Customer.class);
      From<Customer, Customer> customer = cquery.from(Customer.class);
      Join<Customer, Address> address = customer.join("work", JoinType.INNER);
      Expression e = cbuilder.literal("4");
      cquery.where(address.get("id").in(e)).select(customer);
      TypedQuery<Customer> tquery = getEntityManager().createQuery(cquery);
      List<Customer> clist = tquery.getResultList();

      expectedPKs = new String[1];
      expectedPKs[0] = "2";

      if (!checkEntityPK(clist, expectedPKs)) {
        TestUtil
            .logErr("Did not get expected results.  Expected 1 reference, got: "
                + clist.size());
      } else {
        TestUtil.logTrace("Expected results received");
        pass = true;
      }
      getEntityTransaction().commit();
    } catch (Exception e) {
      TestUtil.logErr("Caught unexpected exception", e);

    }

    if (!pass) {
      throw new Exception("joinStringJoinTypeTest failed");
    }
  }

  /*
   * @testName: joinSingularAttributeTest
   * 
   * @assertion_ids: PERSISTENCE:JAVADOC:987;
   * 
   * @test_Strategy: This query is defined on a one-many relationship. Verify
   * the results were accurately returned.
   *
   * SELECT c FROM Customer c JOIN c.work o WHERE (o.id in (4))
   */
  @SetupMethod(name = "setupCustomerData")
  @Test
  public void joinSingularAttributeTest() throws Exception {
    boolean pass = false;
    String expectedPKs[];

    try {
      CriteriaBuilder cbuilder = getEntityManager().getCriteriaBuilder();

      getEntityTransaction().begin();
      CriteriaQuery<Customer> cquery = cbuilder.createQuery(Customer.class);
      From<Customer, Customer> customer = cquery.from(Customer.class);
      Join<Customer, Address> address = customer.join(Customer_.work);
      Expression e = cbuilder.literal("4");
      cquery.where(address.get("id").in(e)).select(customer);
      TypedQuery<Customer> tquery = getEntityManager().createQuery(cquery);
      List<Customer> clist = tquery.getResultList();

      expectedPKs = new String[1];
      expectedPKs[0] = "2";

      if (!checkEntityPK(clist, expectedPKs)) {
        TestUtil
            .logErr("Did not get expected results.  Expected 1 reference, got: "
                + clist.size());
      } else {
        TestUtil.logTrace("Expected results received");
        pass = true;
      }
      getEntityTransaction().commit();
    } catch (Exception e) {
      TestUtil.logErr("Caught unexpected exception", e);

    }

    if (!pass) {
      throw new Exception("joinSingularAttributeTest failed");
    }
  }

  /*
   * @testName: joinSingularAttributeJoinTypeTest
   * 
   * @assertion_ids: PERSISTENCE:JAVADOC:988;
   * 
   * @test_Strategy: This query is defined on a one-many relationship. Verify
   * the results were accurately returned.
   *
   * SELECT c FROM Customer c INNER JOIN c.work o WHERE (o.id in (4))
   */
  @SetupMethod(name = "setupCustomerData")
  @Test
  public void joinSingularAttributeJoinTypeTest() throws Exception {
    boolean pass = false;
    String expectedPKs[];

    try {
      CriteriaBuilder cbuilder = getEntityManager().getCriteriaBuilder();

      getEntityTransaction().begin();
      CriteriaQuery<Customer> cquery = cbuilder.createQuery(Customer.class);
      From<Customer, Customer> customer = cquery.from(Customer.class);
      Join<Customer, Address> address = customer.join(Customer_.work,
          JoinType.INNER);
      Expression e = cbuilder.literal("4");
      cquery.where(address.get("id").in(e)).select(customer);
      TypedQuery<Customer> tquery = getEntityManager().createQuery(cquery);
      List<Customer> clist = tquery.getResultList();

      expectedPKs = new String[1];
      expectedPKs[0] = "2";

      if (!checkEntityPK(clist, expectedPKs)) {
        TestUtil
            .logErr("Did not get expected results.  Expected 1 reference, got: "
                + clist.size());
      } else {
        TestUtil.logTrace("Expected results received");
        pass = true;
      }
      getEntityTransaction().commit();
    } catch (Exception e) {
      TestUtil.logErr("Caught unexpected exception", e);

    }

    if (!pass) {
      throw new Exception("joinSingularAttributeJoinTypeTest failed");
    }
  }


  /*
   * @testName: fromGetCorrelationParentTest
   * 
   * @assertion_ids: PERSISTENCE:JAVADOC:983
   * 
   * @test_Strategy:
   */
  @SetupMethod(name = "setupCustomerData")
  @Test
  public void fromGetCorrelationParentTest() throws Exception {
    boolean pass1 = false;
    boolean pass2 = false;
    boolean pass3 = false;
    String expectedPKs[];

    CriteriaBuilder cbuilder = getEntityManager().getCriteriaBuilder();

    try {
      getEntityTransaction().begin();
      CriteriaQuery<Customer> cquery = cbuilder.createQuery(Customer.class);
      Root<Customer> customer = cquery.from(Customer.class);
      cquery.select(customer);
      Subquery<String> sq = cquery.subquery(String.class);
      From<Customer, Customer> sqc = sq.correlate(customer);
      boolean isCorr = sqc.isCorrelated();
      if (isCorr) {
        TestUtil.logTrace("From.isCorrelated() return true");
        pass1 = true;
      } else {
        TestUtil.logErr(
            "Expected From.isCorrelated() to return true, actual:" + isCorr);
      }
      From f = sqc.getCorrelationParent();
      String name = f.getJavaType().getSimpleName();
      if (name.equals("Customer")) {
        TestUtil.logTrace("Received expected parent:" + name);
        pass2 = true;
      } else {
        TestUtil.logErr(
            "Expected getCorrelationParent() to return Customer, actual:"
                + name);
      }
      Join<Customer, Address> w = sqc.join("work");
      sq.select(w.<String> get("state"));
      sq.where(cbuilder.equal(w.get("state"),
          cbuilder.parameter(String.class, "state")));
      cquery.where(customer.get("home").get("state").in(sq));
      TypedQuery<Customer> tquery = getEntityManager().createQuery(cquery);
      tquery.setParameter("state", "MA");
      List<Customer> result = tquery.getResultList();

      expectedPKs = new String[11];
      expectedPKs[0] = "1";
      expectedPKs[1] = "2";
      expectedPKs[2] = "3";
      expectedPKs[3] = "4";
      expectedPKs[4] = "7";
      expectedPKs[5] = "8";
      expectedPKs[6] = "9";
      expectedPKs[7] = "11";
      expectedPKs[8] = "13";
      expectedPKs[9] = "15";
      expectedPKs[10] = "18";
      if (!checkEntityPK(result, expectedPKs)) {
        TestUtil.logErr("test_subquery_in:  Did not get expected results. "
            + " Expected 11 references, got: " + result.size());
      } else {
        TestUtil.logTrace("Expected results received");
        pass3 = true;
      }
      getEntityTransaction().commit();
    } catch (Exception e) {
      TestUtil.logErr("Caught unexpected exception", e);
    }

    if (!pass1 || !pass2 || !pass3) {
      throw new Exception("fromGetCorrelationParentTest failed");
    }
  }
}
