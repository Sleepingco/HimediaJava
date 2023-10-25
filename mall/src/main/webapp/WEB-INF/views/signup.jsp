<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
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
  
  .signup-box {
    background-color: white;
    border: 1px solid #ccc;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    max-width: 500px;
    width: 100%;
  }
  
  .signup-title {
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
  
  .form-radio-label {
    display: inline-block;
    margin-right: 10px;
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
  <div class="signup-box">
    <h2 class="signup-title">회원가입</h2>
    <form method="post" name="frmlogin" id="frmlogin" action="dosignup">
      <div class="form-group">
        <label class="form-label" for="userid">사용자 아이디:</label>
        <input class="form-input" type="text" id="userid" name="userid" size="12">
      </div>
      <div class="form-group">
        <label class="form-label" for="passcode">비밀번호:</label>
        <input class="form-input" type="password" id="passcode" name="passcode" size="12">
      </div>
      <div class="form-group">
        <label class="form-label" for="passcode1">비밀번호 확인:</label>
        <input class="form-input" type="password" id="passcode1" name="passcode1" size="12">
      </div>
      <div class="form-group">
        <label class="form-label" for="username">이름:</label>
        <input class="form-input" type="text" id="username" name="username">
      </div>
      <div class="form-group">
        <span class="form-radio-label">성별:</span>
        <input type="radio" id="male" name="gender" value="남자">
        <label class="form-radio-label" for="male">남</label>
        <input type="radio" id="female" name="gender" value="여자">
        <label class="form-radio-label" for="female">여</label>
      </div>
      <div class="form-group">
        <label class="form-label" for="birthday">생년월일:</label>
        <input class="form-input" type="date" id="birthday" name="birthday">
      </div>
      <div class="form-group">
        <label class="form-label" for="mobile">모바일:</label>
        <input class="form-input" type="text" id="mobile" name="mobile" size="16">
      </div>
      <div class="form-group" style="text-align: right;">
        <input class="form-button" type="submit" value="확인">
        <a href="/" class="form-link">취소</a>
      </div>
    </form>
  </div>
</div>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document).on('submit', '#frmlogin', function() {
  if ($('#userid').val() === "" || $('#passcode').val() === "") {
    alert("회원가입 정보를 입력해 주십시오.");
    return false;
  }
});
</script>
</body>
</html>
