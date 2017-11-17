<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="/WEB-INF/views/shared/head.jsp" %>
	<title>Editar Producto</title>
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
	            	<li> <a href="../inicio"><i class="icon-home"></i>Inicio</a></li>
	            	<li><a href="#dashvariants" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>Productos </a>
	              		<ul id="dashvariants" class="collapse list-unstyled">
	                		<li><a href="<%=request.getContextPath()%>/productos">Visualizar los Productos</a></li>
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
			        	  <h2 class="no-margin-bottom">Editar Producto</h2>
			         </div>
			    </header>
	 
	          <!--Contenido especifico de sections-->
        		 <section class="forms"> 
            <div class="container-fluid">
              <div class="row">
                <!-- Horizontal Form-->
                <div class="col-lg-12">
                  <div class="card">
                    <div class="card-header d-flex align-items-center">
                      <h3 class="h4"></h3>
                    </div>
                    <div class="card-body">
                      <form:form action="update" method="POST" class="form-horizontal" modelAttribute="producto">
                        <div class="form-group row">
                          <label class="col-sm-3 form-control-label">Codigo de barras</label>
                          <div class="col-sm-9">
                            <form:input path="codigo_barras" type="text" class="form-control form-control-success" required/>
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-sm-3 form-control-label">Nombre</label>
                          <div class="col-sm-9">
                          <form:input path="nombre" type="text" class="form-control form-control-success"  required/>
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-sm-3 form-control-label">Precio</label>
                          <div class="col-sm-9">
                           <form:input path="precio" type="number" class="form-control form-control-success"  required/>
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-sm-3 form-control-label">Categoria</label>
                          <div class="col-sm-9">
                            <form:input path="categoria" type="text" class="form-control form-control-success"  required/>
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-sm-3 form-control-label">Peso</label>
                          <div class="col-sm-9">
                            <form:input path="peso" type="number" class="form-control form-control-success"  required/>
                           </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-sm-3 form-control-label">Detalle</label>
                          <div class="col-sm-9">
                            <form:input path="detalle" type="text" class="form-control form-control-success"  required/>
                          </div>
                        </div>
                        <div class="form-group row">       
                          <div class="col-sm-9 offset-sm-3">
                            <input type="submit" value="Actualizar" class="btn bg-primary text-white"/>
                            <a href="<%=request.getContextPath()%>/productos"class="btn btn-outline-primary">Cancelar</a>
                          </div>
                        </div>
                      </form:form>
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

