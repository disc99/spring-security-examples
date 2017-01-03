package org.springframework.security.samples.user;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AccountRepository {

    Optional<Account> findOne(String username) {
        if ("user".equals(username)) {
            return Optional.of(new Account("user", "password", true, false));
        }
        if ("admin".equals(username)) {
            return Optional.of(new Account("admin", "password", true, true));
        }
        return Optional.empty();
    }
}
