public class Solicitacao {

    private String descricao;
    private double valor;

    public Solicitacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
