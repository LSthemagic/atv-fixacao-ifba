public class Loja {
    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;


    public Loja(String nome, String ramo, int anoFundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
        this.vendedor = null;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }


    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }


    public void admitirVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


    public void demitirVendedor() {
        this.vendedor = null;
    }


    public Vendedor getVendedor() {
        return vendedor;
    }
}


