package questao1.view;

import questao1.models.Triatleta;

public class Main {
    public static void main(String[] args) {
        Triatleta bolsonaro = new Triatleta("bolsonaro", 120, "4002-8922");

        bolsonaro.correr();
        bolsonaro.nadar();
        bolsonaro.pedalar();
    }
}
