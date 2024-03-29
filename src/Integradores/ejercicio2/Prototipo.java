package Integradores.ejercicio2;

public abstract class Prototipo<T extends Number> {

    public abstract T siguienteNumero();

    public abstract void reiniciarSerie();

    public abstract void establecerValorInicial(T numero);

}
