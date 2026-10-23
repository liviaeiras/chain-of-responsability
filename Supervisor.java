public class Supervisor extends Aprovador {

    @Override
    protected boolean podeAprovar(Solicitacao solicitacao) {
        return solicitacao.getValor() <= 1000;
    }

    @Override
    protected void aprovar(Solicitacao solicitacao) {
        System.out.println("Supervisor aprovou: " + solicitacao.getDescricao()
                + " (R$ " + solicitacao.getValor() + ")");
    }
}
