package be.jeroendruwe.favoriteservice.controller;

import be.jeroendruwe.favoriteservice.constant.AuthoritiesConstants;
import be.jeroendruwe.favoriteservice.entity.Favorite;
import be.jeroendruwe.favoriteservice.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jdruwe on 14/06/16.
 */

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class FavoriteController {

    @Autowired
    private FavoriteRepository favoriteRepository;

    //TODO: implement using hateoas

    @PreAuthorize("hasAuthority('" + AuthoritiesConstants.ADMIN + "')")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Favorite> getAll() {
        return favoriteRepository.findAll();
    }

    //TODO implement get favorites by userId


}
