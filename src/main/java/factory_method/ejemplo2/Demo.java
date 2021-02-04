package factory_method.ejemplo2;


import factory_method.ejemplo2.factory.Dialog;
import factory_method.ejemplo2.factory.WebDialog;
import factory_method.ejemplo2.factory.WindowsDialog;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo {

    /**
     * La aplicación elige un tipo de creador dependiendo de la
     * configuración actual o los ajustes del entorno.
     * @param args
     */
    public static void main(String args[]) {
        String config = readApplicationConfigFile();
        Dialog dialog;

        if (config.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (config.equals("Web")) {
            dialog = new WebDialog();
        }  else {
            throw new Error("Error!, sistema operativo desconocido");
        }

        dialog.render();
    }

    private static String readApplicationConfigFile() {
        List<String> configurationList = Arrays.asList("Windows", "Web");
        Random rand = new Random();
        return configurationList.get(rand.nextInt(configurationList.size()));
    }
}
