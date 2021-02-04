package factory_method.ejemplo3.factory;

import factory_method.ejemplo3.transportes.maritimo.Barco;
import factory_method.ejemplo3.transportes.maritimo.Bote;
import factory_method.ejemplo3.transportes.ParametroTransporte;
import factory_method.ejemplo3.transportes.Transporte;
import factory_method.ejemplo3.transportes.maritimo.Lancha;

public class LogisticaMaritima extends LogisticaTransporte {

    @Override
    Transporte crearTransporte(ParametroTransporte parametro) {
        if (parametro.getPesoCargamento() > 1500) {
            return new Barco();
        } else if (parametro.getPesoCargamento() > 400) {
            return new Lancha();
        } else {
            return new Bote();
        }
    }
}
