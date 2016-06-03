<%@page import="Modelo.CodigoPostal"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.RsaDAO"%>
<%@page import="Cotizador.Cotizador_rsa"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%
     
    
     Date date =new Date();
    
         Calendar c=Calendar.getInstance();
         date=c.getTime();
       
         
         DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
         Date dateobj = new Date();
         String fecha=df.format(dateobj);
         c.add(Calendar.YEAR, 1);
          Date dateobjm = new Date();
          dateobjm=c.getTime();
         String fecham=df.format(dateobjm);
    String fechavencimiento=fecham;
    String fechaefectiva=fecha;
    
    Calendar cdos=Calendar.getInstance();
    Date datediamas=new Date();
    cdos.add(Calendar.DATE,1);
    datediamas=cdos.getTime();
    String fechadiamas=df.format(datediamas);
    
    String codmarca="";
    String codmodelo="";
    String claversa="";
    claversa=request.getParameter("q");
    //falta recibir version de coche
    
   System.out.println("claversa"+claversa);
   ServletContext a = getServletConfig().getServletContext();
   List<CodigoPostal> codigopostal = (List<CodigoPostal>) a.getAttribute("CodigoPostal"); 
        System.out.println("CodigoPostal"+codigopostal.get(0).getCodpos().toString());
        String cp=codigopostal.get(0).getCodpos().toString();
    
       String anio=claversa.substring(0, 4) ;
    codmodelo=claversa.substring(5);
    System.out.println("codmodelo"+codmodelo);
     RsaDAO rsadao= new RsaDAO();
    codmarca=rsadao.getMarcaID(codmodelo,anio);
    System.out.println("codmarca aqui"+codmodelo);
    
    codmarca=codmarca.substring(0, 40);
   System.out.println("RSA: "+codmarca+" "+codmodelo+" "+anio);
    Cotizador_rsa vm=new Cotizador_rsa(codmodelo,codmarca,anio,fechaefectiva, fechadiamas, fechavencimiento,cp);
  out.println(vm.cotizaRSA());
        
    
    %>