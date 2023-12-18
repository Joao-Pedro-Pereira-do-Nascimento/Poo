package aulab2.src.Aulas;

public class LimparTelaTerminal {
    public static void main(String[] args) {
        LimparTela();
        System.out.println("Tela limpa!");
    }
   public static void LimparTela(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
