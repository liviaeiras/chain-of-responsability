public abstract class Aprovador {

    protected Aprovador proximo;

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public void processar(Solicitacao solicitacao) {
        if (podeAprovar(solicitacao)) {
            aprovar(solicitacao);
        } else if (proximo != null) {
            proximo.processar(solicitacao);
        } else {
            System.out.println("Solicitação \"" + solicitacao.getDescricao()
                    + "\" (R$ " + solicitacao.getValor() + ") não pôde ser aprovada por ninguém.");
        }
    }

    protected abstract boolean podeAprovar(Solicitacao solicitacao);

    protected abstract void aprovar(Solicitacao solicitacao);
}
