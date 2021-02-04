package factory_method.ejemplo2.buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando boton html");
    }

    @Override
    public void onClick() {
        System.out.println("Onclick listener boton html");
    }
}
