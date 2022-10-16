package Forms;

public class Forms {
    public void shapearea() {
        System.out.print("Формулы: ");
    }
}

class Triang extends Forms {
    public void shapearea() {
        System.out.print("S треугольника : 1/2 * основания * высоту");
    }
}
class Circ extends Forms{
    public void shapearea(){
        System.out.print(" S круга: 3,14 * радиус * радиус");
    }
}
class Main{
    public static void main(String[] args) {
        Forms xForms = new Forms();
        Forms xTriang = new Triang();
        Forms xCirc = new Circ();
        xForms.shapearea();
        xTriang.shapearea();
        xForms.shapearea();
        xCirc.shapearea();
    }
}
