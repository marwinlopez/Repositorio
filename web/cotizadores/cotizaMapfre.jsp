
<%@page import="java.util.List"%>
<%@page import="Modelo.CodigoPostal"%>
<%@page import="Modelo.UbicacionMapfre"%>
<%@page import="Modelo.Descripcion"%>
<%@page import="Cotizador.Validacion_Mapfre"%>
<%@page import="Modelo.MapfreDAO"%>
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
    
    String codmarca="";
    String codmodelo="";
    String clavemapfre="";
    clavemapfre=request.getParameter("q");
    //falta recibir version de coche
    try{                     
 ServletContext a = getServletConfig().getServletContext();
 Descripcion des = (Descripcion) a.getAttribute("datos");
 String aniobc=String.valueOf(des.getAnio());
 String idmarcabc=String.valueOf(des.getIdmarca());
 System.out.println(aniobc+""+idmarcabc);
    
    
       String anio=clavemapfre.substring(0, 4) ;
    codmodelo=clavemapfre.substring(5);
    
        List<CodigoPostal> codigopostal = (List<CodigoPostal>) a.getAttribute("CodigoPostal"); 
        System.out.println("CodigoPostal"+codigopostal.get(0).getCodpos().toString());
 
    
 MapfreDAO m=new MapfreDAO();
 UbicacionMapfre ubi=new UbicacionMapfre();
 ubi=m.getPoblacionID(codigopostal.get(0).getCodpos().toString());
    codmarca=m.getMarcaID(codmodelo, aniobc, idmarcabc);
    System.out.println("marca nueva"+codmarca);
    System.out.println("Res mapfre: "+codmarca+" "+codmodelo+" "+anio+" "+fechaefectiva+" "+fechavencimiento+" "+ubi.getEdo()+" "+ubi.getPob());
   
    Validacion_Mapfre vm=new Validacion_Mapfre(codmarca,codmodelo,anio,fechaefectiva,fechavencimiento,ubi.getEdo(),ubi.getPob());
    out.println(vm.cotizaMapfreAnual()+"|"+vm.cotizaMapfre()+"|"+vm.cotizaMapfreAnual());
    }
    catch(Exception ex){
              out.println("No Disponible|No Disponible|No Disponible");
            }
    %>