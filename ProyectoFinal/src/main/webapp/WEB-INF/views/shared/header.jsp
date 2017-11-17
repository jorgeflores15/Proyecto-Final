	<header class="header">
        <nav class="navbar">
          <!-- Search Box-->
          <div class="search-box">
            <button class="dismiss"><i class="icon-close"></i></button>
            <form id="searchForm" action="#" role="search">
              <input type="search" placeholder="Que es lo que estas buscando..." class="form-control">
            </form>
          </div>
          <div class="container-fluid">
            <div class="navbar-holder d-flex align-items-center justify-content-between">
              <!-- Navbar Header-->
              <div class="navbar-header">
                <!-- Navbar Brand --><a href="<%=request.getContextPath()%>/inicio" class="navbar-brand">
                  <div class="brand-text brand-big hidden-lg-down"><span>FAST</span><strong>Market</strong></div>
                  <div class="brand-text brand-small"><strong>FM</strong></div></a>
                <!-- Toggle Button--><a id="toggle-btn" href="#" class="menu-btn active"><span></span><span></span><span></span></a>
              </div>
              <!-- Navbar Menu -->
              <ul class="nav-menu list-unstyled d-flex flex-md-row align-items-md-center">
                <!-- Search-->
                <li class="nav-item d-flex align-items-center"><a id="search" href="#"><i class="icon-search"></i></a></li>
                <li style="text-align: center; margin-right: 20px" class="nav-item d-flex align-items-center"><a ><i></i></a></li>
                <!-- Profile-->
                <li class="nav-item dropdown"> 
                  <a id="messages" rel="nofollow" data-target="#" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="nav-link">
                    <i class="fa fa-user"></i>
                  </a>
                  <ul aria-labelledby="notifications" class="dropdown-menu">
                    <li>
                      <a rel="nofollow" href="#" class="dropdown-item all-notifications text-center">
                        <strong>Ir a Configuracion</strong>
                      </a>
                    </li>
                    <hr>
                    <li>
                      <a rel="nofollow" href="<%=request.getContextPath()%>" class="dropdown-item all-notifications logout text-center">
                        <strong>Cerrar Sesion</strong>
                      </a>
                    </li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </header>