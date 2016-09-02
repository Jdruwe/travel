package be.jeroendruwe.countryservice.error;

/**
 * Created by jdruwe on 14/06/16.
 */
public class CountryNotFoundException extends Exception {

    private String country;

    private static final long serialVersionUID = 1331452128134976250L;

    public CountryNotFoundException(String country) {
        super("Country with name: " + country + " was not found");
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
