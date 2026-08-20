<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css">
</head>

<body>

    <h1>Join our email list</h1>

    <form action="emailList" method="post">

        <input type="hidden" name="action" value="add">

        <label>Email:</label>
        <input type="email" name="email" required>
        <br><br>

        <label>First Name:</label>
        <input type="text" name="firstName" required>
        <br><br>

        <label>Last Name:</label>
        <input type="text" name="lastName" required>
        <br><br>

        <input type="submit" value="Join Now">

    </form>

</body>
</html>