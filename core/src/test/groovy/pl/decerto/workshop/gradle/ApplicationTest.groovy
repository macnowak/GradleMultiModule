package pl.decerto.workshop.gradle

import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = Application.class)
class ApplicationTest extends Specification {

	def "should setup context"() {
		expect:
		true
	}

}
