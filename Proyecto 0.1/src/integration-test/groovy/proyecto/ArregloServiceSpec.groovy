package proyecto

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ArregloServiceSpec extends Specification {

    ArregloService arregloService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Arreglo(...).save(flush: true, failOnError: true)
        //new Arreglo(...).save(flush: true, failOnError: true)
        //Arreglo arreglo = new Arreglo(...).save(flush: true, failOnError: true)
        //new Arreglo(...).save(flush: true, failOnError: true)
        //new Arreglo(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //arreglo.id
    }

    void "test get"() {
        setupData()

        expect:
        arregloService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Arreglo> arregloList = arregloService.list(max: 2, offset: 2)

        then:
        arregloList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        arregloService.count() == 5
    }

    void "test delete"() {
        Long arregloId = setupData()

        expect:
        arregloService.count() == 5

        when:
        arregloService.delete(arregloId)
        sessionFactory.currentSession.flush()

        then:
        arregloService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Arreglo arreglo = new Arreglo()
        arregloService.save(arreglo)

        then:
        arreglo.id != null
    }
}
