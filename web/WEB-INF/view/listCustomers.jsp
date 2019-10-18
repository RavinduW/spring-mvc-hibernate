<%--
  Created by IntelliJ IDEA.
  User: ravindu_c
  Date: 10/17/2019
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring MVC+Hibernate</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM Manager</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>

                <c:forEach var="cus" items="${customers}">
                    <tr>
                        <td>${cus.firstName}</td>
                        <td>${cus.lastName}</td>
                        <td>${cus.email}</td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
</body>
</html>
