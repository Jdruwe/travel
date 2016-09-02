package be.jeroendruwe.attractionservice.repository;

import be.jeroendruwe.attractionservice.entity.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {

    Iterable<Attraction> findByCountryId(Long countryId);

}
