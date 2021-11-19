package com.adkrive.main.general;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletRequest;

import org.springframework.mail.javamail.JavaMailSender;

import com.sun.mail.smtp.SMTPTransport;

public class Utility {
	
    public static String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }
    
    public static boolean sendMailToAll(List<String> names, String subject, String message, JavaMailSender mailSender) throws MessagingException, UnknownHostException, IOException
    {
    	
    	Properties props = new Properties();  
        props.setProperty("mail.transport.protocol", "smtp");     
        props.setProperty("mail.host", "smtp.gmail.com");  
        props.put("mail.smtp.auth", "true");    
        props.put("mail.debug", "true"); 
        props.put("mail.smtp.port", 587); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.socketFactory.port",587);  
       
      
        Session session = Session.getDefaultInstance(props,
        	    new Authenticator() {
        	        protected PasswordAuthentication  getPasswordAuthentication() {
        	        return new PasswordAuthentication(
        	                    "randhircs32@gmail.com", "9931998890");
        	                }
        	    });
    	 InternetAddress[] address = new InternetAddress[names.size()];
		 for(int i=0; i< names.size(); i++ )
		 {
			 address[i] = new InternetAddress(names.get(i));
		 }
    	
    	
    	//Html mail

		  MimeMessage msg = new MimeMessage(session);
		  msg.setFrom(new InternetAddress(GeneralConstant.sendFrom, "Admin"));
		  msg.addRecipients(Message.RecipientType.TO, address);
		  msg.setSubject(subject,"UTF-8");
		  
		  Multipart mp = new MimeMultipart();
		  MimeBodyPart htmlPart = new MimeBodyPart();
		  htmlPart.setContent(message,"text/html");
		  mp.addBodyPart(htmlPart);
		  msg.setContent(mp);
		  
		  SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
		  t.connect();
	        t.sendMessage(msg, msg.getAllRecipients());
	        t.close();
		return true;
    	
    }
    
    public static String[] getSplitOfListString(String splitStr)
    {
    	if(splitStr!=null)
    	{
    		String[] str=splitStr.split("\\R");
    		return str;
    	}
    	else
    	{
    		return null;
    	}
    	
    	
    }
    
     
    

}
