<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>

<petclinic:layout pageName="cursos">
	<h2>Cursos</h2>
	<table id="cursosTable" class="table table-striped">
		<thead>
			<tr>
				<th style="width: 50%;">Nombre</th>
				<th style="width: 50%;">Descripción</th>
				<th style="width: 50%;">Fecha de Inicio</th>
				<th style="width: 50%;">Fecha de Finalización</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cursos}" var="curso">
				<tr>
					<td><a href="<c:url value="/cursos/show/${curso.id}"/>"
						class="btn btn-primary btn-block"><c:out value="${curso.nombre}"/></a></td>
					<td><c:out value="${curso.descripcion}" /></td>
					<td><c:out value="${curso.fechaComienzo}" /></td>
					<td><c:out value="${curso.fechaFin}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</petclinic:layout>
