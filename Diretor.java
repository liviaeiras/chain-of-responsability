public class Diretor extends Aprovador {

    @Override
    protected boolean podeAprovar(Solicitacao solicitacao) {
        return solicitacao.getValor() <= 20000;
    }

    @Override
    protected void aprovar(Solicitacao solicitacao) {
        System.out.println("Diretor aprovou: " + solicitacao.getDescricao()
                + " (R$ " + solicitacao.getValor() + ")");
    }
}
