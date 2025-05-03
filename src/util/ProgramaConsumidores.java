package util;

import interfaces.ColecaoDeConsumidores;
import model.Consumidor;

public class ProgramaConsumidores{

    public void listarConsumidores(ColecaoDeConsumidores colecaoDeConsumidores){
        for(int i = 0; i < colecaoDeConsumidores.obterTotalDeConsumidores(); i++){
            Consumidor consumidor = colecaoDeConsumidores.obterConsumidor(i);
        System.out.println("Posicao " + i + ": " + consumidor.toString());
        }
    }

}