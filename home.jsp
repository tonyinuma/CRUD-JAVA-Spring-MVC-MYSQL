<%-- 
    Document   : home
    Created on : 23/06/2018, 07:31:32 PM
    Author     : LEO
--%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi página JDBC Template</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >
        <script defer src="https://use.fontawesome.com/releases/v5.1.0/js/all.js"></script>
    </head>
    <body>
        <div class="container" align="center">
                <h1>Practice Makes PERFECT</h1>
                <hr>   
                <p>
                    <a href="<c:url value="add.htm"/>" class="btn btn-success" ><i class="fas fa-plus"></i>Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Nombre</td>
                            <td>Email</td>
                            <td>Teléfono</td>
                            <td>Acciones</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id}"/></td>
                                <td><c:out value="${dato.nombre}"/></td>
                                <td><c:out value="${dato.correo}"/></td>
                                <td><c:out value="${dato.telefono}"/></td>
                                <td>
                                    <a href="edit.htm?id=${dato.id}" class="btn btn-dark" ><i class="far fa-edit"></i></a>
                                    <a href="delete.htm?id=${dato.id}" class="btn btn-danger" ><i class="fas fa-trash"></i></a>
                                    <a href="#" class="btn btn-info" ><i class="fas fa-file-alt"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>                 
                </table>
        </div>
       
    </body>
</html>
