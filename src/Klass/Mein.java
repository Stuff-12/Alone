package Klass;

public class Mein {
    public static void main(String[] args) {
        Phone myPhone = new Phone(4546767, "Samsung", 123.22);
        Phone rogPhone = new Phone(2345552, "Iphone", 123.44);
        Phone denPhone = new Phone(2345525,"Nokia", 746485.745);
        Phone alexPhone = new Phone();






        System.out.println(myPhone.model+" "+myPhone.number+" "+myPhone.weight);
        System.out.println(rogPhone.model+" "+rogPhone.number+" "+rogPhone.weight);
        System.out.println(denPhone.model+" "+denPhone.number+" "+denPhone.weight);

        myPhone.receiveCall("Сосед с топором");
        rogPhone.getNumber();
        denPhone.receiveCall("Повар", 666_66_66);
        System.out.println(rogPhone.getNumber());
        System.out.println(myPhone.getNumber());
        System.out.println(denPhone.getNumber());

        System.out.println(rogPhone.getModel());
        System.out.println(myPhone.getModel());
        System.out.println(denPhone.getModel());

        System.out.println(rogPhone.getWeight());
        System.out.println(denPhone.getWeight());
        System.out.println(myPhone.getWeight());
        System.out.println(alexPhone.getModel());


        rogPhone.sendMessage(21342345, 32546536, 2354235);
    }
}
