<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container">

	<div class="row">
		<div class="col-3"></div>
		<div class="col-6">
			<div class="card">
				<div class="card-header">
					<h2 style="text-align: center; color: red;">Recharge Form</h2>
				</div>
				<div class="card-body">

					<form action="showplan" method="get">
						<label class="form-control-label">Enter your Mobile Number</label>
						<input type="text" class="form-control"
							placeholder="Mobile number" name="mobilenumber" maxlength="10" />

						<label class="form-control-label">Select the Operator</label> 
						
						<select
							name="operator" id="operator" class="custom-select mb-3">
							<option selected>Select Operator</option>
							<option value="1">Airtel</option>
							<option value="2">Jio</option>
							<option value="3">Vi</option>
						</select>
						
						<button class="btn btn-primary" value="Submit">Submit</button>

					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>