package proyecto

import grails.gorm.services.Service

@Service(Mecanico)
interface MecanicoService {

    Mecanico get(Serializable id)

    List<Mecanico> list(Map args)

    Long count()

    void delete(Serializable id)

    Mecanico save(Mecanico mecanico)

}