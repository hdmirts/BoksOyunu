# BoksOyunu
```java
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double kick;
    

    Fighter(String name, int damage, int health, int weight, int dodge, double kick){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge > 0 && dodge < 100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
            this.kick = kick;

        }

    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if (foe.isdodge()){
            System.out.println(foe.name + " gelen hasarı blokladı");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;

        }
        return foe.health - this.damage;       
        

    }

    boolean isdodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }
   
}
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if(isCheck()){
            
                while(true){
                    System.out.println("===Yeni Round===");
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " Sağlık :" + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık :" + this.f2.health);
                    
                
                }
            
            

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight );
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı !");
            return true;

        }
        return false;
    }
    
}
public class Main {
    

    public static void main(String[] args) {
        Fighter f1 = new Fighter(" X oyuncusu", 10, 120, 100, 30, 60);
        Fighter f2 = new Fighter(" Y oyuncusu", 20, 85, 85, 45, 60);


        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}



```

