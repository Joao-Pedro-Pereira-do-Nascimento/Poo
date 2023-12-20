package aulab3.src.aula;

public class Carro {
  public  String modelo;
  public     String marca;
   private String cor;
   protected int portas;
    private boolean movimento;

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Marca:"+this.marca);
        System.out.println("Cor: "+this.cor);
        System.out.println("A Quantidade de portas é : "+this.portas);
       
    }
    public void emmovimento(){
        if (movimento == true){
            System.out.println("Carro está andando vrum vrum...");
        }else{
            System.out.println("O carro está parado ");
        }
    }
    public void andar(){
        this.movimento = true;
    }
    public void parado(){
        this.movimento = false;
    }
    
}
