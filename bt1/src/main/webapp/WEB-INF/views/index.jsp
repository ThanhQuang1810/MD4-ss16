<%--
  Created by IntelliJ IDEA.
  User: Nguye
  Date: 9/16/2024
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2> (USD to VND)</h2>
<form action="/convert" method="post">


    <label for="usd">Số lượng USD: </label>
    <input type="number" id="usd" name="usd" step="0.01" required><br><br>
    <label for="rate">Tỷ giá (VND/USD): </label>
    <input type="number" id="rate" name="rate" step="0.01" required><br><br>

    <button type="submit">Chuyển đổi</button>
</form>
</body>
</html>


