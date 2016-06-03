
<%@page import="Modelo.CodigoPostal"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.UbicacionAba"%>
<%@page import="Cotizador.MyUtil"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="java.io.StringReader"%>
<%@page import="org.xml.sax.InputSource"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="zurich_header.HeaderHandlerResolver"%>
<%@page import="org.tempuri.Entrada"%>
<%@page import="org.datacontract.schemas._2004._07.abaseguros.Token"%>
<%@page import="org.tempuri.ObjectFactory"%>
<%@page import="javax.xml.bind.JAXBElement"%>

    <%
        String primaTotal="";
        String primasemestral="";
        
         MyUtil m =new MyUtil();
     
          ServletContext a = getServletConfig().getServletContext();
        List<CodigoPostal> codigopostal = (List<CodigoPostal>) a.getAttribute("CodigoPostal"); 
        System.out.println("CodigoPostal"+codigopostal);
        UbicacionAba ubi=new UbicacionAba();
         ubi= m.getUbicacionAba(codigopostal.get(0).getCodpos().toString());
         System.out.println("Edo: "+ubi.getEdo());
         System.out.println("Municipio: "+ubi.getMpo());
         
         Date date =new Date();
    
         Calendar c=Calendar.getInstance();
         date=c.getTime();
       
         
         DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
         Date dateobj = new Date();
         String fecha=df.format(dateobj);
         c.add(Calendar.YEAR, 1);
          Date dateobjm = new Date();
          dateobjm=c.getTime();
         String fecham=df.format(dateobjm);
    String fechavencimiento=fecham;
    String fechaefectiva=fecha;
    System.out.println("daos:"+fecha);
   String claveaba=request.getParameter("q");
   String anio=claveaba.substring(0, 4) ;
   String  codmodelo=claveaba.substring(5);
   System.out.println("daos:"+anio+codmodelo);
    try {
	org.tempuri.ACCotizacion service = new org.tempuri.ACCotizacion();
        
        HeaderHandlerResolver header = new HeaderHandlerResolver();
        service.setHandlerResolver(header);
        
       
        
	org.tempuri.IACCotizacion port = service.getDefault();
	 // TODO initialize WS operation arguments here
	org.tempuri.Entrada parameters = new org.tempuri.Entrada();
        
        ObjectFactory factory = new ObjectFactory();
        //JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("&lt;COT&gt; &lt;DG&gt;    &lt;NEG&gt;6542&lt;/NEG&gt;    &lt;AGE&gt;93349&lt;/AGE&gt;    &lt;CON&gt;0&lt;/CON&gt;    &lt;TAR&gt;141&lt;/TAR&gt;   &lt;INIVIG&gt;2016-05-02&lt;/INIVIG&gt;    &lt;FINVIG&gt;2017-05-02&lt;/FINVIG&gt;    &lt;TS&gt;1&lt;/TS&gt;    &lt;TC&gt;1&lt;/TC&gt;    &lt;FP&gt;12&lt;/FP&gt;  &lt;/DG&gt;  &lt;INCISOS&gt;    &lt;INCISO&gt;      &lt;ID&gt;3435&lt;/ID&gt;      &lt;MOD&gt;2013&lt;/MOD&gt;      &lt;PAQ&gt;1&lt;/PAQ&gt;      &lt;EDO&gt;19&lt;/EDO&gt;      &lt;MUN&gt;1037&lt;/MUN&gt;      &lt;SERV&gt;1&lt;/SERV&gt;      &lt;USO&gt;1&lt;/USO&gt;      &lt;TDED&gt;1&lt;/TDED&gt;      &lt;TSA&gt;1&lt;/TSA&gt;      &lt;PD&gt;0&lt;/PD&gt;      &lt;PB&gt;0&lt;/PB&gt;      &lt;COBS&gt;        &lt;COB&gt;          &lt;COBID&gt;1&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0.05&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;2&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0.10&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;3&lt;/COBID&gt;          &lt;SUMAASEG&gt;1000000&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;4&lt;/COBID&gt;          &lt;SUMAASEG&gt;400000&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;42&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;    &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;50&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;116&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;         &lt;COB&gt;          &lt;COBID&gt;472&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0.05&lt;/DPCT&gt;        &lt;/COB&gt;      &lt;/COBS&gt;    &lt;/INCISO&gt;  &lt;/INCISOS&gt;&lt;/COT&gt;");
        //JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("<COT> <DG> <NEG>6542</NEG> <AGE>93349</AGE> <CON>0</CON> <TAR>141</TAR> <INIVIG>2016-05-10</INIVIG> <FINVIG>2017-05-10</FINVIG> <TS>1</TS> <TC>1</TC> <FP>12</FP> </DG> <INCISOS> <INCISO> <ID>3435</ID> <MOD>2013</MOD> <PAQ>1</PAQ> <EDO>19</EDO> <MUN>1037</MUN> <SERV>1</SERV> <USO>1</USO> <TDED>1</TDED> <TSA>1</TSA> <PD>0</PD> <PB>0</PB> <COBS> <COB> <COBID>1</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.05</DPCT> </COB> <COB> <COBID>2</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.10</DPCT> </COB> <COB> <COBID>3</COBID> <SUMAASEG>1000000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>4</COBID> <SUMAASEG>400000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>42</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>50</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>116</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>472</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.05</DPCT> </COB> </COBS> </INCISO> </INCISOS></COT>");
        //JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("<COT> <DG> <NEG>6542</NEG> <AGE>93349</AGE> <CON>0</CON> <TAR>141</TAR> <INIVIG>2016-05-10</INIVIG> <FINVIG>2017-05-10</FINVIG> <TS>1</TS> <TC>1</TC> <FP>12</FP> </DG> <INCISOS> <INCISO> <ID>3435</ID> <MOD>2013</MOD> <PAQ>1</PAQ> <EDO>19</EDO> <MUN>1037</MUN> <SERV>1</SERV> <USO>1</USO> <TDED>1</TDED> <TSA>1</TSA> <PD>0</PD> <PB>0</PB> <COBS> <COB> <COBID>1</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.05</DPCT> </COB> <COB> <COBID>2</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.10</DPCT> </COB> <COB> <COBID>3</COBID> <SUMAASEG>1000000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>4</COBID> <SUMAASEG>400000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>116</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> </COBS> </INCISO> </INCISOS></COT>");
      //     JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("<COT> <DG> <NEG>6542</NEG> <AGE>93349</AGE> <CON>0</CON> <TAR>141</TAR> <INIVIG>2016-05-10</INIVIG> <FINVIG>2017-05-10</FINVIG> <TS>1</TS> <TC>1</TC> <FP>12</FP> </DG> <INCISOS> <INCISO> <ID>1146</ID> <MOD>2013</MOD> <PAQ>1</PAQ> <EDO>19</EDO> <MUN>1037</MUN> <SERV>1</SERV> <USO>1</USO> <TDED>1</TDED> <TSA>1</TSA> <PD>0</PD> <PB>0</PB> <COBS> <COB> <COBID>1</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.05</DPCT> </COB> <COB> <COBID>2</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.10</DPCT> </COB> <COB> <COBID>3</COBID> <SUMAASEG>1000000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>4</COBID> <SUMAASEG>400000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>116</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> </COBS> </INCISO> </INCISOS></COT>");
       // JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("<COT> <DG> <NEG>6542</NEG> <AGE>93349</AGE> <CON>0</CON> <TAR>141</TAR> <INIVIG>"+fechaefectiva+"</INIVIG> <FINVIG>"+fechavencimiento+"</FINVIG> <TS>1</TS> <TC>1</TC> <FP>12</FP> </DG> <INCISOS> <INCISO> <ID>"+codmodelo+"</ID> <MOD>"+anio+"</MOD> <PAQ>1</PAQ> <EDO>19</EDO> <MUN>1037</MUN> <SERV>1</SERV> <USO>1</USO> <TDED>1</TDED> <TSA>1</TSA> <PD>0</PD> <PB>0</PB> <COBS> <COB> <COBID>1</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.05</DPCT> </COB> <COB> <COBID>2</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0.10</DPCT> </COB> <COB> <COBID>3</COBID> <SUMAASEG>1000000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>4</COBID> <SUMAASEG>400000</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> <COB> <COBID>116</COBID> <SUMAASEG>0</SUMAASEG> <DADIC /> <DPCT>0</DPCT> </COB> </COBS> </INCISO> </INCISOS></COT>");
       // &lt;COT&gt;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
  JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada( "<COT> <DG> <NEG>6542</NEG> <AGE>93349</AGE> <CON>0</CON> <TAR>141</TAR> <INIVIG>"+fechaefectiva+"</INIVIG> <FINVIG>"+fechavencimiento+"</FINVIG>  <TS>2</TS> <AGRUPA>195530</AGRUPA><TC>1</TC> <FP>12</FP> </DG> <INCISOS> <INCISO> <ID>"+codmodelo+"</ID> <MOD>"+anio+"</MOD>  <PAQ>1</PAQ> <EDO>"+ubi.getEdo()+"</EDO> <MUN>"+ubi.getMpo()+"</MUN> <SERV>1</SERV> <USO>1</USO> <TDED>1</TDED> <TSA>1</TSA> <PD>30</PD> <PB>0</PB> <COBS>  <COB> <COBID>1</COBID> <SUMAASEG>0</SUMAASEG> <DADIC></DADIC> <DPCT>0.05</DPCT> </COB> <COB><COBID>2</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0.1</DPCT></COB><COB><COBID>3</COBID><SUMAASEG>1000000</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>4</COBID><SUMAASEG>400000</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>50</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>470</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>473</COBID><SUMAASEG>3000000</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>561</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB> </COBS> </INCISO> </INCISOS></COT>");
        parameters.setStrEntrada(createMessageDescription);
        
	// TODO process result here
	org.tempuri.Salida result = port.cotizaAuto(parameters);
        

        //out.println("Result = "+result.getStrSalida().getValue()    );
         String cantidad=result.getStrSalida().getValue()   ;
//out.println("CANTIDAD \n"+cantidad.substring(0,cantidad.length()));
        //out.println("CANTIDAD"+result.getStrSalida().getValue().substring(result.getStrSalida().getValue().indexOf("PTOTAL"),result.getStrSalida().getValue().indexOf("PTOTAL")+20   )   );
        

DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(cantidad));

Document doc=builder.parse(src);
 primaTotal=doc.getElementsByTagName("PTOTAL").item(0).getTextContent();
//String primasemestral=doc.getElementsByTagName("PrimaTotal").item(0).getTextContent();





       System.out.println("resultado"+primaTotal);
       
       
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        System.out.println("Result ex= "+ex);
    }
    
    //SEGUNDA LLAMADA PARA SEMESTRAL
    try {
	org.tempuri.ACCotizacion service = new org.tempuri.ACCotizacion();
        
        HeaderHandlerResolver header = new HeaderHandlerResolver();
        service.setHandlerResolver(header);
        
       
        
	org.tempuri.IACCotizacion port = service.getDefault();
	 // TODO initialize WS operation arguments here
	org.tempuri.Entrada parameters = new org.tempuri.Entrada();
        
        ObjectFactory factory = new ObjectFactory();

        
  JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada( "<COT> <DG> <NEG>6542</NEG> <AGE>93349</AGE> <CON>0</CON> <TAR>141</TAR> <INIVIG>"+fechaefectiva+"</INIVIG> <FINVIG>"+fechavencimiento+"</FINVIG>  <TS>2</TS> <AGRUPA>195530</AGRUPA><TC>1</TC> <FP>2</FP> </DG> <INCISOS> <INCISO> <ID>"+codmodelo+"</ID> <MOD>"+anio+"</MOD>  <PAQ>1</PAQ> <EDO>"+ubi.getEdo()+"</EDO> <MUN>"+ubi.getMpo()+"</MUN> <SERV>1</SERV> <USO>1</USO> <TDED>1</TDED> <TSA>1</TSA> <PD>30</PD> <PB>0</PB> <COBS>  <COB> <COBID>1</COBID> <SUMAASEG>0</SUMAASEG> <DADIC></DADIC> <DPCT>0.05</DPCT> </COB> <COB><COBID>2</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0.1</DPCT></COB><COB><COBID>3</COBID><SUMAASEG>1000000</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>4</COBID><SUMAASEG>400000</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>50</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>470</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>473</COBID><SUMAASEG>3000000</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB><COB><COBID>561</COBID><SUMAASEG>0</SUMAASEG><DADIC></DADIC><DPCT>0</DPCT></COB> </COBS> </INCISO> </INCISOS></COT>");
        parameters.setStrEntrada(createMessageDescription);
        
	// TODO process result here
	org.tempuri.Salida result = port.cotizaAuto(parameters);
        

        //out.println("Result = "+result.getStrSalida().getValue()    );
         String cantidad=result.getStrSalida().getValue()   ;
//out.println("CANTIDAD \n"+cantidad.substring(0,cantidad.length()));
        //out.println("CANTIDAD"+result.getStrSalida().getValue().substring(result.getStrSalida().getValue().indexOf("PTOTAL"),result.getStrSalida().getValue().indexOf("PTOTAL")+20   )   );
        

DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(cantidad));

Document doc=builder.parse(src);
 primasemestral=doc.getElementsByTagName("PTOTAL").item(0).getTextContent();
//String primasemestral=doc.getElementsByTagName("PrimaTotal").item(0).getTextContent();





       System.out.println("resultado"+primasemestral);
         primasemestral=m.formatNumber(String.valueOf(primasemestral));
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        System.out.println("Result ex= "+ex);
    }
    

     out.println("$ "+m.formatNumber(primaTotal)+"|$ "+primasemestral+"|$ "+m.formatNumber(primaTotal));
    %>


    </body>
</html>
