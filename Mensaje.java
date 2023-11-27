//ejercicio7 y 8
public class Mensaje {
    private String numeroLlamada;
    private String numeroRemitente;
    private String textoMensaje;

    public Mensaje(MensajeTexto mensajeTexto, String nl, String nr) {
        numeroLlamada = nl;
        numeroRemitente = nr;
        textoMensaje = mensajeTexto.getMensajeCompleto();
    }
    public Mensaje(MensajeTexto mensajeTexto, String nr) {
        numeroRemitente = nr;
        textoMensaje = mensajeTexto.getMensajeCompleto();
    }
    public Mensaje(MensajeTexto mensajeTexto) {
        textoMensaje = mensajeTexto.getMensajeCompleto();
    }
    // Método para actualizar el número de llamada del mensaje
    public void actualizarNumeroLlamada(String nuevoNumeroLlamada) {
        numeroLlamada = nuevoNumeroLlamada;
    }
    public void imprimirMensaje() {
        System.out.println("Número de llamada: " + numeroLlamada);
        System.out.println("Número del remitente: " + numeroRemitente);
        System.out.println("Texto del mensaje: " + textoMensaje);
    }
     public static void main(String[] args) {
        MensajeTexto mensajeTexto = new MensajeTexto("tqc", "Te quiero, cariño.");
        Mensaje mensaje1 = new Mensaje(mensajeTexto, "123456789", "987654321");
        Mensaje mensaje2 = new Mensaje(mensajeTexto, "987654321");
        Mensaje mensaje3 = new Mensaje(mensajeTexto);

        mensaje1.imprimirMensaje();
        mensaje2.imprimirMensaje();
        mensaje3.actualizarNumeroLlamada("555555555");
        mensaje3.imprimirMensaje();
    }
}
