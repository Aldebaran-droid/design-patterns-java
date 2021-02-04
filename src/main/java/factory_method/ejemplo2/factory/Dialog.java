/**
 * Sitio web de referencia
 * https://refactoring.guru/es/design-patterns/factory-method
 */
package factory_method.ejemplo2.factory;

import factory_method.ejemplo2.buttons.Button;

/**
 * La clase creadora declara el método fábrica que debe devolver
 * un objeto de una clase de producto. Normalmente, las
 * subclases de la creadora proporcionan la implementación de
 * este método.
 */
public abstract class Dialog {

    // La creadora también puede proporcionar cierta
    // implementación por defecto del método fábrica.
    abstract Button createButton();

    /**
     * Observa que, a pesar de su nombre, la principal
     * responsabilidad de la creadora no es crear productos.
     * Normalmente contiene cierta lógica de negocio que depende
     * de los objetos de producto devueltos por el método
     * fábrica. Las subclases pueden cambiar indirectamente esa
     * lógica de negocio sobrescribiendo el método fábrica y
     * devolviendo desde él un tipo diferente de producto.
     */
    public void render() {
        Button button = createButton();
        button.onClick();
        button.render();
    }
}
