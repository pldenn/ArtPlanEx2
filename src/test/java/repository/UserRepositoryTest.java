package repository;

import data.User;
import exception.ErrorNameException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.UserService;

import java.util.ArrayList;

class UserRepositoryTest {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User Petya = new User("Petya", "123");
        User Petya2 = new User("Petya", "123");
        User Alex = new User("Alex1", "1234");


    @Test
    public void shouldCheckNotAddiNameRepeat() throws ErrorNameException {
        service.add(Petya);
        service.add(Petya2);
        service.add(Alex);

        ArrayList<User> expected = new ArrayList<>();
        expected.add(Petya);
        expected.add(Alex);
        Assertions.assertEquals(expected, UserRepository.usersList);

    }

}