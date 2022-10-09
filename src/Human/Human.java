package Human;
//Создать класс человек, у человека должно быть имя, рост, вес, возраст.
// И человек должен говорить
// «Меня зовут, имя»,
// «Мне, лет лет»,
// « Мой рост рост см , вес вес кг»
public class Human {

    String nameHuman;
    int rostHuman;
    double vesHuman;
    int areHuman;

    public String imya(){
        return "Меня зовут "+nameHuman;
    }
    public String vozrats(){
        return "Мне "+areHuman+" полных года";
    }
    public String dannie(){
        return "Мой рост "+rostHuman+" сантиметра, "+"и мой вес "+vesHuman+"кг";
    }
    public Human(String nameHuman, int rostHuman, double vesHuman, int areHuman){
        this.vesHuman = vesHuman;
        this.areHuman = areHuman;
        this.nameHuman = nameHuman;
        this.rostHuman = rostHuman;
    }
    public Human(){

    }
}
