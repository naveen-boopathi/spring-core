package org.example.modules;


import java.beans.ConstructorProperties;

public class ExampleBean {
    private final int years;

    private final String ultimateAnswer;

//    public ExampleBean(int years, String ultimateAnswer) {
//        this.years = years;
//        this.ultimateAnswer = ultimateAnswer;
//    }

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

}
