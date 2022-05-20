<!DOCTYPE html>
<html lang="en">
<head>
  <title>Student Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://localhost:61005/student/resources/css/form.css" type="text/css">
  
</head>

<body>
   
	<div id="bg"></div>

<form method="post" action="/student/modification/submit">
    
    <h4 style="padding-bottom: 30px;"><b><u>Student Registration Form</u></b></h4>
    
    <div class="form-group">
      <label for="uname"><b>Username :</b></label>
      <input type="text" class="form-control" id="uname" placeholder="Enter username" name="uname" required>
      <div class="invalid-feedback">Please fill out this feild</div>
    </div>
    
    <div class="form-group">
      <label for="txt-password"><b>Current Password :</b></label>
      <input type="password" class="form-control" id="txt-password1" placeholder="Enter password" name="txt-password1" required>
      <div class="invalid-feedback">Please fill out this feild</div>
    </div>
    
    <div class="form-group">
      <label for="txt-password"><b>New Password :</b></label>
      <input type="password" class="form-control" id="txt-password2" placeholder="Enter password" name="txt-password2" required>
      <div class="invalid-feedback">Please fill out this feild</div>
    </div>
    
    <div class="form-group">
      <label for="txt-password"><b>Confirm Password :</b></label>
      <input type="password" class="form-control" id="txt-password3" placeholder="Enter password" name="txt-password3" required>
      <div class="invalid-feedback">Please fill out this feild</div>
    </div>
    
    <div class="form-group">
        <button type="submit" class="btn m-2 " >Submit</button>
        <button  type="reset" class="btn m-5" style="background-color: yellow; color: black; ">Reset</a></button>
    </div>

    
</form>
</div>
</body>
</html>