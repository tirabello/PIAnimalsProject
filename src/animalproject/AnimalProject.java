
package animalproject;
import java.util.Scanner;
//FINAL PADRAO PARA CADA PERDA

public class AnimalProject {

    public static void main(String[] args) {

        int continuar=1;
        int parar;
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
        
        textos.Animal();
        String NomeAnimal = scan.nextLine();
        System.out.println("Eu, " + NomeAnimal + " preciso de voce!!");
        System.out.println("Vamos comecar nossa historia!!\n");
        
        System.out.println("Em um dia ensolarado em Downsville, num suburbio do bairro RochDawle,");
        System.out.println("fui tirado do meu lar bruscamente, e voce, " + textos.nome + ", entrou em desespero.");
        System.out.println("Pouco tempo depois, o telefone tocou, era ele..... ");
        System.out.println("O famoso Shark Thank, dono do monopolio dos estudios SharkDowns, e apresentador do programa ");
        System.out.println("Cidade Downlerta, o programa onde e apresentado inumeros shows, inclusive o 'Quizz ShowDown!!'");
        System.out.println("um jogo que busca participantes ao redor de Downsville para concorrer ao premio de 1 MILHAO DE DOWNLARES!!\n");
        System.out.println("Enfim, acabei falando demais, voltando a historia....");
        System.out.println("O famoso Shak Thank te convidou para o 'Quizz ShowDown', para concorrer o premio em downlares.");
        System.out.println("Voce, " + textos.nome + " sabendo disso, decide aproveitar a oportunidade para, com o dinheiro do programa, pagar o meu resgate.");
        System.out.println("**aperte qualquer tecla para continuar**");
        String ler = scan.nextLine();
        
        System.out.println("---------------------CHEGANDO NO LOCAL--------------------------------------------------------------------------\n");
        System.out.println("SHARK: Bem vindo participante" + textos.nome+ " vamos comecar?");
        System.out.println("SHARK: Deixe-me lembrardes que o premio final e de 1 MILHAO DE DOWNLARES,\n esse programa tambem esta sendo transmitido para todos os nossos ColaboraDowners que estao em casa!");
        System.out.println("SHARK: vamos comecar com a pergunta de numero 1");
        //perguntasssssss
        // PERGUNTA 1---------------------------------------------------------------------------------------------
        while(continuar == 1){
            
            System.out.println("Pergunta 1: ");
            System.out.println("Quantas casas decimais tem o numero PI?" );
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
                            System.out.println("\nVoce sente uma grande conexao com seu bichinho, uma conexao que supera barreiras...");
                            System.out.println("voce sente a presenca de " + NomeAnimal + " dentro de seu coracao");
                            textos.AnimalDica();
                            System.out.println("**DICA:O numero PI e irracional** \n");
                           dicas--; 
                        }else if (dicas<=0){
                            textos.AnimalEsgotado();
                        }     
                    break;
                    case 1:
                        System.out.println("Errou");
                        System.out.println("O jogo acabou ");
                        continuar = 0;
                    break;
                    case 2:
                        System.out.println("CERTA RESPOSTA!");
                        System.out.println("SHARK: Parabens " + textos.nome + " voce acertou a primeira pergunta e arrecadou a quantia de 200,000 downlares.");
                        System.out.println("SHARK: claro, o jogo esta so comecando, ainda temos muito pela frente.");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;     
                        System.out.println("SHARK: Vamos para a proxima pergunta. \n Agora o jogo vai comecar a ficar mais dificil hahaha \n");
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
        //PERGUNTA 2-------------------------------------------------------------------------------------------------------------------        
        while (continuar == 2){
            System.out.println("Pergunta 2: ");
            System.out.println("De quem e a famosa frase: `penso logo existo?` ");
            System.out.println("1) Galileu Galilei");
            System.out.println("2) Socrates");
            System.out.println("3) Rene Descartes");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            if(resposta<0 || resposta>4){
                System.out.println("Resposta invalida");
            }else{
                switch (resposta){
                    case 4:                   
                        if(dicas>=1){
                            System.out.println("\nVoce sente uma grande conexao com seu bichinho, uma conexao que supera barreiras...");
                            System.out.println("voce sente a presenca de " + NomeAnimal + " dentro de seu coracao");
                            textos.AnimalDica();
                            System.out.println("**DICA: E tambem o pai da filosofia.** \n");
                            dicas--; 
                        }else if (dicas<=0){
                            textos.AnimalEsgotado();
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
                        System.out.println("CERTA RESPOSTA!");
                        System.out.println("SHARK: Bom... vejo que temos alguem estudado aqui");
                        System.out.println("SHARK: Parabens " + textos.nome + " voce arrecadou mais 200,000 para sua conta. \n");
                        downlares.MensagemVitoria();
                        downlares.downlares += 200000;                  
                        continuar++;
                    break;  
                }
            }    
        } 
        //  PERGUNTA 3----------------------------------------------------------------------
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
                        System.out.println("\nVoce sente uma grande conexao com seu bichinho, uma conexao que supera barreiras...");
                        System.out.println("voce sente a presenca de " + NomeAnimal + " dentro de seu coracao");
                        textos.AnimalDica();
                        System.out.println("**DICA: Era engenheiro aeroespacial e morreu em 2012.** \n");
                       dicas--; 
                    }else if (dicas<=0){
                        textos.AnimalEsgotado();
                    }     
                break;
                case 1:
                    System.out.println("CERTA RESPOSTA!");
                    System.out.println("SHARK: " + textos.nome + " voce é muito bom hein? Mais uma certa resposta");
                    downlares.MensagemVitoria();
                    downlares.downlares += 200000;
                    System.out.println("SHARK: E com isso voce acaba de arrecadar um total de " + downlares.downlares);
                    System.out.println("SHARK: Seguindo nossas regras... eu preciso te perguntar,");
                    System.out.println("SHARK: voce deseja parar o jogo por aqui? e voltar para casa com toda a quantia arrecadada ate entao? \n");
                    System.out.println("SHARK: LEMBRE-SE: se voce perder, tera uma penalidade grande, perdendo praticamente toda sua quantia arrecadada ate entao.");
                    System.out.println("1 - sim desejo parar aqui // 2- quero continuar");
                    parar = scan.nextInt();
                    if(parar == 1){
                        
                        System.out.println("SHARK: bom... que pena! O jogo estava ficando muito divertido.");
                        System.out.println(textos.nome + ": eu nao estou fazendo isso pelo dinheiro, e sim pelo meu animal " + NomeAnimal);
                        System.out.println(textos.nome + ": acredito que com a quantia arrecadada posso pagar pelo resgate dele.\n ");
                        System.out.println("SHARK: Poxa, que tristeza, sua historia me comoveu e tenho certeza que comoveu tambem todos os nossos telespectadowres ");
                        System.out.println("SHARK: bom, espero que consiga salvar seu animalzinho");
                        System.out.println("SHARK: e com isso, o programa de hoje chega ao fim! ate semana que vem com mais um QuizzShowDOWN!!!!! ");
                        
                        System.out.println("\n----------CHEGANDO EM CASA-----------");
                        System.out.println("A primeira coisa que " + textos.nome + " faz quando chega em casa e pegar seu telefone e ligar para os bandidos que sequestraram seu pet...");
                        System.out.println(textos.nome + ": oi, consegui o dinheiro para o resgate de " + NomeAnimal);
                        System.out.println("BANDIDOS: Qual a quantia?");
                        System.out.println(textos.nome + ": eu consegui " + downlares.downlares);
                        
                        textos.textoFinalC();
                        
                        System.out.println("-------FINAL C---------\n");
                        System.out.println("----insufi[C]iente----\n");
                        System.out.println("");
                        
                        System.out.println(NomeAnimal + ": perai, isso nao precisa acabar assim");
                        System.out.println(NomeAnimal + ": nao desista, jogue o jogo do shark ate o final, consiga o 1 milhao de downlares");
                        System.out.println("voce tem o que e preciso para me salvar! CONTINUE!");    
                        continuar =0;
                    }
                    else if(parar == 2){
                        System.out.println("entao vamos continuar hahahahahhahaha");
                        System.out.println("SHARK: estamos indo para PENULTIMA pergunta do nosso jogo.");
                        System.out.println("SHARK: antes de continuarmos, vamos falar com o nosso participante");
                        System.out.println("SHARK: o que te trouxe aqui hoje, " + textos.nome + "? com sede de virar um milhionario, jovem?\n");
                        System.out.println(textos.nome + ": eu nao estou fazendo isso pelo dinheiro, seu Shark, e sim pelo meu animal " + NomeAnimal);
                        System.out.println(textos.nome + ": ele foi sequestrado, e agora estou aqui, lutando para conseguir a quantia necessaria e pagar o resgate.\n");
                        System.out.println("SHARK: mas que linda historia meu jovem, espero que voce consiga chegar ate o fim");
                        System.out.println("SHARK: eu duvido muito, sao perguntas muito dificeis daqui pra frente, mas boa sorte, os nossos telespectadowres estao torcendo por voce");
                        continuar++;
                    }                   
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
        //  PERGUNTA 4----------------------------------------------------------------------
        while (continuar == 4){
            System.out.println("PERGUNTA 4: ");
            System.out.println("Qual o nome do primeiro computador digital? ");
            System.out.println("1) Abaco");
            System.out.println("2) ENIAC");
            System.out.println("3) Zuse");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            switch (resposta){
                case 4:                   
                    if(dicas>=1){
                        System.out.println("\nVoce sente uma grande conexao com seu bichinho, uma conexao que supera barreiras...");
                        System.out.println("voce sente a presenca de " + NomeAnimal + " dentro de seu coracao");
                        textos.AnimalDica();
                        System.out.println("**DICA: Possuia 30 toneladas e foi elaborada para o laboratorio de pesquisa balistica dos EUA.**");
                        dicas--; 
                    }else if (dicas<=0){
                        textos.AnimalEsgotado();
                    }     
                break;
                case 1:
                    System.out.println("Errou");
                    System.out.println("O jogo acabou ");
                    continuar=0;
                break;
                case 2:
                    System.out.println("CERTA RESPOSTA!");
                    System.out.println("SHARK: O QUE?? COMO ASSIM VOCE ACERTOU??");
                    System.out.println("SHARK: AHAM... digo... Parabens meu jovem!!! mais uma pergunta, mais 200.000 para sua conta bancaria");
                    System.out.println("SHARK: e um passo mais perto de reencontrar seu animal.....");
                    System.out.println(textos.nome + ": isso e tudo o que mais quero seu Shark, tudo que estou fazendo e pelo meu querido " + NomeAnimal);
                    System.out.println("SHARK: Bom, parabens vamos par a ultima pergunta, tenho certeza que voce ira conseguir, conseguiu todas ate aqui ne");
                    System.out.println("hahaha.....HAHAHAHHAHAHA...\n");
                    System.out.println("O Sr. Shark estava agindo de uma maneira estranha..... um pouco maniaco, quase assustador");
                    System.out.println("Como se ele estivesse escondendo alguma coisa....\n\n");
                    System.out.println("SHARK: ULTIMA PERGUNTA DA NOITE!!!");
                    System.out.println("Shark estava com uma feicao de raiva, estava suando muito.");
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
        //  PERGUNTA 5----------------------------------------------------------------------
        while (continuar == 5){
            System.out.println("PERGUNTA 5: ");
            System.out.println("Quem foi o presidente do inicio da Ditadura Militar? ");
            System.out.println("1) Getulio Vargas");
            System.out.println("2) Joao Goulart");
            System.out.println("3) Humberto Castello Branco");
            System.out.println("4) DICA"  + "                    "+ "Downlares atuais: " + downlares.downlares);
            resposta= scan.nextInt();
            switch (resposta){
                case 4:                   
                    if(dicas>=1){
                        System.out.println("\nVoce sente uma grande conexao com seu bichinho, uma conexao que supera barreiras...");
                        System.out.println("voce sente a presenca de " + NomeAnimal + " dentro de seu coracao");
                        textos.AnimalDica();
                        System.out.println("**DICA: Era marechal e possui em sua homenagem uma avenida com o seu nome em Porto Alegre.**\n");
                        dicas--; 
                    }else if (dicas<=0){
                        textos.AnimalEsgotado();
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
