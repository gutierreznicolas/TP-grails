package proyecto

import grails.gorm.services.Service

@Service(Tipoarreglo)
interface TipoarregloService {

    Tipoarreglo get(Serializable id)

    List<Tipoarreglo> list(Map args)

    Long count()

    void delete(Serializable id)

    Tipoarreglo save(Tipoarreglo tipoarreglo)

}