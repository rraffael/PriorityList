/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityList;

/**
 *
 * @author rraffael
 */
public class Element<K extends Comparable<K>, V>  {
    K chave;
    V valor;
    int Prioridade;
    
    public Element(K chave, V valor){
        this.chave = chave;
        this.valor = valor;
        this.Prioridade = 0;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    
    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public int getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(int Prioridade) {
        this.Prioridade = Prioridade;
    }
    
    
    
}
