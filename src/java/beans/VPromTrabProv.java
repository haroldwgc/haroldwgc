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
@Table(name = "VPromTrabProv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VPromTrabProv.findAll", query = "SELECT v FROM VPromTrabProv v")
    , @NamedQuery(name = "VPromTrabProv.findByCodigo", query = "SELECT v FROM VPromTrabProv v WHERE v.codigo = :codigo")
    , @NamedQuery(name = "VPromTrabProv.findByUnidad", query = "SELECT v FROM VPromTrabProv v WHERE v.unidad = :unidad")
    , @NamedQuery(name = "VPromTrabProv.findByObreros", query = "SELECT v FROM VPromTrabProv v WHERE v.obreros = :obreros")
    , @NamedQuery(name = "VPromTrabProv.findByT\u00e9cnicos", query = "SELECT v FROM VPromTrabProv v WHERE v.t\u00e9cnicos = :t\u00e9cnicos")
    , @NamedQuery(name = "VPromTrabProv.findByAdministrativos", query = "SELECT v FROM VPromTrabProv v WHERE v.administrativos = :administrativos")
    , @NamedQuery(name = "VPromTrabProv.findByServicio", query = "SELECT v FROM VPromTrabProv v WHERE v.servicio = :servicio")
    , @NamedQuery(name = "VPromTrabProv.findByDirigentes", query = "SELECT v FROM VPromTrabProv v WHERE v.dirigentes = :dirigentes")
    , @NamedQuery(name = "VPromTrabProv.findByContratos", query = "SELECT v FROM VPromTrabProv v WHERE v.contratos = :contratos")
    , @NamedQuery(name = "VPromTrabProv.findByEstudiando", query = "SELECT v FROM VPromTrabProv v WHERE v.estudiando = :estudiando")
    , @NamedQuery(name = "VPromTrabProv.findByPrestados", query = "SELECT v FROM VPromTrabProv v WHERE v.prestados = :prestados")
    , @NamedQuery(name = "VPromTrabProv.findByOes", query = "SELECT v FROM VPromTrabProv v WHERE v.oes = :oes")
    , @NamedQuery(name = "VPromTrabProv.findByPresos", query = "SELECT v FROM VPromTrabProv v WHERE v.presos = :presos")
    , @NamedQuery(name = "VPromTrabProv.findByLicencia", query = "SELECT v FROM VPromTrabProv v WHERE v.licencia = :licencia")})
public class VPromTrabProv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Codigo")
    @Id
    private Short codigo;
    @Size(max = 80)
    @Column(name = "Unidad")
    private String unidad;
    @Column(name = "Obreros")
    private Short obreros;
    @Column(name = "T\u00e9cnicos")
    private Short técnicos;
    @Column(name = "Administrativos")
    private Short administrativos;
    @Column(name = "Servicio")
    private Short servicio;
    @Column(name = "Dirigentes")
    private Short dirigentes;
    @Column(name = "Contratos")
    private Short contratos;
    @Column(name = "Estudiando")
    private Short estudiando;
    @Column(name = "Prestados")
    private Short prestados;
    @Column(name = "OES")
    private Short oes;
    @Column(name = "Presos")
    private Short presos;
    @Column(name = "Licencia")
    private Short licencia;

    public VPromTrabProv() {
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Short getObreros() {
        return obreros;
    }

    public void setObreros(Short obreros) {
        this.obreros = obreros;
    }

    public Short getTécnicos() {
        return técnicos;
    }

    public void setTécnicos(Short técnicos) {
        this.técnicos = técnicos;
    }

    public Short getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(Short administrativos) {
        this.administrativos = administrativos;
    }

    public Short getServicio() {
        return servicio;
    }

    public void setServicio(Short servicio) {
        this.servicio = servicio;
    }

    public Short getDirigentes() {
        return dirigentes;
    }

    public void setDirigentes(Short dirigentes) {
        this.dirigentes = dirigentes;
    }

    public Short getContratos() {
        return contratos;
    }

    public void setContratos(Short contratos) {
        this.contratos = contratos;
    }

    public Short getEstudiando() {
        return estudiando;
    }

    public void setEstudiando(Short estudiando) {
        this.estudiando = estudiando;
    }

    public Short getPrestados() {
        return prestados;
    }

    public void setPrestados(Short prestados) {
        this.prestados = prestados;
    }

    public Short getOes() {
        return oes;
    }

    public void setOes(Short oes) {
        this.oes = oes;
    }

    public Short getPresos() {
        return presos;
    }

    public void setPresos(Short presos) {
        this.presos = presos;
    }

    public Short getLicencia() {
        return licencia;
    }

    public void setLicencia(Short licencia) {
        this.licencia = licencia;
    }
    
}
