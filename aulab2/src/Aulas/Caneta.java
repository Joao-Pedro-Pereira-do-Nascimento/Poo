package aulab2.src.Aulas;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
   
    void status(){
        
        System.out.println("------------ Espercificações da caneta----------------------");
        System.out.println("Modelo:"+this.modelo);        
        System.out.println("Uma caneta tem cor "+this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Caneta tem "+this.carga+"% da sua carga");
        System.out.println("Estar tampada ? ("+this.tampada+")");
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("A caneta estar tampada não possivel rabiscar");
        }else{
            System.out.println("Rabiscando . . . . . . . . . . . . . . .. . . . . . . . . . . . . . ");
        }
    }
    void tampar(){
        this.tampada = true; // this faz referencia ao objeto que chamou 

    }
    void destampar(){
        this.tampada = false;
    }
}
