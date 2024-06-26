<%--

    Copyright (c) 2003 Contributors to the Eclipse Foundation

    This program and the accompanying materials are made available under the
    terms of the Eclipse Public License v. 2.0, which is available at
    http://www.eclipse.org/legal/epl-2.0.

    This Source Code may also be made available under the following Secondary
    Licenses when the conditions for such availability set forth in the
    Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
    version 2 with the GNU Classpath Exception, which is available at
    https://www.gnu.org/software/classpath/license.html.

    SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0

--%>

<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="fmt_rt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="tck" uri="http://java.sun.com/jstltck/jstltck-util" %>
<%@ page import="java.util.TimeZone,java.util.Date" %>
<tck:test testName="positiveTimezoneValueTest">
    <%
        TimeZone tz = TimeZone.getTimeZone("PST");
        pageContext.setAttribute("tz", tz);
        Date date = new Date(883192294202L);
        pageContext.setAttribute("dte", date);
    %>
    <c:set var="mtz" value="PST"/>
    <!-- EL: Behavioral test of value attribute -->
    <!-- Timezone object -->
    <fmt:timeZone value="${tz}">
        <fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${dte}"/>
    </fmt:timeZone>
    <!-- Timezone as a String -->
    <fmt:timeZone value="${mtz}">
        <fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${dte}"/>
    </fmt:timeZone>
    <fmt:timeZone value="America/Los_Angeles">
        <fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${dte}"/>
    </fmt:timeZone>

    <!-- RT: Behavioral test of value attribute -->
    <!-- Timezone object -->
    <fmt_rt:timeZone value='<%= (TimeZone) pageContext.getAttribute("tz") %>'>
        <fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${dte}"/>
    </fmt_rt:timeZone>
    <!-- Timezone as a String -->
    <fmt_rt:timeZone value='<%= (String) pageContext.getAttribute("mtz") %>'>
        <fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${dte}"/>
    </fmt_rt:timeZone>
    <fmt_rt:timeZone value="GMT-1:00">
        <fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${dte}"/>
    </fmt_rt:timeZone>
</tck:test>
