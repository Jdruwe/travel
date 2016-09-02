package be.jeroendruwe.countryservice.advice;

import be.jeroendruwe.countryservice.error.CountryNotFoundException;
import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;


/**
 * Created by jdruwe on 14/06/16.
 */

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
@ResponseBody
public class CountryControllerAdvice {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(CountryNotFoundException.class)
    public VndErrors countryNotFoundException(CountryNotFoundException e) {
        return this.error(e, e.getCountry());
    }

    private <E extends Exception> VndErrors error(E e, String logref) {
        String msg = Optional.of(e.getMessage()).orElse(e.getClass().getSimpleName());
        return new VndErrors(logref, msg);
    }

}
