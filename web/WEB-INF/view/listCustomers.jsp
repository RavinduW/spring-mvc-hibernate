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
            <input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd';return false;" class="add-button"/>
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Actions</th>
                    <th></th>
                </tr>

                <c:forEach var="cus" items="${customers}">
                    
                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="customerId" value="${cus.id}"/>
                    </c:url>
                    <c:url var="deleteLink" value="/customer/delete">
                        <c:param name="customerId" value="${cus.id}"/>
                    </c:url>
                    <tr>
                        <td>${cus.firstName}</td>
                        <td>${cus.lastName}</td>
                        <td>${cus.email}</td>
                        <td><a href="${updateLink}">Update</a></td>
                        <td><a href="${deleteLink}">Delete</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
</body>
</html>
