package factory_method.ejemplo3.transportes.aereo;

import factory_method.ejemplo3.transportes.Transporte;

public class Avioneta implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregar por avioneta");
    }

    @Override
    public void inicializarCargamento() {
        System.out.println("Inicializar cargamento avioneta");
    }
}
