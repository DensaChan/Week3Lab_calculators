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
        <form method="post" action="arithmetic">
            <div>            
                First <input type="text" name="first" value="${first}"><br>
                Second <input type="text" name="second" value="${second}"><br>
                <!-- operators buttons -->
                <input type="submit" name="operation" value="+">
                <input type="submit" name="operation" value="-">
                <input type="submit" name="operation" value="*">
                <input type="submit" name="operation" value="%">
                <br>
            </div>
        </form>
        <br>
        <div>
            Result: ${result}
        </div>
        <div>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
