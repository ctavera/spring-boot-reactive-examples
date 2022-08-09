package da.springframework.springbootreactiveexamples.repositories;

import da.springframework.springbootreactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = new Person(1, "Michael", "Mayers");
    Person jason = new Person(2, "Jason", "Voorhies");
    Person sam = new Person(3, "Sam", "Fisher");
    Person emma = new Person(4, "Emma", "Stone");

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael, jason, sam, emma);
    }
}
