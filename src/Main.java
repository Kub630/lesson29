import animals.Cat;
import animals.Cow;
import animals.Dog;

import java.awt.datatransfer.ClipboardOwner;

public class Main {
    public static void main(String[] args){
        Cow cow = new Cow();
        cow.name= "ui";
        cow.age= "2";
        cow.color="ak";

        Cat cat = new Cat();
        cat.age =12;
        cat.name="tom";
        cow.color="ak";

        Dog dog = new Dog();
        dog.age=13;
        dog.name="Belyi";
        dog.color="ak";

        System.out.println(cat.name+"\n"+cat.color+"\n"+cat.age+"\n"+cow.color+"\n"+cow.name+"\n"+cow.color+"\n"+cow.age+"\n"+dog.color+"\n"+dog.name+"\n"+dog.age+"\n");
        }


    }
