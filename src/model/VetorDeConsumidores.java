package model;

import java.util.*;
import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;

public class VetorDeConsumidores implements ColecaoDeConsumidores{
    
    List<Consumidor> vetorConsumidores = new ArrayList<>();

    @Override
    public void adicionarConsumidor(Consumidor consumidor){
        vetorConsumidores.add(consumidor);
    }

    @Override
    public void excluirConsumidor(String nomeDoConsumidor){
        //Complexidade de O(n)
        for(Consumidor consumidor : vetorConsumidores){
            if(consumidor.getNome().equals(nomeDoConsumidor)){
                vetorConsumidores.remove(consumidor);
                return;
            }
        }   
        //metodo 2 usando lambda
        //vetorConsumidores.removeIf(consumidor -> consumidor.getNome() == nomeDoConsumidor);
    }

    @Override
    public void excluirConsumidor(int idDoConsumidor){
        //Complexidade de O(n)
        for(Consumidor consumidor : vetorConsumidores){
            if(consumidor.getId() == idDoConsumidor){
                vetorConsumidores.remove(consumidor);
                return;
            }
        }
        //metodo 2 usando lambda
        //vetorConsumidores.removeIf(consumidor -> consumidor.getId() == idDoConsumidor);  
    }

    @Override
    public Consumidor obterConsumidor(int posicaoDoConsumidor){
        if(posicaoDoConsumidor < vetorConsumidores.size()){
            return vetorConsumidores.get(posicaoDoConsumidor);
        }
        System.out.println("Consumidor nao encontrado");
        return null;
    }

    @Override
    public int obterTotalDeConsumidores(){
        return vetorConsumidores.size();
    }

    @Override
    public void trocarPosicaoEntreConsumidores(int posicaoDoConsumidor1, int posicaoDoConsumidor2){
        if(posicaoDoConsumidor1 < vetorConsumidores.size() || posicaoDoConsumidor2 < vetorConsumidores.size()){
            Consumidor consumidor1 = vetorConsumidores.get(posicaoDoConsumidor1);
            Consumidor consumidor2 = vetorConsumidores.get(posicaoDoConsumidor2);
            vetorConsumidores.set(posicaoDoConsumidor1, consumidor2);
            vetorConsumidores.set(posicaoDoConsumidor2, consumidor1);  
        }
        else{
            System.out.println("Falha ao trocar consumidor de lugar, posicao invalida");
        }
    }

    @Override
    public void alterarConsumidor(int posicaoDoConsumidor, Consumidor novoConsumidor){
        if(posicaoDoConsumidor < vetorConsumidores.size()){
            vetorConsumidores.set(posicaoDoConsumidor, novoConsumidor);
        }  
    }

    @Override    
    public void ordenarConsumidores(Ordenador ordenador){
        ordenador.ordenar(this);
    }

}
