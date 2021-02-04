package factory_method.ejemplo2.factory;

import factory_method.ejemplo2.buttons.Button;
import factory_method.ejemplo2.buttons.HtmlButton;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
