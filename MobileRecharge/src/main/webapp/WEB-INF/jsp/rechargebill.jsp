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


	<div class="container">
		<div class="row">
			<div class="col-2"></div>
				<div class="col-8">

					<div class="card">
						<div class="card-header">
							<h1 style="text-align: center; color: blue;">Congratulations
								your Recharge completed</h1>
						</div>

						<div class="card-body">

							<%
						Offers offer = (Offers) request.getAttribute("myplan");
						%>
							<h2 style="text-align: center;">Bill for Re-Charge on Mobile Number : ${mobilenumber}</h2>
							<br>
							
							<h2 style="text-align: center;">Transaction-Id : ${transctionId}</h2>
							<br>
							<h2 style="text-align: center;">
								Valid for:
								<%=offer.getDays()%></h2>
							<br>
							<h2 style="text-align: center;">
								TalkTime:
								<%=offer.getTalkTime()%></h2>
							<br>
							<h2 style="text-align: center;">
								Data Balance:
								<%=offer.getData()%></h2>
							<br>
							<h2 style="text-align: center;">
								Amount payable:
								<%=offer.getPrice()%></h2>
							<br>  <div style="text-align: center;"><a href="/" > Return</a></div>

						</div>
					</div>
				</div>
			</div>
		</div>

</body>
</html>