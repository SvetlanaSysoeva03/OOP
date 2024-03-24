package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Company {



    private Random random = new Random();
    private Vacancy vacancy;


    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;

    }





    public void needEmployee(){
        Vacancy newVacancy = new Vacancy(maxSalary, name);
        jobAgency.sendOffer(newVacancy);


    }


}
