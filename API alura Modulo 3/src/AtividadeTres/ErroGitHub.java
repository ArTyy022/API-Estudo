package AtividadeTres;

class ErroGitHub extends RuntimeException {

    public ErroGitHub(String mensagem) {
        super(mensagem);
    }
}