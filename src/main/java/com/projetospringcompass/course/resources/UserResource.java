package com.projetospringcompass.course.resources;

import com.projetospringcompass.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1l, "pedro", "pedro@test.com","988775544","1234");
    return ResponseEntity.ok().body(u);
    }

}
