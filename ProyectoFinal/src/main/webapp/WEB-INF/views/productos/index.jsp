<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html xmlns:h="http://java.sun.com/jsf/html">
<head>
	<%@ include file="/WEB-INF/views/shared/head.jsp" %>
	<title>Lista de Productos</title>
	<script>
		function deleteProduct(id){
		    var doIt=confirm('¿Estas seguro que deseas eliminarlo?');
		  if(doIt){
			location.href ="<%=request.getContextPath()%>/producto/"+id+"/borrar";
		    }
		  else{
		
		    }
		}
	</script>
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
	            	<li class="active"><a href="#dashvariants" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>Productos </a>
	              		<ul id="dashvariants" class="collapse list-unstyled">
	                		<li class="active"style="background: #00aae3"><a>Visualizar los Productos</a></li>
	                		<li><a href="<%=request.getContextPath()%>/producto/nuevo">Registrar nuevo Producto</a></li>
	              		</ul>
	            	</li>
	            	<li><a href="#dashvariants2" aria-expanded="false" data-toggle="collapse"> <i class="icon-grid"></i>Usuarios</a>
	              		<ul id="dashvariants2" class="collapse list-unstyled">
	                		<li><a href="<%=request.getContextPath()%>/usuarios">Visualizar Usuarios</a></li>
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
			        	  <h2 class="no-margin-bottom">Lista de productos</h2>
			         </div>
			    </header>
	 
	       <section class="tables"style=" min-height: 493px;">   
            <div class="container-fluid">
              <div class="row">
                <div class="col-lg-12">
                  <div class="card">
                    <div class="card-header d-flex align-items-center">
                      	
                      	<div style=" height: 60px" class="col text-left">
	                      	<form class="form-inline">
	                      		<div style="margin-right: 20px;" class="form-group">
		                      		<div class="form-group-material">
		                              <input id="qa" type="text" name="qa" class="input-material">
		                              <label for="qa" class="label-material">¿Qué buscas?</label>
		                            </div>
	                      		</div>
	                      		<div class="form-group">
									<input class="btn btn-outline-primary" type="submit" value="Buscar"/>
								</div>
							</form>
                      	</div>
						<div class="col text-right">
						<a href="<%=request.getContextPath()%>/producto/nuevo" class="btn bg-primary text-white">Nuevo Producto</a>
						</div>
                    </div>
                    <div class="card-body">
                      <table class="table table-responsive table-striped table-hover">
                        <thead>
                          <tr>
                            <th># Codigo</th>
                            <th>Categoria</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Peso</th>
                            <th>Estado</th>
                            <th>Detalle</th>
                            <th></th>
                            <th></th>
                          </tr>
                        </thead>
                        <tbody>
							    <c:if test="${not empty productos}">
							       <c:forEach var="producto" items="${productos}">
										<tr>
											<th scope="row">${producto.codigo_barras}</th>
											<td>${producto.categoria}</td>
											<td>${producto.nombre}</td>
											<td>$/. ${producto.precio}</td>
											<td>${producto.peso}</td>
											<c:choose>
											    <c:when test="${producto.estado eq '1'}">
											       <td>Disponible</td>
											    </c:when>    
											    <c:otherwise>
											        <td>Vendido</td>
											    </c:otherwise>
											</c:choose>
											<td>${producto.detalle}</td>
											<td><a
												href="<%=request.getContextPath()%>/producto/${producto.codigo_barras}/editar"
												class="btn btn-outline-info btn-xs"> <i
													class="fa fa-edit"></i> Editar
											</a></td>
												<td>
													<input class="btn btn-outline-danger btn-xs" type="button" name="delete" value="Borrar" 
													onclick="deleteProduct(${producto.codigo_barras});" >
												</td>
										</tr>
									</c:forEach> 
							    </c:if>
						</tbody>
					</table>
					 <c:if test="${empty productos}">
						<div style="margin:30px;margin-bottom:126px">No hay productos ...</div>
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
