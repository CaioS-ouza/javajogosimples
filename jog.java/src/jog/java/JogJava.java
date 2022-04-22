/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jog.java;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;
public class JogJava {

    public static void main(String[] args) {
       PrintStream show=System.out;
       Scanner scan=new Scanner(System.in);
       Random gerador=new Random();
       
       int opcao;
       int escolha_computador;
       int escolha_usuario;
              show.println("ola qual seu nome?");
              String nome = scan.nextLine();
              show.println("ah, seu nome e "+nome+",ne?, enfim, bom te conhecer. ");
              show.println("\nestava pensando aqui e eu queria perguntar se quer participar de um jogo?\n1->S\n2->N");
              opcao=scan.nextInt();
              
              if(opcao==2){
                  show.println("deixa pra outra vez entao.");
                  System.exit(0);}
              else if(opcao==1){
        show.println("Que bom que voce quer jogar,vou explicar como funciona.");
    }
              show.println("O jogo e o seguinte,vou pensar em um número de 0 a 10, e voce vai ter que adivihar qual numero e.");
              show.println("\n Esta se perguntando o que vai ganhar com isso?\n1->S\n2->N");
              opcao=scan.nextInt();
              if(opcao==1){show.println("Com o jogo voce ira ganhar um incrivel nada, bom, se voce gostar da sensacao de ganhar alguma coisa vai ser esse o seu ganho.");
              }else if(opcao==2){show.println("Nao?ok...");}
              show.println("Bom, agora que voce sabe mais ou menos como vai ser o jogo vou escolher um numero");
              escolha_computador=gerador.nextInt(11);
              show.println("pronto ja escolhi um numero "+nome+".");
              show.println("tente adivinhar agora sabichao:");
              
              do{ escolha_usuario=scan.nextInt();
              if(escolha_usuario!=escolha_computador){
                  show.println("Voce errouuuu, pelo visto nao foi dessa vez.");
                  }else{show.println("Voce acertoouuu receba, parabens"+nome+"quando quiser jogar de novo so chamar.");
              }
              }while(escolha_usuario!=escolha_computador);
              
              show.println("Essa foi minha apresentacao");
              
              
              }
              }

    
    

