package aulab2.src.Aulas;

public class estancia_caneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo ="Blue pen";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 70;
        c1.destampar(); // quando for um metodo não usa atribuição apenas o a instancia c1.método ();
        c1.status();
        c1.rabiscar();

    }
    
}
