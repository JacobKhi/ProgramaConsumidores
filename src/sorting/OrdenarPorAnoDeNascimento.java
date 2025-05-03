package sorting;

import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;

public class OrdenarPorAnoDeNascimento implements Ordenador{
    //Essa classe organiza pelo metodo quick sort
    @Override
    public void ordenar(ColecaoDeConsumidores consumidores) {
        quickSort(consumidores, 0, consumidores.obterTotalDeConsumidores() -1);
    }

    private void quickSort(ColecaoDeConsumidores consumidores, int inicio, int fim){
        int posPivo;
        if (inicio < fim){
            posPivo = particionarVetor(consumidores, inicio, fim);
			quickSort(consumidores, inicio, posPivo - 1);
			quickSort(consumidores, posPivo + 1, fim);
        }
    }

    private int particionarVetor(ColecaoDeConsumidores consumidores, int inicio, int fim) {
        int esquerda, direita, pivo;
        esquerda = inicio;
        direita = fim;
        pivo = consumidores.obterConsumidor(inicio).getYearBirth();
        while (esquerda < direita) {
            while (consumidores.obterConsumidor(esquerda).getYearBirth() <= pivo && esquerda < fim) {
                esquerda++;
            }
            while (consumidores.obterConsumidor(direita).getYearBirth() > pivo && direita > inicio) {
                direita--;
            }
            if (esquerda < direita) {
                consumidores.trocarPosicaoEntreConsumidores(esquerda, direita);
            }
        }  
        consumidores.trocarPosicaoEntreConsumidores(inicio, direita);
        return direita;
    }
}
