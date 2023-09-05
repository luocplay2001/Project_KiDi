package net.codejava.service.impl;

import net.codejava.model.ChangePassword;
import net.codejava.model.User;
import net.codejava.repository.ChangePasswordRepository;
import net.codejava.service.ChangePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangePasswordImpl implements ChangePasswordService {

    @Autowired private ChangePasswordRepository changePasswordRepository;

    @Override
    public ChangePassword save(ChangePassword changePassword) {
        return changePasswordRepository.save(changePassword);
    }

    @Override
    public List<ChangePassword> findAllByUserOrderByChangeDateDesc(User user) {
        return changePasswordRepository.findAllByUserOrderByChangeDateDesc(user);
    }
}
