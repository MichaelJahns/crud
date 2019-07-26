package michaelj.crud.crud.account;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class UserAccount implements UserDetails {

    @GeneratedValue
    @Id
    private long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String joinDate;

    public UserAccount(String username, String password, String joinDate, PasswordEncoder encoder){
        this.username = username;
        this.password = encoder.encode(password);
        this.joinDate = joinDate;

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
