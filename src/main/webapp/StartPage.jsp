<%-- 
    Document   : StartPage
    Created on : Sep 12, 2016, 6:00:12 PM
    Author     : alancerio18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color:blue;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start page</title>
    </head>
    <body>
        
          <center>
        <h1>Calculator</h1>

        <img src ="images\rectangle.jpg">
        <br>
        <br>
        <form method="POST" action="CalControl?action=rectangle" >
            <label>Enter width</label>   <input type="text" name="width" value=""/>
            <label>Enter length</label>  <input type="text" name="length" value=""/>
            <input type="submit" name="area" value="submit">
            
        </form>
        ${responseRectangle}
       
        <br>
        <br>
        <br>
        <img src ="images\radius.jpg">
        <br>
        <br>
        <form method="POST" action="CalControl?action=circle" >
            <label>Enter radius</label>   <input type="text" name="radius" value=""/>
            <input type="submit" name="radius" value="submit">

        </form>
        ${responseCircle}
       
        <br>
        <br>
        <img src ="images\triangle.jpg">
        <br>
        <br>
        <br>
        <form method="POST" action="CalControl?action=triangle" >
            <label>Enter Opposite Side</label>   <input type="text" name="opposite" value=""/>
            <label>Enter Adjacent Side</label>  <input type="text" name="adjacent" value=""/>
            <input type="submit" name="hypotenuse" value="submit">

        </form>
        ${responseTriangle}
          
    </center>
    </body>
</html>
