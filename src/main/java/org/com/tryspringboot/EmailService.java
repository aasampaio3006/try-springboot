package org.com.tryspringboot;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	public  void enviar(String nome, String emailConvidado){
        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.teste.com.br");
            email.setSmtpPort(587);
            email.setStartTLSEnabled(true);
            email.setAuthenticator(new DefaultAuthenticator("noreply@teste.com.br", "N0R3ply@F@c1lP@y"));
            //email.setSSLOnConnect(true);

            email.setFrom("noreply@teste.com.br");
            email.setSubject("Você foi convidado pelo ListaVIP");
            email.setMsg("Olá " + nome + ". Você acaba de ser convidado pelo ListaVIP.");
            email.addTo(emailConvidado);
            email.send();

        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}