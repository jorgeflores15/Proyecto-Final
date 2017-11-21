<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html xmlns:h="http://java.sun.com/jsf/html">
<head>
	<%@ include file="/WEB-INF/views/shared/head.jsp" %>
	<title>Lista de Usuarios</title>
</head>
<body>
	<div class="page home-page">
   		<%@ include file="/WEB-INF/views/shared/header.jsp" %>
   		<div class="page-content d-flex align-items-stretch">
   			<nav class="side-navbar">
	        	<!-- Sidebar Header-->
	          	<div class="sidebar-header d-flex align-items-center">
	            	<div class="avatar"><img src="<%=request.getContextPath()%>/resources/img/avatar.jpg" alt="..." class="img-fluid rounded-circle"></div>
	            	<div class="title">
	              		<h1 class="h4">Jorge Flores</h1>
	              		<p>Administrador</p>
	            	</div>
	          	</div>
	         <!-- Sidebar Navidation Menus--><span class="heading">Principal</span>
	          	<ul class="list-unstyled">
	            	<li> <a href="<%=request.getContextPath()%>/inicio"><i class="icon-home"></i>Inicio</a></li>
	            	<li><a href="#dashvariants" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>Productos </a>
	              		<ul id="dashvariants" class="collapse list-unstyled">
	                		<li><a href="<%=request.getContextPath()%>/productos">Visualizar los Productos</a></li>
	                		<li><a href="<%=request.getContextPath()%>/producto/nuevo">Registrar nuevo Producto</a></li>
	              		</ul>
	            	</li>
	            	<li class="active"><a href="#dashvariants2" aria-expanded="false" data-toggle="collapse"> <i class="icon-grid"></i>Usuarios</a>
	              		<ul id="dashvariants2" class="collapse list-unstyled">
	                		<li class="active"><a>Visualizar Usuarios</a></li>
			            </ul>
			        </li>
		            <li><a href="#dashvariants3" aria-expanded="false" data-toggle="collapse"> <i class="icon-padnote"></i>Proveedores</a>
		            	<ul id="dashvariants3" class="collapse list-unstyled">
		                	<li><a href="#">Visualizar los Proveedores</a></li>
			                <li><a href="#">Registrar nuevo Proveedor</a></li>
			            </ul>
	            	</li>
	          	</ul>
	         <span class="heading">Extras</span>
	          	<ul class="list-unstyled">
		            <li> <a href="#"> <i class="fa fa-bar-chart"></i>Estadisticas </a></li>
		            <li> <a href="#"> <i class="icon-mail"></i>Mensajes </a></li>
		        </ul>
	       </nav>
	       <div class="content-inner">
	      		<!-- Page Header-->
	          	<header class="page-header">
			         <div class="container-fluid">
			        	  <h2 class="no-margin-bottom">Lista de usuarios</h2>
			         </div>
			    </header>
	 
	       <section class="tables">   
            <div class="container-fluid">
              <div class="row">
                <div class="col-lg-12">
                  <div class="card">
                    <div class="card-header d-flex align-items-center">
                      	<h3 class="h4"></h3>
                      	<form method="POST" action="producto/buscar">
							<input type="text" name="inptBuscar"/>
							<input class="btn btn-primary" type="submit" value="Buscar"/>
						</form>
                    </div>
                    <div class="card-body">
                      <table class="table table-striped table-hover">
                        <thead>
                          <tr>
                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Avatar</th>
                            <th>Correo</th>
                            <th></th>
                            <th></th>
                          </tr>
                        </thead>
                        <tbody>
							    <c:if test="${not empty usuarios}">
							       <c:forEach var="usuario" items="${usuarios}">
										<tr>
											<th scope="row">${usuario.id_usuario}</th>
											<td>${usuario.nombres}</td>
											<td>${usuario.avatar}</td>
											<td>${usuario.correo}</td>
											<%-- <td><a
												href="<%=request.getContextPath()%>/usuario/${usuario.id_usuario}/editar"
												class="btnbtn-info btn-xs"> <i
													class="fa fa-edit"></i>Edit
											</a></td>--%>
												<td><a href="#"
												<%--  href="<%=request.getContextPath()%>/usuario/${usuario.id_usuario}/historial/"--%>
												class="btnbtn-danger btn-xs"> <i
													class="fa fa-list"></i> Consultar historial
											</a></td>
										</tr>
									</c:forEach> 
							    </c:if>
						</tbody>
					</table>
					 <c:if test="${empty usuarios}">
						<div style="margin:30px;margin-bottom:126px">No hay usuarios ...</div>
					 </c:if>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
	         
	          	<%@ include file="/WEB-INF/views/shared/footer.jsp" %>
	      </div>
   	  </div>
   	  <%@ include file="/WEB-INF/views/shared/javascript.jsp" %>
   </div>
</body>
</html>
