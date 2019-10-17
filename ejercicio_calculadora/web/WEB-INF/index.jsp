<%-- 
    Document   : index.jsp
    Created on : 11/10/2019, 11:57:37 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width, initial-scale=1.0">
        <meta charset="UTF-8">
        <title>CALCULADORA CON JSP</title>
    </head>
    <body>
        <center><div>MI CALCULADORA</div></center>
        
        <form action="controlador_calculadora" method="POST">
            <center>
                <table>
                    <tr><td>valor 1</td><input type="number" name="valor1"/></td></tr>
                    <tr><td>valor 2</td><input type="number" name="valor2"/></td></tr>
                    <tr><td><input type="submit" name="operacion" value="sumar"/></td></tr>
                    <td><input type="submit" name="operacion" value="restar"/></td>
                    <td><input type="submit" name="operacion" value="multiplicar"/></td>
                    <td><input type="submit" name="operacion" value="dividir"/></td>
                </table>
            </center>
            
            
        </form>
    
    </body>
</html>
