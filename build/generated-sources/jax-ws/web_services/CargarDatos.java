
package web_services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CargarDatos", targetNamespace = "http://Web_services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CargarDatos {


    /**
     * 
     * @param name
     * @param cod
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "NewReserv")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "NewReserv", targetNamespace = "http://Web_services/", className = "web_services.NewReserv")
    @ResponseWrapper(localName = "NewReservResponse", targetNamespace = "http://Web_services/", className = "web_services.NewReservResponse")
    @Action(input = "http://Web_services/CargarDatos/NewReservRequest", output = "http://Web_services/CargarDatos/NewReservResponse")
    public boolean newReserv(
        @WebParam(name = "cod", targetNamespace = "")
        String cod,
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param orig
     * @param dest
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EliminarRuta")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarRuta", targetNamespace = "http://Web_services/", className = "web_services.EliminarRuta")
    @ResponseWrapper(localName = "EliminarRutaResponse", targetNamespace = "http://Web_services/", className = "web_services.EliminarRutaResponse")
    @Action(input = "http://Web_services/CargarDatos/EliminarRutaRequest", output = "http://Web_services/CargarDatos/EliminarRutaResponse")
    public boolean eliminarRuta(
        @WebParam(name = "orig", targetNamespace = "")
        String orig,
        @WebParam(name = "dest", targetNamespace = "")
        String dest);

    /**
     * 
     * @param texto
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CargarRersev")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CargarRersev", targetNamespace = "http://Web_services/", className = "web_services.CargarRersev")
    @ResponseWrapper(localName = "CargarRersevResponse", targetNamespace = "http://Web_services/", className = "web_services.CargarRersevResponse")
    @Action(input = "http://Web_services/CargarDatos/CargarRersevRequest", output = "http://Web_services/CargarDatos/CargarRersevResponse")
    public String cargarRersev(
        @WebParam(name = "texto", targetNamespace = "")
        String texto);

    /**
     * 
     * @param texto
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CargarDestinos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CargarDestinos", targetNamespace = "http://Web_services/", className = "web_services.CargarDestinos")
    @ResponseWrapper(localName = "CargarDestinosResponse", targetNamespace = "http://Web_services/", className = "web_services.CargarDestinosResponse")
    @Action(input = "http://Web_services/CargarDatos/CargarDestinosRequest", output = "http://Web_services/CargarDatos/CargarDestinosResponse")
    public String cargarDestinos(
        @WebParam(name = "texto", targetNamespace = "")
        String texto);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImagHash", targetNamespace = "http://Web_services/", className = "web_services.GetImagHash")
    @ResponseWrapper(localName = "getImagHashResponse", targetNamespace = "http://Web_services/", className = "web_services.GetImagHashResponse")
    @Action(input = "http://Web_services/CargarDatos/getImagHashRequest", output = "http://Web_services/CargarDatos/getImagHashResponse")
    public String getImagHash();

    /**
     * 
     * @param texto
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CargarRutas")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CargarRutas", targetNamespace = "http://Web_services/", className = "web_services.CargarRutas")
    @ResponseWrapper(localName = "CargarRutasResponse", targetNamespace = "http://Web_services/", className = "web_services.CargarRutasResponse")
    @Action(input = "http://Web_services/CargarDatos/CargarRutasRequest", output = "http://Web_services/CargarDatos/CargarRutasResponse")
    public String cargarRutas(
        @WebParam(name = "texto", targetNamespace = "")
        String texto);

    /**
     * 
     * @param orig
     * @param costo
     * @param tiempo
     * @param dest
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ModRuta")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ModRuta", targetNamespace = "http://Web_services/", className = "web_services.ModRuta")
    @ResponseWrapper(localName = "ModRutaResponse", targetNamespace = "http://Web_services/", className = "web_services.ModRutaResponse")
    @Action(input = "http://Web_services/CargarDatos/ModRutaRequest", output = "http://Web_services/CargarDatos/ModRutaResponse")
    public boolean modRuta(
        @WebParam(name = "orig", targetNamespace = "")
        String orig,
        @WebParam(name = "dest", targetNamespace = "")
        String dest,
        @WebParam(name = "costo", targetNamespace = "")
        String costo,
        @WebParam(name = "tiempo", targetNamespace = "")
        String tiempo);

    /**
     * 
     * @param llave
     * @param orig
     * @param costo
     * @param tiempo
     * @param dest
     * @param piloto
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "NewRuta")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "NewRuta", targetNamespace = "http://Web_services/", className = "web_services.NewRuta")
    @ResponseWrapper(localName = "NewRutaResponse", targetNamespace = "http://Web_services/", className = "web_services.NewRutaResponse")
    @Action(input = "http://Web_services/CargarDatos/NewRutaRequest", output = "http://Web_services/CargarDatos/NewRutaResponse")
    public boolean newRuta(
        @WebParam(name = "orig", targetNamespace = "")
        String orig,
        @WebParam(name = "dest", targetNamespace = "")
        String dest,
        @WebParam(name = "costo", targetNamespace = "")
        String costo,
        @WebParam(name = "tiempo", targetNamespace = "")
        String tiempo,
        @WebParam(name = "piloto", targetNamespace = "")
        String piloto,
        @WebParam(name = "llave", targetNamespace = "")
        String llave);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EliminarReserva")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarReserva", targetNamespace = "http://Web_services/", className = "web_services.EliminarReserva")
    @ResponseWrapper(localName = "EliminarReservaResponse", targetNamespace = "http://Web_services/", className = "web_services.EliminarReservaResponse")
    @Action(input = "http://Web_services/CargarDatos/EliminarReservaRequest", output = "http://Web_services/CargarDatos/EliminarReservaResponse")
    public boolean eliminarReserva(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param orig
     * @param dest
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListadoRutas", targetNamespace = "http://Web_services/", className = "web_services.GetListadoRutas")
    @ResponseWrapper(localName = "getListadoRutasResponse", targetNamespace = "http://Web_services/", className = "web_services.GetListadoRutasResponse")
    @Action(input = "http://Web_services/CargarDatos/getListadoRutasRequest", output = "http://Web_services/CargarDatos/getListadoRutasResponse")
    public String getListadoRutas(
        @WebParam(name = "orig", targetNamespace = "")
        String orig,
        @WebParam(name = "dest", targetNamespace = "")
        String dest);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Web_services/", className = "web_services.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Web_services/", className = "web_services.HelloResponse")
    @Action(input = "http://Web_services/CargarDatos/helloRequest", output = "http://Web_services/CargarDatos/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
