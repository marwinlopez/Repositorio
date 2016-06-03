 <%@page import="mx.com.zurich.webservices.FORMAPAGOType"%>
<%@page import="mx.com.zurich.webservices.PAQUETEType"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="mx.com.zurich.webservices.RECOTIZACIONAUTOSREQType"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="Cotizador.MyUtil"%>
<%-- start web service invocation --%><hr/>
    <%
         MyUtil m =new MyUtil();
        Date date =new Date();
    
         Calendar c=Calendar.getInstance();
         date=c.getTime();
         int fechai;
         
         DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
         Date dateobj = new Date();
         String fecha=df.format(dateobj);
         fecha=fecha.replace("/", "");
         fechai=Integer.parseInt(fecha);
    
      String clavezurich=request.getParameter("q");
      System.out.println("clave zurich"+clavezurich);

     // System.out.print("Return Value :" );
   //   System.out.println(Str.substring(10) );

   String anioo=clavezurich.substring(0, 4) ;
   String claverev=clavezurich.substring(5);
      
System.out.println("clave:"+claverev);
       
       
    // int modelo=Integer.parseInt(parte2);
       try {
           //falta recibir el año
         System.out.println("vers"+clavezurich);
      //  out.print(clavezurich);
       // String modelo=request.getParameter("modelo");
           
           
        /*Generación de Llamada*/
	mx.com.zurich.webservices.WSCotizacionAutosService service = new mx.com.zurich.webservices.WSCotizacionAutosService();
	mx.com.zurich.webservices.WSCotizacionAutosType port = service.getWSCotizacionAutosServicePort();
	 // TODO initialize WS operation arguments here
	mx.com.zurich.webservices.SOLICITUDCOTAUTOSREQType part1 = new mx.com.zurich.webservices.SOLICITUDCOTAUTOSREQType();
        
        /*Mandar parametros */
    part1.setNumReq(1);
    part1.setUsuario("bcseg1761ws");
    part1.setPassword("bcseg1761ws");
    part1.setIdOficina(74);
    part1.setProgramaComercial(8701022);
    part1.setTipoVehiculo(1);
    part1.setIdEstado(0);
    part1.setIdCiudad(0);
    part1.setIdTipoValor(7);
    part1.setIdTipoUso(1);
    part1.setCveAgente(1761);
    part1.setTipoProducto(0);
    part1.setTipoCarga(0);
    part1.setTipoPersona("F");
    part1.setEdad(28);
    part1.setGenero("N");
    part1.setEstadoCivil(7);
    part1.setOcupacion(1);
    part1.setGiro(1);
    part1.setNacionalidad(0);
    part1.setIdMoneda(0);
    part1.setVigencia(12);
    BigDecimal x=new BigDecimal("0.0");
    part1.setMontoAsegurado(x);
    part1.setCodigoPostal(6100);

    /* Datos dinamicos*/
    int modelo=Integer.parseInt(anioo);
   part1.setFechaInicio(fechai);
   System.out.println(fechai);
   part1.setModelo(modelo);
    part1.setCveZurich(claverev);
    
    /**/
    
    
    
    
    
    
    /*Estamos tomando la respuesta */
RECOTIZACIONAUTOSREQType rec=new RECOTIZACIONAUTOSREQType();
rec.setNumResquest(2);
rec.setFolioCotizacion(0);
BigDecimal n=new BigDecimal("0.0");
rec.setPorcentajeDescuento(n);
rec.setPorcentajeRecargo(n);
rec.setPrimaObjetivo(n);

rec.setIdPaquete(215);
part1.setCONDICIONES(rec);
    
	// TODO process result here
	mx.com.zurich.webservices.SOLICITUDCOTAUTOSRESType result = port.getWSCotizacionAutos(part1);
  //      
//	out.println("Result = "+result.getMensaje()  );
        String mensaje=result.getMensaje();
        
        System.out.println("resultado "+mensaje);
      if(mensaje.contains("NO ES POSIBLE GENERAR ESTA COTIZACION")){
           out.print(mensaje+"|"+mensaje+"|"+mensaje);
           System.out.println("Ejecutivo");
      }else{
         
          
          try{
List<PAQUETEType> listares;
PAQUETEType primeraopc;

        
	
    listares=result.getPAQUETE();
       primeraopc=listares.get(0);
      FORMAPAGOType semestral =new FORMAPAGOType();
      FORMAPAGOType anual =new FORMAPAGOType();
          semestral=primeraopc.getFORMAPAGO().get(2);
          anual=primeraopc.getFORMAPAGO().get(0);
          
          
          String respuestacob="$ "+m.formatNumber(String.valueOf(anual.getPrimaTotal()))+"|$ "+m.formatNumber(String.valueOf(semestral.getPrimaTotal()))+"|$ "+m.formatNumber(String.valueOf(anual.getPrimaTotal()));
          System.out.println(respuestacob);
          respuestacob=respuestacob.replace(" ","");
        respuestacob=respuestacob.replace("<hr/>","");
        respuestacob=respuestacob.replace("<hr>","");
     //  out.println(respuestacob.replace(" ",""));
          out.println(respuestacob);
          }catch(Exception exc ){
              System.out.println("Excepcion:" +exc);
               out.print("No disponible|No disponible|No disponible");
          }
         
//	out.println("Result = "+result.getMensaje()  );
         
      }
      
      
    } catch (Exception ex) {
	// TODO handle custom exceptions here
      System.out.println("Excepcion: "+ex);
        
    }
        
         
    %>
    <%-- end web service invocation --%><hr/>
