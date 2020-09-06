package service;

import data.User;
import exception.ErrorNameException;
import repository.UserRepository;

public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void add(User user) throws ErrorNameException {
        repository.add(user);
    }

}
