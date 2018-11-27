package proyecto

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoarregloServiceSpec extends Specification {

    TipoarregloService tipoarregloService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Tipoarreglo(...).save(flush: true, failOnError: true)
        //new Tipoarreglo(...).save(flush: true, failOnError: true)
        //Tipoarreglo tipoarreglo = new Tipoarreglo(...).save(flush: true, failOnError: true)
        //new Tipoarreglo(...).save(flush: true, failOnError: true)
        //new Tipoarreglo(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoarreglo.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoarregloService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Tipoarreglo> tipoarregloList = tipoarregloService.list(max: 2, offset: 2)

        then:
        tipoarregloList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoarregloService.count() == 5
    }

    void "test delete"() {
        Long tipoarregloId = setupData()

        expect:
        tipoarregloService.count() == 5

        when:
        tipoarregloService.delete(tipoarregloId)
        sessionFactory.currentSession.flush()

        then:
        tipoarregloService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Tipoarreglo tipoarreglo = new Tipoarreglo()
        tipoarregloService.save(tipoarreglo)

        then:
        tipoarreglo.id != null
    }
}
