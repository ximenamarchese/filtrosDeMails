package ar.edu.unahur.obj2.composite.mail;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.filtros.Adjunto;
import ar.edu.unahur.obj2.composite.filtros.AdjuntoContiene;
import ar.edu.unahur.obj2.composite.filtros.FiltroCompuesto;
import ar.edu.unahur.obj2.composite.filtros.Tamanio;
import ar.edu.unahur.obj2.composite.agrupable.IAgrupable;

public class MailTest {
    @Test
    void testGetAdjunto() {
        Mail mail = new Mail("Taehyung","Toti", "Te amo", 47, true,"Reunion en mi casa");
        IAgrupable tam = new Tamanio(mail,47);
        IAgrupable adj = new Adjunto(mail);
        IAgrupable contiene = new AdjuntoContiene(mail,"amo");

        IAgrupable compuesto = new FiltroCompuesto(Arrays.asList(tam,adj,contiene));

        mail.setFiltro(compuesto);
        assertTrue(mail.filtrate());

    }
}
