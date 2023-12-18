package aulab2.src.Aulas;
public class caneta02 {
    public static void main(String[] args) {
     Caneta c2 = new Caneta();
     c2.modelo = "Bic";
     c2.cor = "Azul";
     c2.ponta = 1.5f;
     c2.carga = 10;
     c2.destampar();     
     c2.status();
     c2.rabiscar();
    }
}
