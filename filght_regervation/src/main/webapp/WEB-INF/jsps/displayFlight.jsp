<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
<style>
   body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 100px;
        padding:100px;
        background-image: url("img.jpg");
       background-size:auto;
        background-position: center center;
    }
   

    h2 {
        color: #333333;
        text-align: center;
        margin-top: 30px;
    }

    table {
        margin: 0 auto;
        border-collapse: collapse;
        width: 80%;
        max-width: 800px;
        background-color: #ffffff;
        border: 1px solid #cccccc;
    }

    th, td {
        padding: 10px;
        text-align: center;
        border: 1px solid #cccccc;
    }

    th {
        background-color: #f2f2f2;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    a {
        display: inline-block;
        padding: 5px 10px;
        background-color: #4CAF50;
        color: #ffffff;
        text-decoration: none;
        border-radius: 4px;
    }

    a:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <h2>Flight Search Results</h2>

    <table>
        <tr>
            <th>Airlines</th>
            <th>Departure City</th>
            <th>Arrival City</th>
            <th>Departure Time</th>
            <th>Select Flight</th>
        </tr>
        <c:forEach items="${flights}" var="findFlights">
            <tr>
                <td>${findFlights.operatingAirlines}</td>
                <td>${findFlights.departureCity}</td>
                <td>${findFlights.arrivalCity}</td>
                <td>${findFlights.estimatedDepartureTime}</td>
                <td><a href="showmyReservation?flightId=${findFlights.getId()}">Select</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
