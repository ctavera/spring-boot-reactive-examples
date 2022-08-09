package da.springframework.springbootreactiveexamples.repositories;

import da.springframework.springbootreactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository {

    Mono<Person> findById(Integer id);

    Flux<Person> findAll();
}
