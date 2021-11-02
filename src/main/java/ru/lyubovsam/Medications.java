package ru.lyubovsam;

public class Medications {
        int price;
        String name;
        String prod;
        public void sayName() {
            System.out.println(name);
        }
    public void sayPrice() {
        System.out.println(price);
    }
    public void sayProd() {
        System.out.println(prod);
    }
    public void incrementPrice() {
            price = price + 10;
    }

        public static void main(String [] args){
            Medications advil = new Medications();
            Medications capoten = new Medications();
            advil.name = "Адвилл";
            advil.price = 355;
            advil.prod = "Bayer";
            capoten.name = "Капотен";
            capoten.price = 178;
            capoten.prod = "Astrazenneka";
            advil.sayName();
            advil.incrementPrice();
            advil.sayPrice();
            advil.sayProd();
            capoten.sayName();
            capoten.sayPrice();
            capoten.sayProd();


    }
}
