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
  <link rel="stylesheet" href="http://localhost:61005/login/resources/css/form.css" type="text/css">
  
</head>

<body>
   
	<div id="bg"></div>

<form method="post" action="/login/submit">
    
    <h4 style="padding-bottom: 30px;"><b><u>Student Registration Form</u></b></h4>
    <div class="form-group">
      <label for="fname"><b>Full Name :</b></label>
      <input type="text" class="form-control" id="fname" placeholder="Enter your full name" name="fname" required>
      <div class="invalid-feedback">Please fill out this feild</div>
    </div>

    <div class="form-group">
        <label for="roll"><b>Roll Number :</b></label>
        <input type="number" class="form-control" id="roll" placeholder="Enter your roll number" name="roll" required>
        <div class="invalid-feedback">Please fill out this feild</div>
    </div>


    <div class="form-group">
        <label for="gname"><b>Guardian's Name :</b></label>
        <input type="text" class="form-control" id="gname" placeholder="Enter guardian's name" name="gname" required>
        <div class="invalid-feedback">Please fill out this feild</div>
    </div>


    <div class="form-group">
        <label for="add"><b>Address :</b></label>
        <textarea class="form-control" id="add" placeholder="Enter your address" name="add" rows="5" required></textarea>
        <div class="invalid-feedback">Please fill out this feild</div>
    </div>


    <div class="form-check-inline">
      <lable class="form-check-label" for="gender"><b>Gender :</b></lable>
      <input type="radio" class="form-check-input m-3" id="gender" name="gender" value="M" required="required">
      <lable>Male</lable><br><br>
      <input type="radio" class="form-check-input m-3" id="gender" name="gender" value="F">
      <lable>Female</lable>
      <input type="radio" class="form-check-input m-3" id="gender" name="gender" value="O">
      <lable>Other</lable>
      <div class="invalid-feedback">Please fill out this feild</div>
    </div>


    <div class="checkbox-group">
      <lable for="hobby"><b>Hobby :</b></lable><br>
      <input type="checkbox"  id="hobby" name="hobby">
      <lable>Dancing</lable><br>
      <input type="checkbox" id="hobby" name="hobby" >
      <lable>Singing</lable><br>
      <input type="checkbox" id="hobby" name="hobby" >
      <lable>Listening Music</lable><br>
      <input type="checkbox" id="hobby" name="hobby" >
      <lable>Cooking</lable><br>
      <input type="checkbox" id="hobby" name="hobby" >
      <lable>Others</lable><br>
    </div>

    <div class="form-group">
        <button type="submit" class="btn m-2 " >Submit</button>
        <button  type="reset" class="btn m-5" style="background-color: yellow; color: black; ">Reset</a></button>
    </div>

    
</form>
</div>
</body>
</html>