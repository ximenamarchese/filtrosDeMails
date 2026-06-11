package ar.edu.unahur.obj2.composite.filtros;

import ar.edu.unahur.obj2.composite.mail.Mail;

public class DefaultFiltroSimple extends FiltroSimple{

    public DefaultFiltroSimple(Mail mail) {
        super(mail);
    }

    @Override
    public Boolean doAplicar() {
        return Boolean.TRUE;
    }
    

}
