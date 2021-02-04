package factory_method.ejemplo1;

import factory_method.ejemplo1.formas.*;

public class FormaFactory {

    public static Forma getForma(FormaEnum formaEnum) {
        switch (formaEnum) {
            case CIRCULO: return new Circulo();
            case CUADRADO: return new Cuadrado();
            case RECTANGULO: return new Rectangulo();
            case TRIANGULO: return new Triangulo();
            default: throw new Error("Forma no soportada");
        }
    }
}
