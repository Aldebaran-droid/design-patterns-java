package factory_method.ejemplo3.transportes.aereo;

import factory_method.ejemplo3.transportes.Transporte;

public class Boeing747 implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregar por Boeing 747");
    }

    @Override
    public void inicializarCargamento() {
        System.out.println("Inicializar cargamento Boeing 747");
    }
}
