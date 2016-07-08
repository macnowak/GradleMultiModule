package pl.decerto.workshop.gradle;

import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.decerto.workshop.elastic.SearchService;

@Slf4j
@RestController
@RequestMapping(path = "sample")
public class SomeEndpoint {

	private SearchService searchService;

	@Inject
	public SomeEndpoint(SearchService searchService) {
		this.searchService = searchService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String search() {
		log.info("aaa");
		return searchService.doSomeSearching();
	}

}
