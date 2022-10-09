package Klass1;
//Создать класс Person, который содержит:
//
//переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
//Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName+" Говорит");
    }

    public void talk(){
        System.out.println(fullName+" Говорит");
    }
}
