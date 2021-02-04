package factory_method.ejemplo3.transportes.maritimo;

import factory_method.ejemplo3.transportes.Transporte;

public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregar por barco");
    }

    @Override
    public void inicializarCargamento() {
        System.out.println("Inicializar cargamento Barco");
    }
}
