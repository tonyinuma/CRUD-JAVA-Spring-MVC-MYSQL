<%-- 
    Document   : add
    Created on : 25/06/2018, 09:49:36 PM
    Author     : LEO
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuario</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >
    </head>
    <body>
        <div class="container">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="<c:url value="/home.htm" />">Agregar Usuario</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Agregar</li>
                </ol>
            </nav>
            <div class="card bg-">
                <div class="card-header">Formulario</div>
                <div class="card-body">
                   
                        <form:form method="post" commandName="usuarios">
                            <h1>Complete el formulario</h1>
                            
                            <form:errors path="*" element="div" cssClass="alert alert-danger" />
                            
                            <p>
                                <form:label path="nombre">Nombre:</form:label>
                                <form:input path="nombre" cssClass="form-control" />
                                
                            </p>
                            
                            <p>
                                <form:label path="correo">Correo electrónico</form:label>
                                <form:input path="correo" cssClass="form-control" />
                            </p>
                            
                            <p>
                                <form:label path="telefono">Teléfono</form:label>
                                <form:input path="telefono" cssClass="form-control" />
                            </p>
                            <hr />
                            <div align="center">
                                <input align="center" type="submit" value="Enviar" class="btn btn-danger" />
                            </div>
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
