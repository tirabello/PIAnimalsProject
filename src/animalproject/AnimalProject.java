
package animalproject;
import java.util.Scanner;
//FINAL PADRAO PARA CADA PERDA

public class AnimalProject {

    public static void main(String[] args) {
 
        int continuar=1;
        int dicas = 2;
        int resposta;
        Scanner scan = new Scanner(System.in);
        CaixaDownlares downlares = new CaixaDownlares();
        Introducson textos = new Introducson();
        
        textos.introducao();
        
        System.out.println("----------------------------");   
        System.out.println("WELCOME TO THE ANIMAL PROJECT");
        System.out.println("----------------------------");
        
        textos.CriacaoPersonagem();
        textos.nome = scan.nextLine();
        
        
        
        //perguntasssssss
        while(continuar == 1){
            
            System.out.println("Pergunta 1: ");
            System.out.println("Quantas casas decimais tem o numero PI?");
            System.out.println("1) duas");
            System.out.println("2) infinitas");
            System.out.println("3) centenas");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            if(resposta<0 || resposta>4){
                System.out.println("Resposta invalida");
            }else{
                switch (resposta){
                    case 4:                   
                        if(dicas>=1){
                            System.out.println("O numero PI e irracional");
                           dicas--; 
                        }else if (dicas<=0){
                            System.out.println("acabou");
                        }     
                    break;
                    case 1:
                        System.out.println("Errou");
                        System.out.println("O jogo acabou ");
                        continuar = 0;
                    break;
                    case 2:
                        System.out.println("Acertou!!!!!!!");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;                  
                        continuar++;
                    break;
                    case 3:
                        System.out.println("Errou");
                        System.out.println("O jogo acabou ");
                        continuar = 0;
                    break;  
                }
            }
        }
        while (continuar == 2){
            System.out.println("Pergunta 2: ");
            System.out.println("De quem e a famosa frase: `penso logo existo?` ");
            System.out.println("1) Galileu Galilei");
            System.out.println("2) Socrates");
            System.out.println("3) Rene Descartes");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            switch (resposta){
                case 4:                   
                    if(dicas>=1){
                        System.out.println("E tambem o pai da filosofia.");
                       dicas--; 
                    }else if (dicas<=0){
                        System.out.println("acabou");
                    }     
                break;
                case 1:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar =0;
                break;
                case 2:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;
                case 3:
                    System.out.println("Acertou!!!!!!!");
                    downlares.MensagemVitoria();
                    downlares.downlares += 200000;                  
                    continuar++;
                break;  
            }     
        } 
        while (continuar == 3){
            System.out.println("Pergunta 3: ");
            System.out.println("Quem foi o primeiro homem a pisar na lua? ");
            System.out.println("1) Neil ArmStrong");
            System.out.println("2) Buzz Aldrin");
            System.out.println("3) Charles Duke");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta = scan.nextInt();
            switch (resposta){
                case 4:                   
                    if(dicas>=1){
                        System.out.println(" Era engenheiro aeroespacial e morreu em 2012.");
                       dicas--; 
                    }else if (dicas<=0){
                        System.out.println("acabou");
                    }     
                break;
                case 1:
                    System.out.println("Acertou!!!!!!!");
                    downlares.MensagemVitoria();
                    downlares.downlares += 200000;                  
                    continuar++;
                    System.out.println("OPCAO DE SAIR AQUI PRIMEIRO FINAL");
                break;
                case 2:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;
                case 3:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;  
            }
        }
        while (continuar == 4){
            System.out.println("Pergunta 4: ");
            System.out.println("Qual o nome do primeiro computador digital? ");
            System.out.println("1) Abaco");
            System.out.println("2) ENIAC");
            System.out.println("3) Zuse");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            switch (resposta){
                case 4:                   
                    if(dicas>=1){
                        System.out.println(" Possuia 30 toneladas e foi elaborada para o laboratorio de pesquisa balistica dos EUA.");
                       dicas--; 
                    }else if (dicas<=0){
                        System.out.println("acabou");
                    }     
                break;
                case 1:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;
                case 2:
                    System.out.println("Acertou!!!!!!!");
                    downlares.MensagemVitoria();
                    downlares.downlares += 200000;                  
                    continuar++;
                break;
                case 3:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;  
            }
        }
        while (continuar == 5){
            System.out.println("Pergunta 5: ");
            System.out.println("Quem foi o presidente do inicio da Ditadura Militar? ");
            System.out.println("1) Getulio Vargas");
            System.out.println("2) Joao Goulart");
            System.out.println("3) Humberto Castello Branco");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            switch (resposta){
                case 4:                   
                    if(dicas>=1){
                        System.out.println(" Era marechal e possui em sua homenagem uma avenida com o seu nome em Porto Alegre.");
                       dicas--; 
                    }else if (dicas<=0){
                        System.out.println("acabou");
                    }     
                break;
                case 1:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;
                case 2:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;
                case 3:
                    System.out.println("Acertou!!!!!!!");
                    downlares.MensagemVitoria();
                    downlares.downlares += 200000;                  
                    System.out.println("FINAL VERDADEIRO AQUI");
                break;  
            }
        }
    } 
}