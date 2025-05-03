package model;

public class Consumidor {

    private String nome;
    private int id;
    private int yearBirth;
    private String education;
    private String maritalStatus;
    private int income;
    private int mntWines;
    private int mntMeatProducts;
    private int numWebPurchases;
    private int numStorePurchases;

    public Consumidor(int id, int year, String education, String maritalStatus,
                    int income, int mntWines, int mntMeatProducts,
                    int numWebPurchases, int numStorePurchases) {
        
        this.id = id;
        this.yearBirth = year;
        this.education = education;
        this.maritalStatus = maritalStatus;
        this.income = income;
        this.mntWines = mntWines;
        this.mntMeatProducts = mntMeatProducts;
        this.numWebPurchases = numWebPurchases;
        this.numStorePurchases = numStorePurchases;

    }

    //Construtor contendo o nome
    public Consumidor(String nome, int id, int year, String education, String maritalStatus,
                    int income, int mntWines, int mntMeatProducts,
                    int numWebPurchases, int numStorePurchases) {
        
        this.nome = nome;
        this.id = id;
        this.yearBirth = year;
        this.education = education;
        this.maritalStatus = maritalStatus;
        this.income = income;
        this.mntWines = mntWines;
        this.mntMeatProducts = mntMeatProducts;
        this.numWebPurchases = numWebPurchases;
        this.numStorePurchases = numStorePurchases;

    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getEducation() {
        return education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public int getIncome() {
        return income;
    }

    public int getMntWines() {
        return mntWines;
    }

    public int getMntMeatProducts() {
        return mntMeatProducts;
    }

    public int getNumWebPurchases() {
        return numWebPurchases;
    }

    public int getNumStorePurchases() {
        return numStorePurchases;
    }

    @Override
    public String toString(){
        return "Consumidor{" +
            "id= " + id +
            ", yearBirth= " + yearBirth +
            ", education= " + education +
            ", maritalStatus= " + maritalStatus +
            ", income= " + income +
            ", mntWines= " + mntWines +
            ", mntMeatProducts= " + mntMeatProducts +
            ", numWebPurchases= " + numWebPurchases +
            ", numStorePurchases= " + numStorePurchases + "}";
    }
    
}
