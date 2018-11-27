package proyecto

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class RepuestoServiceSpec extends Specification {

    RepuestoService repuestoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Repuesto(...).save(flush: true, failOnError: true)
        //new Repuesto(...).save(flush: true, failOnError: true)
        //Repuesto repuesto = new Repuesto(...).save(flush: true, failOnError: true)
        //new Repuesto(...).save(flush: true, failOnError: true)
        //new Repuesto(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //repuesto.id
    }

    void "test get"() {
        setupData()

        expect:
        repuestoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Repuesto> repuestoList = repuestoService.list(max: 2, offset: 2)

        then:
        repuestoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        repuestoService.count() == 5
    }

    void "test delete"() {
        Long repuestoId = setupData()

        expect:
        repuestoService.count() == 5

        when:
        repuestoService.delete(repuestoId)
        sessionFactory.currentSession.flush()

        then:
        repuestoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Repuesto repuesto = new Repuesto()
        repuestoService.save(repuesto)

        then:
        repuesto.id != null
    }
}
