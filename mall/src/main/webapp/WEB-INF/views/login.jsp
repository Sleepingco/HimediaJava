<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
  body {
    background-color: #f0f0f0;
    font-family: Arial, sans-serif;
  }
  
  .container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }
  
  .login-box {
    background-color: white;
    border: 1px solid #ccc;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    max-width: 400px;
    width: 100%;
  }
  
  .login-title {
    text-align: center;
    font-size: 24px;
    margin-bottom: 20px;
  }
  
  .form-group {
    margin-bottom: 15px;
  }
  
  .form-label {
    display: block;
    font-weight: bold;
    margin-bottom: 5px;
  }
  
  .form-input {
    width: 100%;
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 3px;
  }
  
  .form-button {
    width: 100%;
    background-color: #007bff;
    color: white;
    border: none;
    padding: 10px;
    border-radius: 3px;
    cursor: pointer;
  }
  
  .form-button:hover {
    background-color: #0056b3;
  }
  
  .form-link {
    text-align: right;
    margin-top: 10px;
  }
</style>
</head>
<body>
<div class="container">
  <div class="login-box">
    <h2 class="login-title">로그인</h2>
    <form method="post" name="frmlogin" id="frmlogin" action="dologin">
      <div class="form-group">
        <label class="form-label" for="userid">아이디:</label>
        <input class="form-input" type="text" name="userid" id="userid">
      </div>
      <div class="form-group">
        <label class="form-label" for="passcode">비밀번호:</label>
        <input class="form-input" type="password" name="passcode" id="passcode">
      </div>
      <div class="form-group">
        <input class="form-button" type="submit" value="로그인">
      </div>
      <div class="form-link">
        <a href="/">취소</a>
      </div>
    </form>
  </div>
</div>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document).on('submit', '#frmlogin', function() {
  if ($('#userid').val() === "" || $('#passcode').val() === "") {
    alert("로그인 정보를 입력해 주십시오.");
    return false;
  }
});
</script>
</body>
</html>