<!doctype html>
<html>
<head>
    <style type="text/css">
        label{
            float:left;
            width: 65px;
        }
    </style>
</head>
<body style="align-content: center;">
        <h1>estamos buscando mecanicos...            solicitud relacionada a patente: ${session.patente}</h1>
        <section class="row colset-2-its">
            <h1>MchaniC</h1>

            <p>
                Pedí un mecanico en donde sea que estés!
            </p>
            <h1><g:link controller="cliente">Pedir mecanico!!</g:link></h1>

            <g:form controller="cliente" action="solicitarMecanico" style="padding-left: 40%; align-content: center">
		        <div style="width: 220px; align-content: center;">
		        	<g:field type="text" name="patente"/>

		            <g:textArea type="text" name="descripcion" rows="5" cols="40">Ingrese una breve descripcion</g:textArea>

		        	<g:field id="lat" type="hidden" name="latitude"/>
		        	<g:field id="lon" type="hidden" name="longitude"/>

		            <g:field name="btnU" type="button" onclick="solicitarUbicacion()" value="Adjuntar Mi Ubicacion"/>

                    <!-- Script para adjuntar ubicacion -->
		            <script type="text/javascript">
		            	function solicitarUbicacion(){
		            		navigator.geolocation.getCurrentPosition(function(pos){
		            			alert('tu Ubicacion es'+pos.coords.latitude+' | '+pos.coords.longitude);
		            			document.getElementById('lat').value = pos.coords.latitude;
		            			document.getElementById('lon').value = pos.coords.longitude;
		            		});
		            	}
		            </script>
		            <g:field name="env" type="submit" value="pedir!!"/>
		        </div>
		    </g:form>
        </section>
</body>
</html>