package factory_method.ejemplo1;

import factory_method.ejemplo1.formas.Forma;
import factory_method.ejemplo1.formas.FormaEnum;

import java.util.Random;

public class Demo {

    public static void main(String args[]) {
        Forma formaSeleccionada = FormaFactory.getForma(getFormaSeleccionado());

        Forma circulo = FormaFactory.getForma(FormaEnum.CIRCULO);

        Forma cuadrado = FormaFactory.getForma(FormaEnum.CUADRADO);

        formaSeleccionada.dibujar();
        circulo.dibujar();
        cuadrado.dibujar();
    }


    private static FormaEnum getFormaSeleccionado() {
        Random random = new Random();
        return FormaEnum.values()[random.nextInt(FormaEnum.values().length)];
    }
}
