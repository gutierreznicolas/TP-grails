package proyecto

class Solicitud {
	
	String patente
	String descripcion
	String latitud
	String longitud
	
    static constraints = {
    	latitud  nullable: true
    	longitud nullable: true
    }
}
