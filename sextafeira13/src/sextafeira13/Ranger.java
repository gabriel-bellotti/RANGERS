package sextafeira13;


public abstract class Ranger {
    String nome;
    String cor;        
    String armaPrincipal;
    
    public Ranger (String nome, String cor, String armaPrincipal) {
       this.nome= nome;
       this.cor= cor;
       this.armaPrincipal= armaPrincipal;
}
     public void  atacar(){
        System.out.println("usando" + this.armaPrincipal);
    }
      public void  defender(){
        System.out.println("defenderndo");
    }

    public abstract void  transformar();
       
}
