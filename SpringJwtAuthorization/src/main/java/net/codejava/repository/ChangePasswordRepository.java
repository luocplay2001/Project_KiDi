package net.codejava.repository;

import net.codejava.model.ChangePassword;
import net.codejava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChangePasswordRepository extends JpaRepository<ChangePassword, Integer> {
    List<ChangePassword> findAllByUserOrderByChangeDateDesc(User user);
}
