package michaelj.crud.crud.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<UserAccount, Long> {
    UserAccount findByUsername(String username);
}
