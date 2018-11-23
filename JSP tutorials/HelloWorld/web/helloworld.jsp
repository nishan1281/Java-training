<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="sun.jvm.hotspot.HelloWorld" %>
<%--<%@ page import="com.helloWorld.jsp.StringToUpper" %>--%>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%--<%= StringToUpper.makeItUpper("Md Ariful alam Nishan") %>--%>
  <p> String to Upper Case :  <%= new String("Upper Case").toUpperCase() %> </p>  <!-- this is an expression example -->
  <p> This is an example of scriplet
  <%
      for (int i =1; i<5; i++)
      {
          out.println("</br>&nbsp;&nbsp;&nbsp;&nbsp;It is an example of scriplet :" + i); // here &nbsp; used for spacing
      }

  %>
  </p>

  </body>
</html>