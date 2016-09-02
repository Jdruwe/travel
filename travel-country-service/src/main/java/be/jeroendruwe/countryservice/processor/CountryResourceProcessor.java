package be.jeroendruwe.countryservice.processor;

import be.jeroendruwe.countryservice.entity.Country;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by jdruwe on 12/06/16.
 */

@Component
public class CountryResourceProcessor implements ResourceProcessor<Resource<Country>> {

    @Override
    public Resource<Country> process(Resource<Country> countryResource) {
        countryResource.add(new Link("http://www.google.be", "test"));
        return countryResource;
    }

}
