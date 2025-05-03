package app;

import java.util.ArrayList;
import java.util.List;

import data.ManipularDataset;

import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;

import model.Consumidor;
import model.ListaDeConsumidores;
import model.VetorDeConsumidores;
import sorting.OrdenarPorAnoDeNascimento;
import sorting.OrdenarPorEscolaridade;
import util.ProgramaConsumidores;

public class App {
    public static void main(String[] args) {

        String arquivoEntrada = "data/arquivo_reduzido.csv";

        List<Consumidor> consumidoresArray = new ArrayList<>();
        
        //Listas dos consumidores
        ColecaoDeConsumidores vetorDeConsumidores = new VetorDeConsumidores();
        ColecaoDeConsumidores listaDeConsumidores = new ListaDeConsumidores();

        //Ordenadores
        Ordenador ordenarAnoDeNascimentoPorQuickSort = new OrdenarPorAnoDeNascimento();
        Ordenador ordenarEscolaridadePorBubbleSort = new OrdenarPorEscolaridade();

        ProgramaConsumidores programaConsumidores = new ProgramaConsumidores();

        consumidoresArray = ManipularDataset.lerDataset(arquivoEntrada);

        for(Consumidor consumidor : consumidoresArray){
            vetorDeConsumidores.adicionarConsumidor(consumidor);
            listaDeConsumidores.adicionarConsumidor(consumidor);
        }

        /*
        System.out.println("vetor antes");
        System.out.println("Total de consumidores: " + vetorDeConsumidores.obterTotalDeConsumidores());
        programaConsumidores.listarConsumidores(vetorDeConsumidores);

        vetorDeConsumidores.excluirConsumidor(965);
        
        System.out.println(vetorDeConsumidores.obterConsumidor(20));
        
        vetorDeConsumidores.trocarPosicaoEntreConsumidores(1, 7);

        Consumidor consumidorTeste = new Consumidor(100, 1940, "Formado", "Casado", 70000, 20, 10, 4, 2);
        vetorDeConsumidores.alterarConsumidor(2, consumidorTeste);

        System.out.println("vetor depois");
        System.out.println("Total de consumidores: " + vetorDeConsumidores.obterTotalDeConsumidores());
        programaConsumidores.listarConsumidores(vetorDeConsumidores);
        */

        /*
        System.out.println("lista antes");
        System.out.println("Total de consumidores: " + listaDeConsumidores.obterTotalDeConsumidores());
        programaConsumidores.listarConsumidores(listaDeConsumidores);
        
        listaDeConsumidores.excluirConsumidor(965);

        System.out.println(listaDeConsumidores.obterConsumidor(1));

        Consumidor novoConsumidor = listaDeConsumidores.obterConsumidor(4);
        listaDeConsumidores.alterarConsumidor(0, novoConsumidor);

        listaDeConsumidores.trocarPosicaoEntreConsumidores(1, 8);

        System.out.println("lista depois");
        System.out.println("Total de consumidores: " + listaDeConsumidores.obterTotalDeConsumidores());
        programaConsumidores.listarConsumidores(listaDeConsumidores);
        */

        /* 
        System.out.println("lista antes do quicksort");
        programaConsumidores.listarConsumidores(listaDeConsumidores);

        vetorDeConsumidores.ordenarConsumidores(ordenarAnoDeNascimentoPorQuickSort);

        System.out.println("lista depois do quicksort");
        programaConsumidores.listarConsumidores(listaDeConsumidores);
        */

        
        System.out.println("lista antes do bubblesort");
        programaConsumidores.listarConsumidores(listaDeConsumidores);

        listaDeConsumidores.ordenarConsumidores(ordenarEscolaridadePorBubbleSort);

        System.out.println("lista depois do bubblesort");
        programaConsumidores.listarConsumidores(listaDeConsumidores);
        
    }
}