<%@ page import = "helloworld.ClassCalling" %>
<!DOCTYPE html>
<html>
<head>
<title>Hello world</title>
</head>
<body>

<h1>Hello world of java</h1>
<p>This is a paragraph.</p>

The time on the server is <%= new java.util.Date() %>
<br/>

<% 
  for (int i = 1; i<=5; i++)
    {
	out.print("<br/> I love to code" + i);
    }
%>

<div>
<p>Expression</p>
<p> 25 multiply with 25 = <%= 25*25 %> </p>
<p> 20 is greater than 30 =  <%=20>30 %> </p>
</div>

<div>
<p> Declaration </p>


<p>The string Hello World to lower case : <%= ClassCalling.makeItLower("Hello world") %> </p>


</div>











</body>
</html>