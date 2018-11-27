package proyecto

import grails.gorm.services.Service

@Service(Repuesto)
interface RepuestoService {

    Repuesto get(Serializable id)

    List<Repuesto> list(Map args)

    Long count()

    void delete(Serializable id)

    Repuesto save(Repuesto repuesto)

}