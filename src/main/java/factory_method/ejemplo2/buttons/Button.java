package factory_method.ejemplo2.buttons;

// La interfaz de producto declara las operaciones que todos los
// productos concretos deben implementar.
public interface Button {
    void render();
    void onClick();
}
