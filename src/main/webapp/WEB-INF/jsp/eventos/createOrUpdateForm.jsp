<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<petclinic:layout pageName="eventos">

    <jsp:body>
        <h2><c:if test="${evento['new']}">Nuevo </c:if>Evento</h2>
            <form:form modelAttribute="evento" class="form-horizontal">
            <div class="form-group has-feedback">
                <petclinic:inputField label="Nombre" name="nombre"/>
                <petclinic:inputField label="Descripción" name="descripcion"/>
                <petclinic:inputField label="Fecha" name="fecha"/>
                <petclinic:inputField label="Hora" name="hora"/>
                <petclinic:inputField label="Lugar" name="lugar" />
              	</div>
              	
              	<div class="form-group">
					<label class="col-sm-2 control-label">Sede</label>
					<div class="col-sm-10">
						<select name="sede" class="form-control">
							<c:forEach var="item" items="${sedes}">
								<option value="${item.id}"<c:if test="${item.id == evento.sede.id}">
           			 selected
           			 </c:if>>${item.nombre}</option>
							</c:forEach>
						</select>
					</div>
				</div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button class="btn btn-default" type="submit">Guardar Evento</button>
                </div>
            </div>
            
    </form:form>
 
 </jsp:body>
 </petclinic:layout>