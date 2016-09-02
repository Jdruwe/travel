package be.jeroendruwe.countryservice.repository;

import be.jeroendruwe.countryservice.entity.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jdruwe on 03/06/16.
 */

public interface CountryRepository extends CrudRepository<Country, Long> {

}
