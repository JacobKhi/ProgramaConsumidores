package model;

import util.No;
import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;

public class ListaDeConsumidores implements ColecaoDeConsumidores{
    
    No inicio = null;
    int totalDeElementos = 0;

    @Override
    public void adicionarConsumidor(Consumidor consumidor){
        No novoNo = new No(consumidor);
        novoNo.definirProximo(inicio);
        this.inicio = novoNo;
        totalDeElementos++;  
    }
    
    @Override        
    public void excluirConsumidor(String nomeDoConsumidor){
        No noAtual = inicio;
        No noAnterior = null;

        if(noAtual != null){
            //Iterar pela lista
            while (noAtual.obterProximo() != null && noAtual.obterDado().getNome() != nomeDoConsumidor){ 
                noAnterior = noAtual;
                noAtual = noAtual.obterProximo();
            }
            //Verificar se o consumidor ta na lista
            if(noAtual.obterDado().getNome().equals(nomeDoConsumidor)){
                noAnterior.definirProximo(noAtual.obterProximo());
                totalDeElementos--;
                System.out.println("Consumidor de nome: " + nomeDoConsumidor + " removido");
            }
            else{
                System.out.println("Consumidor nao encontrado na lista");
            }
        }
        else{
            System.out.println("Consumidor não existe na lista, pois ela esta vazia");
        }
    }
     
    @Override 
    public void excluirConsumidor(int idDoConsumidor){
        No noAtual = inicio;
        No noAnterior = null;

        if(noAtual != null){
            //Iterar pela lista
            while (noAtual.obterProximo() != null && noAtual.obterDado().getId() != idDoConsumidor){ 
                noAnterior = noAtual;
                noAtual = noAtual.obterProximo();
            }
            //Verificar se o consumidor ta na lista
            if(noAtual.obterDado().getId() == idDoConsumidor){
                noAnterior.definirProximo(noAtual.obterProximo());
                totalDeElementos--;
                System.out.println("Consumidor de Id: " + idDoConsumidor + " removido");
            }
            else{
                System.out.println("Consumidor nao encontrado na lista");
            }
        }
        else{
            System.out.println("Consumidor não existe na lista, pois ela esta vazia");
        }
    }
    
    @Override
    public Consumidor obterConsumidor(int posicaoDoConsumidor){
        No noAtual = inicio;
        int posicaoAtual = 0;

        if(noAtual != null){
            while (noAtual.obterProximo() != null && posicaoAtual < posicaoDoConsumidor) {
                noAtual = noAtual.obterProximo();
                posicaoAtual++;
            }
            if(posicaoAtual == posicaoDoConsumidor){
                return noAtual.obterDado();
            }
        }
        else{
            System.out.println("Consumidor não pode ser obtido, pois ela esta vazia");
            return null;
        }

        System.out.println("Consumidor de posicao " + posicaoDoConsumidor + " nao encontrado");
        return null;
    }
    
    @Override
    public int obterTotalDeConsumidores(){
        return totalDeElementos;
    }
    
    @Override
    public void trocarPosicaoEntreConsumidores(int posicaoDoConsumidor1, int posicaoDoConsumidor2){
        No noAtualDoConsumidor1 = inicio;
        No noAtualDoConsumidor2 = inicio;
        int posicaoAtualDoConsumidor1 = 0;
        int posicaoAtualDoConsumidor2 = 0;

        if(this.inicio != null){
            while (noAtualDoConsumidor1.obterProximo() != null && posicaoAtualDoConsumidor1 < posicaoDoConsumidor1) {
                noAtualDoConsumidor1 = noAtualDoConsumidor1.obterProximo();
                posicaoAtualDoConsumidor1++;
            }
            while (noAtualDoConsumidor2.obterProximo() != null && posicaoAtualDoConsumidor2 < posicaoDoConsumidor2) {
                noAtualDoConsumidor2 = noAtualDoConsumidor2.obterProximo();
                posicaoAtualDoConsumidor2++;
            }
            if(posicaoAtualDoConsumidor1 == posicaoDoConsumidor1 && posicaoAtualDoConsumidor2 == posicaoDoConsumidor2){
                Consumidor variavelAuxiliar = noAtualDoConsumidor1.obterDado();
                noAtualDoConsumidor1.definirDado(noAtualDoConsumidor2.obterDado());
                noAtualDoConsumidor2.definirDado(variavelAuxiliar);
                System.out.println("Troca concluida com exito");
            }
            else{
                System.out.println("Posicoes invalidas na lista");
            }
        }
        else{
            System.out.println("Consumidor não pode ser trocado, pois ela esta vazia");
        }
    }
    
    @Override
    public void alterarConsumidor(int posicaoDoConsumidor, Consumidor novoConsumidor){
        No noAtual = inicio;
        int posicaoAtual = 0;

        if(noAtual != null){
            while (noAtual.obterProximo() != null && posicaoAtual < posicaoDoConsumidor) {
                noAtual = noAtual.obterProximo();
                posicaoAtual++;
            }
            if(posicaoDoConsumidor == posicaoAtual){
                noAtual.definirDado(novoConsumidor);
            }
            else{
                System.out.println("Tamanho invalido");
            }
        }
        else{
            System.out.println("Posicao invalida, a lista esta vazia");
        }
    }
    
    @Override
    public void ordenarConsumidores(Ordenador ordenador){
        ordenador.ordenar(this);
    }

}