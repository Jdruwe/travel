package be.jeroendruwe.attractionservice.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String detail;

    @NotNull
    @Column(nullable = false)
    private Long countryId;

    public Attraction(String name, String detail, Long countryId) {
        this.name = name;
        this.detail = detail;
        this.countryId = countryId;
    }

    Attraction() {

    }

    public String getName() {
        return name;
    }

    public long getCountryId() {
        return countryId;
    }

    public String getDetail() {
        return detail;
    }
}
