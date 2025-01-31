<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index jsp page</title>
    <link rel="stylesheet" href=" <%= application.getContextPath() %>/css/style.css " />
</head>
<body>
<div class = "container">
	<%@include file="menu.jsp" %>

    <h1>Hello from Hardik Pansheriya</h1>
	<p>this is a life</p>
</div>
<script src="<%= application.getContextPath() %>/js/script.js"></script>
</body>
</html>