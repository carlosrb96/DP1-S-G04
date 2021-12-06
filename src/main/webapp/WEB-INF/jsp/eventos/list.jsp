<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>

<petclinic:layout pageName="eventos">
	<h2>Eventos</h2>
	<table id="eventosTable" class="table table-striped">
		<thead>
			<tr>
				<th style="width: 50%;">Nombre</th>
				<th style="width: 50%;">Fecha</th>
				<th style="width: 50%;">Hora</th>
				<th style="width: 50%;">Lugar</th>			
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${eventos}" var="evento">
				<tr>
					<td><a href="<c:url value="/evento/show/${evento.id}"/>"
						class="btn btn-primary btn-block"><c:out value="${evento.nombre}"/></a></td>
					<td><c:out value="${evento.fecha}" /></td>
					<td><c:out value="${evento.hora}" /></td>
					<td><c:out value="${evento.lugar}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</petclinic:layout>
