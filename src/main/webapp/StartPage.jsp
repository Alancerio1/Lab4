<%-- 
    Document   : StartPage
    Created on : Sep 12, 2016, 6:00:12 PM
    Author     : alancerio18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <center>
        <h1>Calculator</h1>

        <img src ="images\rectangle.jpg">
        <br>
        <br>
        <form method="POST" action="CalControl" >
            <label>Enter width</label>   <input type="text" name="width" value=""/>
            <label>Enter length</label>  <input type="text" name="length" value=""/>
            <input type="submit" name="area" value="submit">
            
        </form>
         <%
            Object responseRectangle = request.getAttribute("message");
            out.println(responseRectangle);
        %>
        <br>
        <br>
        <br>
        <img src ="images\radius.jpg">
        <br>
        <br>
        <form method="POST" action="CalResults.jsp" >
            <label>Enter radius</label>   <input type="text" name="radius" value=""/>
            <input type="submit" name="radius" value="submit">

        </form>
        <br>
        <br>
        <img src ="images\triangle.jpg">
        <br>
        <br>
        <br>
        <form method="POST" action="CalResults.jsp" >
            <label>Enter Opposite Side</label>   <input type="text" name="opposite" value=""/>
            <label>Enter Adjacent Side</label>  <input type="text" name="adjacent" value=""/>
            <input type="submit" name="hypotenuse" value="submit">

        </form>
    </center>
    </body>
</html>
