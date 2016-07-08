package pl.decerto.workshop.elastic;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SearchService {

	public String doSomeSearching() {
		log.info("Starting searching");
		return "searching";
	}
}
