public class Match {//sporcuların eşleşme kriterleri için sınıf oluşturdum nitelik belirttim
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
        if(isCheck()){//kontrol metodu oluşturdum.burayı döndürmek için boolean oluşturdum aynı metodu kullanarak
            
                while(true){//birinin sağığı 0 altına inerse kaybetmiş olacak ve musabaka bitecek
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
            System.out.println("Sporcuların sikletleri uymuyor.");//eşleşme olmazsa musabaka başlamaz
        }
    }

    boolean isCheck(){//true dönmezse eşleşme olmayacak
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
