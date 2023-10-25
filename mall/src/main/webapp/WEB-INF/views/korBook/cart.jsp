<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="../css/cart.css">
  <title>장바구니</title>
</head>
<body>
  <div class="cart-container">
    <h1>장바구니</h1>
    <div class="cart-items">
      <div class="cart-item" id=div1>
        <img src="../img/${book.img}.jpg" alt="책 이미지">
        <div class="item-details">
          <h2>책 제목:${book.name}</h2>
          <p>작가:${book.author}</p>
          <p>가격:<label id="price">${book.price}</label></p>
          <input type=button id=btndelete1 class="remove-button" value="삭제">
        </div>
      </div>
      <!-- 더 많은 아이템 항목 추가 가능 -->
    </div>
    <div class="cart-summary">
      <p>총 가격:&nbsp;<label id=totalsum></label></p>
      <button class="checkout-button">결제하기</button>
    </div>
  </div>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document).ready(function() {
    let Price = parseInt($('#price').text());
    totalPrice = Price;
    $("#totalsum").text(totalPrice);
    console.log(${book.price})
})
.on('click','#btndelete1',function(){
	$('#div1').remove();
})

</script>
</html>
