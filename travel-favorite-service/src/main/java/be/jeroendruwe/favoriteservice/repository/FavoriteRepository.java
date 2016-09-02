package be.jeroendruwe.favoriteservice.repository;

import be.jeroendruwe.favoriteservice.entity.Favorite;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jdruwe on 03/06/16.
 */

public interface FavoriteRepository extends CrudRepository<Favorite, Long> {

    //TODO implement get favorites by userId

}
