package academy.maratonajava.javacore.Jmodificadorfinal.dominio;

import java.security.PublicKey;

public class Car {
    private String name;
    public static final double VELOCIDADE_LIMITE = 250;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
