package Alishev;

public class ClassesAdnObjects {//<--это класс
    public static void main(String[] args) {
        Person person1 = new Person();//<--Это объект
        person1.name = "Roma";//<--это ссылка имени на объект(но так писать не желательно)
        person1.age = 50;//<--это ссылка возраста на объект
        System.out.println("Меня зовут " + person1.name + "," + " мне " + person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        System.out.println("Меня зовут " + person2.name + "," + " мне " + person2.age + " лет");
    }
}

class Person {
    //У класса могут быть :
    //1. Данные (поля)
    //2. Действия, которые он может совершать (методы)


    String name;//<--это поле класса Стринг(строковое)
    int age;//<--это поле класса Интежер(числовое)


}
