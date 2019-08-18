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
public class Ambiente {
    
    private int qtdLinha;
    private int qtdColuna;
    
    public Ambiente(int qtdLinha, int qtdColuna){
        this.qtdColuna = qtdLinha;
        this.qtdLinha = qtdColuna;
    }
    
    public Ambiente(){
    }

    public int getQtdLinha() {
        return qtdLinha;
    }
    
    public void setQtdLinha(int qtdLinha) {
        this.qtdLinha = qtdLinha;
    }

    public int getQtdColuna() {
        return qtdColuna;
    }

    public void setQtdColuna(int qtdColuna) {
        this.qtdColuna = qtdColuna;
    }
    
    
    
    
    
}
