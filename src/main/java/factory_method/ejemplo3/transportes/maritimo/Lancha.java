package factory_method.ejemplo3.transportes.maritimo;

import factory_method.ejemplo3.transportes.Transporte;

public class Lancha implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Lancha entrega");
    }

    @Override
    public void inicializarCargamento() {
        System.out.println("Lancha inicializacion");
    }
}
