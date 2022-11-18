<%@page import="com.example.entity.Offers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body class="container">

<%Offers offer = (Offers)request.getAttribute("myplan"); %>

Bill for Re-Charge on Mobile Number : ${mobilenumber}<br><br>

Transaction-Id <br><br>
Valid for: <%= offer.getDays()%>
TalkTime: <%= offer.getTalkTime() %>
Data Balance: <%= offer.getData() %>
Amount payable: <%= offer.getPrice() %>

<a href="/"> Return</a>
</body>
</html>