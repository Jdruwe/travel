package be.jeroendruwe.authserver.repository;

import be.jeroendruwe.authserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jdruwe on 16/06/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
