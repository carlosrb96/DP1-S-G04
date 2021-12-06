<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>

<petclinic:layout pageName="actividades">
	<h2>Actividades</h2>
	<table id="actividadesTable" class="table table-striped">
		<thead>
			<tr>
				<th style="width: 50%;">Descripción</th>
				<th style="width: 50%;">Categoría</th>
				<th style="width: 50%;">Sede</th>
				<th style="width: 50%;">Monitor</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${actividades}" var="actividad">
				<tr>
					<td><a href="<c:url value="/actividades/show/${actividad.id}"/>"
						class="btn btn-primary btn-block"><c:out value="${actividad.descripcion}"/></a></td>
					<td><c:out value="${actividad.categoria}" /></td>
					<td><c:out value="${actividad.sede.nombre}" /></td>
					<td><c:out value="${actividad.monitor.nombre}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</petclinic:layout>
