package ru.dvfu.mrcpk.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dvfu.mrcpk.restapi.generators.Generator;
import ru.dvfu.mrcpk.restapi.model.User;

import java.util.List;


//@RequestMapping("/api/v1/user")

@RestController
@RequestMapping("/rest/questrs/user")
public class UserController {

    @Autowired
    Generator generator;

    @GetMapping
    List<User> get() {
        return generator.getUserList();
    }

    @GetMapping("{id}")
    User getById(@PathVariable("id") int id){
        return generator.getUserList().stream()
                .filter(u->u.getId()==id)
                .findAny().get();
    }

}
