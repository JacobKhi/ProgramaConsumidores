package sorting;

import java.util.*;
import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;

public class OrdenarPorEscolaridade implements Ordenador{
    //Essa classe organiza pelo metodo bubble sort
    @Override
    public void ordenar(ColecaoDeConsumidores consumidores) {
        bubbleSort(consumidores);
    }
    
    private void bubbleSort(ColecaoDeConsumidores consumidores){

        String escolaridadeConsumidor1;
        String escolaridadeConsumidor2;

        List<String> ordemDeEscolariade = new ArrayList<>();
        ordemDeEscolariade.add("Basic");
        ordemDeEscolariade.add("Graduation");
        ordemDeEscolariade.add("Master");
        ordemDeEscolariade.add("PhD");
        ordemDeEscolariade.add("2n Cycle");

        for (int i = 0; i < consumidores.obterTotalDeConsumidores() - 1; i++){
            for (int j = 0; j < consumidores.obterTotalDeConsumidores() - i - 1; j++){
                escolaridadeConsumidor1 = consumidores.obterConsumidor(j).getEducation();
                escolaridadeConsumidor2 = consumidores.obterConsumidor(j + 1).getEducation();
                if(compararEscolaridade(ordemDeEscolariade, escolaridadeConsumidor1, escolaridadeConsumidor2) > 0){
                    consumidores.trocarPosicaoEntreConsumidores(j, j + 1);
                }

            }
        }
    }

    private int compararEscolaridade(List<String> ordemDeEscolariade, String escolaridadeConsumidor1, String escolaridadeConsumidor2) {
        Integer consumidor1 = ordemDeEscolariade.indexOf(escolaridadeConsumidor1);
        Integer consumidor2 = ordemDeEscolariade.indexOf(escolaridadeConsumidor2);
        if(consumidor1 > consumidor2){
            return 1;
        }
        else if (consumidor1 < consumidor2){
            return -1;
        }
        else{
            return 0;
        }
    }

}   
