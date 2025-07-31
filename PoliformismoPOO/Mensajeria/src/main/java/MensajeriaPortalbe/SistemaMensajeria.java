    package MensajeriaPortalbe;

public class SistemaMensajeria {
    public static void main(String[] args) {
        Mensaje[] mensajes = {
            new Correo(),
            new SMS(),
            new NotificacionPush()
        };

        for (Mensaje m : mensajes) {
            m.enviar();
            System.out.println("---------------");
        }
    }
}
