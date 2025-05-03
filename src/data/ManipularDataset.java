package data;

import java.io.*;
import java.util.*;
import model.Consumidor;

public class ManipularDataset {

    public static List<Consumidor> lerDataset(String arquivoEntrada) {

        List<Consumidor> consumidores = new ArrayList<>();
        String linha;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada))) {

            //Le e separa cada parte do cabecalho
            String[] camposSeparados = leitor.readLine().split("\t");

            //Adicionei a um hashmap(nome ; valor) pois seria mais facil pescar as informacoes da array com um get...
            //...do que montar uma arraylist ja separada
            Map<String, Integer> indice = new HashMap<>();

            for (int i = 0; i < camposSeparados.length; i++) {
                indice.put(camposSeparados[i], i);
            }

            while ((linha = leitor.readLine()) != null) {

                String[] palavrasSeparadas = linha.split("\t", -1);

                try {
                    int id = Integer.parseInt(palavrasSeparadas[indice.get("ID")]);
                    int year = Integer.parseInt(palavrasSeparadas[indice.get("Year_Birth")]);
                    String education = palavrasSeparadas[indice.get("Education")];
                    String marital = palavrasSeparadas[indice.get("Marital_Status")];
                    int income = Integer.parseInt(palavrasSeparadas[indice.get("Income")]);
                    int wines = Integer.parseInt(palavrasSeparadas[indice.get("MntWines")]);
                    int meats = Integer.parseInt(palavrasSeparadas[indice.get("MntMeatProducts")]);
                    int web = Integer.parseInt(palavrasSeparadas[indice.get("NumWebPurchases")]);
                    int store = Integer.parseInt(palavrasSeparadas[indice.get("NumStorePurchases")]);

                    Consumidor consumidor = new Consumidor(id, year, education, marital, income, wines, meats, web, store);
                    consumidores.add(consumidor);

                } catch (IllegalArgumentException e) {

                    //Caso de algum erro na hora de encontrar algo nos vetores
                    e.printStackTrace();

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return consumidores;
    }

    public static void escreverDataset(String caminhoSaida, List<Consumidor> consumidores) {
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoSaida))) {
            
            escritor.write("ID, Year_Birth,Education, Marital_Status, Income, MntWines, MntMeatProducts, NumWebPurchases, NumStorePurchases\n");

            for (Consumidor consumidor : consumidores) {
                
                escritor.write(
                    consumidor.getId() + "\t\t" + consumidor.getYearBirth() + consumidor.getEducation() + "\t\t" + 
                    consumidor.getMaritalStatus() + "\t\t" + consumidor.getIncome() + "\t\t" +consumidor.getMntWines() + "\t\t" + 
                    consumidor.getMntMeatProducts() + "\t\t" + consumidor.getNumWebPurchases() + "\t\t" +
                    consumidor.getNumStorePurchases()
                );
                escritor.write("\n");
            }

            System.out.println("Arquivo salvo com sucesso!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}