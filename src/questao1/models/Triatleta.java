package questao1.models;

import questao1.interfaces.Ciclista;
import questao1.interfaces.Corredor;
import questao1.interfaces.Nadador;

public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {

    public Triatleta(String nome, int idade, String numeroTelefone) {
        super(nome, idade, numeroTelefone);
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + " está pedalando");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando");
    }
}
