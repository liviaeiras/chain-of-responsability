public class Gerente extends Aprovador {

    @Override
    protected boolean podeAprovar(Solicitacao solicitacao) {
        return solicitacao.getValor() <= 5000;
    }

    @Override
    protected void aprovar(Solicitacao solicitacao) {
        System.out.println("Gerente aprovou: " + solicitacao.getDescricao()
                + " (R$ " + solicitacao.getValor() + ")");
    }
}
