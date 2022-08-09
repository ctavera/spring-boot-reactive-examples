package da.springframework.springbootreactiveexamples.repositories;

import da.springframework.springbootreactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public Mono<Person> findById(Integer id) {
        return null;
    }

    @Override
    public Flux<Person> findAll() {
        return null;
    }
}
