package ru.geekbrains.j_one.lesson_a.online;

public class Worker {

    String name;
    String salary;
    int age;
    public Worker(String зайцев, int i) {
        System.out.println("Это конструктор класса Worker") ;
        name = "Петров Василий Васильевич ";
        salary = "пятьдесят тысяч рублей";
        age = 40;
    }

    Worker(String a, String b, int c) {
        this.name = a;
        this.salary = b;
        this.age = c;
    }

    public String toString(){
        return String.format("Name: %s \ Salary: %d \n" ,
                name,  salary,);}

    public void print(){
        System.out.println(this);
    }



     }




