
interface Transport {
    void deliver();
}


abstract class Animal {
    
}


class Tiger extends Animal {
   
}


class Camel extends Animal implements Transport {
    
    public void deliver() {
        System.out.println("Camel is delivering cargo.");
    }
}


class Deer extends Animal {
    
}


class Donkey extends Animal implements Transport {
    
    public void deliver() {
        System.out.println("Donkey is delivering goods.");
    }
}

public class Lab7_3_1 {
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        
        for (Animal animal : animals) {
           
            if (animal instanceof Transport) {
               
                ((Transport) animal).deliver();
            }
        }
    }
}
