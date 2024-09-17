package sextafeira13;

public class RangerAmarelo extends Ranger {
    
    public RangerAmarelo(String nome, String cor, String armaPrincipal) {
        super(nome, cor, armaPrincipal);
    }
    public void usarPoderAcelerado(){
        
    }

    @Override
    public void transformar() {
       System.out.println("Morphar: Pterodáctilo!!!");
    }
}
