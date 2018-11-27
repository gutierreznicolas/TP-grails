package proyecto

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class MecanicoServiceSpec extends Specification {

    MecanicoService mecanicoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Mecanico(...).save(flush: true, failOnError: true)
        //new Mecanico(...).save(flush: true, failOnError: true)
        //Mecanico mecanico = new Mecanico(...).save(flush: true, failOnError: true)
        //new Mecanico(...).save(flush: true, failOnError: true)
        //new Mecanico(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //mecanico.id
    }

    void "test get"() {
        setupData()

        expect:
        mecanicoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Mecanico> mecanicoList = mecanicoService.list(max: 2, offset: 2)

        then:
        mecanicoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        mecanicoService.count() == 5
    }

    void "test delete"() {
        Long mecanicoId = setupData()

        expect:
        mecanicoService.count() == 5

        when:
        mecanicoService.delete(mecanicoId)
        sessionFactory.currentSession.flush()

        then:
        mecanicoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Mecanico mecanico = new Mecanico()
        mecanicoService.save(mecanico)

        then:
        mecanico.id != null
    }
}
