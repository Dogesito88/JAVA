//ejercicio 6
public class MensajeTexto {
    private String codigo;
    private String mensajeCompleto;

    // Constructor para crear un objeto MensajeTexto con código y mensaje completo
    public MensajeTexto(String c, String mc) {
        codigo = c;
        mensajeCompleto = mc;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getMensajeCompleto() {
        return mensajeCompleto;
    }

    public static void main(String[] args) {
        
        MensajeTexto mensaje = new MensajeTexto("tqc", "Te quiero, cariño.");
        System.out.println("Código del mensaje: " + mensaje.getCodigo());
        System.out.println("Mensaje completo: " + mensaje.getMensajeCompleto());
    }

}
