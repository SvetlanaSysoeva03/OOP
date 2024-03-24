package ru.geekbrains.oop.lesson7.observer;

public class Vacancy {
    private int salary;
    private String companyName;


    public Vacancy(int salary, String companyName) {
        this.salary = salary;
        this.companyName = companyName;

    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }



    @Override
    public String toString() {
        return "Vacancy{" +
                "salary=" + salary +
                ", companyName='" + companyName + '\'' +

                '}';
    }
}
