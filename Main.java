package ru.geekbrains.j_one.lesson_a.online;

public class Main {
    public static void main(String[] args) {
        Worker w0;
        Worker w = new Worker();
        w.age = 40;
        w.name = " Петров Василий Васильевич ";
        w.salary = "пятьдесят тысяч рублей";
        System.out.printf("name: %s, salary: %s, age: %s",
                w.getName(), w.getSalary(), w.getAge());
        System.out.println(w0.getInfo());


    }

    public static void main(String[] args) {

        Worker[] Array = new Worker[5];
        Array[0] = new Worker("Зайцев", 45);
        Array[1] = new Worker("Петров", 40);
        Array[2] = new Worker("Иванов", 31);
        Array[3] = new Worker("Лосева", 30);
        Array[4] = new Worker("Мальцева", 45);

        for (int i=0; i < Array.length; i++)
            if (Array[i].age > 40) Array[i].print();
    }
}