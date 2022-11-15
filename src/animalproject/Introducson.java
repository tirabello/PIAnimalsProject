
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
    public void textoFinalA(){
        System.out.println("RESPOSTA ERRADA");
        System.out.println("SHARK: Poxa, errar na primeira pergunta é ruim hein?");
        System.out.println("SHARK: Ainda mais uma pergunta facil dessas.");
        System.out.println("SHARK: Infelizmente, voce nao conseguiu nada.");
        System.out.println("----FINAL A ----");
        System.out.println("estud[A]r mais");
    }    
    
    public void textoFinalC(){  
        System.out.println("BANDIDOS: VOCE ACHA QUE ISSO E SUFICIENTE??? O SEU QUERIDO BICHINHO VALE SO ISSO??");
        System.out.println("BANDIDOS: NOS QUEREMOS MAIS, MUITO MAIS, NOS QUEREMOS 1 MILHAO DE DOWNLARES ");
        System.out.println(nome + ": mas onde vou conseguir toda essa quantia? eu nao tenho como....");
        System.out.println("BANDIDOS: entao diga adeus a seu animal. \n \n \n");
        System.out.println("------FIM DA LIGACAO-----");
        System.out.println("Depois do ocorrido," + nome + " entrou em uma depressao profunda, sem saber oq fazer.");
        System.out.println("Tinha todo dinheiro do mundo, mas de que valia sem seu querido amigo? Depois disso nunca mais se ouviu falar de " + nome);
        System.out.println("Alguns acreditam que foi morar no meio do mato, outros acreditam num destino pior... \n \n");
    }
    
    public void textoFinalE(){
        System.out.println("SHARK: Ele tem poderes misticos, poderes inimaginaveis, que nao conseguimos compreender a amplitude");
        System.out.println("SHARK: Entao, surgiu a ideia de roubarmos!! Esse animal vale um dinheirao sabe ");
        System.out.println("SHARK: Claro, eu nao pretendia te deixar desolado");
        System.out.println("SHARK: Mas tambem nao podia te dar o dinheiro de graca, como isso ia pegar pra mim?? nos vivemos numa meritocracia voce sabe...");
        System.out.println("SHARK: Por isso te convidei para meu jogo, esse dinheiro e uma microparte do total que vou ganhar com a venda dessa especime");
        System.out.println("SHARK: MAS NAO ERA PRA VOCE TER CHEGADO ATE O FIM, VOCE DEVIA TER PARADO QUANDO TEVE A CHANCE");
        System.out.println("SHARK: NOS IAMOS LUCRAR COM SEU SOFRIMENTO");
        System.out.println("SHARK: consigo ate ver as manchetes... pobre jovem que perdeu seu querido pet");
        System.out.println("SHARK: foi para um jogo de perguntas salva-lo e mesmo assim nao conseguiu. Voce seria famoso(e eu lucraria como seu mentor huhahaha)");
        System.out.println("SHARK: ...mas agora voce ja e um milionario, nao tem pra que fazer isso, voce nao vale mais nada pra mim, infelizmente voce nao podera sair vivo daqui.");
        System.out.println("Nesse momento... voce escuta um barulho vindo dos fundos");
        switch(Animal){
            case 1: 
                System.out.println("auau ");
            break;
            case 2:
                System.out.println("miau miau");
            break; 
            case 3:
                 System.out.println("glub glub");
            break;
            case 4:
                 System.out.println("sh!sh!sh!");
            break;
            case 5:
                 System.out.println(" cra! cra!");
            break;
            case 6:
                 System.out.println("BOOM! BOoM!");
            break;
        }  
        System.out.println("CHEFE ELE ESCAPOU DA JAULA!!!");
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
    
    public void AnimalDica(){     
        switch(Animal){
            case 1:
                System.out.println("auau (sinto que voce precisa da minha ajuda, mestre)");
                System.out.println("auau (eu posso te ajudar, mas minhas forcas estao fracas...)");
                System.out.println("auau (use minhas dicas com sabedoria)");
                break;
            case 2:
                System.out.println("miau miau (voce quer minha ajuda?)");
                System.out.println("miau miau (eu posso te ajudar, mas minhas forcas estao fracas...)");
                System.out.println("miau miau (use minhas dicas com sabedoria)");
            break;
            case 3:
                System.out.println("glub glub (sinto que voce precisa da minha ajuda)");
                System.out.println("glub glub (eu posso te ajudar, mas minhas forcas estao fracas...)");
                System.out.println("glub glub (use minhas dicas com sabed0r1a)");
            break;
            case 4:
                System.out.println("sh!sh!sh! (sinto que voce precisa da minha ajuda)");
                System.out.println("sh!sh!sh! (eu consigo te ajudar,mas minhas forcas estao fracas...)");
                System.out.println("sh!sh!sh! (use minhas dicas com sabedoria, e busque vinganca!!!)\n");
            break;
            case 5:
                System.out.println("cra! cra! (eu vou te ajudar lindeza c;)");
                System.out.println("cra! cra! (mas minhas forcas estao fracas... ;c)");
                System.out.println("cra! cra! (use minhas dicas com sabedoria)");
            break;
            case 6:
                System.out.println("BOOM! BOoM! (voce nao consegue fazer nada sozinho ne?)");
                System.out.println("BOOM! BOoM! (eu posso te ajudar, mas minhas forcas estao fracas...)");
                System.out.println("BOOM! BOoM! (use minhas dicas com sabedoria)");
            break;
        }
    }
    public void AnimalEsgotado(){
        switch(Animal){
            case 1: 
                System.out.println("auau (perdao minhas forcas acabaram)");
            break;
            case 2:
                System.out.println("miau miau (Nao vou mais conseguir te ajudar daqui pra frente)");
            break; 
            case 3:
                 System.out.println("glub glub (nao consigo te ajudar mais)");
            break;
            case 4:
                 System.out.println("sh!sh!sh! (infelizmente vai ter que trilhar o resto sozinho)");
            break;
            case 5:
                 System.out.println(" cra! cra! (Queria te ajudar, mas minhas forcas acabaram ;c)");
            break;
            case 6:
                 System.out.println("BOOM! BOoM! (Boa sorte daqui pra frente, por que eu nao vou conseguir te ajudar mais)");
            break;
        }
    }  
    public void AnimalVinganca(){
        switch(Animal){
            case 1: 
                System.out.println("auau (Vamos nos vingar deles mestre!)");
            break;
            case 2:
                System.out.println("miau miau (Esse homem vai pagar pelo que fez comigo)");
            break; 
            case 3:
                 System.out.println("glub glub (esse Shark vai ter oq merece!)");
            break;
            case 4:
                 System.out.println("sh!sh!sh! (Vamos nos vingar.)");
            break;
            case 5:
                 System.out.println(" cra! cra! (Esse feiuxo vai sofrer oque merece c;)");
            break;
            case 6:
                 System.out.println("BOOM! BOoM! (Deixe comigo, ele vai pagar pelo que fez!!)");
            break;
        }
    }
    public void AnimalErrou(){
        switch(Animal){
            case 1: 
                System.out.println("auau (Nao desista mestre!!!)");
            break;
            case 2:
                System.out.println("miau miau (Nao desista, eu preciso de voce)");
            break; 
            case 3:
                 System.out.println("glub glub (Nao desista, eu preciso da sua ajuda)");
            break;
            case 4:
                 System.out.println("sh!sh!sh! (Aprenda com seus erros e nao desista.)");
            break;
            case 5:
                 System.out.println(" cra! cra! (Voce consegue fofete, por favor nao desista c;)");
            break;
            case 6:
                 System.out.println("BOOM! BOoM! (Tente de novo, nao desista!!)");
            break;
        }
    }
}
