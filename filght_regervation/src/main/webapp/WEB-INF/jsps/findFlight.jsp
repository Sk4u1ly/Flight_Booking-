<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
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
        color: #ffffff;
        text-align: center;
        margin-top: 30px;
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
    }

    form {
        max-width: 400px;
        margin: 0 auto;
        background-color: rgba(255, 255, 255, 0.8);
        padding: 30px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    input[type="text"] {
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
</style>
</head>
<body>
    <h2>Search For Your Flight</h2>
    <form action="findFlight" method="post">
        From<input type="text" name="from" /><br><br>
        To<input type="text" name="to" /><br><br>
        Departure Date<input type="text" name="departureDate" /><br><br>
        <input type="submit" value="Search" />
    </form>
</body>
</html>