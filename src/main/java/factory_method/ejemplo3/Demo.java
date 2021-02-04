package factory_method.ejemplo3;

import factory_method.ejemplo3.factory.FactoryLogistica;
import factory_method.ejemplo3.factory.LogisticaTransporte;
import factory_method.ejemplo3.transportes.ParametroTransporte;
import factory_method.ejemplo3.transportes.TipoTransporte;
import factory_method.ejemplo3.transportes.Transporte;
import factory_method.ejemplo3.transportes.aereo.Avioneta;

import java.util.Random;

public class Demo {

    public static void main(String args[])
    {

//        LogisticaTransporte logisticaTransporte = FactoryLogistica.getLogistica(getTransporteSeleccionado());
        LogisticaTransporte logisticaTransporte = FactoryLogistica.getLogistica(TipoTransporte.AEREO);

        ParametroTransporte parametroTransporte = new ParametroTransporte();
        parametroTransporte.setPesoCargamento(10001);
        Transporte transporte = new Avioneta();
        transporte.entregar();
    }

    private static TipoTransporte getTransporteSeleccionado() {
        Random random = new Random();
        return TipoTransporte.values()[random.nextInt(TipoTransporte.values().length)];
    }
}
