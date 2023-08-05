<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>


body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 100px;
        padding: 100px;
        background-image: url("img.jpg");
       background-size:auto;
        background-position: center center;
    }
  

    h2 {
        color:white;
        text-align: center;
        margin-top: 30px;
    }

    form {
        max-width: 400px;
        margin: 0 auto;
        background-color:#ffffff;
        padding: 30px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    table {
        width: 100%;
    }

    td {
        padding: 10px;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: #ffffff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    input[type="submit"]:active {
        background-color: #3e8e41;
    }

    .error {
        color: red;
        text-align: center;
        margin-top: 10px;
    }
</style>
</head>
<body>
    <h2>Login Here</h2>
    <form action="verifyLogin" method="post">
        <table>
            <tr>
                <td>EmailId</td>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Login" /></td>
            </tr>
        </table>
    </form>
    <div class="error">
        ${error}
    </div>
</body>
</html>