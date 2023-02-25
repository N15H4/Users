package com.example.user.service;

import com.example.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    public static final ArrayList<User> user = new ArrayList<>();
    static int userid = 0;

    static {
        User u1 = new User(++userid, "nisha", "nisha@122", "delhi", 1234);
        user.add(u1);
    }

    public  List<User>  finduser() {
        return user;
    }

    public  User userid(String id){

        for(User us: user){
            if(us.getName().equals(id)){
                return us;
            }
        }
return null;
    }

    public void addUser(User ur){
        user.add(ur);


    }

    public String deleteUser(String name){

        for(User us :user){
            if(us.getName().equals(name)){
                user.remove(us);
            }
        }
        return "user deleted";
}
}

