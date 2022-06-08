package br.com.ifba.salmos.infrastructure.support;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author tarciiz
 * @apiNote
 *          Salmos 1.0 credentials:
 *          Email: salmosrecover@outlook.com.br
 *          Senha: salmos1.0
 */

public class EmailUtil {
    private static final String USERNAME = "salmosrecover@outlook.com.br";
    private static final String PASSWORD = "salmos1.0";
    private static final String HOST = "smtp-mail.outlook.com";
    private static final String PORT = "587";
    static Session session;

    static {
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Hotmail */
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.user", USERNAME);
        props.put("mail.smtp.pwd", PASSWORD);
        // props.put("mail.smtp.ssl.enable", "true");

        session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });

        /** Ativa Debug para sessão */
        session.setDebug(true);
    }

    public static boolean sendEmail(String adress, String title, String msg) {
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USERNAME));
            // Remetente

            Address[] toUser = InternetAddress.parse(adress);

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(title);// Assunto
            message.setText(msg);
            /** Método para enviar a mensagem criada */
            Transport.send(message, USERNAME, PASSWORD);

            System.out.println("Feito!!!");
            return true;
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
