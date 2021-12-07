<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<petclinic:layout pageName="eventos">

    <table class="table table-striped">
        <tr>
            <th>Nombre</th>
            <td><b><c:out value="${evento.nombre}"/></b></td>
        </tr>
         <tr>
            <th>Descripción</th>
            <td><b><c:out value="${evento.descripcion}"/></b></td>
        </tr>
         <tr>
            <th>Fecha</th>
            <td><b><c:out value="${evento.fecha}"/></b></td>
        </tr>
        <tr>
            <th>Hora</th>
            <td><b><c:out value="${evento.hora}"/></b></td>
        </tr>
         <tr>
            <th>Lugar</th>
            <td><b><c:out value="${evento.lugar}"/></b></td>
        </tr>
        <tr>
            <th>Sede Organizadora</th>
            <td><b><c:out value="${evento.sede.nombre}"/></b></td>
        </tr>
        </table>
             
</petclinic:layout>