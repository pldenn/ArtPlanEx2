package repository;

import data.User;
import exception.ErrorNameException;

import java.util.ArrayList;

public class UserRepository {
   static ArrayList<User> usersList = new ArrayList<User>();

    public void add(User user) throws ErrorNameException {
        String name = user.getName();
        try {
            for (User i: usersList) {
                if (i.getName().equals(name)){
                    throw new ErrorNameException("");
                }
            }
        }catch (ErrorNameException e){
            System.out.println("Your name " + name + " is already used. Please, try another");
            return;
        }
        usersList.add(user);
        user.setAuthorization(true);
    }

}
