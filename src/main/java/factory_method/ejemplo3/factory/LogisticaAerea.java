package factory_method.ejemplo3.factory;

import factory_method.ejemplo3.transportes.aereo.Avioneta;
import factory_method.ejemplo3.transportes.aereo.Boeing747;
import factory_method.ejemplo3.transportes.ParametroTransporte;
import factory_method.ejemplo3.transportes.Transporte;

public class LogisticaAerea extends LogisticaTransporte {

    @Override
    Transporte crearTransporte(ParametroTransporte parametro) {

        if (parametro.getPesoCargamento() > 10000) {
            return new Boeing747();
        } else {
            return new Avioneta();
        }
    }
}
