public class Fighter {//dövüşçüleri tanımlamak için yeni sınıf oluşturdum
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double kick;
    

    Fighter(String name, int damage, int health, int weight, int dodge, double kick){//çağırmak için metod oluşturdum
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
