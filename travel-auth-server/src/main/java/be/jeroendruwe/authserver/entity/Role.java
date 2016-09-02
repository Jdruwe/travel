package be.jeroendruwe.authserver.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by jdruwe on 16/06/16.
 */

@Entity
public class Role implements GrantedAuthority {

    private static final long serialVersionUID = -5402095458940886480L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String role;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Set<User> users;

    public Role() {

    }

    @Override
    public String getAuthority() {
        return role;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public Set<User> getUsers() {
        return users;
    }
}
