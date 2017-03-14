package com.wetts.base.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by wetts on 2017/3/14.
 */
public class SendEmailUtil {

    private static final String HOST;
    private static final String PROTOCOL;
    private static final String PORT;
    private static final String SSL_PORT;
    private static final String FROM;
    private static final String FROM_NAME;
    private static final String PWD;

    static {
        String path = SendEmailUtil.class.getClass().getResource("/").getPath() + "../classes";
        HOST = PropertiesUtil.getProperty(path, "mail.properties", "host");
        PROTOCOL = PropertiesUtil.getProperty(path, "mail.properties", "protocol");
        PORT = PropertiesUtil.getProperty(path, "mail.properties", "not.ssl.port");
        SSL_PORT = PropertiesUtil.getProperty(path, "mail.properties", "ssl.port");
        FROM = PropertiesUtil.getProperty(path, "mail.properties", "from.address");
        FROM_NAME = PropertiesUtil.getProperty(path, "mail.properties", "from.name");
        PWD = PropertiesUtil.getProperty(path, "mail.properties", "from.pwd");
    }

    public static void sendEmail(String toEmail, String subject, String text) {
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//设置服务器地址
        props.put("mail.store.protocol", PROTOCOL);//设置协议
        props.put("mail.smtp.port", PORT);//设置端口
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props,
                new Authenticator() {

                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(FROM, PWD);
                    }
                });

        try {
            // Instantiate a message
            Message msg = new MimeMessage(session);

            //Set message attributes
            msg.setFrom(new InternetAddress(FROM));
            InternetAddress[] address = {new InternetAddress(toEmail)};
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(text);

            //Send the message
            Transport.send(msg);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    /**
     * Send the email via SMTP using TLS and SSL
     */
    public static void sendEmailBySSL(String toEmail, String subject, String text) {
        // Create all the needed properties
        Properties connectionProperties = new Properties();
        // SMTP host
        connectionProperties.put("mail.smtp.host", HOST);
        // Is authentication enabled
        connectionProperties.put("mail.smtp.auth", "true");
        // Is TLS enabled
        connectionProperties.put("mail.smtp.starttls.enable", "true");
        // SSL Port
        connectionProperties.put("mail.smtp.socketFactory.port", SSL_PORT);
        // SSL Socket Factory class
        connectionProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        // SMTP port, the same as SSL port :)
        connectionProperties.put("mail.smtp.port", SSL_PORT);

        // Create the session
        Session session = Session.getDefaultInstance(connectionProperties,
                new Authenticator() {    // Define the authenticator
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(FROM, PWD);
                    }
                });

        // Create and send the message
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM, FROM_NAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(text);

            // Send the message
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
