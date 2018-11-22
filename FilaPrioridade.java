package PriorityList;

import java.util.List;

/**
 *
 * @author Caelum ~ Raffael de Castro Rodrigues
 */
public class FilaPrioridade<K extends Comparable<K>, V> {
    
    private Boolean heapMax, heapMin;
    private List<Element<K, V>> lista;
    
    public FilaPrioridade(){}
    
    public void adicionarElemento(K chave, V valor){
        Element<K, V> elemento = new Element<>(chave, valor);
        this.lista.add(elemento);
        Boolean aux = false;
        if(heapMin = true){
            this.borbulheParaCimaMin(this.lista.indexOf(elemento));
        }
        if(heapMax = true){
            this.borbulheParaBaixoMin(this.lista.indexOf(elemento));
        }
        
    }
    
    public boolean vazio(){
        return this.lista.isEmpty();
    }
    
    public int tamanho(){
        return this.lista.size();
    }
    
    private void borbulheParaCimaMin(int indice) {
        int indicePai;
        indicePai = (indice + 1) / 2 - 1;
        
        K infoTemp = lista.get(indicePai).getChave();

        while ((indice > 0) && (this.lista.get(indicePai).chave.compareTo(infoTemp) > 0)) {
            this.lista.get(indice).setChave(this.lista.get(indicePai).getChave());
            this.lista.get(indice).setValor(this.lista.get(indicePai).getValor());
            indice = indicePai;
            indicePai = (indice + 1) / 2 - 1;
        }
        this.lista.get(indice).setValor(this.lista.get(indice).getValor());
        this.lista.get(indice).setChave(infoTemp);

    }   
    
    private void borbulheParaBaixoMin(int indice) {
        int menorFilho;
        int filhoDireito, filhoEsquerdo;
        K infoTemp = lista.get(indice).getChave();
        while ((indice + 1) * 2 <= this.lista.size()) {
            filhoEsquerdo = 2 * (indice + 1) - 1;
            filhoDireito = filhoEsquerdo + 1;
            // Procura o menor filho
            if ((filhoDireito <= this.lista.size() - 1) &&
            (this.lista.get(filhoDireito).getChave().compareTo(this.lista.get(filhoEsquerdo).getChave()) < 0)){
                menorFilho = filhoDireito;
            }else{
                menorFilho = filhoEsquerdo;
            }
            if (infoTemp.compareTo(this.lista.get(menorFilho).getChave()) < 0){
                break;
            }
            this.lista.get(indice).setChave(this.lista.get(menorFilho).getChave());
            this.lista.get(indice).setValor(this.lista.get(menorFilho).getValor());
            indice = menorFilho;
        }
        this.lista.get(indice).setValor(this.lista.get(indice).getValor());
        this.lista.get(indice).setChave(infoTemp);

    }
    
    public Element<K, V> getPai(Element<K, V> element){
        return this.lista.get((this.lista.indexOf(element)+1)/2-1);
    }
    
    public Element<K, V> getFilhoEsquerdo(Element<K, V> element){
        return this.lista.get(2*(this.lista.indexOf(element)+1)-1);
    }
    
    public Element<K, V> getFilhoDireito(Element<K, V> element){
        return this.lista.get(2*(this.lista.indexOf(element)+1));
    }
    
    public void heapMax(){
        this.heapMax = true;
        this.heapMin = false;
    }
    
    public void heapMin(){
        this.heapMax = false;
        this.heapMin = true;
    }
    
}
