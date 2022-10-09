package Car;

import java.util.Arrays;

public class ProsmotrCar {
    public static void main(String[] args) {
        Car numberOne = new Car();
        numberOne.nameCar = "BMW";
        numberOne.topSpeedCar = 250;
        numberOne.tormogenieCar = 30;
        numberOne.volumeCar = 5;

        Car numberTwo = new Car();
        numberTwo.nameCar = "Volvo";
        numberTwo.topSpeedCar = 420;
//        numberTwo.tormogenieCar =

        System.out.println(numberOne.nameCar);
        System.out.println(numberOne.volumeCar);
        System.out.println(numberOne.tormogenieCar);
        System.out.println(numberOne.pametriCar());

        System.out.println(numberTwo.pametriCar());
        System.out.println(numberOne.drugoiPametr());
    }
}
