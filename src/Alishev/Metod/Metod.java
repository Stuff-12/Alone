package Alishev.Metod;

public class Metod {
    public static void main(String[] args) {
        PersonMetod person1 = new PersonMetod();
        person1.name = "Roma";
        person1.age = 50;

        person1.speak();//<--вызываемый метод
        person1.sayHello();

        PersonMetod person2 = new PersonMetod();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        person2.sayHello();

    }
}

class PersonMetod {

    String name;
    int age;

    void speak() {//<--метод
        for (int i = 0; i < 3; i++) {//<--с помощью цикла ФОР мы вывели на консоль три раза САУТ
            System.out.println("Меня зовут " + name + "," + "мне " + age + "лет");

        }
    }

    void sayHello(){
        System.out.println("Привет");
    }
}

