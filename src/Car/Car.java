package Car;

import java.text.DecimalFormat;

public class Car {
    String nameCar;
    double topSpeedCar;
    double tormogenieCar;
    double volumeCar;

    public String pametriCar() {
        return nameCar + " " + topSpeedCar + "км/ч " + tormogenieCar + "m тормозной путь с 250км/ч " + volumeCar + " объем двигателя ";
    }

    public String drugoiPametr() {
        double groth = (topSpeedCar / 1.608);
        String topSpeed = new DecimalFormat("#0.00").format(groth);

        return nameCar + " " + topSpeed + "ml/ch " + tormogenieCar + "fut тормозной путь " + volumeCar*1000 + " кубичеческих сантиметров американских мощных мощностей";
    }

}
