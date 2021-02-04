package factory_method.ejemplo3.factory;

import factory_method.ejemplo3.transportes.terrestre.Camion;
import factory_method.ejemplo3.transportes.terrestre.Moto;
import factory_method.ejemplo3.transportes.ParametroTransporte;
import factory_method.ejemplo3.transportes.Transporte;

public class LogisticaTerrestre  extends LogisticaTransporte {
    @Override
    Transporte crearTransporte(ParametroTransporte parametro) {
        if (parametro.getPesoCargamento() > 500) {
            return new Camion();
        } else {
            return new Moto();
        }
    }
}
