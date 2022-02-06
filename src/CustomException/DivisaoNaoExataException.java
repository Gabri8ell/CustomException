package CustomException;

public class DivisaoNaoExataException extends Exception{
    int numerador;
    int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
