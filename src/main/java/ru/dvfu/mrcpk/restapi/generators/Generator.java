package ru.dvfu.mrcpk.restapi.generators;

import org.springframework.stereotype.Service;
import ru.dvfu.mrcpk.restapi.model.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class Generator {

    public List<User> getUserList(){
        return new ArrayList<>() {{
            add(new User(100,"Супер","Админ","12345678", UserCategory.ADMIN));
            add(new User(200,"Мария","Васильева","12345678", UserCategory.TEACHER));
            add(new User(300,"Вася","Пупкин","12345678", UserCategory.STUDENT));
        }};
    }

    public Quiz getQuiz(){

        List<Option> optionListQuestion1 = new ArrayList<>(){{
            add(new Option(1001,"equals", true));
            add(new Option(1002,"equal", false));
            add(new Option(1003,"hashCode", true));
            add(new Option(1004,"copy", false));
        }};
        Question question1 = new Question(101,"Выберите правильные методы класса Object", optionListQuestion1);

        List<Option> optionListQuestion2 = new ArrayList<>(){{
            add(new Option(1001,"interface", true));
            add(new Option(1002,"goto", false));
            add(new Option(1003,"unsigned", false));
            add(new Option(1004,"fun", false));
        }};
        Question question2 = new Question(102,"Укажите верные ключевые слова java", optionListQuestion2);

        List<Option> optionListQuestion3 = new ArrayList<>(){{
            add(new Option(1001,"Array a = new Array(5)", false));
            add(new Option(1002,"int[] a = { 45, 19, 46, 32 }", true));
            add(new Option(1003,"int a() = new int[5]", true));
            add(new Option(1004,"int a = null", false));
        }};
        Question question3 = new Question(103,"Какой вариант правильно объявляет и инициализирует массив", optionListQuestion3);

        return new Quiz(1,"Java Test",
                new ArrayList<Question>(){{
                    add(question1);
                    add(question2);
                    add(question3);
        }});
    }

    public List<Quiz> getQuizes(){
        return new ArrayList<>(){{
            add(getQuiz());
        }};
    }
}
