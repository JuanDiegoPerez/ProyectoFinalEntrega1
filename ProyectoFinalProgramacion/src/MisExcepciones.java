public class MisExcepciones extends Exception {

    public MisExcepciones(String message) {
        super(message);
    }

    public ExcepcionProductoNoDisponible(String message) {
        super("el producto no esta disponible");
    }

    public ExcepcionCompraRechazada(String message) {
        super("no se ha podido realizar la compra, intente nuevamente");
    }

    public ExcepcionMensajeNoEnviado (String message) {
        super("el mensaje no se ha enviado, intente nuevamente");
    }

    public ExcepcionProductoNoEncontrado(String message) {
        super("el producto no se ha encontrado, intente nuevamente");
    }

    public ExcepcionUsuarioNoEncontrado(String message) {
        super("el usuario no se ha encontrado, intente nuevamente");
    }

    public ExcepcionProductoNoPublicado(String message) {
        super("no se ha podido publicar el producto, intente nuevamente");
    }

    public ExcepcionProductoNoCancelado (String message) {
        super("no se ha podido cancelar el producto, intente nuevamente");
    }

    public ExcepcionMensajeNulo(String message) {
        super("el mensaje que intenta enviar, esta nulo");
    }

    public ExcepcionMensajeSinDestinatario(String message) {
        super("el mensaje no posee destinatario");
    }

    public ExcepcionCalificacionNoCargada(String message) {
        super("su calificacion no se ha cargado con exito, intente nuevamente");
    }

    public ExcepcionEstadistica(String message) {
        super("la estadistica no se ha podido calcular");
    }
}
