import javax.swing.*;

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

        //Criar um novo objeto
        Turista outroTurista = new Turista();
        String nome = JOptionPane.showInputDialog("Entre com seu nome:");
        outroTurista.setNome(nome);
        JOptionPane.showInputDialog(null, "O nome digitado foi " + outroTurista.getNome());

        //Criar a captura do CPF deste objeto
        String cpf = JOptionPane.showInputDialog("Entre com seu cpf:");
        if (Validacao.cpf(cpf))
            outroTurista.setCpf(cpf);
         else
            System.out.println("ERRO!!! CPF NÃO VALIDADO");
            JOptionPane.showInputDialog(null, outroTurista.setCpf() + "Validado!");
        }
    }