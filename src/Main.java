
public class Main {
    public static void main(String[] args) {

        //Aula Introdutoria de Orientação Objetos
        // Declaração de Objetos
        Pessoa adao;

        //Instanciação de objeto
        adao = new Pessoa();

        //Ao mesmo tempo
        Pessoa qualquer = new Pessoa();

        //Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));

        // Criar novos objetos
        //Declarar objetos
        Pessoa rainha;
        //Instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Turnner";
        //Definição de comportamento
        rainha.falar();
        rainha.comer();

        Produto p1 = new Produto(1300.00);
        Produto p2 = new Produto();
        p2.setPreco(233.00);
        Produto p3;
        p3 = new Produto("Placa Vídeo", 1300.00);
        p3 = new Produto("Placa Mãe", 2500.00);

        p2.setPreco(1.00);
    }
}