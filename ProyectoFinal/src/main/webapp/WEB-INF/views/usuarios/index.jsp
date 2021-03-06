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
                      <table class="table table-responsive table-striped table-hover">
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
											<td><a href="#"
												<%--  href="<%=request.getContextPath()%>/usuario/${usuario.id_usuario}/historial/"--%>
												class="btnbtn-danger btn-xs" data-toggle="modal" data-target="#myModal"> <i
													class="fa fa-list"></i> Consultar historial
												</a>
											</td>
											<td>
												<!-- <a href="#"onclick="consultarFacturas()">Consultate :v</a> -->
												<form action="historial" id="searchForm">
												  <input type="text" value="${usuario.id_usuario}" name="s" style="visibility:hidden">
												  <input type="submit" value="Consultar">
												</form>
											</td>
										</tr>
									</c:forEach> 
							    </c:if>
						</tbody>
					</table>
					<div id="result"></div>
					 <c:if test="${empty usuarios}">
						<div style="margin:30px;margin-bottom:126px">No hay usuarios ...</div>
					 </c:if>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
	         <div id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" class="modal fade text-left">
                        <div style="margin-top:90px"role="document" class="modal-dialog">
                          <div class="modal-content">
                            <div class="modal-header">
                              <h4 id="exampleModalLabel" class="modal-title">Historial de Compras</h4>
                              <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">�</span></button>
                            </div>
                            <div class="modal-body">
                              <p>Aqui se muestran todas sus compras.</p>
                              <c:if test="${empty historial}">
								<div style="margin:30px;margin-bottom:80px">Aun no tienes ninguna compra ...</div>
							 </c:if>
                              <c:forEach var="usuario" items="${historial}">
                              	<div>
                              	</div>
                              </c:forEach> 
                            </div>
                            <div class="modal-footer">
                              <button type="button" data-dismiss="modal" class="btn btn-secondary">Cerrar</button>
                             <!-- <button type="button" class="btn btn-primary">Save changes</button> --> 
                            </div>
                          </div>
                        </div>
                      </div>
	          	<%@ include file="/WEB-INF/views/shared/footer.jsp" %>
	      </div>
   	  </div>
   	  <%@ include file="/WEB-INF/views/shared/javascript.jsp" %>
   </div>
   <script type="text/javascript">
   $( "#searchForm2" ).submit(function( event ) {
	   event.preventDefault();
	   consultarFacturas();
	   <!--
	   // Get some values from elements on the page: 
	   var $form = $( this ),
	     term = $form.find( "input[name='s']" ).val(),
	     url = $form.attr( "action" );
	   // Send the data using post
	   ///url="http://localhost:8080/proyecto/facturas/1000";
	   var posting = $.post( url, { s: term } );
	  	console.log(url);
	  
	   // Put the results in a div
	   posting.done(function( data ) {
	     var content = $( data ).find( "#content" );
	     $( "#result" ).empty().append( content );
	   });-->
	   
	 });
   $(document).ready(function(){
	    $("#searchForm").click(function(){
	        $.get("http://localhost:8080/proyecto/facturas?s=1000", function(data, status){
	            alert("Data: " + data + "\nStatus: " + status);
	        });
	    });
	});
   <!--
	 function consultarFacturas(){
	  $.post( "http://localhost:8080/proyecto/facturas?s=1000", function( data ) {
		   alert( "Data Loaded: " + data );
		   console.log(data);
		 });-->
	 
   </script>
</body>
</html>
