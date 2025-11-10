package com.utn.productos_api.exception;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException() {
        super("No se puede reducir el stock por debajo de 0.");
    }
}
