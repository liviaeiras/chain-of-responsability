public class Main {

    public static void main(String[] args) {
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        // Montando a cadeia: Supervisor -> Gerente -> Diretor
        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        supervisor.processar(new Solicitacao("Material de escritório", 500));
        supervisor.processar(new Solicitacao("Notebook", 3500));
        supervisor.processar(new Solicitacao("Servidor", 15000));
        supervisor.processar(new Solicitacao("Reforma do prédio", 80000));
    }
}
