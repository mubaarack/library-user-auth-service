package com.teal.library.springsecurityjwt;

import com.teal.library.springsecurityjwt.models.User;
import com.teal.library.springsecurityjwt.viewmodels.UserForm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class LibraryRegistrationService {

    public int RegisterUser(UserForm user){ // throws EmailExistsException {
//        if (emailExist(user.getEmail())) {
//            throw new EmailExistsException(
//                    "There is an account with that email address:" + user.getEmail());
//        }
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        DataAccess db = new DataAccess();
            User newUser = new User();
            newUser.setFirstname(user.getFirstname());
            newUser.setLastname(user.getLastname());
            newUser.setPassword(passwordEncoder.encode(user.getPassword()));
            newUser.setEmail(user.getEmail());
            newUser.setRole("Admin");
            newUser.setUsername(user.getUsername());
            int readerid = db.AddReader(user);
            if(readerid != -1)
                return db.AddUser(newUser, readerid);
            else
                return readerid;
    }
}
