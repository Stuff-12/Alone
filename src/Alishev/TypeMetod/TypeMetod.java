package Alishev.TypeMetod;

public class TypeMetod {
    public static void main(String[] args) {
        PersonMetod person1 = new PersonMetod();
        person1.name = "Roma";
        person1.age = 50;

        PersonMetod person2 = new PersonMetod();
        person2.name = "Vova";
        person2.age = 20;

        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии " + year1 + " лет");
        System.out.println("Второму человеку до пенсии " + year2 + " лет");


    }
}

class PersonMetod {

    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {//<--метод
        for (int i = 0; i < 3; i++) {//<--с помощью цикла ФОР мы вывели на консоль три раза САУТ
            System.out.println("Меня зовут " + name + "," + "мне " + age + "лет");

        }
    }

    void sayHello() {
        System.out.println("Привет");
    }
}

