/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import beans.InformaciondeTrabajadores;
import controller.EstrucFacade;
import controller.InformaciondeTrabajadoresFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author harold
 */
@WebService(serviceName = "SigerService")
public class SigerService {

    @EJB
    private EstrucFacade estrucFacade;

    @EJB
    private InformaciondeTrabajadoresFacade informaciondeTrabajadoresFacade;

    @WebMethod(operationName = "dir")
    public List<InformaciondeTrabajadores> dir() {
        return informaciondeTrabajadoresFacade.directorio();
    }

    @WebMethod(operationName = "AreaDeUser")
    public String AreaPorUsuario(@WebParam(name = "dir") String dir) {
        return informaciondeTrabajadoresFacade.AreaPorNombre(dir);
    }

    @WebMethod(operationName = "estruct")
    public List<String> estruct() {
        return estrucFacade.Areas();
    }

    @WebMethod(operationName = "directores")
    public List<String> directores(@WebParam(name = "dir") String dir) {
        return estrucFacade.AreasPorDir(dir);
    }

    @WebMethod(operationName = "AreaPorUser")
    public List<String> areaPorUser(@WebParam(name = "user") String dir) {
        return estrucFacade.AreasPorDir(dir);
    }
}
