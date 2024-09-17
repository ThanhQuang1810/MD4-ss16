<%--
  Created by IntelliJ IDEA.
  User: Nguye
  Date: 9/16/2024
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kết Quả Tra Cứu</title>
</head>
<body>
<h1>Kết Quả Tra Cứu</h1>

<c:if test="${not empty meaning}">
    <p>Từ: ${word}</p>
    <p>Nghĩa tiếng Việt: ${meaning}</p>
</c:if>

<c:if test="${not empty error}">
    <p>${error}</p>
</c:if>

<a href="/">Quay lại trang tra cứu</a>
</body>
</html>


