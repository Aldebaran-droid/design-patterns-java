package factory_method.ejemplo3.factory;

import factory_method.ejemplo3.transportes.TipoTransporte;

public class FactoryLogistica {

    public static LogisticaTransporte getLogistica(TipoTransporte tipoTransporte) {
        if (tipoTransporte== TipoTransporte.AEREO) {
            return new LogisticaAerea();
        } else if (tipoTransporte== TipoTransporte.MARITIMO) {
            return new LogisticaMaritima();
        } else if (tipoTransporte== TipoTransporte.TERRESTRE) {
            return new LogisticaTerrestre();
        } else {
            throw new Error("Logistica no soportada");
        }
    }
}
