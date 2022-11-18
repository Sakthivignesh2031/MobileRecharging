<%@page import="com.example.entity.Offers"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plan</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
</head>
<body class="container">

	<%
	List<Offers> offer = (List<Offers>) request.getAttribute("offer");
	%>
	<%
	Long mobileNo = (Long) request.getAttribute("mobilenumber");
	%>

	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">
				<div class="card">
					<div class="card-header">
						<h2 style="text-align: center; color: blue;">Select your Plan</h2>
					</div>
					<div class="card-body">
						<table class="table table-bordered table-stripped">
							<thead>
								<tr>
									<th>planId</th>
									<th>Days</th>
									<th>talktime</th>
									<th>data</th>
									<th>price</th>
								</tr>
							</thead>

							<%for(Offers offerList : offer){ %>

							<form action="">
							<tr>
								<td><input type="radio" name="planId"
									value="<%= offerList.getPlanId()%>"></td>
								<td>
									<% out.print(offerList.getPlanId()); %>
								</td>
								<td>
									<% out.print(offerList.getDays()); %>
								</td>
								<td>
									<%out.println(offerList.getTalkTime()); %>
								</td>
								<td>
									<%out.println(offerList.getData()); %>
								</td>
								<td>
									<%out.println(offerList.getPrice()); %>
								</td>
							</tr>
							<%
								}
								%>

						</table>

						<input type="hidden" name="mobilenumber" value="mobileNumer">
						<button class="btn btn-primary">Submit</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>