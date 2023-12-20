package aulab3.src.aula;

public class instancia {
    public static void main(String[] args) {
        Carro cr1 = new Carro();
        cr1.modelo = "HB20";
        //cr1.cor ="Prata";
        cr1.marca = "Hyundai";
        cr1.portas = 4;
        cr1.andar();        
        cr1.status();
        cr1.emmovimento(); // só é possivel usar esse método porque ele está dentro da classe carro
    }
    
}
