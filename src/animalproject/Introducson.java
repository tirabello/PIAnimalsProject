
package animalproject;
import java.util.Scanner;

public class Introducson {
    
    String nome;
    int Animal;
    Scanner scan = new Scanner (System.in);
    
       
    
    public void introducao(){
        System.out.println("Bem vindo a cidade de DownsVille!!!!!!");
        System.out.println("Uma cidade pacata, com alta qualidade de vida. \nAqui os moradores, prezam muito pelo convivio com animais, todos amam e possuem um. \nE juntos, carregam um elo para vida toda.");
        System.out.println("Ate entao, tudo parece tranquilo, ate que.....");      
    }
      
    
    
    
    
    public void CriacaoPersonagem(){
        System.out.println("Primeiramente, precisamos saber seu nome.");
        System.out.println("Como voce quer ser chamado?");
    }
 
    
    
    
    public void Animal(){
        System.out.println("Agora, escolha o seu companheiro nessa jornada: ");
        System.out.println("1- Cachorro ");
        System.out.println("2- Gato  ");
        System.out.println("3- Peixe ");
        System.out.println("4- Cobra ");
        System.out.println("5- Calopsita ");
        System.out.println("6- Aranha ");
        Animal = scan.nextInt();
        
        switch(Animal){
            case 1: 
                System.out.println("auau (Como vc quer me chamar?)");
            break;
            case 2:
                System.out.println("miau miau (Como vc quer me chamar?)");
            break; 
            case 3:
                 System.out.println("glub glub (Como vc quer me chamar?)");
            break;
            case 4:
                 System.out.println("sh!sh!sh! (Como vc quer me chamar?)");
            break;
            case 5:
                 System.out.println(" cra! cra! (Como vc quer me chamar?)");
            break;
            case 6:
                 System.out.println("BOOM! BOoM! (Como vc quer me chamar?)");
            break;
        }       
    }
    
    
    
    
}
