<html>
<head>
<title>Login Form</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form id="frm-login" method="post" action="/student/deletion/delete">
			<div class="mb-3">
				<label for="txt-user-id" class="form-label">User ID</label> <input
					type="text" class="form-control" id="txt-user-id" name="username"
					placeholder="Enter User ID">
			</div>
			<div class="mb-3">
				<label for="txt-password" class="form-label">Password</label> <input
					type="password" class="form-control" id="txt-password"
					name="password">
			</div>

			<button type="submit" class="btn btn-primary" id="btn-delete">Delete</button>
		</form>
	</div>

</body>
</html>

