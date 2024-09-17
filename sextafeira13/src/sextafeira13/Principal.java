package sextafeira13;

public class Principal {

    public static void main(String[] args) {
        RangerVermelho rangerVermelho= new RangerVermelho("Maicon", "vermelho", "espada");
        
        rangerVermelho.nome            = ("Maicon");
        
        rangerVermelho.cor             = ("vermelho");
        
        rangerVermelho.armaPrincipal   = ("espada");
        
        RangerAmarelo rangerAmarelo= new RangerAmarelo("Maria", "amarelo", "laser");
        
        rangerAmarelo.nome             = ("Maria");
        
        rangerAmarelo.cor              = ("amarelo");
        
        rangerAmarelo.armaPrincipal    = ("laser");
        
        RangerAzul rangerAzul= new RangerAzul("Marcelo", "azul", "machado");
        
        rangerAzul.nome                = ("Marcelo");
        
        rangerAzul.cor                 = ("azul");
        
        rangerAzul.armaPrincipal       = ("machado");
        
        ZordRex zordRex = new ZordRex("rex", "broca");
        
        zordRex.nome                   = ("rex");
        
        zordRex.poder                  = ("broca");
        
        ZordShark zordShark = new ZordShark("shark", "morder");
        
        zordShark.nome                 = ("shark");
                
        zordShark.poder                = ("morder");
        
        ZordPtero zordPtero = new ZordPtero("ptero", "voar");
        
        zordPtero.nome                 = ("ptero");
        
        zordPtero.poder                = ("voar");
        
        Megazord megazord = new Megazord("dinozord", "finalbeam");
        
        megazord.nome                  = ("dinozord");
        
        megazord.poder                 = ("finalbeam");
        
    }

    

}
