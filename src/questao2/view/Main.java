package questao2.view;

import questao2.models.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("lula", 2.0);

        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.reajustar(0.02);
        System.out.println(contaPoupanca.getSaldo());

    }
}