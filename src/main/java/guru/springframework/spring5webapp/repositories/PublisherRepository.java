package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by BB on 5/11/2021
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
