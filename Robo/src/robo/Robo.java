/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

/**
 *
 * @author Alyson
 */
public class Robo {

    private int linha;
    private int coluna;
    private static final int fatoMovimento = 2;

    Ambiente sala = new Ambiente();

    public Robo(int linha, int coluna, Ambiente sala) {
        this.linha = linha;
        this.coluna = coluna;
        this.sala = sala;
    }

    public Robo() {
    }

    public void mostrarPosicao() {
        System.out.println("[Robo] esta na posicao (" + linha + ", " + coluna + ") da sala");
    }

    public void andarFrente() {
        if ((linha + 1) < sala.getQtdLinha()) {
            linha = linha + fatoMovimento;
        } else {
            System.out.println("Comando não pode ser realizado");
        }
    }

    public void andarTras() {
        if (linha > 1 ) {
           linha = linha - fatoMovimento;
        } else {
            System.out.println("Comando não pode ser realizado");
        }
    }

    public void parar() {
        System.out.println("Robo parado");
    }

    public void virarDireita() {
        if((coluna + 1) < sala.getQtdColuna()){
            coluna = coluna + fatoMovimento;
        }else{
            System.out.println("Comando não pode ser realizado");
        }
    }

    public void virarEsquerda() {
        if (coluna > 1){
            coluna = coluna - fatoMovimento;
        }else{
            System.out.println("Comando não pode ser realizado");
        }      
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public Ambiente getSala() {
        return sala;
    }

    public void setSala(Ambiente sala) {
        this.sala = sala;
    }

    public static int getFatoMovimento() {
        return fatoMovimento;
    }
    
}
