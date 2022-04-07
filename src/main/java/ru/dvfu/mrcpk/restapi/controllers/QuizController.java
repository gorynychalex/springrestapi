package ru.dvfu.mrcpk.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dvfu.mrcpk.restapi.generators.Generator;
import ru.dvfu.mrcpk.restapi.model.Question;
import ru.dvfu.mrcpk.restapi.model.Quiz;

import java.util.List;

//@RequestMapping("/api/v1/quiz")

@RestController
@RequestMapping("/rest/questrs/quiz")
public class QuizController {

    @Autowired
    Generator generator;

    @GetMapping
    Quiz getQuiz(){
        return generator.getQuiz();
    }

    @GetMapping("/{id}")
    Quiz getQuizById(@PathVariable int id){
        return generator.getQuizes().stream()
                .filter(q->q.getId()==id)
                .findFirst().get();
    }
}
