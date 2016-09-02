package be.jeroendruwe.attractionservice.controller;

import be.jeroendruwe.attractionservice.constant.AuthoritiesConstants;
import be.jeroendruwe.attractionservice.entity.Attraction;
import be.jeroendruwe.attractionservice.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jdruwe on 14/06/16.
 */

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AttractionController {

    @Autowired
    private AttractionRepository attractionRepository;

    //TODO: implement using hateoas

    @PreAuthorize("hasAuthority('" + AuthoritiesConstants.ADMIN + "')")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Attraction> getAll() {
        return attractionRepository.findAll();
    }

    @PreAuthorize("hasAuthority('" + AuthoritiesConstants.ADMIN + "')")
    @RequestMapping(method = RequestMethod.GET, value = "/{countryId}")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Attraction> getByCountry(@PathVariable("countryId") Long countryId) {
        return attractionRepository.findByCountryId(countryId);
    }


}
