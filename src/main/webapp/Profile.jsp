<%@ page import="ir.maktab.model.Person" %><%--
  Created by IntelliJ IDEA.
  User: pc1
  Date: 1/1/2023
  Time: 7:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.rtl.min.css"
          integrity="sha384-gXt9imSW0VcJVHezoNQsP+TNrjYXoGcrqBZJpry9zJt8PCQjobwmhMGaDHTASo9N" crossorigin="anonymous">
    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
    <style>
        body {
            font-family: Vazir;
        }
    </style>
</head>
<body class="d-flex justify-content-center align-items-center">

<% Person person = (Person) request.getAttribute("person"); %>
<div class="container row py-3 m-5 d-flex justify-content-center align-items-center">

    <table class="table">
        <caption>Welcome dear <%=person.getUsername()%>
        </caption>
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">First name</th>
            <th scope="col">Last name</th>
            <th scope="col">Age</th>
            <th scope="col">Country</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td><%=person.getFirstName()%>
            </td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td><%=person.getLastName()%>
            </td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td><%=person.getAge()%>
            </td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td><%=person.getCountry()%>
            </td>
        </tr>
        </tbody>
    </table>

    <a href="index.jsp" class="btn btn-secondary " role="button" aria-pressed="true">First page</a>

</div>

</body>
</html>
