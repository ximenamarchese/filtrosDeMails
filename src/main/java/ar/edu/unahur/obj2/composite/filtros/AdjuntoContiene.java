package ar.edu.unahur.obj2.composite.filtros;

import ar.edu.unahur.obj2.composite.mail.Mail;

public class AdjuntoContiene extends FiltroSimple {
    private String texto;

    public AdjuntoContiene(Mail mail, String texto) {
        super(mail);
        this.texto = texto;
    }

    @Override
    protected Boolean doAplicar() {
        return mail.getAsunto().contains(texto);
    }

}
