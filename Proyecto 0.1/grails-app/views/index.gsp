<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>
<body >
    

    <div class="svg" role="presentation" >
       
           <center> <asset:image src="taller-mecanico.jpg" class="grails-logo" /></center>
           <asset:image src="download.jpg" class="grails-logo2"  />
           <asset:image src="logo3.jpg" class="grails-logo3" align="right"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1 class="caja">Bienvenido al administrador de talleres!!!</h1>

            <p>
                En esta pagina podra realizar el alta/baja/edicion de mecanicos , repuestos , categorias , arreglos y tipos de arreglos
            </p>

            <div id="controllers" role="navigation">
                <h2 class="caja">Seleccione la funcionalidad que desea:</h2>
                <ul>
                  <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                         <li class="controller">
                            <center><g:link controller="${c.logicalPropertyName}">Administrar ${c.name}</g:link></center> 
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
