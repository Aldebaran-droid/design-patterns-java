package factory_method.ejemplo3.transportes.terrestre;

import factory_method.ejemplo3.transportes.Transporte;

public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregar por camion");
    }

    @Override
    public void inicializarCargamento() {
        System.out.println("Inicializar cargamento Camion");
    }
}
