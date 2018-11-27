package proyecto

class ClienteController {

    static scope = "session"

	def solicitudService
	
    def index() {

    }

    //debe registrar y publicar la solicitud de modo q quede visible a los mecanico
    def solicitarMecanico() {
        solicitudService.nuevaSolicitud(params.patente, params.descripcion, params.latitude, params.longitude)
    	session.patente = params.patente
    	redirect(action: 'index')
    }    
}
