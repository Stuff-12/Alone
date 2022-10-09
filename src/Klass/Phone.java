package Klass;

//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
// которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int newNumber, String newModel) {
        this.number = newNumber;
        this.model = newModel;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("Использовался конструктор с тремя параметрами");
    }

    public Phone() {
        this.model = "Vodophone";
    }

    public void receiveCall(String name) {
        System.out.println("Звонит" + " " + name);
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name, int number) {
        if (name.equals("Налогавая")) {
            System.out.println("Не брать трубку!!!");
        } else {
            System.out.println("Вам звонит" + " " + name + " " + number);
        }
    }
    public void sendMessage(int ... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}