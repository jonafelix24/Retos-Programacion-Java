package dev.silenzz.retos.nivel_1.operaciones_basicas;

public class BasicOperationsSolucion {
    
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> throw new IllegalArgumentException(op);
        };
    }

}
