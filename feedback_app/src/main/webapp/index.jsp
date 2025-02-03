<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
   	<%@include file="comp/links.jsp" %>
  </head>
  <body>
  	<%@include file="comp/header.jsp" %>
    <div class="content_container d-flex py-5 flex-column justify-content-center align-items-center">
    	<a href="<%= application.getContextPath() %>/comp/feedback.jsp" class="btn btn-light">Give us feedback</a>
    </div>
   	<%@include file="comp/scripts.jsp" %>
  </body>
</html>