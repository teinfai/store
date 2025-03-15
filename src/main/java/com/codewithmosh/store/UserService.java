package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    @Autowired
    public UserService(UserRepository userRepository,@Qualifier("EMAIL")NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) throws IllegalAccessException {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalAccessException("wrong email, exist" +  user.getEmail());
        }

        userRepository.save(user);
        notificationService.SendMessage("Register Successs!", user.getName());

    }

}
