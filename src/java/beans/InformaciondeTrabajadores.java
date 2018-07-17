/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author harold
 */
@Entity
@Table(name = "Informacion de Trabajadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformaciondeTrabajadores.findAll", query = "SELECT  i FROM InformaciondeTrabajadores i WHERE i.nombreyApellidos != 'NULL'")
    ,@NamedQuery(name = "InformaciondeTrabajadores.findDirectores", query = "SELECT i.nombreyApellidos FROM InformaciondeTrabajadores i WHERE i.cargo LIKE 'Dir%'")
        ,@NamedQuery(name = "InformaciondeTrabajadores.findAreaUser", query = "SELECT i.ubicacion FROM InformaciondeTrabajadores i WHERE i.nombreyApellidos LIKE :nombreyApellidos")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByNombre", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByErApellido", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.erApellido = :erApellido")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByDoApellido", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.doApellido = :doApellido")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByNombreyApellidos", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.nombreyApellidos = :nombreyApellidos")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByEsDirigente", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.esDirigente = :esDirigente")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByUnidad", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.unidad = :unidad")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByUbicacion", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.ubicacion = :ubicacion")
    , @NamedQuery(name = "InformaciondeTrabajadores.findByCargo", query = "SELECT i FROM InformaciondeTrabajadores i WHERE i.cargo = :cargo")

})
public class InformaciondeTrabajadores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 25)
    @Column(name = "Nombre")
    private String nombre;
    @Id
    @Column(name = "No_Identidad")
    private String noIdentidad;
    @Size(max = 15)
    @Column(name = "[1er Apellido]")
    private String erApellido;
    @Size(max = 15)
    @Column(name = "[2do Apellido]")
    private String doApellido;
    @Size(max = 59)
    @Column(name = "[Nombre y Apellidos]")
    private String nombreyApellidos;
    @Size(max = 3)
    @Column(name = "[Es Dirigente]")
    private String esDirigente;
    @Size(max = 80)
    @Column(name = "Unidad")
    private String unidad;
    @Size(max = 163)
    @Column(name = "Ubicacion")
    private String ubicacion;
    @Size(max = 20)
    @Column(name = "Cargo")
    private String cargo;

    public InformaciondeTrabajadores() {
    }

    public String getNoIdentidad() {
        return noIdentidad;
    }

    public void setNoIdentidad(String noIdentidad) {
        this.noIdentidad = noIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getErApellido() {
        return erApellido;
    }

    public void setErApellido(String erApellido) {
        this.erApellido = erApellido;
    }

    public String getDoApellido() {
        return doApellido;
    }

    public void setDoApellido(String doApellido) {
        this.doApellido = doApellido;
    }

    public String getNombreyApellidos() {
        return nombreyApellidos;
    }

    public void setNombreyApellidos(String nombreyApellidos) {
        this.nombreyApellidos = nombreyApellidos;
    }

    public String getEsDirigente() {
        return esDirigente;
    }

    public void setEsDirigente(String esDirigente) {
        this.esDirigente = esDirigente;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
