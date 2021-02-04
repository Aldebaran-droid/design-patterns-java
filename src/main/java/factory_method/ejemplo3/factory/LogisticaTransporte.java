package factory_method.ejemplo3.factory;

import factory_method.ejemplo3.transportes.ParametroTransporte;
import factory_method.ejemplo3.transportes.Transporte;

public abstract class LogisticaTransporte {

    abstract Transporte crearTransporte(ParametroTransporte parametro);

    public Transporte getTransporte(ParametroTransporte parametro) {
        Transporte transporte = crearTransporte(parametro);
        transporte.inicializarCargamento();
        return transporte;
    }
}
