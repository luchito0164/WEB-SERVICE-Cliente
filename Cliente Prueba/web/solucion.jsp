<%-- 
    Document   : solucion
    Created on : 27/10/2016, 12:03:15 AM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="0">
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>resultado</td>
                    <td><input type="text" name="" value="${sessionScope.lista}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>

                <form action="index.html" method="POST">
                
                    <input type="submit" value="Retornar" />
                
                </form>
    </body>
</html>
