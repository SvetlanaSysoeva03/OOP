package ru.geekbrains.oop.lesson7.observer;

public class Manager implements Observer{
    private String name;
    private int salary;

    public Manager(String name){
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }
}