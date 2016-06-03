/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Properties;
 
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
 
import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author KNDY
 */
public class EmailWithPdf {
    
     /**
     * Sends an email with a PDF attachment.
     */
    public void email() {
       String smtpHost = "smtp.gmail.com"; //replace this with a valid host
        int smtpPort = 587; //replace this with a valid port
                 
        String sender = "contacto@bcseguros.mx"; //replace this with a valid sender email address
   //     String recipient = "ferralex.03.mx@gmail.com"; //replace this with a valid recipient email address
       String recipient = "candymargarcia@gmail.com"; //replace this with a valid recipient email address
        String content = " Enviamos en archivo adjunto la información que contendrá tu póliza de acuerdo al modelo y características indicadas en nuestro portal " +
                            "\n ";
        String subject = "Póliza BC del Seguro de tu Auto"  ;
         final String username = "contacto@bcseguros.mx";
    final String password = "B0utiqu3";
         
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);   
           properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(properties, 
		  new javax.mail.Authenticator() {
                        @Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
         
        ByteArrayOutputStream outputStream = null;
         
        try {           
            //construct the text body part
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(content);
             
            //now write the PDF content to the output stream
            outputStream = new ByteArrayOutputStream();
            writePdf(outputStream);
            byte[] bytes = outputStream.toByteArray();
             
            //construct the pdf body part
            DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
            MimeBodyPart pdfBodyPart = new MimeBodyPart();
            pdfBodyPart.setDataHandler(new DataHandler(dataSource));
            pdfBodyPart.setFileName("Cotizacion_Bseguro.pdf");
                         
            //construct the mime multi part
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(textBodyPart);
            mimeMultipart.addBodyPart(pdfBodyPart);
             
            //create the sender/recipient addresses
            InternetAddress iaSender = new InternetAddress(sender);
            InternetAddress iaRecipient = new InternetAddress(recipient);
             
            //construct the mime message
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setSender(iaSender);
            mimeMessage.setSubject(subject);
            mimeMessage.setRecipient(Message.RecipientType.TO, iaRecipient);
            mimeMessage.setContent(mimeMultipart);
             
            //send off the email
            Transport.send(mimeMessage);
             
            System.out.println("sent from " + sender + 
                    ", to " + recipient + 
                    "; server = " + smtpHost + ", port = " + smtpPort);         
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            //clean off
            if(null != outputStream) {
                try { outputStream.close(); outputStream = null; }
                catch(Exception ex) { }
            }
        }
    }
     
    /**
     * Writes the content of a PDF file (using iText API)
     * to the {@link OutputStream}.
     * @param outputStream {@link OutputStream}.
     * @throws Exception
     */
    public void writePdf(OutputStream outputStream) throws Exception {
        Document document = new Document(PageSize.LETTER,50,50,50,30);
          Font boldFontTitulo = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
          Font boldFontTexto = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
          Font FontTexto = new Font(Font.FontFamily.HELVETICA, 12);
          
          // document.setPageSize(null);
           PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        Image imagen = Image.getInstance("D:\\ALEX\\Bseguros\\web\\img\\Aseguradoras\\BSeguroLogo.png");
        Image imagen2 = Image.getInstance("D:\\ALEX\\Bseguros\\web\\img\\Aseguradoras\\mapfre.png");
        
         DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
     Calendar cdos=Calendar.getInstance();
    Date datediamas=new Date();
    Date dateaniomas=new Date();
    cdos.add(Calendar.DATE,1);
    datediamas=cdos.getTime();
    String fechadiamas=df.format(datediamas);
    cdos.add(Calendar.YEAR,1);
    dateaniomas=cdos.getTime();
    String fechavencimiento=df.format(dateaniomas);
        document.open();
        
        
        PdfContentByte canvas = writer.getDirectContent();
        Rectangle rect = new Rectangle(36, 36, 579, 756);
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(2);
        canvas.rectangle(rect);
       
//         Rectangle rect= new Rectangle(36,108);
//         rect.setBorder(Rectangle.BOX);
//         
//rect.setBorderColor(BaseColor.BLACK);
//rect.setBorderWidth(2);
//document.add(rect);
        document.addTitle("Cotizacion");
        document.addSubject("Cotizacion");
        document.addKeywords("Cotizacion, seguros");
        document.addAuthor("BSeguro");
        document.addCreator("Bseguro");
         
                   
         imagen.scaleAbsoluteHeight(30f);   
         imagen.setAbsolutePosition(45f, 720f);
         imagen2.scaleAbsoluteHeight(30f);   
         imagen2.setAbsolutePosition(450f, 720f);
        document.add(imagen);
        document.add(imagen2);
        
        Paragraph paragraph2 = new Paragraph("DATOS DE TU POLIZA"+fechadiamas+" hasta: "+fechavencimiento,boldFontTitulo);
        Paragraph paragraph3 = new Paragraph("DhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhATOS DE TU POLIZA",boldFontTitulo);

              
                paragraph2.setAlignment(Element.ALIGN_CENTER);
                    
            document.add(paragraph2);
            document.add(paragraph3);
                    
            document.close();
 
    }
     
    /**
     * Main method.
     * @param args No args required.
     */
    public static void main(String[] args) {
        EmailWithPdf demo = new EmailWithPdf();
        demo.email();
    }
}

