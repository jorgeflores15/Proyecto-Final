<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/WEB-INF/views/shared/head.jsp" %>
	<title>Iniciar Sesion</title>
</head>
<body>
	<div class="page login-page">
      <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
          <div class="row">
            <!-- Logo & Information Panel-->
            <div class="col-lg-6">
              <div class="info d-flex align-items-center">
                <div class="content">
                  <div class="logo">
                    <h1>Fast Market</h1>
                  </div>
                  <p>Panel de administración del supermercado</p>
                </div>
              </div>
            </div>
            <!-- Form Panel    -->
            <div class="col-lg-6 bg-white">
              <div class="form d-flex align-items-center">
                <div class="content">
                  <form id="login-form" action="login" method="post">
                    <div class="form-group">
                      <input id="login-username" type="text" name="loginUsername" required class="input-material">
                      <label for="login-username" class="label-material">Usuario</label>
                    </div>
                    <div class="form-group">
                      <input id="login-password" type="password" name="loginPassword" required class="input-material">
                      <label for="login-password" class="label-material">Contraseña</label>
                    </div>
                       <input type="submit" class="btn btn-primary" value="Ingresar">
                      <!-- <a href="inicio" class="btn btn-primary">Ingresar</a>-->
                    <!-- This should be submit button but I replaced it with <a> for demo purposes-->
                  </form><br><small>¿Olvidaste tu contraseña? </small><a href="#" class="signup">Haz click aquí</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <%@ include file="/WEB-INF/views/shared/javascript.jsp" %>
</body>
</html>
