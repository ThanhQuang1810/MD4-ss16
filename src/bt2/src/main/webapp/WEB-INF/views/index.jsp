<%--
  Created by IntelliJ IDEA.
  User: Nguye
  Date: 9/16/2024
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tra Cứu Từ Điển</title>
</head>
<body>
<h1>Tra Cứu Từ Điển Anh - Việt</h1>
<form action="/search" method="get">
    <label for="word">Nhập từ cần tra cứu:</label>
    <input type="text" id="word" name="word">
    <button type="submit">Tìm kiếm</button>
</form>
</body>
</html>