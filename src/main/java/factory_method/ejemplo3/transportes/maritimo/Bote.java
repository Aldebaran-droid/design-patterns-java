package factory_method.ejemplo3.transportes.maritimo;

import factory_method.ejemplo3.transportes.Transporte;

public class Bote implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregar por bote");
    }

    @Override
    public void inicializarCargamento() {
        System.out.println("Inicializar cargamento Bote");
    }
}
