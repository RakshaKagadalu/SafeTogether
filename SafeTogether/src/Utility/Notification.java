/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import javax.mail.*;

/**
 *
 * @author arjunbirju
 */
public class Notification {
    private final String fromEmail;
    private final String TWILLIO_PHONE;
    private final String ACCOUNT_SID;
    private final String AUTH_TOKEN;
    private final String emailPassword;

    public Notification() {
        this.fromEmail = "safetogetherhelp2022@gmail.com";
        this.TWILLIO_PHONE = "+15076930984";
        this.ACCOUNT_SID = "AC8e103a80825707f0b6a56d6368833e49";
        this.AUTH_TOKEN = "7a796692edd30285b45def3bfba088a2";
        this.emailPassword = "INFO5100aed";
    }

    public void sendMail(String toEmail,String subject,String emailMessage)
    {           
        System.out.println("Sending mail");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail, emailPassword);
            }

        });
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(emailMessage);
            Transport.send(message);
            System.out.println("email sent to : "+ toEmail);
        } catch(Exception ex){
            System.out.println(""+ex);
        }
    }
    
    public void sendSms(String phoneNum, String smsContent) {
        // COMMENTED this Code BECAUSE TWILLIO is Expensive and we don't have money, tested and working fine assume sms will go if you see the console log below
        
        System.out.println("Sent message to "+ phoneNum + "\n With content : "+ smsContent);
        
        
//        try {
//            String toPhone = "+1" + phoneNum;
//            System.out.println("toPhone: "+toPhone);
//            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//            Message message = Message.creator(
//                    new PhoneNumber(toPhone), // to phone
//                    new PhoneNumber(TWILLIO_PHONE), // twillio phone
//                    smsContent)
//                .create();
//            System.out.println(message.getSid());
//        } catch(Exception ex){
//            System.out.println(""+ex);
//        }
    }
    
}
