package net.codejava.service;

import net.codejava.model.ChangePassword;
import net.codejava.model.User;

import java.util.List;

public interface ChangePasswordService {
    ChangePassword save(ChangePassword changePassword);

    List<ChangePassword> findAllByUserOrderByChangeDateDesc(User user);
}
