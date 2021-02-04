package factory_method.ejemplo2.factory;

import factory_method.ejemplo2.buttons.Button;
import factory_method.ejemplo2.buttons.WindowsButton;

// Los creadores concretos sobrescriben el método fábrica para
// cambiar el tipo de producto resultante.
public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
