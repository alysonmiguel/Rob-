/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

import java.util.Scanner;

/**
 *
 * @author Alyson
 */
public class TestarRobo {

    Scanner entrada = new Scanner(System.in);
    Ambiente sala;
    Robo mig ;

    public void definirAmbiente() {
        System.out.println("Informe o tamanho do ambiente (quantidade de linha e colunas)");
        sala = new Ambiente(entrada.nextInt(),entrada.nextInt());
    }

    public void iniciarRobo() {
        System.out.println("Informe a posicao do robo no ambiente (linha e coluna)");
        mig = new Robo(entrada.nextInt(), entrada.nextInt(), sala);

    }

    public void menu() {
        int op;
        System.out.println("A sala tem tamanho: " + sala.getQtdLinha() + " X " + sala.getQtdColuna());
        mig.mostrarPosicao();
        do {
          
            System.out.println("1 - Andar para Frente\n"
                    + "2 - Andar para Trás\n"
                    + "3 - Parar\n"
                    + "4 - Virar para Direita\n"
                    + "5 - Virar para Esquerda\n"
                    + "6 - Sair");
            op = entrada.nextInt();
            switch(op){
                case 1: System.out.println("[Robo]: Andando para frente");mig.andarFrente();  mig.mostrarPosicao();  break;
                case 2: System.out.println("[Robo]: Andando para tras");  mig.andarTras(); mig.mostrarPosicao(); break;
                case 3: System.out.println("[Robo]: Robo parado"); mig.mostrarPosicao(); break;
                case 4: System.out.println("[Robo]: Virando para direita"); mig.virarDireita(); mig.mostrarPosicao(); break;
                case 5: System.out.println("[Robo]: Virando para esquerda");mig.virarEsquerda(); mig.mostrarPosicao(); break;
                case 6: System.out.println("Saindo..."); break;
                default: System.out.println("Opção invalida!");
            }
            
        }while(op != 6);       
        
        
    }

}
