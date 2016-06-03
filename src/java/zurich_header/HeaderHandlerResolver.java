/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zurich_header;

/**
 *
 * @author luis
 */

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * Clase que arma el listado del HandlerResolver
 * @author saturnov26
 *
 */
public class HeaderHandlerResolver implements HandlerResolver {
	
	private HeaderHandler headerHandler = new HeaderHandler() ;
	

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo)
	{
	  List<Handler> handlerChain = new ArrayList<Handler>();	 
	
	  handlerChain.add(this.getHeaderHandler());
	
	  return handlerChain;
	 }//Fin del metodo


	public HeaderHandler getHeaderHandler() {
		return headerHandler;
	}


	public void setHeaderHandler(HeaderHandler headerHandler) {
		this.headerHandler = headerHandler;
	}

}//Fin de la clase