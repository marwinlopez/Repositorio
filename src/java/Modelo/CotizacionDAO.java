/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

/**
 *
 * @author Luis
 */
public class CotizacionDAO {
 
       conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;
    final String username = "contacto@bcseguros.mx";
    final String password = "B0utiqu3";
     final String internet_addres = "contacto@bcseguros.mx";

    public CotizacionDAO() {
        con = new conexion();
    
    
    
}
 public int insertCotizacion(Cotizacion x){
int idcotizacion=0;
     try {
  Connection c=  con.getConexion();
     
    System.out.println("Entro a insertars");
    System.out.println("lala"+x.getApellido_materno());
    
    
            ps = c.prepareStatement("INSERT INTO clientes_historico(  id_aseguradora, id_marca, id_submarca, id_anio,             id_modelo, id_clave_aseguradora, fecha_cotizacion, tipo_pago,             monto, nombre_contratante, apellido_paterno, apellido_materno,             mail, telefono, rfc, serie, cp, call, no_ext, no_int, estado,             delegacion, colonia, forma_pago, cobertura_auto_siempre, cobertura_auto_amante,banco, telefono_movil)    VALUES (?, ?, ?, ?, ?, ?, now(), ?,  ?,?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)",Statement.RETURN_GENERATED_KEYS);
 ps.setString(1, x.getId_aseguradora());
 ps.setString(2, x.getId_marca());
 ps.setString(3, x.getId_submarca());
 ps.setString(4, x.getId_anio().toString());
 ps.setString(5, x.getId_modelo());
 ps.setString(6, x.getId_clave_aseguradora());
 
 ps.setString(7, x.getMetododepago());
 ps.setString(8, x.getMonto());
 ps.setString(9, x.getNombre_contratante());
 ps.setString(10, x.getApellido_paterno());
 ps.setString(11, x.getApellido_materno());
 ps.setString(12, x.getMail());
 ps.setString(13, x.getTelefono());
 ps.setString(14, x.getRfc());
 ps.setString(15, x.getSerie());
 ps.setString(16, x.getCp());
 ps.setString(17, x.getCall());
 ps.setString(18, x.getNo_ext());
 ps.setString(19, x.getNo_int());
 ps.setString(20, x.getEstado());
 ps.setString(21, x.getDelegacion());
 ps.setString(22, x.getColonia());
 ps.setString(23, x.getMetododepago());
 ps.setBoolean(24, x.getCobertura_auto_siempre());
 ps.setBoolean(25, x.getCobertura_auto_amante());
 ps.setString(26, x.getBanco());
 ps.setString(27, x.getCelular());
 


 int id=ps.executeUpdate();
 
    if (id == 0) {
            throw new SQLException("No se guardo cotizacion");
        }

        try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                idcotizacion=generatedKeys.getInt(1);
              
            }
            else {
                throw new SQLException("No se guardo cotizacion");
            }
        }
}catch(Exception ex){
    System.out.println("Exc:"+ex);
}
System.out.println("idcotizacion: "+idcotizacion);
        return idcotizacion;
    }
 
 
 public void email(Cotizacion x, int idcotizacion) {
        String smtpHost = "smtp.gmail.com"; //replace this with a valid host
        int smtpPort = 587; //replace this with a valid port
                 
        String sender = "contacto@bcseguros.mx"; //replace this with a valid sender email address
   //     String recipient = "ferralex.03.mx@gmail.com"; //replace this with a valid recipient email address
       String recipient = x.getMail(); //replace this with a valid recipient email address
        String content = " "  +x.getNombre_contratante()+" "+x.getApellido_paterno()+ " " +  " " +
                            "\n "+
                            " Enviamos en archivo adjunto la información que contendrá tu póliza de acuerdo al modelo y características indicadas en nuestro portal " +
                            "\n "+
                            " Para recibir mayor información, pongo a tus órdenes el  Tel. 555-5555-555 con horario de atención de Lunes a Viernes de 09:00 a 18:00 hrs.</p> " +
                            "  " +
                            "  " +
                            "  ";
        String subject = "Póliza BC"+x.getId_aseguradora().substring(0, 1)+x.getMetododepago().substring(0,1)+": 0000"+idcotizacion+"  del Seguro de tu Auto"  ;
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
            writePdf(outputStream, x, idcotizacion);
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
 
 public void emailAdmin(Cotizacion x, int idcotizacion) {
        String smtpHost = "smtp.gmail.com"; //replace this with a valid host
        int smtpPort = 587; //replace this with a valid port
                 
        String sender = "contacto@bcseguros.mx"; //replace this with a valid sender email address
        String recipient = "notificacion@lrconsultoresit.com"; //replace this with a valid recipient email address
   //    String recipient = "contacto@bcseguros.mx"; //replace this with a valid recipient email address
        String content = " El nuevo cliente:"  +x.getNombre_contratante()+" "+x.getApellido_paterno()+ " " +  " " +
                            "\n "+
                            " Ha realizado la solicitud para una nueva poliza, Adjunto la información de la misma segun las características indicadas por el cliente en el portal " +
                            "\n "+
                            " </p> " +
                            "  " +
                            "  " +
                            "  ";
        String subject = "Póliza BC"+x.getId_aseguradora().substring(0, 1)+x.getMetododepago().substring(0,1)+": 0000"+idcotizacion+"  - PENDIENTE POR PROCESAR"  ;
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
            writePdf(outputStream, x, idcotizacion);
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
 
 public void writePdf(OutputStream outputStream, Cotizacion x, int idcotizacion) throws Exception {
     
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
    
    
      
       
          Document document = new Document(PageSize.LETTER,50,50,50,30);
          Font boldFontTitulo = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
          Font boldFontTexto = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
          Font FontTexto = new Font(Font.FontFamily.HELVETICA, 10);
          
          // document.setPageSize(null);
           PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        
         Image imagen = Image.getInstance("http://54.67.56.185/BSeguros_pa18/img/BSeguroLogo.png");
     //      Image imagen = Image.getInstance("D:\\ALEX\\Bseguros\\web\\img\\Aseguradoras\\BSeguroLogo.png");
        Image imagen2 = Image.getInstance("http://54.67.56.185/BSeguros_pa18/img/Aseguradoras/"+x.getId_aseguradora()+".png");
        //Image imagen2 = Image.getInstance("D:\\ALEX\\Bseguros\\web\\img\\Aseguradoras\\Mapfre.png");
        
        document.open();
        
        PdfContentByte canvas = writer.getDirectContent();
        Rectangle rect = new Rectangle(36, 36, 579, 756);
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(2);
        canvas.rectangle(rect);
       
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
        
        Paragraph paragraph2 = new Paragraph("DATOS DE TU POLIZA",boldFontTitulo);
        paragraph2.setAlignment(Element.ALIGN_CENTER);          
        document.add(paragraph2);                   
            
            //creas una tabla con un ancho de 3 celdas, el salto a la siguiente fila sera automatico
        PdfPTable table = new PdfPTable(3);
        table.getDefaultCell().setBorder(0);
        PdfPCell cell;
        
        Paragraph saltodelinea=new Paragraph(" ");
        document.add(saltodelinea);
        
        document.add(new Paragraph(" Datos de tu poliza folio: "+"BC"+x.getId_aseguradora().substring(0, 1)+x.getMetododepago().substring(0,1)+": 0000"+idcotizacion,boldFontTitulo));
        document.add(new Paragraph(" Vigencia de la poliza del: "+fechadiamas+" al: "+fechavencimiento,boldFontTitulo));
        document.add(saltodelinea);
        
        document.add(new Paragraph(" Datos del Contratante: ",boldFontTitulo));
        //document.add(saltodelinea);
        
                    //agrego otra tabla
         table = new PdfPTable(6);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
         table.addCell(new Paragraph("Nombre: ",boldFontTexto));
         PdfPCell celdaNombre = new PdfPCell(new Paragraph(x.getNombre_contratante()+" "+x.getApellido_paterno(), FontTexto));
         celdaNombre.setColspan(5);
         celdaNombre.setBorder(0);
         table.addCell(celdaNombre);
         table.addCell(new Paragraph("RFC : ",boldFontTexto));
         PdfPCell celdaRFC = new PdfPCell(new Paragraph(x.getRfc(), FontTexto));
         celdaRFC.setColspan(5);
         celdaRFC.setBorder(0);
         table.addCell(celdaRFC);
         table.addCell(new Paragraph("Direccion: ",boldFontTexto));
                    PdfPCell celdaDir = new PdfPCell(new Paragraph(x.getCall()+", "+x.getNo_ext()+", "+x.getNo_int()+", "+x.getColonia()+", "+x.getDelegacion()+", "+x.getEstado()+", "+x.getCp(), FontTexto));
                    celdaDir.setColspan(5);
                     celdaDir.setBorder(0);
                    table.addCell(celdaDir);
                    table.addCell(new Paragraph("Email: ",boldFontTexto));
                    table.addCell(AddCell(x.getMail(),5));
                    table.addCell(new Paragraph("Telefono ",boldFontTexto));
                    PdfPCell celdaTel = new PdfPCell(new Paragraph(x.getTelefono(),FontTexto));
                    celdaTel.setColspan(5);
                    celdaTel.setBorder(0);
                    table.addCell(celdaTel);
      
                    document.add(table);
                    document.add(saltodelinea);
               
                    
          document.add(new Paragraph(" Datos del Vehiculo: ",boldFontTitulo));
          //      document.add(saltodelinea);
                
                    //agrego otra tabla
         table = new PdfPTable(6);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
                    table.addCell(new Paragraph("Marca: ",boldFontTexto));
                    table.addCell(AddCell(x.getId_marca(),5));
                    table.addCell(new Paragraph("Modelo:",boldFontTexto));
                    table.addCell(AddCell(x.getId_anio().toString(),5));
                    table.addCell(new Paragraph("Tipo: ",boldFontTexto));
                    table.addCell(AddCell(x.getId_submarca(),5));
                    table.addCell(new Paragraph("Version:  ",boldFontTexto));
                    table.addCell(AddCell(x.getId_modelo(),5));
                    table.addCell(new Paragraph("No. De Serie: ",boldFontTexto));
                    table.addCell(AddCell(x.getSerie(),5));
                    
                    
                    document.add(table);
                    document.add(saltodelinea);
                
          document.add(new Paragraph(" Informacion de la Poliza: ",boldFontTitulo));
            //    document.add(saltodelinea);
                
                    //agrego otra tabla
         table = new PdfPTable(6);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
                    table.addCell(new Paragraph("Pago: ",boldFontTexto));
                    table.addCell(AddCell(x.getTipo_pago(),5));
                    table.addCell(new Paragraph("Aseguradora: ",boldFontTexto));
                    table.addCell(AddCell(x.getId_aseguradora(),5));
                    
                    
                    
                    document.add(table);
                    document.add(saltodelinea);
                
          document.add(new Paragraph(" Detalles de la Cobertura: Cobertura Amplia ",boldFontTitulo));
              //  document.add(saltodelinea);
                
                    //agrego otra tabla
         table = new PdfPTable(3);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
                    table.addCell(new Paragraph("Cobertura ",boldFontTexto));
                    table.addCell(new Paragraph("Responsabilidad Civil",boldFontTexto));
                    table.addCell(new Paragraph("Deducible ",boldFontTexto));
                    table.addCell(new Paragraph("Daños Materiales", FontTexto));
                    table.addCell(new Paragraph("Valor Comercial",FontTexto));
                    table.addCell(new Paragraph("5%",FontTexto));
                    table.addCell(new Paragraph("Robo Total",FontTexto));
                    table.addCell(new Paragraph("Valor Comercial",FontTexto));
                    table.addCell(new Paragraph("10%",FontTexto));
                    table.addCell(new Paragraph("Responsabilidad Civil",FontTexto));
                    table.addCell(new Paragraph("$4,000,000.00",FontTexto));
                    table.addCell(new Paragraph("",FontTexto));
                    table.addCell(new Paragraph("Gastos Medicos Ocupantes",FontTexto));
                    table.addCell(new Paragraph("$500,000.00",FontTexto));
                    table.addCell(new Paragraph("",FontTexto));
                    table.addCell(new Paragraph("Asistencia Legal",FontTexto));
                    table.addCell(new Paragraph("Amparada",FontTexto));
                    table.addCell(new Paragraph("",FontTexto));
                    table.addCell(new Paragraph("Asistencia Vial",FontTexto));
                    table.addCell(new Paragraph("Amparada",FontTexto));
                    table.addCell(new Paragraph("",FontTexto));
                    
                    
                    
                    document.add(table);
                    document.add(saltodelinea);
                
          document.add(new Paragraph(" Informacion del Pago ",boldFontTitulo));
          document.add(new Paragraph(" Instrumento de Pago: "+ x.getMetododepago(),boldFontTexto));
               
                    //agrego otra tabla
         table = new PdfPTable(6);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
                    table.addCell(AddCell("Concepto ",2));
                    table.addCell(AddCell("Monto",4));
                    table.addCell(AddCell("Prima Total ",2));
                    table.addCell(AddCell(x.getMonto(),4));
                    table.addCell(AddCell("Prima Inicial",2));
                    table.addCell(AddCell(x.getMonto(),4));
                    table.addCell(AddCell("Pago Subsecuente ",2));
                    table.addCell(AddCell("0",4));
                                       
                    
                    document.add(table);
                    document.add(saltodelinea);
         
        if (x.getCobertura_auto_siempre()==true ) {
       
             document.add(new Paragraph(" Informacion de Modulos HDI ",boldFontTitulo));
 table = new PdfPTable(6);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
                    table.addCell(AddCell("Modulos ",2));
                    table.addCell(AddCell("Contratados",4));
                    table.addCell(AddCell("HDI - Autos por Siempre ",2));
                    table.addCell(AddCell("$ 1,799.00",4));
                    document.add(table);
                    
           
       }else{ if (x.getCobertura_auto_amante()==true){
           
               document.add(new Paragraph(" Informacion de Modulos HDI ",boldFontTitulo));
 table = new PdfPTable(6);
         table.setWidthPercentage(100);
         table.getDefaultCell().setBorder(0);
                    table.addCell(AddCell("Modulos ",2));
                    table.addCell(AddCell("Contratados",4));
                    table.addCell(AddCell("HDI - Amante de los Autos ",2));
                    table.addCell(AddCell("$ 1,799.00",4));
                    document.add(table);
                    
           }else{
           
       }
                document.add(saltodelinea);
       }document.add(new Paragraph("* Estaras asegurado a partir de las 12 horas del siguiente dia habil.", boldFontTexto));
       
       
        
                    
                    

                    
            document.close();
 
     
    }


 //public static void main(String[] args) {
 //       EmailWithPdf demo = new EmailWithPdf();
//        demo.email();
//    }
  
 public boolean sendAdmin(Cotizacion x, int idcotizacion){
      boolean bandera = false;
       String destinatario = "notificacion@lrconsultoresit.com";//x.getMail();
       String titulo = "Nueva Cotizacion: "+x.getId_aseguradora();
       String cadena="";
       System.out.println("Send Admin");
       System.out.println(x.getMetododepago());
       if(x.getMetododepago().equals("tarjeta")){
       
        cadena = "Hola\n"
               + "El nuevo cliente: "+x.getNombre_contratante()+" "+x.getApellido_paterno()+"\n\n"
               + "Los datos del vehiculo son:"
               + x.getId_marca()+" "+x.getId_submarca()+" "+x.getId_anio()+
                   "\n\nMetodo de pago:"+x.getMetododepago()+"\n\n"
                  + "Los datos de la tarjeta son:" + 
                   "\nPrimer Nombre:"+x.getPrimernombre()+
                   "\nSegundo Nombre:"+x.getSegundonombre()+
                   "\nNumero Tarjeta:"+x.getNumerotarjeta()+
                   "\nFecha Vencimiento:"+x.getFechavencimiento()+
                   "\nCVC:"+x.getCvc()+
                    "\nBanco:"+x.getBanco()+
                    "\n\nCualquier Duda o comentario. A los telefono 55-55-55-55-55"+
                    "\n\n\n\n Saludos, \n BCSeguros\n www.bcseguros.mx";
           
       }else{
       
       cadena = "Hola\n"
               + "El nuevo cliente: "+x.getNombre_contratante()+" "+x.getApellido_paterno()+"\n\n"
               + "Los datos del vehiculo son:"
               + x.getId_marca()+" "+x.getId_submarca()+" "+x.getId_anio()+
               "\n\nMetodo de pago:"+x.getMetododepago()+
               "\n\nCualquier Duda o comentario. A los telefono 55-55-55-55-55"+
               "\n\n\n\n Saludos, \n BCSeguros\n www.bcseguros.mx";
       
       }
       
       
        try {
                Properties props = new Properties();
		
                props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
                
                
                        Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(internet_addres));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(destinatario));
			message.setSubject(titulo);
			message.setText(cadena);

			Transport.send(message);

			System.out.println("Done");
                        bandera =  true;
		} catch (MessagingException e) {
			throw new RuntimeException(e);
                        
		}
        return bandera ;
 }
 public boolean sendCliente(Cotizacion x, int idcotizacion){
       boolean bandera = false;
       String destinatario = x.getMail();
       String titulo = "Nueva Cotizacion: "+x.getId_aseguradora();
       String cadena = 
               
                " "  +x.getNombre_contratante()+" "+x.getApellido_paterno()+ " " +  " " +
                            "\n "+
                            " Enviamos en archivo adjunto la información que contendrá tu póliza de acuerdo al modelo y características indicadas en nuestro portal " +
                            "\n "+
                            " Para recibir mayor información, pongo a tus órdenes el  Tel. 555-5555-555 con horario de atención de Lunes a Viernes de 09:00 a 18:00 hrs.</p> " +
                            "  " +
                            "  " +
                            "  ";
               
               
           //    "Hola "+x.getNombre_contratante()+" "+x.getApellido_paterno()+"\n\n Pronto nos pondremos en contacto contigo. \n\n"
           //    + "Los datos del vehiculo son:"
           //    + x.getId_marca()+" "+x.getId_submarca()+" "+x.getId_anio()+
           //    "\n\nCualquier Duda o comentario. A los telefono 55-55-55-55-55"+
          //     "\n\n\n\n Saludos, \n BCSeguros\n www.bcseguros.mx";
       
        try {
                Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
                
                        Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(internet_addres));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(destinatario));
			message.setSubject(titulo);
			message.setContent(cadena,"text/html");

			Transport.send(message);

			System.out.println("Done");
                        bandera =  true;
		} catch (MessagingException e) {
			throw new RuntimeException(e);
                        
		}
        return bandera ;
    }

    private PdfPCell AddCell(String email_ , int columnas) {
         Font FontTexto = new Font(Font.FontFamily.HELVETICA, 10);
       PdfPCell celdaEmail = new PdfPCell(new Paragraph(email_, FontTexto));
                    celdaEmail.setColspan(columnas);
                    celdaEmail.setBorder(0);
                    
                    return celdaEmail;
    }

   


}