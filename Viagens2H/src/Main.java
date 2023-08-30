public class Main {
    public static void main(String[] args) {

        //Classe objeto      Construtor
        Turista mochileira = new Turista();

        // Definir formato dos objetos
        mochileira.setNome("Lindsay Lohan");
        mochileira.setCpf(Validacao.cpf("123"));
        Turista mochileiro = new Turista("João");

        //Definir comportameto
       String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}