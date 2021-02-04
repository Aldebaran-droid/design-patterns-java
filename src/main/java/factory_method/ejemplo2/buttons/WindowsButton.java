package factory_method.ejemplo2.buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando boton windows");
    }

    @Override
    public void onClick() {
        System.out.println("Onclick listener boton windows");
    }
}
