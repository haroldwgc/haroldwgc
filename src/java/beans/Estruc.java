/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author harold
 */
@Entity
@Table(name = "ESTRUC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estruc.findAll", query = "SELECT e FROM Estruc e")
    ,@NamedQuery(name = "Estruc.findDescripcion", query = "SELECT  e.estDesc FROM Estruc e")
     ,@NamedQuery(name = "Estruc.findAreaPorDir", query = "SELECT DISTINCT e.estDesc FROM Estruc e,InformaciondeTrabajadores info,VtrabTecnicos vtrab WHERE VTRAB.estNV1=E.estNV1 and INFO.nombreyApellidos LIKE :nombre")
    , @NamedQuery(name = "Estruc.findByEstUbic", query = "SELECT e FROM Estruc e WHERE e.estUbic = :estUbic")
    , @NamedQuery(name = "Estruc.findByEstNV1", query = "SELECT e FROM Estruc e WHERE e.estNV1 = :estNV1")
    , @NamedQuery(name = "Estruc.findByEstNV2", query = "SELECT e FROM Estruc e WHERE e.estNV2 = :estNV2")
    , @NamedQuery(name = "Estruc.findByEstNV3", query = "SELECT e FROM Estruc e WHERE e.estNV3 = :estNV3")
    , @NamedQuery(name = "Estruc.findByEstNV4", query = "SELECT e FROM Estruc e WHERE e.estNV4 = :estNV4")
    , @NamedQuery(name = "Estruc.findByEstDesc", query = "SELECT e.estDesc FROM Estruc e WHERE e.estDesc = :estDesc")
    , @NamedQuery(name = "Estruc.findByEstCanTrab", query = "SELECT e FROM Estruc e WHERE e.estCanTrab = :estCanTrab")
    , @NamedQuery(name = "Estruc.findByEstCanPlz", query = "SELECT e FROM Estruc e WHERE e.estCanPlz = :estCanPlz")
    , @NamedQuery(name = "Estruc.findByEstAreSol", query = "SELECT e FROM Estruc e WHERE e.estAreSol = :estAreSol")
    , @NamedQuery(name = "Estruc.findByEstFSolap", query = "SELECT e FROM Estruc e WHERE e.estFSolap = :estFSolap")
    , @NamedQuery(name = "Estruc.findByEntFSolap", query = "SELECT e FROM Estruc e WHERE e.entFSolap = :entFSolap")
    , @NamedQuery(name = "Estruc.findByEstReloj", query = "SELECT e FROM Estruc e WHERE e.estReloj = :estReloj")
    , @NamedQuery(name = "Estruc.findByGrupCod", query = "SELECT e FROM Estruc e WHERE e.grupCod = :grupCod")
    , @NamedQuery(name = "Estruc.findByPagMes", query = "SELECT e FROM Estruc e WHERE e.pagMes = :pagMes")
    , @NamedQuery(name = "Estruc.findByPagAno", query = "SELECT e FROM Estruc e WHERE e.pagAno = :pagAno")
    , @NamedQuery(name = "Estruc.findByPagHorMes", query = "SELECT e FROM Estruc e WHERE e.pagHorMes = :pagHorMes")
    , @NamedQuery(name = "Estruc.findByNomFFin", query = "SELECT e FROM Estruc e WHERE e.nomFFin = :nomFFin")
    , @NamedQuery(name = "Estruc.findByNomFIni", query = "SELECT e FROM Estruc e WHERE e.nomFIni = :nomFIni")
    , @NamedQuery(name = "Estruc.findByNomQin", query = "SELECT e FROM Estruc e WHERE e.nomQin = :nomQin")
    , @NamedQuery(name = "Estruc.findByNomMes", query = "SELECT e FROM Estruc e WHERE e.nomMes = :nomMes")
    , @NamedQuery(name = "Estruc.findByNomAno", query = "SELECT e FROM Estruc e WHERE e.nomAno = :nomAno")
    , @NamedQuery(name = "Estruc.findByEstClaAut", query = "SELECT e FROM Estruc e WHERE e.estClaAut = :estClaAut")
    , @NamedQuery(name = "Estruc.findByEstP2Rapid", query = "SELECT e FROM Estruc e WHERE e.estP2Rapid = :estP2Rapid")
    , @NamedQuery(name = "Estruc.findByEstSNTieP", query = "SELECT e FROM Estruc e WHERE e.estSNTieP = :estSNTieP")
    , @NamedQuery(name = "Estruc.findByEstSNPad", query = "SELECT e FROM Estruc e WHERE e.estSNPad = :estSNPad")
    , @NamedQuery(name = "Estruc.findByEstSNTieS", query = "SELECT e FROM Estruc e WHERE e.estSNTieS = :estSNTieS")
    , @NamedQuery(name = "Estruc.findByEstDestajo", query = "SELECT e FROM Estruc e WHERE e.estDestajo = :estDestajo")
    , @NamedQuery(name = "Estruc.findByEstAreaDIP", query = "SELECT e FROM Estruc e WHERE e.estAreaDIP = :estAreaDIP")
    , @NamedQuery(name = "Estruc.findByEstTecUniv", query = "SELECT e FROM Estruc e WHERE e.estTecUniv = :estTecUniv")
    , @NamedQuery(name = "Estruc.findByEstQuitPE", query = "SELECT e FROM Estruc e WHERE e.estQuitPE = :estQuitPE")
    , @NamedQuery(name = "Estruc.findByEstEstipAl", query = "SELECT e FROM Estruc e WHERE e.estEstipAl = :estEstipAl")
    , @NamedQuery(name = "Estruc.findByEstUnidRem", query = "SELECT e FROM Estruc e WHERE e.estUnidRem = :estUnidRem")
    , @NamedQuery(name = "Estruc.findByEstTrbMun", query = "SELECT e FROM Estruc e WHERE e.estTrbMun = :estTrbMun")
    , @NamedQuery(name = "Estruc.findByEstViajera", query = "SELECT e FROM Estruc e WHERE e.estViajera = :estViajera")
    , @NamedQuery(name = "Estruc.findByPSEAprobE", query = "SELECT e FROM Estruc e WHERE e.pSEAprobE = :pSEAprobE")
    , @NamedQuery(name = "Estruc.findByPSEAprobD", query = "SELECT e FROM Estruc e WHERE e.pSEAprobD = :pSEAprobD")
    , @NamedQuery(name = "Estruc.findByPSEAprobDS", query = "SELECT e FROM Estruc e WHERE e.pSEAprobDS = :pSEAprobDS")
    , @NamedQuery(name = "Estruc.findByPSEAprobT", query = "SELECT e FROM Estruc e WHERE e.pSEAprobT = :pSEAprobT")
    , @NamedQuery(name = "Estruc.findByPSEAprobA", query = "SELECT e FROM Estruc e WHERE e.pSEAprobA = :pSEAprobA")
    , @NamedQuery(name = "Estruc.findByPSEAprobS", query = "SELECT e FROM Estruc e WHERE e.pSEAprobS = :pSEAprobS")
    , @NamedQuery(name = "Estruc.findByPSEAprobO", query = "SELECT e FROM Estruc e WHERE e.pSEAprobO = :pSEAprobO")
    , @NamedQuery(name = "Estruc.findByPsecaae", query = "SELECT e FROM Estruc e WHERE e.psecaae = :psecaae")
    , @NamedQuery(name = "Estruc.findByPsecaad", query = "SELECT e FROM Estruc e WHERE e.psecaad = :psecaad")
    , @NamedQuery(name = "Estruc.findByPsecaads", query = "SELECT e FROM Estruc e WHERE e.psecaads = :psecaads")
    , @NamedQuery(name = "Estruc.findByPsecaat", query = "SELECT e FROM Estruc e WHERE e.psecaat = :psecaat")
    , @NamedQuery(name = "Estruc.findByPsecaaa", query = "SELECT e FROM Estruc e WHERE e.psecaaa = :psecaaa")
    , @NamedQuery(name = "Estruc.findByPsecaas", query = "SELECT e FROM Estruc e WHERE e.psecaas = :psecaas")
    , @NamedQuery(name = "Estruc.findByPsecaao", query = "SELECT e FROM Estruc e WHERE e.psecaao = :psecaao")
    , @NamedQuery(name = "Estruc.findByPseaaae", query = "SELECT e FROM Estruc e WHERE e.pseaaae = :pseaaae")
    , @NamedQuery(name = "Estruc.findByPseaaad", query = "SELECT e FROM Estruc e WHERE e.pseaaad = :pseaaad")
    , @NamedQuery(name = "Estruc.findByPseaaads", query = "SELECT e FROM Estruc e WHERE e.pseaaads = :pseaaads")
    , @NamedQuery(name = "Estruc.findByPseaaat", query = "SELECT e FROM Estruc e WHERE e.pseaaat = :pseaaat")
    , @NamedQuery(name = "Estruc.findByPseaaaa", query = "SELECT e FROM Estruc e WHERE e.pseaaaa = :pseaaaa")
    , @NamedQuery(name = "Estruc.findByPseaaas", query = "SELECT e FROM Estruc e WHERE e.pseaaas = :pseaaas")
    , @NamedQuery(name = "Estruc.findByPseaaao", query = "SELECT e FROM Estruc e WHERE e.pseaaao = :pseaaao")
    , @NamedQuery(name = "Estruc.findByRCOAprobE", query = "SELECT e FROM Estruc e WHERE e.rCOAprobE = :rCOAprobE")
    , @NamedQuery(name = "Estruc.findByRCOAprobD", query = "SELECT e FROM Estruc e WHERE e.rCOAprobD = :rCOAprobD")
    , @NamedQuery(name = "Estruc.findByRCOAprobDS", query = "SELECT e FROM Estruc e WHERE e.rCOAprobDS = :rCOAprobDS")
    , @NamedQuery(name = "Estruc.findByRCOAprobT", query = "SELECT e FROM Estruc e WHERE e.rCOAprobT = :rCOAprobT")
    , @NamedQuery(name = "Estruc.findByRCOAprobA", query = "SELECT e FROM Estruc e WHERE e.rCOAprobA = :rCOAprobA")
    , @NamedQuery(name = "Estruc.findByRCOAprobS", query = "SELECT e FROM Estruc e WHERE e.rCOAprobS = :rCOAprobS")
    , @NamedQuery(name = "Estruc.findByRCOAprobO", query = "SELECT e FROM Estruc e WHERE e.rCOAprobO = :rCOAprobO")
    , @NamedQuery(name = "Estruc.findByRcocaae", query = "SELECT e FROM Estruc e WHERE e.rcocaae = :rcocaae")
    , @NamedQuery(name = "Estruc.findByRcocaad", query = "SELECT e FROM Estruc e WHERE e.rcocaad = :rcocaad")
    , @NamedQuery(name = "Estruc.findByRcocaads", query = "SELECT e FROM Estruc e WHERE e.rcocaads = :rcocaads")
    , @NamedQuery(name = "Estruc.findByRcocaat", query = "SELECT e FROM Estruc e WHERE e.rcocaat = :rcocaat")
    , @NamedQuery(name = "Estruc.findByRcocaaa", query = "SELECT e FROM Estruc e WHERE e.rcocaaa = :rcocaaa")
    , @NamedQuery(name = "Estruc.findByRcocaas", query = "SELECT e FROM Estruc e WHERE e.rcocaas = :rcocaas")
    , @NamedQuery(name = "Estruc.findByRcocaao", query = "SELECT e FROM Estruc e WHERE e.rcocaao = :rcocaao")
    , @NamedQuery(name = "Estruc.findByRcoaaae", query = "SELECT e FROM Estruc e WHERE e.rcoaaae = :rcoaaae")
    , @NamedQuery(name = "Estruc.findByRcoaaad", query = "SELECT e FROM Estruc e WHERE e.rcoaaad = :rcoaaad")
    , @NamedQuery(name = "Estruc.findByRcoaaads", query = "SELECT e FROM Estruc e WHERE e.rcoaaads = :rcoaaads")
    , @NamedQuery(name = "Estruc.findByRcoaaat", query = "SELECT e FROM Estruc e WHERE e.rcoaaat = :rcoaaat")
    , @NamedQuery(name = "Estruc.findByRcoaaaa", query = "SELECT e FROM Estruc e WHERE e.rcoaaaa = :rcoaaaa")
    , @NamedQuery(name = "Estruc.findByRcoaaas", query = "SELECT e FROM Estruc e WHERE e.rcoaaas = :rcoaaas")
    , @NamedQuery(name = "Estruc.findByRcoaaao", query = "SELECT e FROM Estruc e WHERE e.rcoaaao = :rcoaaao")
    , @NamedQuery(name = "Estruc.findByEjeCAAntP", query = "SELECT e FROM Estruc e WHERE e.ejeCAAntP = :ejeCAAntP")
    , @NamedQuery(name = "Estruc.findByEjeAAAntP", query = "SELECT e FROM Estruc e WHERE e.ejeAAAntP = :ejeAAAntP")
    , @NamedQuery(name = "Estruc.findByDirCAAntP", query = "SELECT e FROM Estruc e WHERE e.dirCAAntP = :dirCAAntP")
    , @NamedQuery(name = "Estruc.findByDirAAAntP", query = "SELECT e FROM Estruc e WHERE e.dirAAAntP = :dirAAAntP")
    , @NamedQuery(name = "Estruc.findByDsuCAAntP", query = "SELECT e FROM Estruc e WHERE e.dsuCAAntP = :dsuCAAntP")
    , @NamedQuery(name = "Estruc.findByDsuAAAntP", query = "SELECT e FROM Estruc e WHERE e.dsuAAAntP = :dsuAAAntP")
    , @NamedQuery(name = "Estruc.findByTecCAAntP", query = "SELECT e FROM Estruc e WHERE e.tecCAAntP = :tecCAAntP")
    , @NamedQuery(name = "Estruc.findByTecAAAntP", query = "SELECT e FROM Estruc e WHERE e.tecAAAntP = :tecAAAntP")
    , @NamedQuery(name = "Estruc.findByAdmCAAntP", query = "SELECT e FROM Estruc e WHERE e.admCAAntP = :admCAAntP")
    , @NamedQuery(name = "Estruc.findByAdmAAAntP", query = "SELECT e FROM Estruc e WHERE e.admAAAntP = :admAAAntP")
    , @NamedQuery(name = "Estruc.findByServCAAntP", query = "SELECT e FROM Estruc e WHERE e.servCAAntP = :servCAAntP")
    , @NamedQuery(name = "Estruc.findByServAAAntP", query = "SELECT e FROM Estruc e WHERE e.servAAAntP = :servAAAntP")
    , @NamedQuery(name = "Estruc.findByObrCAAntP", query = "SELECT e FROM Estruc e WHERE e.obrCAAntP = :obrCAAntP")
    , @NamedQuery(name = "Estruc.findByObrAAAntP", query = "SELECT e FROM Estruc e WHERE e.obrAAAntP = :obrAAAntP")
    , @NamedQuery(name = "Estruc.findByEjeCAAnt", query = "SELECT e FROM Estruc e WHERE e.ejeCAAnt = :ejeCAAnt")
    , @NamedQuery(name = "Estruc.findByEjeAAAnt", query = "SELECT e FROM Estruc e WHERE e.ejeAAAnt = :ejeAAAnt")
    , @NamedQuery(name = "Estruc.findByDirCAAnt", query = "SELECT e FROM Estruc e WHERE e.dirCAAnt = :dirCAAnt")
    , @NamedQuery(name = "Estruc.findByDirAAAnt", query = "SELECT e FROM Estruc e WHERE e.dirAAAnt = :dirAAAnt")
    , @NamedQuery(name = "Estruc.findByDSuCAAnt", query = "SELECT e FROM Estruc e WHERE e.dSuCAAnt = :dSuCAAnt")
    , @NamedQuery(name = "Estruc.findByDSuAAAnt", query = "SELECT e FROM Estruc e WHERE e.dSuAAAnt = :dSuAAAnt")
    , @NamedQuery(name = "Estruc.findByTecCAAnt", query = "SELECT e FROM Estruc e WHERE e.tecCAAnt = :tecCAAnt")
    , @NamedQuery(name = "Estruc.findByTecAAAnt", query = "SELECT e FROM Estruc e WHERE e.tecAAAnt = :tecAAAnt")
    , @NamedQuery(name = "Estruc.findByAdmCAAnt", query = "SELECT e FROM Estruc e WHERE e.admCAAnt = :admCAAnt")
    , @NamedQuery(name = "Estruc.findByAdmAAAnt", query = "SELECT e FROM Estruc e WHERE e.admAAAnt = :admAAAnt")
    , @NamedQuery(name = "Estruc.findByServCAAnt", query = "SELECT e FROM Estruc e WHERE e.servCAAnt = :servCAAnt")
    , @NamedQuery(name = "Estruc.findByServAAAnt", query = "SELECT e FROM Estruc e WHERE e.servAAAnt = :servAAAnt")
    , @NamedQuery(name = "Estruc.findByObrCAAnt", query = "SELECT e FROM Estruc e WHERE e.obrCAAnt = :obrCAAnt")
    , @NamedQuery(name = "Estruc.findByObrAAAnt", query = "SELECT e FROM Estruc e WHERE e.obrAAAnt = :obrAAAnt")
    , @NamedQuery(name = "Estruc.findByFondoSalCD", query = "SELECT e FROM Estruc e WHERE e.fondoSalCD = :fondoSalCD")
    , @NamedQuery(name = "Estruc.findByFondoSalPr", query = "SELECT e FROM Estruc e WHERE e.fondoSalPr = :fondoSalPr")
    , @NamedQuery(name = "Estruc.findByFondoSalRe", query = "SELECT e FROM Estruc e WHERE e.fondoSalRe = :fondoSalRe")
    , @NamedQuery(name = "Estruc.findByFondoSalPl", query = "SELECT e FROM Estruc e WHERE e.fondoSalPl = :fondoSalPl")
    , @NamedQuery(name = "Estruc.findByPromTrabCD", query = "SELECT e FROM Estruc e WHERE e.promTrabCD = :promTrabCD")
    , @NamedQuery(name = "Estruc.findByPromTrabPr", query = "SELECT e FROM Estruc e WHERE e.promTrabPr = :promTrabPr")
    , @NamedQuery(name = "Estruc.findByPromTrabRe", query = "SELECT e FROM Estruc e WHERE e.promTrabRe = :promTrabRe")
    , @NamedQuery(name = "Estruc.findByPromTrabPl", query = "SELECT e FROM Estruc e WHERE e.promTrabPl = :promTrabPl")
    , @NamedQuery(name = "Estruc.findByValABCDApr", query = "SELECT e FROM Estruc e WHERE e.valABCDApr = :valABCDApr")
    , @NamedQuery(name = "Estruc.findByValABPropC", query = "SELECT e FROM Estruc e WHERE e.valABPropC = :valABPropC")
    , @NamedQuery(name = "Estruc.findByValABRealA", query = "SELECT e FROM Estruc e WHERE e.valABRealA = :valABRealA")
    , @NamedQuery(name = "Estruc.findByValABPlanA", query = "SELECT e FROM Estruc e WHERE e.valABPlanA = :valABPlanA")
    , @NamedQuery(name = "Estruc.findByCalcP1", query = "SELECT e FROM Estruc e WHERE e.calcP1 = :calcP1")
    , @NamedQuery(name = "Estruc.findByEst1erGrpD", query = "SELECT e FROM Estruc e WHERE e.est1erGrpD = :est1erGrpD")})
public class Estruc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "EstUbic")
    private String estUbic;
    @Column(name = "EstNV1")
    private Short estNV1;
    @Column(name = "EstNV2")
    private Short estNV2;
    @Column(name = "EstNV3")
    private Short estNV3;
    @Column(name = "EstNV4")
    private Short estNV4;
    @Size(max = 80)
    @Column(name = "EstDesc")
    private String estDesc;
    @Column(name = "EstCanTrab")
    private Short estCanTrab;
    @Column(name = "EstCanPlz")
    private Short estCanPlz;
    @Size(max = 30)
    @Column(name = "EstAreSol")
    private String estAreSol;
    @Size(max = 50)
    @Column(name = "EstFSolap")
    private String estFSolap;
    @Size(max = 30)
    @Column(name = "EntFSolap")
    private String entFSolap;
    @Column(name = "EstReloj")
    private Short estReloj;
    @Column(name = "GrupCod")
    private Short grupCod;
    @Column(name = "PagMes")
    private Short pagMes;
    @Column(name = "PagAno")
    private Short pagAno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PagHorMes")
    private BigDecimal pagHorMes;
    @Column(name = "NomFFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nomFFin;
    @Column(name = "NomFIni")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nomFIni;
    @Column(name = "NomQin")
    private Short nomQin;
    @Column(name = "NomMes")
    private Short nomMes;
    @Column(name = "NomAno")
    private Short nomAno;
    @Column(name = "EstClaAut")
    private Short estClaAut;
    @Column(name = "EstP2Rapid")
    private Short estP2Rapid;
    @Column(name = "EstSNTieP")
    private Short estSNTieP;
    @Column(name = "EstSNPad")
    private Short estSNPad;
    @Column(name = "EstSNTieS")
    private Short estSNTieS;
    @Column(name = "EstDestajo")
    private Short estDestajo;
    @Column(name = "EstAreaDIP")
    private Short estAreaDIP;
    @Column(name = "EstTecUniv")
    private Short estTecUniv;
    @Column(name = "EstQuitPE")
    private Short estQuitPE;
    @Column(name = "EstEstipAl")
    private Short estEstipAl;
    @Column(name = "EstUnidRem")
    private Short estUnidRem;
    @Column(name = "EstTrbMun")
    private Short estTrbMun;
    @Column(name = "EstViajera")
    private Short estViajera;
    @Column(name = "PSEAprobE")
    private Short pSEAprobE;
    @Column(name = "PSEAprobD")
    private Short pSEAprobD;
    @Column(name = "PSEAprobDS")
    private Short pSEAprobDS;
    @Column(name = "PSEAprobT")
    private Short pSEAprobT;
    @Column(name = "PSEAprobA")
    private Short pSEAprobA;
    @Column(name = "PSEAprobS")
    private Short pSEAprobS;
    @Column(name = "PSEAprobO")
    private Short pSEAprobO;
    @Column(name = "PSECAAE")
    private Short psecaae;
    @Column(name = "PSECAAD")
    private Short psecaad;
    @Column(name = "PSECAADS")
    private Short psecaads;
    @Column(name = "PSECAAT")
    private Short psecaat;
    @Column(name = "PSECAAA")
    private Short psecaaa;
    @Column(name = "PSECAAS")
    private Short psecaas;
    @Column(name = "PSECAAO")
    private Short psecaao;
    @Column(name = "PSEAAAE")
    private Short pseaaae;
    @Column(name = "PSEAAAD")
    private Short pseaaad;
    @Column(name = "PSEAAADS")
    private Short pseaaads;
    @Column(name = "PSEAAAT")
    private Short pseaaat;
    @Column(name = "PSEAAAA")
    private Short pseaaaa;
    @Column(name = "PSEAAAS")
    private Short pseaaas;
    @Column(name = "PSEAAAO")
    private Short pseaaao;
    @Column(name = "RCOAprobE")
    private Short rCOAprobE;
    @Column(name = "RCOAprobD")
    private Short rCOAprobD;
    @Column(name = "RCOAprobDS")
    private Short rCOAprobDS;
    @Column(name = "RCOAprobT")
    private Short rCOAprobT;
    @Column(name = "RCOAprobA")
    private Short rCOAprobA;
    @Column(name = "RCOAprobS")
    private Short rCOAprobS;
    @Column(name = "RCOAprobO")
    private Short rCOAprobO;
    @Column(name = "RCOCAAE")
    private Short rcocaae;
    @Column(name = "RCOCAAD")
    private Short rcocaad;
    @Column(name = "RCOCAADS")
    private Short rcocaads;
    @Column(name = "RCOCAAT")
    private Short rcocaat;
    @Column(name = "RCOCAAA")
    private Short rcocaaa;
    @Column(name = "RCOCAAS")
    private Short rcocaas;
    @Column(name = "RCOCAAO")
    private Short rcocaao;
    @Column(name = "RCOAAAE")
    private Short rcoaaae;
    @Column(name = "RCOAAAD")
    private Short rcoaaad;
    @Column(name = "RCOAAADS")
    private Short rcoaaads;
    @Column(name = "RCOAAAT")
    private Short rcoaaat;
    @Column(name = "RCOAAAA")
    private Short rcoaaaa;
    @Column(name = "RCOAAAS")
    private Short rcoaaas;
    @Column(name = "RCOAAAO")
    private Short rcoaaao;
    @Column(name = "EjeCAAntP")
    private Short ejeCAAntP;
    @Column(name = "EjeAAAntP")
    private Short ejeAAAntP;
    @Column(name = "DirCAAntP")
    private Short dirCAAntP;
    @Column(name = "DirAAAntP")
    private Short dirAAAntP;
    @Column(name = "DsuCAAntP")
    private Short dsuCAAntP;
    @Column(name = "DsuAAAntP")
    private Short dsuAAAntP;
    @Column(name = "TecCAAntP")
    private Short tecCAAntP;
    @Column(name = "TecAAAntP")
    private Short tecAAAntP;
    @Column(name = "AdmCAAntP")
    private Short admCAAntP;
    @Column(name = "AdmAAAntP")
    private Short admAAAntP;
    @Column(name = "ServCAAntP")
    private Short servCAAntP;
    @Column(name = "ServAAAntP")
    private Short servAAAntP;
    @Column(name = "ObrCAAntP")
    private Short obrCAAntP;
    @Column(name = "ObrAAAntP")
    private Short obrAAAntP;
    @Column(name = "EjeCAAnt")
    private Short ejeCAAnt;
    @Column(name = "EjeAAAnt")
    private Short ejeAAAnt;
    @Column(name = "DirCAAnt")
    private Short dirCAAnt;
    @Column(name = "DirAAAnt")
    private Short dirAAAnt;
    @Column(name = "DSuCAAnt")
    private Short dSuCAAnt;
    @Column(name = "DSuAAAnt")
    private Short dSuAAAnt;
    @Column(name = "TecCAAnt")
    private Short tecCAAnt;
    @Column(name = "TecAAAnt")
    private Short tecAAAnt;
    @Column(name = "AdmCAAnt")
    private Short admCAAnt;
    @Column(name = "AdmAAAnt")
    private Short admAAAnt;
    @Column(name = "ServCAAnt")
    private Short servCAAnt;
    @Column(name = "ServAAAnt")
    private Short servAAAnt;
    @Column(name = "ObrCAAnt")
    private Short obrCAAnt;
    @Column(name = "ObrAAAnt")
    private Short obrAAAnt;
    @Column(name = "FondoSalCD")
    private BigDecimal fondoSalCD;
    @Column(name = "FondoSalPr")
    private Long fondoSalPr;
    @Column(name = "FondoSalRe")
    private BigDecimal fondoSalRe;
    @Column(name = "FondoSalPl")
    private BigDecimal fondoSalPl;
    @Column(name = "PromTrabCD")
    private Short promTrabCD;
    @Column(name = "PromTrabPr")
    private Short promTrabPr;
    @Column(name = "PromTrabRe")
    private Short promTrabRe;
    @Column(name = "PromTrabPl")
    private Short promTrabPl;
    @Column(name = "ValABCDApr")
    private BigDecimal valABCDApr;
    @Column(name = "ValABPropC")
    private BigDecimal valABPropC;
    @Column(name = "ValABRealA")
    private BigDecimal valABRealA;
    @Column(name = "ValABPlanA")
    private BigDecimal valABPlanA;
    @Column(name = "CalcP1")
    private Character calcP1;
    @Column(name = "Est1erGrpD")
    private Short est1erGrpD;
    @JoinColumn(name = "EntCod", referencedColumnName = "EntCod")
    @ManyToOne
    private Dentid entCod;

    public Estruc() {
    }

    public Estruc(String estUbic) {
        this.estUbic = estUbic;
    }

    public String getEstUbic() {
        return estUbic;
    }

    public void setEstUbic(String estUbic) {
        this.estUbic = estUbic;
    }

    public Short getEstNV1() {
        return estNV1;
    }

    public void setEstNV1(Short estNV1) {
        this.estNV1 = estNV1;
    }

    public Short getEstNV2() {
        return estNV2;
    }

    public void setEstNV2(Short estNV2) {
        this.estNV2 = estNV2;
    }

    public Short getEstNV3() {
        return estNV3;
    }

    public void setEstNV3(Short estNV3) {
        this.estNV3 = estNV3;
    }

    public Short getEstNV4() {
        return estNV4;
    }

    public void setEstNV4(Short estNV4) {
        this.estNV4 = estNV4;
    }

    public String getEstDesc() {
        return estDesc;
    }

    public void setEstDesc(String estDesc) {
        this.estDesc = estDesc;
    }

    public Short getEstCanTrab() {
        return estCanTrab;
    }

    public void setEstCanTrab(Short estCanTrab) {
        this.estCanTrab = estCanTrab;
    }

    public Short getEstCanPlz() {
        return estCanPlz;
    }

    public void setEstCanPlz(Short estCanPlz) {
        this.estCanPlz = estCanPlz;
    }

    public String getEstAreSol() {
        return estAreSol;
    }

    public void setEstAreSol(String estAreSol) {
        this.estAreSol = estAreSol;
    }

    public String getEstFSolap() {
        return estFSolap;
    }

    public void setEstFSolap(String estFSolap) {
        this.estFSolap = estFSolap;
    }

    public String getEntFSolap() {
        return entFSolap;
    }

    public void setEntFSolap(String entFSolap) {
        this.entFSolap = entFSolap;
    }

    public Short getEstReloj() {
        return estReloj;
    }

    public void setEstReloj(Short estReloj) {
        this.estReloj = estReloj;
    }

    public Short getGrupCod() {
        return grupCod;
    }

    public void setGrupCod(Short grupCod) {
        this.grupCod = grupCod;
    }

    public Short getPagMes() {
        return pagMes;
    }

    public void setPagMes(Short pagMes) {
        this.pagMes = pagMes;
    }

    public Short getPagAno() {
        return pagAno;
    }

    public void setPagAno(Short pagAno) {
        this.pagAno = pagAno;
    }

    public BigDecimal getPagHorMes() {
        return pagHorMes;
    }

    public void setPagHorMes(BigDecimal pagHorMes) {
        this.pagHorMes = pagHorMes;
    }

    public Date getNomFFin() {
        return nomFFin;
    }

    public void setNomFFin(Date nomFFin) {
        this.nomFFin = nomFFin;
    }

    public Date getNomFIni() {
        return nomFIni;
    }

    public void setNomFIni(Date nomFIni) {
        this.nomFIni = nomFIni;
    }

    public Short getNomQin() {
        return nomQin;
    }

    public void setNomQin(Short nomQin) {
        this.nomQin = nomQin;
    }

    public Short getNomMes() {
        return nomMes;
    }

    public void setNomMes(Short nomMes) {
        this.nomMes = nomMes;
    }

    public Short getNomAno() {
        return nomAno;
    }

    public void setNomAno(Short nomAno) {
        this.nomAno = nomAno;
    }

    public Short getEstClaAut() {
        return estClaAut;
    }

    public void setEstClaAut(Short estClaAut) {
        this.estClaAut = estClaAut;
    }

    public Short getEstP2Rapid() {
        return estP2Rapid;
    }

    public void setEstP2Rapid(Short estP2Rapid) {
        this.estP2Rapid = estP2Rapid;
    }

    public Short getEstSNTieP() {
        return estSNTieP;
    }

    public void setEstSNTieP(Short estSNTieP) {
        this.estSNTieP = estSNTieP;
    }

    public Short getEstSNPad() {
        return estSNPad;
    }

    public void setEstSNPad(Short estSNPad) {
        this.estSNPad = estSNPad;
    }

    public Short getEstSNTieS() {
        return estSNTieS;
    }

    public void setEstSNTieS(Short estSNTieS) {
        this.estSNTieS = estSNTieS;
    }

    public Short getEstDestajo() {
        return estDestajo;
    }

    public void setEstDestajo(Short estDestajo) {
        this.estDestajo = estDestajo;
    }

    public Short getEstAreaDIP() {
        return estAreaDIP;
    }

    public void setEstAreaDIP(Short estAreaDIP) {
        this.estAreaDIP = estAreaDIP;
    }

    public Short getEstTecUniv() {
        return estTecUniv;
    }

    public void setEstTecUniv(Short estTecUniv) {
        this.estTecUniv = estTecUniv;
    }

    public Short getEstQuitPE() {
        return estQuitPE;
    }

    public void setEstQuitPE(Short estQuitPE) {
        this.estQuitPE = estQuitPE;
    }

    public Short getEstEstipAl() {
        return estEstipAl;
    }

    public void setEstEstipAl(Short estEstipAl) {
        this.estEstipAl = estEstipAl;
    }

    public Short getEstUnidRem() {
        return estUnidRem;
    }

    public void setEstUnidRem(Short estUnidRem) {
        this.estUnidRem = estUnidRem;
    }

    public Short getEstTrbMun() {
        return estTrbMun;
    }

    public void setEstTrbMun(Short estTrbMun) {
        this.estTrbMun = estTrbMun;
    }

    public Short getEstViajera() {
        return estViajera;
    }

    public void setEstViajera(Short estViajera) {
        this.estViajera = estViajera;
    }

    public Short getPSEAprobE() {
        return pSEAprobE;
    }

    public void setPSEAprobE(Short pSEAprobE) {
        this.pSEAprobE = pSEAprobE;
    }

    public Short getPSEAprobD() {
        return pSEAprobD;
    }

    public void setPSEAprobD(Short pSEAprobD) {
        this.pSEAprobD = pSEAprobD;
    }

    public Short getPSEAprobDS() {
        return pSEAprobDS;
    }

    public void setPSEAprobDS(Short pSEAprobDS) {
        this.pSEAprobDS = pSEAprobDS;
    }

    public Short getPSEAprobT() {
        return pSEAprobT;
    }

    public void setPSEAprobT(Short pSEAprobT) {
        this.pSEAprobT = pSEAprobT;
    }

    public Short getPSEAprobA() {
        return pSEAprobA;
    }

    public void setPSEAprobA(Short pSEAprobA) {
        this.pSEAprobA = pSEAprobA;
    }

    public Short getPSEAprobS() {
        return pSEAprobS;
    }

    public void setPSEAprobS(Short pSEAprobS) {
        this.pSEAprobS = pSEAprobS;
    }

    public Short getPSEAprobO() {
        return pSEAprobO;
    }

    public void setPSEAprobO(Short pSEAprobO) {
        this.pSEAprobO = pSEAprobO;
    }

    public Short getPsecaae() {
        return psecaae;
    }

    public void setPsecaae(Short psecaae) {
        this.psecaae = psecaae;
    }

    public Short getPsecaad() {
        return psecaad;
    }

    public void setPsecaad(Short psecaad) {
        this.psecaad = psecaad;
    }

    public Short getPsecaads() {
        return psecaads;
    }

    public void setPsecaads(Short psecaads) {
        this.psecaads = psecaads;
    }

    public Short getPsecaat() {
        return psecaat;
    }

    public void setPsecaat(Short psecaat) {
        this.psecaat = psecaat;
    }

    public Short getPsecaaa() {
        return psecaaa;
    }

    public void setPsecaaa(Short psecaaa) {
        this.psecaaa = psecaaa;
    }

    public Short getPsecaas() {
        return psecaas;
    }

    public void setPsecaas(Short psecaas) {
        this.psecaas = psecaas;
    }

    public Short getPsecaao() {
        return psecaao;
    }

    public void setPsecaao(Short psecaao) {
        this.psecaao = psecaao;
    }

    public Short getPseaaae() {
        return pseaaae;
    }

    public void setPseaaae(Short pseaaae) {
        this.pseaaae = pseaaae;
    }

    public Short getPseaaad() {
        return pseaaad;
    }

    public void setPseaaad(Short pseaaad) {
        this.pseaaad = pseaaad;
    }

    public Short getPseaaads() {
        return pseaaads;
    }

    public void setPseaaads(Short pseaaads) {
        this.pseaaads = pseaaads;
    }

    public Short getPseaaat() {
        return pseaaat;
    }

    public void setPseaaat(Short pseaaat) {
        this.pseaaat = pseaaat;
    }

    public Short getPseaaaa() {
        return pseaaaa;
    }

    public void setPseaaaa(Short pseaaaa) {
        this.pseaaaa = pseaaaa;
    }

    public Short getPseaaas() {
        return pseaaas;
    }

    public void setPseaaas(Short pseaaas) {
        this.pseaaas = pseaaas;
    }

    public Short getPseaaao() {
        return pseaaao;
    }

    public void setPseaaao(Short pseaaao) {
        this.pseaaao = pseaaao;
    }

    public Short getRCOAprobE() {
        return rCOAprobE;
    }

    public void setRCOAprobE(Short rCOAprobE) {
        this.rCOAprobE = rCOAprobE;
    }

    public Short getRCOAprobD() {
        return rCOAprobD;
    }

    public void setRCOAprobD(Short rCOAprobD) {
        this.rCOAprobD = rCOAprobD;
    }

    public Short getRCOAprobDS() {
        return rCOAprobDS;
    }

    public void setRCOAprobDS(Short rCOAprobDS) {
        this.rCOAprobDS = rCOAprobDS;
    }

    public Short getRCOAprobT() {
        return rCOAprobT;
    }

    public void setRCOAprobT(Short rCOAprobT) {
        this.rCOAprobT = rCOAprobT;
    }

    public Short getRCOAprobA() {
        return rCOAprobA;
    }

    public void setRCOAprobA(Short rCOAprobA) {
        this.rCOAprobA = rCOAprobA;
    }

    public Short getRCOAprobS() {
        return rCOAprobS;
    }

    public void setRCOAprobS(Short rCOAprobS) {
        this.rCOAprobS = rCOAprobS;
    }

    public Short getRCOAprobO() {
        return rCOAprobO;
    }

    public void setRCOAprobO(Short rCOAprobO) {
        this.rCOAprobO = rCOAprobO;
    }

    public Short getRcocaae() {
        return rcocaae;
    }

    public void setRcocaae(Short rcocaae) {
        this.rcocaae = rcocaae;
    }

    public Short getRcocaad() {
        return rcocaad;
    }

    public void setRcocaad(Short rcocaad) {
        this.rcocaad = rcocaad;
    }

    public Short getRcocaads() {
        return rcocaads;
    }

    public void setRcocaads(Short rcocaads) {
        this.rcocaads = rcocaads;
    }

    public Short getRcocaat() {
        return rcocaat;
    }

    public void setRcocaat(Short rcocaat) {
        this.rcocaat = rcocaat;
    }

    public Short getRcocaaa() {
        return rcocaaa;
    }

    public void setRcocaaa(Short rcocaaa) {
        this.rcocaaa = rcocaaa;
    }

    public Short getRcocaas() {
        return rcocaas;
    }

    public void setRcocaas(Short rcocaas) {
        this.rcocaas = rcocaas;
    }

    public Short getRcocaao() {
        return rcocaao;
    }

    public void setRcocaao(Short rcocaao) {
        this.rcocaao = rcocaao;
    }

    public Short getRcoaaae() {
        return rcoaaae;
    }

    public void setRcoaaae(Short rcoaaae) {
        this.rcoaaae = rcoaaae;
    }

    public Short getRcoaaad() {
        return rcoaaad;
    }

    public void setRcoaaad(Short rcoaaad) {
        this.rcoaaad = rcoaaad;
    }

    public Short getRcoaaads() {
        return rcoaaads;
    }

    public void setRcoaaads(Short rcoaaads) {
        this.rcoaaads = rcoaaads;
    }

    public Short getRcoaaat() {
        return rcoaaat;
    }

    public void setRcoaaat(Short rcoaaat) {
        this.rcoaaat = rcoaaat;
    }

    public Short getRcoaaaa() {
        return rcoaaaa;
    }

    public void setRcoaaaa(Short rcoaaaa) {
        this.rcoaaaa = rcoaaaa;
    }

    public Short getRcoaaas() {
        return rcoaaas;
    }

    public void setRcoaaas(Short rcoaaas) {
        this.rcoaaas = rcoaaas;
    }

    public Short getRcoaaao() {
        return rcoaaao;
    }

    public void setRcoaaao(Short rcoaaao) {
        this.rcoaaao = rcoaaao;
    }

    public Short getEjeCAAntP() {
        return ejeCAAntP;
    }

    public void setEjeCAAntP(Short ejeCAAntP) {
        this.ejeCAAntP = ejeCAAntP;
    }

    public Short getEjeAAAntP() {
        return ejeAAAntP;
    }

    public void setEjeAAAntP(Short ejeAAAntP) {
        this.ejeAAAntP = ejeAAAntP;
    }

    public Short getDirCAAntP() {
        return dirCAAntP;
    }

    public void setDirCAAntP(Short dirCAAntP) {
        this.dirCAAntP = dirCAAntP;
    }

    public Short getDirAAAntP() {
        return dirAAAntP;
    }

    public void setDirAAAntP(Short dirAAAntP) {
        this.dirAAAntP = dirAAAntP;
    }

    public Short getDsuCAAntP() {
        return dsuCAAntP;
    }

    public void setDsuCAAntP(Short dsuCAAntP) {
        this.dsuCAAntP = dsuCAAntP;
    }

    public Short getDsuAAAntP() {
        return dsuAAAntP;
    }

    public void setDsuAAAntP(Short dsuAAAntP) {
        this.dsuAAAntP = dsuAAAntP;
    }

    public Short getTecCAAntP() {
        return tecCAAntP;
    }

    public void setTecCAAntP(Short tecCAAntP) {
        this.tecCAAntP = tecCAAntP;
    }

    public Short getTecAAAntP() {
        return tecAAAntP;
    }

    public void setTecAAAntP(Short tecAAAntP) {
        this.tecAAAntP = tecAAAntP;
    }

    public Short getAdmCAAntP() {
        return admCAAntP;
    }

    public void setAdmCAAntP(Short admCAAntP) {
        this.admCAAntP = admCAAntP;
    }

    public Short getAdmAAAntP() {
        return admAAAntP;
    }

    public void setAdmAAAntP(Short admAAAntP) {
        this.admAAAntP = admAAAntP;
    }

    public Short getServCAAntP() {
        return servCAAntP;
    }

    public void setServCAAntP(Short servCAAntP) {
        this.servCAAntP = servCAAntP;
    }

    public Short getServAAAntP() {
        return servAAAntP;
    }

    public void setServAAAntP(Short servAAAntP) {
        this.servAAAntP = servAAAntP;
    }

    public Short getObrCAAntP() {
        return obrCAAntP;
    }

    public void setObrCAAntP(Short obrCAAntP) {
        this.obrCAAntP = obrCAAntP;
    }

    public Short getObrAAAntP() {
        return obrAAAntP;
    }

    public void setObrAAAntP(Short obrAAAntP) {
        this.obrAAAntP = obrAAAntP;
    }

    public Short getEjeCAAnt() {
        return ejeCAAnt;
    }

    public void setEjeCAAnt(Short ejeCAAnt) {
        this.ejeCAAnt = ejeCAAnt;
    }

    public Short getEjeAAAnt() {
        return ejeAAAnt;
    }

    public void setEjeAAAnt(Short ejeAAAnt) {
        this.ejeAAAnt = ejeAAAnt;
    }

    public Short getDirCAAnt() {
        return dirCAAnt;
    }

    public void setDirCAAnt(Short dirCAAnt) {
        this.dirCAAnt = dirCAAnt;
    }

    public Short getDirAAAnt() {
        return dirAAAnt;
    }

    public void setDirAAAnt(Short dirAAAnt) {
        this.dirAAAnt = dirAAAnt;
    }

    public Short getDSuCAAnt() {
        return dSuCAAnt;
    }

    public void setDSuCAAnt(Short dSuCAAnt) {
        this.dSuCAAnt = dSuCAAnt;
    }

    public Short getDSuAAAnt() {
        return dSuAAAnt;
    }

    public void setDSuAAAnt(Short dSuAAAnt) {
        this.dSuAAAnt = dSuAAAnt;
    }

    public Short getTecCAAnt() {
        return tecCAAnt;
    }

    public void setTecCAAnt(Short tecCAAnt) {
        this.tecCAAnt = tecCAAnt;
    }

    public Short getTecAAAnt() {
        return tecAAAnt;
    }

    public void setTecAAAnt(Short tecAAAnt) {
        this.tecAAAnt = tecAAAnt;
    }

    public Short getAdmCAAnt() {
        return admCAAnt;
    }

    public void setAdmCAAnt(Short admCAAnt) {
        this.admCAAnt = admCAAnt;
    }

    public Short getAdmAAAnt() {
        return admAAAnt;
    }

    public void setAdmAAAnt(Short admAAAnt) {
        this.admAAAnt = admAAAnt;
    }

    public Short getServCAAnt() {
        return servCAAnt;
    }

    public void setServCAAnt(Short servCAAnt) {
        this.servCAAnt = servCAAnt;
    }

    public Short getServAAAnt() {
        return servAAAnt;
    }

    public void setServAAAnt(Short servAAAnt) {
        this.servAAAnt = servAAAnt;
    }

    public Short getObrCAAnt() {
        return obrCAAnt;
    }

    public void setObrCAAnt(Short obrCAAnt) {
        this.obrCAAnt = obrCAAnt;
    }

    public Short getObrAAAnt() {
        return obrAAAnt;
    }

    public void setObrAAAnt(Short obrAAAnt) {
        this.obrAAAnt = obrAAAnt;
    }

    public BigDecimal getFondoSalCD() {
        return fondoSalCD;
    }

    public void setFondoSalCD(BigDecimal fondoSalCD) {
        this.fondoSalCD = fondoSalCD;
    }

    public Long getFondoSalPr() {
        return fondoSalPr;
    }

    public void setFondoSalPr(Long fondoSalPr) {
        this.fondoSalPr = fondoSalPr;
    }

    public BigDecimal getFondoSalRe() {
        return fondoSalRe;
    }

    public void setFondoSalRe(BigDecimal fondoSalRe) {
        this.fondoSalRe = fondoSalRe;
    }

    public BigDecimal getFondoSalPl() {
        return fondoSalPl;
    }

    public void setFondoSalPl(BigDecimal fondoSalPl) {
        this.fondoSalPl = fondoSalPl;
    }

    public Short getPromTrabCD() {
        return promTrabCD;
    }

    public void setPromTrabCD(Short promTrabCD) {
        this.promTrabCD = promTrabCD;
    }

    public Short getPromTrabPr() {
        return promTrabPr;
    }

    public void setPromTrabPr(Short promTrabPr) {
        this.promTrabPr = promTrabPr;
    }

    public Short getPromTrabRe() {
        return promTrabRe;
    }

    public void setPromTrabRe(Short promTrabRe) {
        this.promTrabRe = promTrabRe;
    }

    public Short getPromTrabPl() {
        return promTrabPl;
    }

    public void setPromTrabPl(Short promTrabPl) {
        this.promTrabPl = promTrabPl;
    }

    public BigDecimal getValABCDApr() {
        return valABCDApr;
    }

    public void setValABCDApr(BigDecimal valABCDApr) {
        this.valABCDApr = valABCDApr;
    }

    public BigDecimal getValABPropC() {
        return valABPropC;
    }

    public void setValABPropC(BigDecimal valABPropC) {
        this.valABPropC = valABPropC;
    }

    public BigDecimal getValABRealA() {
        return valABRealA;
    }

    public void setValABRealA(BigDecimal valABRealA) {
        this.valABRealA = valABRealA;
    }

    public BigDecimal getValABPlanA() {
        return valABPlanA;
    }

    public void setValABPlanA(BigDecimal valABPlanA) {
        this.valABPlanA = valABPlanA;
    }

    public Character getCalcP1() {
        return calcP1;
    }

    public void setCalcP1(Character calcP1) {
        this.calcP1 = calcP1;
    }

    public Short getEst1erGrpD() {
        return est1erGrpD;
    }

    public void setEst1erGrpD(Short est1erGrpD) {
        this.est1erGrpD = est1erGrpD;
    }

    public Dentid getEntCod() {
        return entCod;
    }

    public void setEntCod(Dentid entCod) {
        this.entCod = entCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estUbic != null ? estUbic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estruc)) {
            return false;
        }
        Estruc other = (Estruc) object;
        if ((this.estUbic == null && other.estUbic != null) || (this.estUbic != null && !this.estUbic.equals(other.estUbic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Estruc[ estUbic=" + estUbic + " ]";
    }

}
