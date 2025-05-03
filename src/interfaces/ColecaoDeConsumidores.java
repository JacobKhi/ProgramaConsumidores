package interfaces;

import model.Consumidor;

public interface ColecaoDeConsumidores {

    public void adicionarConsumidor(Consumidor consumidor);

    public void excluirConsumidor(String nomeDoConsumidor);

    //Adicionei esse pois o arquivo csv n tem nome e eu precisava testar esse metodo
    public void excluirConsumidor(int idDoConsumidor);

    public Consumidor obterConsumidor(int posicaoDoConsumidor);

    public int obterTotalDeConsumidores();

    public void trocarPosicaoEntreConsumidores(int posicaoDoConsumidor1, int posicaoDoConsumidor2);

    public void alterarConsumidor(int posicaoDoConsumidor, Consumidor novoConsumidor);

    //Fazer depois
    public void ordenarConsumidores(Ordenador ordenador);

}