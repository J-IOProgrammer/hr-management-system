<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Management</title>
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
<div class="container row py-3 m-5 d-flex justify-content-center align-items-center">

    <div class="d-flex justify-content-center align-items-center my-5"><h1>Welcome to management system</h1></div>
    <div class="d-flex justify-content-center align-items-center gap-4 my-2">
        <a href="AddNewUser.jsp" class="btn btn-primary " role="button" aria-pressed="true">Add New
            User</a>
        <a href="SignIn.jsp" class="btn btn-warning " role="button" aria-pressed="true">Sing In</a>
        <a href="ListAllUser.jsp" class="btn btn-secondary " role="button" aria-pressed="true">List
            All User</a>
    </div>

</div>
</body>
</html>