<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE>
<html>
<head>

 <title>회원가입</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  
  
 <style>
.jumbotron {
  padding: 80px 40px;
  margin-bottom: 30px;
  color: white;
  background-color: #ccfff3;
}
h1.fon {
	color: #000066;
}
</style>

</head>
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1 class="fon">회원가입</h1>      
  </div>
</div>
  
  <form action="member_proc.do">
    <div class="form-group">
      <label for="id">ID:</label>
      <td><input type="id" class="form-control" name="id"></td>
      <td><a href="#" id="id_check" class="btn btn-outline-success">중복확인</a></td>
    </div>
    
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="pwd">
    </div>
    
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" name="name">
    </div>
    
     <div class="checkbox">
      <h4>Gender:</h4>
      <label><input type="radio" name="gender">여</label>
      <label><input type="radio" name="gender">남</label>
    </div>
    
    <div class="form-group">
      <label for="phone">Phone:</label>
      <input type="text" class="form-control" name="phone">
     </div>
    <br>
    
    <div class="form-group">
      <label for="address">Address:</label>
      <input type="text" class="form-control" name="address">
    </div>
     
    <div class="form-group">
    	<th>가입일</th>
     </div>
  
     
     <br>
     <center>
      <a href="member_proc.do"><input type="submit" value="회원가입 완료"/></a>
     </center>
  </form>
</div>

</body>
</html>