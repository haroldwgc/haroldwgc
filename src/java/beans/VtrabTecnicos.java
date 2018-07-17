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
@Table(name = "VtrabTecnicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VtrabTecnicos.findAll", query = "SELECT v FROM VtrabTecnicos v")
    , @NamedQuery(name = "VtrabTecnicos.findByEstDesc", query = "SELECT v FROM VtrabTecnicos v WHERE v.estDesc = :estDesc")
    , @NamedQuery(name = "VtrabTecnicos.findByCantTrabArea", query = "SELECT v FROM VtrabTecnicos v WHERE v.cantTrabArea = :cantTrabArea")
    , @NamedQuery(name = "VtrabTecnicos.findByEstNV1", query = "SELECT v FROM VtrabTecnicos v WHERE v.estNV1 = :estNV1")
    , @NamedQuery(name = "VtrabTecnicos.findByTrbSexo", query = "SELECT v FROM VtrabTecnicos v WHERE v.trbSexo = :trbSexo")})
public class VtrabTecnicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 80)
    @Column(name = "EstDesc")
    @Id
    private String estDesc;
    @Column(name = "CantTrabArea")
    private Integer cantTrabArea;
    @Column(name = "EstNV1")
    private Short estNV1;
    @Column(name = "TrbSexo")
    private Character trbSexo;

    public VtrabTecnicos() {
    }

    public String getEstDesc() {
        return estDesc;
    }

    public void setEstDesc(String estDesc) {
        this.estDesc = estDesc;
    }

    public Integer getCantTrabArea() {
        return cantTrabArea;
    }

    public void setCantTrabArea(Integer cantTrabArea) {
        this.cantTrabArea = cantTrabArea;
    }

    public Short getEstNV1() {
        return estNV1;
    }

    public void setEstNV1(Short estNV1) {
        this.estNV1 = estNV1;
    }

    public Character getTrbSexo() {
        return trbSexo;
    }

    public void setTrbSexo(Character trbSexo) {
        this.trbSexo = trbSexo;
    }
    
}
