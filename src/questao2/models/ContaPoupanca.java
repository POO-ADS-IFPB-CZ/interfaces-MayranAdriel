package questao2.models;

import questao2.interfaces.Investimento;

public class ContaPoupanca extends Conta implements Investimento{


    public ContaPoupanca(String nomeTitular, double saldo) {
        super(nomeTitular, saldo);
    }

    @Override
    public void reajustar(double percentual){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);
    }
}
