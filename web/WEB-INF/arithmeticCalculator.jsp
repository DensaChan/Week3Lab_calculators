<%-- 
    Document   : arithmeticCalculator
    Created on : 24-Jan-2023, 8:05:12 PM
    Author     : Densa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <div>
            <h1>Arithmetic Calculator</h1>
        </div>
        <form method="post" action="age">
            <div>            
                Enter your age: <input type="text" name="age" value="${age}"><br>
                <input type="submit" value="Age next birthday">
            </div>
        </form>
        <div>
            ${message}
        </div>
        <div>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
