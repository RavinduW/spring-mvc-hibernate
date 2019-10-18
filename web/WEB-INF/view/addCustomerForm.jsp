<%--
  Created by IntelliJ IDEA.
  User: ravindu_c
  Date: 10/18/2019
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>SpringMVC+Hibernate</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM Manager</h2>
        </div>
    </div>
    <div id="container">
        <form:form action="saveCustomer" method="post" modelAttribute="customer">
            <table>
                <tbody>
                    <tr>
                        <td><label>First name:</label></td>
                        <td><form:input path="firstName"/></td>
                    </tr>
                    <tr>
                        <td><label>Last name:</label></td>
                        <td><form:input path="lastName"/></td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save"/></td>
                    </tr>
                </tbody>
            </table>
        </form:form>
        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
        </p>
    </div>
</body>
</html>
