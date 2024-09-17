package sextafeira13;

public class RangerAzul extends Ranger {
    
    public RangerAzul(String nome, String cor, String armaPrincipal) {
        super(nome, cor, armaPrincipal);
    }
   public void usarPoderAquático(){
       
   }

    @Override
    public void transformar() {
        System.out.println("Morphar: Megalodon!!!");
    }
}
