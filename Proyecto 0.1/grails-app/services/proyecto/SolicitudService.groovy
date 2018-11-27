package proyecto

import grails.gorm.transactions.Transactional
import proyecto.*

@Transactional
class SolicitudService {

    public void nuevaSolicitud(String pat, String desc, String lat, String lon) {
    	new Solicitud(patente: pat, descripcion: desc, latitud: lat, longitud: lon).save()
    }
}
