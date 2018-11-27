package proyecto

import grails.gorm.services.Service

@Service(Arreglo)
interface ArregloService {

    Arreglo get(Serializable id)

    List<Arreglo> list(Map args)

    Long count()

    void delete(Serializable id)

    Arreglo save(Arreglo arreglo)

}