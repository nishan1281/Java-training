<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Built in object</title>
</head>
<body>

Request User Agent : <%= request.getHeader("User-Agent")%>
<div> Request User Language : <%= request.getLocale()%></div>

</body>
</html>
