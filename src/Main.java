import java.util.WeakHashMap;

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
        System.out.println((qualquer.falar("oi"));
    }
}