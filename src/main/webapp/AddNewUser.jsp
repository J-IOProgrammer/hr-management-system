<%--
  Created by IntelliJ IDEA.
  User: pc1
  Date: 12/31/2022
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New User</title>
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

    <h1>Fill the form</h1>

    <form action="add-new-user-servlet" method="post">
        <div class="form-row">
            <div class="col-md-4 mb-3">
                <label for="validationDefault01">First name</label>
                <input type="text" class="form-control" name="firstName" id="validationDefault01"
                       placeholder="First name" required>
            </div>
            <div class="col-md-4 mb-3">
                <label for="validationDefault02">Last name</label>
                <input type="text" class="form-control" name="lastName" id="validationDefault02" placeholder="Last name"
                       required>
            </div>
            <div class="col-md-4 mb-3">
                <label for="validationDefaultUsername">Username</label>
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="inputGroupPrepend2">@</span>
                    </div>
                    <input type="text" class="form-control" name="userName" id="validationDefaultUsername"
                           placeholder="Username"
                           aria-describedby="inputGroupPrepend2" required>
                </div>
            </div>
        </div>
        <div class="form-row">
            <div class="col-md-3 mb-3">
                <label for="validationDefault03">Country</label>
                <input type="text" class="form-control" name="country" id="validationDefault03" placeholder="Country"
                       required>
            </div>
            <div class="col-md-3 mb-3">
                <label for="validationDefault04">Age</label>
                <input type="text" class="form-control" name="age" id="validationDefault04" placeholder="Age" required>
            </div>
        </div>
        <button class="btn btn-primary" type="submit">Submit form</button>
    </form>

</div>
</body>
</html>
