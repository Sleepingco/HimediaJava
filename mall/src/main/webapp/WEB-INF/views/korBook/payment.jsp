<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/payment.css" rel="stylesheet"/>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <script>
        $(document).ready(function() {
            $("#qty").on("input", function() {
                var quantity = parseInt($(this).val());
                var unitPrice = parseInt("${book.price}");
                var totalPrice = quantity * unitPrice;
                $("#sum").val(totalPrice);
            });
        });
    </script>
    <meta charset="UTF-8">
    <title>책 결제</title>
</head>
<body>
    <header class="header">
        <h1>책 결제</h1>
    </header>
    <div class="container">
        <form action="/korBook/Payment" method="post">
            <div class="form-group">
                <label>모바일 번호:</label>
                <input type="text" id="mobile" name="mobile"  required>
            </div>
            <div class="form-group">
                <label >구매 수량:</label>
                <input type="number" id="qty" name="qty" min="1" required>
            </div>
            <div class="form-group">
                <label>총 구매금액:</label>
                <input type="text" id="sum" name="sum" readonly>
            </div>
            <input type="hidden" name="bookSeq" value="${book.seq}">
            <input type="submit" class="btn-pay" value="결제">
        </form>
    </div>
</body>

</html>