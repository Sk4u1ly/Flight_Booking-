<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight</title>
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
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
     

    h2 {
        color:chocolate;
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
        margin-top: 30px;
    }

    th, td {
        padding: 10px;
        text-align: left;
        border: 1px solid #cccccc;
    }

    td:first-child {
        font-weight: bold;
    }

    input[type="text"] {
        padding: 5px;
        border: 1px solid #cccccc;
        border-radius: 4px;
        width: 100%;
        box-sizing: border-box;
    }

    input[type="submit"] {
        display: block;
        margin-top: 20px;
        padding: 10px 20px;
        background-color: #4CAF50;
        color: #ffffff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<h2>Flight Details</h2>
     
    <table>
        <tr>
            <td>Operating Airlines:</td>
            <td>${flight.operatingAirlines}</td>
        </tr>
        <tr>
            <td>Flight Number:</td>
            <td>${flight.flightNumber}</td>
        </tr>
        <tr>
            <td>Departure City:</td>
            <td>${flight.departureCity}</td>
        </tr>
        <tr>
            <td>Arrival City:</td>
            <td>${flight.arrivalCity}</td>
        </tr>
        <tr>
            <td>Date Of Departure:</td>
            <td>${flight.dateOfDeparture}</td>
        </tr>
        <tr>
            <td>Estimated Departure Time:</td>
            <td>${flight.estimatedDepartureTime}</td>
        </tr>
    </table>

    <h2>Enter Passenger Details</h2>
    <form action="conformReservation" method="post">
        <table>
            <tr>
                <td>FirstName:</td>
                <td><input type="text" name="firstName" /></td>
            </tr>
            <tr>
                <td>LastName:</td>
                <td><input type="text" name="lastName" /></td>
            </tr>
            <tr>
                <td>MiddleName:</td>
                <td><input type="text" name="middleName" /></td>
            </tr>
            <tr>
                <td>EmailId:</td>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <td>PhoneNumber:</td>
                <td><input type="text" name="phoneNumber" /></td>
            </tr>
            <tr>
                <td><input type="hidden" name="flightId" value="${flight.id }" /></td>
            </tr>
        </table>

        <h2>Payment Details</h2>
        <table>
            <tr>
                <td>CardNumber:</td>
                <td><input type="text" name="cardNumber" /></td>
            </tr>
            <tr>
                <td>NameOnCard:</td>
                <td><input type="text" name="nameOnCard" /></td>
            </tr>
            <tr>
                <td>CVV:</td>
                <td><input type="text" name="cvv" /></td>
            </tr>
            <tr>
                <td>ExpiryDate:</td>
                <td><input type="text" name="expiryDate" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Pay Now" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
