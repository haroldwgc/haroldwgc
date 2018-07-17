/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author harold
 */
@Entity
@Table(name = "DENTID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dentid.findAll", query = "SELECT d FROM Dentid d")
    , @NamedQuery(name = "Dentid.findByEntCod", query = "SELECT d FROM Dentid d WHERE d.entCod = :entCod")
    , @NamedQuery(name = "Dentid.findByEntDir", query = "SELECT d FROM Dentid d WHERE d.entDir = :entDir")
    , @NamedQuery(name = "Dentid.findByEntReloj", query = "SELECT d FROM Dentid d WHERE d.entReloj = :entReloj")
    , @NamedQuery(name = "Dentid.findByEntSolap", query = "SELECT d FROM Dentid d WHERE d.entSolap = :entSolap")
    , @NamedQuery(name = "Dentid.findByEntFotos", query = "SELECT d FROM Dentid d WHERE d.entFotos = :entFotos")
    , @NamedQuery(name = "Dentid.findByEntPlCont", query = "SELECT d FROM Dentid d WHERE d.entPlCont = :entPlCont")
    , @NamedQuery(name = "Dentid.findByEntPlSolap", query = "SELECT d FROM Dentid d WHERE d.entPlSolap = :entPlSolap")
    , @NamedQuery(name = "Dentid.findByEntCSolap", query = "SELECT d FROM Dentid d WHERE d.entCSolap = :entCSolap")
    , @NamedQuery(name = "Dentid.findByEntAvisos", query = "SELECT d FROM Dentid d WHERE d.entAvisos = :entAvisos")
    , @NamedQuery(name = "Dentid.findByEntAvCorr", query = "SELECT d FROM Dentid d WHERE d.entAvCorr = :entAvCorr")
    , @NamedQuery(name = "Dentid.findByEntNomDest", query = "SELECT d FROM Dentid d WHERE d.entNomDest = :entNomDest")
    , @NamedQuery(name = "Dentid.findByEntDirDest", query = "SELECT d FROM Dentid d WHERE d.entDirDest = :entDirDest")
    , @NamedQuery(name = "Dentid.findByEntSrvSMTP", query = "SELECT d FROM Dentid d WHERE d.entSrvSMTP = :entSrvSMTP")
    , @NamedQuery(name = "Dentid.findByEntSrvAuth", query = "SELECT d FROM Dentid d WHERE d.entSrvAuth = :entSrvAuth")
    , @NamedQuery(name = "Dentid.findByEntUsrName", query = "SELECT d FROM Dentid d WHERE d.entUsrName = :entUsrName")
    , @NamedQuery(name = "Dentid.findByEntPassWrd", query = "SELECT d FROM Dentid d WHERE d.entPassWrd = :entPassWrd")
    , @NamedQuery(name = "Dentid.findByPresFecApe", query = "SELECT d FROM Dentid d WHERE d.presFecApe = :presFecApe")
    , @NamedQuery(name = "Dentid.findByPresFecFin", query = "SELECT d FROM Dentid d WHERE d.presFecFin = :presFecFin")
    , @NamedQuery(name = "Dentid.findByPresFecIni", query = "SELECT d FROM Dentid d WHERE d.presFecIni = :presFecIni")
    , @NamedQuery(name = "Dentid.findByPresOpenTa", query = "SELECT d FROM Dentid d WHERE d.presOpenTa = :presOpenTa")
    , @NamedQuery(name = "Dentid.findByPresCLAQue", query = "SELECT d FROM Dentid d WHERE d.presCLAQue = :presCLAQue")
    , @NamedQuery(name = "Dentid.findByAtenFecIni", query = "SELECT d FROM Dentid d WHERE d.atenFecIni = :atenFecIni")
    , @NamedQuery(name = "Dentid.findByAtenFecFin", query = "SELECT d FROM Dentid d WHERE d.atenFecFin = :atenFecFin")
    , @NamedQuery(name = "Dentid.findByAtenRepIni", query = "SELECT d FROM Dentid d WHERE d.atenRepIni = :atenRepIni")
    , @NamedQuery(name = "Dentid.findByAtenRepFin", query = "SELECT d FROM Dentid d WHERE d.atenRepFin = :atenRepFin")
    , @NamedQuery(name = "Dentid.findByAtenSelTip", query = "SELECT d FROM Dentid d WHERE d.atenSelTip = :atenSelTip")
    , @NamedQuery(name = "Dentid.findByAtenSelCom", query = "SELECT d FROM Dentid d WHERE d.atenSelCom = :atenSelCom")
    , @NamedQuery(name = "Dentid.findByEntFEsp", query = "SELECT d FROM Dentid d WHERE d.entFEsp = :entFEsp")
    , @NamedQuery(name = "Dentid.findByPresFecICh", query = "SELECT d FROM Dentid d WHERE d.presFecICh = :presFecICh")
    , @NamedQuery(name = "Dentid.findByPresFecFCh", query = "SELECT d FROM Dentid d WHERE d.presFecFCh = :presFecFCh")
    , @NamedQuery(name = "Dentid.findByDiasPermit", query = "SELECT d FROM Dentid d WHERE d.diasPermit = :diasPermit")
    , @NamedQuery(name = "Dentid.findByDiasPermAt", query = "SELECT d FROM Dentid d WHERE d.diasPermAt = :diasPermAt")
    , @NamedQuery(name = "Dentid.findByEntHrsFS", query = "SELECT d FROM Dentid d WHERE d.entHrsFS = :entHrsFS")
    , @NamedQuery(name = "Dentid.findByEntMiniste", query = "SELECT d FROM Dentid d WHERE d.entMiniste = :entMiniste")
    , @NamedQuery(name = "Dentid.findByEntP2Rapid", query = "SELECT d FROM Dentid d WHERE d.entP2Rapid = :entP2Rapid")
    , @NamedQuery(name = "Dentid.findByDestfecini", query = "SELECT d FROM Dentid d WHERE d.destfecini = :destfecini")
    , @NamedQuery(name = "Dentid.findByDestfecfin", query = "SELECT d FROM Dentid d WHERE d.destfecfin = :destfecfin")
    , @NamedQuery(name = "Dentid.findByCanoAct", query = "SELECT d FROM Dentid d WHERE d.canoAct = :canoAct")
    , @NamedQuery(name = "Dentid.findByCMesAct", query = "SELECT d FROM Dentid d WHERE d.cMesAct = :cMesAct")
    , @NamedQuery(name = "Dentid.findByEntDisabPe", query = "SELECT d FROM Dentid d WHERE d.entDisabPe = :entDisabPe")
    , @NamedQuery(name = "Dentid.findByEntHabAsiC", query = "SELECT d FROM Dentid d WHERE d.entHabAsiC = :entHabAsiC")
    , @NamedQuery(name = "Dentid.findByEntExpXML", query = "SELECT d FROM Dentid d WHERE d.entExpXML = :entExpXML")
    , @NamedQuery(name = "Dentid.findByEntExpUNE", query = "SELECT d FROM Dentid d WHERE d.entExpUNE = :entExpUNE")
    , @NamedQuery(name = "Dentid.findByEntCodUNE", query = "SELECT d FROM Dentid d WHERE d.entCodUNE = :entCodUNE")
    , @NamedQuery(name = "Dentid.findByEntPerfEmp", query = "SELECT d FROM Dentid d WHERE d.entPerfEmp = :entPerfEmp")
    , @NamedQuery(name = "Dentid.findByEntAnoEsti", query = "SELECT d FROM Dentid d WHERE d.entAnoEsti = :entAnoEsti")
    , @NamedQuery(name = "Dentid.findByEntMesEsti", query = "SELECT d FROM Dentid d WHERE d.entMesEsti = :entMesEsti")
    , @NamedQuery(name = "Dentid.findByEnUtExpImp", query = "SELECT d FROM Dentid d WHERE d.enUtExpImp = :enUtExpImp")
    , @NamedQuery(name = "Dentid.findByEntPerQoM", query = "SELECT d FROM Dentid d WHERE d.entPerQoM = :entPerQoM")
    , @NamedQuery(name = "Dentid.findByEntHayS5", query = "SELECT d FROM Dentid d WHERE d.entHayS5 = :entHayS5")
    , @NamedQuery(name = "Dentid.findByEntVac9y8", query = "SELECT d FROM Dentid d WHERE d.entVac9y8 = :entVac9y8")
    , @NamedQuery(name = "Dentid.findByEntHrsVacF", query = "SELECT d FROM Dentid d WHERE d.entHrsVacF = :entHrsVacF")
    , @NamedQuery(name = "Dentid.findByEntHrsModi", query = "SELECT d FROM Dentid d WHERE d.entHrsModi = :entHrsModi")
    , @NamedQuery(name = "Dentid.findByEntHrsModS", query = "SELECT d FROM Dentid d WHERE d.entHrsModS = :entHrsModS")
    , @NamedQuery(name = "Dentid.findByEstrNV1", query = "SELECT d FROM Dentid d WHERE d.estrNV1 = :estrNV1")
    , @NamedQuery(name = "Dentid.findByEstrNV2", query = "SELECT d FROM Dentid d WHERE d.estrNV2 = :estrNV2")
    , @NamedQuery(name = "Dentid.findByEntBDenDir", query = "SELECT d FROM Dentid d WHERE d.entBDenDir = :entBDenDir")
    , @NamedQuery(name = "Dentid.findByEntPgRstP4", query = "SELECT d FROM Dentid d WHERE d.entPgRstP4 = :entPgRstP4")
    , @NamedQuery(name = "Dentid.findByUltexpxml", query = "SELECT d FROM Dentid d WHERE d.ultexpxml = :ultexpxml")
    , @NamedQuery(name = "Dentid.findByEntNoCtvos", query = "SELECT d FROM Dentid d WHERE d.entNoCtvos = :entNoCtvos")
    , @NamedQuery(name = "Dentid.findByEntVacAnti", query = "SELECT d FROM Dentid d WHERE d.entVacAnti = :entVacAnti")
    , @NamedQuery(name = "Dentid.findByEntRepArea", query = "SELECT d FROM Dentid d WHERE d.entRepArea = :entRepArea")
    , @NamedQuery(name = "Dentid.findByEntDiasAvC", query = "SELECT d FROM Dentid d WHERE d.entDiasAvC = :entDiasAvC")
    , @NamedQuery(name = "Dentid.findByEntNomDRH", query = "SELECT d FROM Dentid d WHERE d.entNomDRH = :entNomDRH")
    , @NamedQuery(name = "Dentid.findByEntDRHNoId", query = "SELECT d FROM Dentid d WHERE d.entDRHNoId = :entDRHNoId")
    , @NamedQuery(name = "Dentid.findByEntNomDire", query = "SELECT d FROM Dentid d WHERE d.entNomDire = :entNomDire")
    , @NamedQuery(name = "Dentid.findByEntDirecNo", query = "SELECT d FROM Dentid d WHERE d.entDirecNo = :entDirecNo")
    , @NamedQuery(name = "Dentid.findByEntCarDRH", query = "SELECT d FROM Dentid d WHERE d.entCarDRH = :entCarDRH")
    , @NamedQuery(name = "Dentid.findByEntAnoMvto", query = "SELECT d FROM Dentid d WHERE d.entAnoMvto = :entAnoMvto")
    , @NamedQuery(name = "Dentid.findByEntUltMvto", query = "SELECT d FROM Dentid d WHERE d.entUltMvto = :entUltMvto")
    , @NamedQuery(name = "Dentid.findByEntTelefon", query = "SELECT d FROM Dentid d WHERE d.entTelefon = :entTelefon")
    , @NamedQuery(name = "Dentid.findByEntEstipMN", query = "SELECT d FROM Dentid d WHERE d.entEstipMN = :entEstipMN")
    , @NamedQuery(name = "Dentid.findByEntEstipCv", query = "SELECT d FROM Dentid d WHERE d.entEstipCv = :entEstipCv")
    , @NamedQuery(name = "Dentid.findByUltpagadic", query = "SELECT d FROM Dentid d WHERE d.ultpagadic = :ultpagadic")
    , @NamedQuery(name = "Dentid.findByEntXMLS5", query = "SELECT d FROM Dentid d WHERE d.entXMLS5 = :entXMLS5")
    , @NamedQuery(name = "Dentid.findByEntTarj2Cl", query = "SELECT d FROM Dentid d WHERE d.entTarj2Cl = :entTarj2Cl")
    , @NamedQuery(name = "Dentid.findByEntForzarJ", query = "SELECT d FROM Dentid d WHERE d.entForzarJ = :entForzarJ")
    , @NamedQuery(name = "Dentid.findByEntPermPos", query = "SELECT d FROM Dentid d WHERE d.entPermPos = :entPermPos")
    , @NamedQuery(name = "Dentid.findByEntlimDias", query = "SELECT d FROM Dentid d WHERE d.entlimDias = :entlimDias")
    , @NamedQuery(name = "Dentid.findByEntDiasAnt", query = "SELECT d FROM Dentid d WHERE d.entDiasAnt = :entDiasAnt")
    , @NamedQuery(name = "Dentid.findByEntDiasCad", query = "SELECT d FROM Dentid d WHERE d.entDiasCad = :entDiasCad")
    , @NamedQuery(name = "Dentid.findByEntCtrSeNo", query = "SELECT d FROM Dentid d WHERE d.entCtrSeNo = :entCtrSeNo")
    , @NamedQuery(name = "Dentid.findByEntLenCont", query = "SELECT d FROM Dentid d WHERE d.entLenCont = :entLenCont")
    , @NamedQuery(name = "Dentid.findByEntTodosJo", query = "SELECT d FROM Dentid d WHERE d.entTodosJo = :entTodosJo")})
public class Dentid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "EntCod")
    private String entCod;
    @Size(max = 100)
    @Column(name = "EntDir")
    private String entDir;
    @Column(name = "EntReloj")
    private Short entReloj;
    @Size(max = 15)
    @Column(name = "EntSolap")
    private String entSolap;
    @Size(max = 100)
    @Column(name = "EntFotos")
    private String entFotos;
    @Size(max = 100)
    @Column(name = "EntPlCont")
    private String entPlCont;
    @Size(max = 100)
    @Column(name = "EntPlSolap")
    private String entPlSolap;
    @Column(name = "EntCSolap")
    private Short entCSolap;
    @Column(name = "EntAvisos")
    private Short entAvisos;
    @Column(name = "EntAvCorr")
    private Short entAvCorr;
    @Size(max = 30)
    @Column(name = "EntNomDest")
    private String entNomDest;
    @Size(max = 30)
    @Column(name = "EntDirDest")
    private String entDirDest;
    @Size(max = 30)
    @Column(name = "EntSrvSMTP")
    private String entSrvSMTP;
    @Column(name = "EntSrvAuth")
    private Short entSrvAuth;
    @Size(max = 15)
    @Column(name = "EntUsrName")
    private String entUsrName;
    @Size(max = 15)
    @Column(name = "EntPassWrd")
    private String entPassWrd;
    @Column(name = "PresFecApe")
    @Temporal(TemporalType.TIMESTAMP)
    private Date presFecApe;
    @Column(name = "PresFecFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date presFecFin;
    @Column(name = "PresFecIni")
    @Temporal(TemporalType.TIMESTAMP)
    private Date presFecIni;
    @Column(name = "PresOpenTa")
    private Short presOpenTa;
    @Column(name = "PresCLAQue")
    private Short presCLAQue;
    @Column(name = "AtenFecIni")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atenFecIni;
    @Column(name = "AtenFecFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atenFecFin;
    @Column(name = "AtenRepIni")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atenRepIni;
    @Column(name = "AtenRepFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atenRepFin;
    @Size(max = 2)
    @Column(name = "AtenSelTip")
    private String atenSelTip;
    @Column(name = "AtenSelCom")
    private Short atenSelCom;
    @Column(name = "EntFEsp")
    private Short entFEsp;
    @Size(max = 10)
    @Column(name = "PresFecICh")
    private String presFecICh;
    @Size(max = 10)
    @Column(name = "PresFecFCh")
    private String presFecFCh;
    @Column(name = "DiasPermit")
    private Short diasPermit;
    @Column(name = "DiasPermAt")
    private Short diasPermAt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EntHrsFS")
    private BigDecimal entHrsFS;
    @Size(max = 20)
    @Column(name = "EntMiniste")
    private String entMiniste;
    @Column(name = "EntP2Rapid")
    private Short entP2Rapid;
    @Column(name = "Destfecini")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destfecini;
    @Column(name = "Destfecfin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destfecfin;
    @Column(name = "CanoAct")
    private Short canoAct;
    @Column(name = "CMesAct")
    private Short cMesAct;
    @Column(name = "EntDisabPe")
    private Short entDisabPe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EntHabAsiC")
    private short entHabAsiC;
    @Size(max = 50)
    @Column(name = "EntExpXML")
    private String entExpXML;
    @Size(max = 100)
    @Column(name = "EntExpUNE")
    private String entExpUNE;
    @Column(name = "EntCodUNE")
    private Short entCodUNE;
    @Column(name = "EntPerfEmp")
    private Short entPerfEmp;
    @Column(name = "EntAnoEsti")
    private Short entAnoEsti;
    @Column(name = "EntMesEsti")
    private Short entMesEsti;
    @Size(max = 70)
    @Column(name = "EnUtExpImp")
    private String enUtExpImp;
    @Column(name = "EntPerQoM")
    private Character entPerQoM;
    @Column(name = "EntHayS5")
    private Short entHayS5;
    @Column(name = "EntVac9y8")
    private Short entVac9y8;
    @Column(name = "EntHrsVacF")
    private Short entHrsVacF;
    @Column(name = "EntHrsModi")
    private Short entHrsModi;
    @Column(name = "EntHrsModS")
    private Short entHrsModS;
    @Column(name = "EstrNV1")
    private Short estrNV1;
    @Column(name = "EstrNV2")
    private Short estrNV2;
    @Column(name = "EntBDenDir")
    private Short entBDenDir;
    @Column(name = "EntPgRstP4")
    private Short entPgRstP4;
    @Column(name = "ultexpxml")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultexpxml;
    @Column(name = "EntNoCtvos")
    private Short entNoCtvos;
    @Column(name = "EntVacAnti")
    private Short entVacAnti;
    @Column(name = "EntRepArea")
    private Short entRepArea;
    @Column(name = "EntDiasAvC")
    private Short entDiasAvC;
    @Size(max = 55)
    @Column(name = "EntNomDRH")
    private String entNomDRH;
    @Size(max = 11)
    @Column(name = "EntDRHNoId")
    private String entDRHNoId;
    @Size(max = 55)
    @Column(name = "EntNomDire")
    private String entNomDire;
    @Size(max = 11)
    @Column(name = "EntDirecNo")
    private String entDirecNo;
    @Size(max = 50)
    @Column(name = "EntCarDRH")
    private String entCarDRH;
    @Column(name = "EntAnoMvto")
    private Short entAnoMvto;
    @Column(name = "EntUltMvto")
    private Short entUltMvto;
    @Size(max = 20)
    @Column(name = "EntTelefon")
    private String entTelefon;
    @Column(name = "EntEstipMN")
    private Short entEstipMN;
    @Column(name = "EntEstipCv")
    private BigDecimal entEstipCv;
    @Column(name = "Ultpagadic")
    private Short ultpagadic;
    @Size(max = 100)
    @Column(name = "EntXMLS5")
    private String entXMLS5;
    @Column(name = "EntTarj2Cl")
    private Short entTarj2Cl;
    @Column(name = "EntForzarJ")
    private Short entForzarJ;
    @Column(name = "EntPermPos")
    private Short entPermPos;
    @Column(name = "EntlimDias")
    private Short entlimDias;
    @Column(name = "EntDiasAnt")
    private Short entDiasAnt;
    @Column(name = "EntDiasCad")
    private Short entDiasCad;
    @Column(name = "EntCtrSeNo")
    private Short entCtrSeNo;
    @Column(name = "EntLenCont")
    private Short entLenCont;
    @Column(name = "EntTodosJo")
    private Short entTodosJo;
    @OneToMany(mappedBy = "entCod")
    private Collection<Estruc> estrucCollection;

    public Dentid() {
    }

    public Dentid(String entCod) {
        this.entCod = entCod;
    }

    public Dentid(String entCod, short entHabAsiC) {
        this.entCod = entCod;
        this.entHabAsiC = entHabAsiC;
    }

    public String getEntCod() {
        return entCod;
    }

    public void setEntCod(String entCod) {
        this.entCod = entCod;
    }

    public String getEntDir() {
        return entDir;
    }

    public void setEntDir(String entDir) {
        this.entDir = entDir;
    }

    public Short getEntReloj() {
        return entReloj;
    }

    public void setEntReloj(Short entReloj) {
        this.entReloj = entReloj;
    }

    public String getEntSolap() {
        return entSolap;
    }

    public void setEntSolap(String entSolap) {
        this.entSolap = entSolap;
    }

    public String getEntFotos() {
        return entFotos;
    }

    public void setEntFotos(String entFotos) {
        this.entFotos = entFotos;
    }

    public String getEntPlCont() {
        return entPlCont;
    }

    public void setEntPlCont(String entPlCont) {
        this.entPlCont = entPlCont;
    }

    public String getEntPlSolap() {
        return entPlSolap;
    }

    public void setEntPlSolap(String entPlSolap) {
        this.entPlSolap = entPlSolap;
    }

    public Short getEntCSolap() {
        return entCSolap;
    }

    public void setEntCSolap(Short entCSolap) {
        this.entCSolap = entCSolap;
    }

    public Short getEntAvisos() {
        return entAvisos;
    }

    public void setEntAvisos(Short entAvisos) {
        this.entAvisos = entAvisos;
    }

    public Short getEntAvCorr() {
        return entAvCorr;
    }

    public void setEntAvCorr(Short entAvCorr) {
        this.entAvCorr = entAvCorr;
    }

    public String getEntNomDest() {
        return entNomDest;
    }

    public void setEntNomDest(String entNomDest) {
        this.entNomDest = entNomDest;
    }

    public String getEntDirDest() {
        return entDirDest;
    }

    public void setEntDirDest(String entDirDest) {
        this.entDirDest = entDirDest;
    }

    public String getEntSrvSMTP() {
        return entSrvSMTP;
    }

    public void setEntSrvSMTP(String entSrvSMTP) {
        this.entSrvSMTP = entSrvSMTP;
    }

    public Short getEntSrvAuth() {
        return entSrvAuth;
    }

    public void setEntSrvAuth(Short entSrvAuth) {
        this.entSrvAuth = entSrvAuth;
    }

    public String getEntUsrName() {
        return entUsrName;
    }

    public void setEntUsrName(String entUsrName) {
        this.entUsrName = entUsrName;
    }

    public String getEntPassWrd() {
        return entPassWrd;
    }

    public void setEntPassWrd(String entPassWrd) {
        this.entPassWrd = entPassWrd;
    }

    public Date getPresFecApe() {
        return presFecApe;
    }

    public void setPresFecApe(Date presFecApe) {
        this.presFecApe = presFecApe;
    }

    public Date getPresFecFin() {
        return presFecFin;
    }

    public void setPresFecFin(Date presFecFin) {
        this.presFecFin = presFecFin;
    }

    public Date getPresFecIni() {
        return presFecIni;
    }

    public void setPresFecIni(Date presFecIni) {
        this.presFecIni = presFecIni;
    }

    public Short getPresOpenTa() {
        return presOpenTa;
    }

    public void setPresOpenTa(Short presOpenTa) {
        this.presOpenTa = presOpenTa;
    }

    public Short getPresCLAQue() {
        return presCLAQue;
    }

    public void setPresCLAQue(Short presCLAQue) {
        this.presCLAQue = presCLAQue;
    }

    public Date getAtenFecIni() {
        return atenFecIni;
    }

    public void setAtenFecIni(Date atenFecIni) {
        this.atenFecIni = atenFecIni;
    }

    public Date getAtenFecFin() {
        return atenFecFin;
    }

    public void setAtenFecFin(Date atenFecFin) {
        this.atenFecFin = atenFecFin;
    }

    public Date getAtenRepIni() {
        return atenRepIni;
    }

    public void setAtenRepIni(Date atenRepIni) {
        this.atenRepIni = atenRepIni;
    }

    public Date getAtenRepFin() {
        return atenRepFin;
    }

    public void setAtenRepFin(Date atenRepFin) {
        this.atenRepFin = atenRepFin;
    }

    public String getAtenSelTip() {
        return atenSelTip;
    }

    public void setAtenSelTip(String atenSelTip) {
        this.atenSelTip = atenSelTip;
    }

    public Short getAtenSelCom() {
        return atenSelCom;
    }

    public void setAtenSelCom(Short atenSelCom) {
        this.atenSelCom = atenSelCom;
    }

    public Short getEntFEsp() {
        return entFEsp;
    }

    public void setEntFEsp(Short entFEsp) {
        this.entFEsp = entFEsp;
    }

    public String getPresFecICh() {
        return presFecICh;
    }

    public void setPresFecICh(String presFecICh) {
        this.presFecICh = presFecICh;
    }

    public String getPresFecFCh() {
        return presFecFCh;
    }

    public void setPresFecFCh(String presFecFCh) {
        this.presFecFCh = presFecFCh;
    }

    public Short getDiasPermit() {
        return diasPermit;
    }

    public void setDiasPermit(Short diasPermit) {
        this.diasPermit = diasPermit;
    }

    public Short getDiasPermAt() {
        return diasPermAt;
    }

    public void setDiasPermAt(Short diasPermAt) {
        this.diasPermAt = diasPermAt;
    }

    public BigDecimal getEntHrsFS() {
        return entHrsFS;
    }

    public void setEntHrsFS(BigDecimal entHrsFS) {
        this.entHrsFS = entHrsFS;
    }

    public String getEntMiniste() {
        return entMiniste;
    }

    public void setEntMiniste(String entMiniste) {
        this.entMiniste = entMiniste;
    }

    public Short getEntP2Rapid() {
        return entP2Rapid;
    }

    public void setEntP2Rapid(Short entP2Rapid) {
        this.entP2Rapid = entP2Rapid;
    }

    public Date getDestfecini() {
        return destfecini;
    }

    public void setDestfecini(Date destfecini) {
        this.destfecini = destfecini;
    }

    public Date getDestfecfin() {
        return destfecfin;
    }

    public void setDestfecfin(Date destfecfin) {
        this.destfecfin = destfecfin;
    }

    public Short getCanoAct() {
        return canoAct;
    }

    public void setCanoAct(Short canoAct) {
        this.canoAct = canoAct;
    }

    public Short getCMesAct() {
        return cMesAct;
    }

    public void setCMesAct(Short cMesAct) {
        this.cMesAct = cMesAct;
    }

    public Short getEntDisabPe() {
        return entDisabPe;
    }

    public void setEntDisabPe(Short entDisabPe) {
        this.entDisabPe = entDisabPe;
    }

    public short getEntHabAsiC() {
        return entHabAsiC;
    }

    public void setEntHabAsiC(short entHabAsiC) {
        this.entHabAsiC = entHabAsiC;
    }

    public String getEntExpXML() {
        return entExpXML;
    }

    public void setEntExpXML(String entExpXML) {
        this.entExpXML = entExpXML;
    }

    public String getEntExpUNE() {
        return entExpUNE;
    }

    public void setEntExpUNE(String entExpUNE) {
        this.entExpUNE = entExpUNE;
    }

    public Short getEntCodUNE() {
        return entCodUNE;
    }

    public void setEntCodUNE(Short entCodUNE) {
        this.entCodUNE = entCodUNE;
    }

    public Short getEntPerfEmp() {
        return entPerfEmp;
    }

    public void setEntPerfEmp(Short entPerfEmp) {
        this.entPerfEmp = entPerfEmp;
    }

    public Short getEntAnoEsti() {
        return entAnoEsti;
    }

    public void setEntAnoEsti(Short entAnoEsti) {
        this.entAnoEsti = entAnoEsti;
    }

    public Short getEntMesEsti() {
        return entMesEsti;
    }

    public void setEntMesEsti(Short entMesEsti) {
        this.entMesEsti = entMesEsti;
    }

    public String getEnUtExpImp() {
        return enUtExpImp;
    }

    public void setEnUtExpImp(String enUtExpImp) {
        this.enUtExpImp = enUtExpImp;
    }

    public Character getEntPerQoM() {
        return entPerQoM;
    }

    public void setEntPerQoM(Character entPerQoM) {
        this.entPerQoM = entPerQoM;
    }

    public Short getEntHayS5() {
        return entHayS5;
    }

    public void setEntHayS5(Short entHayS5) {
        this.entHayS5 = entHayS5;
    }

    public Short getEntVac9y8() {
        return entVac9y8;
    }

    public void setEntVac9y8(Short entVac9y8) {
        this.entVac9y8 = entVac9y8;
    }

    public Short getEntHrsVacF() {
        return entHrsVacF;
    }

    public void setEntHrsVacF(Short entHrsVacF) {
        this.entHrsVacF = entHrsVacF;
    }

    public Short getEntHrsModi() {
        return entHrsModi;
    }

    public void setEntHrsModi(Short entHrsModi) {
        this.entHrsModi = entHrsModi;
    }

    public Short getEntHrsModS() {
        return entHrsModS;
    }

    public void setEntHrsModS(Short entHrsModS) {
        this.entHrsModS = entHrsModS;
    }

    public Short getEstrNV1() {
        return estrNV1;
    }

    public void setEstrNV1(Short estrNV1) {
        this.estrNV1 = estrNV1;
    }

    public Short getEstrNV2() {
        return estrNV2;
    }

    public void setEstrNV2(Short estrNV2) {
        this.estrNV2 = estrNV2;
    }

    public Short getEntBDenDir() {
        return entBDenDir;
    }

    public void setEntBDenDir(Short entBDenDir) {
        this.entBDenDir = entBDenDir;
    }

    public Short getEntPgRstP4() {
        return entPgRstP4;
    }

    public void setEntPgRstP4(Short entPgRstP4) {
        this.entPgRstP4 = entPgRstP4;
    }

    public Date getUltexpxml() {
        return ultexpxml;
    }

    public void setUltexpxml(Date ultexpxml) {
        this.ultexpxml = ultexpxml;
    }

    public Short getEntNoCtvos() {
        return entNoCtvos;
    }

    public void setEntNoCtvos(Short entNoCtvos) {
        this.entNoCtvos = entNoCtvos;
    }

    public Short getEntVacAnti() {
        return entVacAnti;
    }

    public void setEntVacAnti(Short entVacAnti) {
        this.entVacAnti = entVacAnti;
    }

    public Short getEntRepArea() {
        return entRepArea;
    }

    public void setEntRepArea(Short entRepArea) {
        this.entRepArea = entRepArea;
    }

    public Short getEntDiasAvC() {
        return entDiasAvC;
    }

    public void setEntDiasAvC(Short entDiasAvC) {
        this.entDiasAvC = entDiasAvC;
    }

    public String getEntNomDRH() {
        return entNomDRH;
    }

    public void setEntNomDRH(String entNomDRH) {
        this.entNomDRH = entNomDRH;
    }

    public String getEntDRHNoId() {
        return entDRHNoId;
    }

    public void setEntDRHNoId(String entDRHNoId) {
        this.entDRHNoId = entDRHNoId;
    }

    public String getEntNomDire() {
        return entNomDire;
    }

    public void setEntNomDire(String entNomDire) {
        this.entNomDire = entNomDire;
    }

    public String getEntDirecNo() {
        return entDirecNo;
    }

    public void setEntDirecNo(String entDirecNo) {
        this.entDirecNo = entDirecNo;
    }

    public String getEntCarDRH() {
        return entCarDRH;
    }

    public void setEntCarDRH(String entCarDRH) {
        this.entCarDRH = entCarDRH;
    }

    public Short getEntAnoMvto() {
        return entAnoMvto;
    }

    public void setEntAnoMvto(Short entAnoMvto) {
        this.entAnoMvto = entAnoMvto;
    }

    public Short getEntUltMvto() {
        return entUltMvto;
    }

    public void setEntUltMvto(Short entUltMvto) {
        this.entUltMvto = entUltMvto;
    }

    public String getEntTelefon() {
        return entTelefon;
    }

    public void setEntTelefon(String entTelefon) {
        this.entTelefon = entTelefon;
    }

    public Short getEntEstipMN() {
        return entEstipMN;
    }

    public void setEntEstipMN(Short entEstipMN) {
        this.entEstipMN = entEstipMN;
    }

    public BigDecimal getEntEstipCv() {
        return entEstipCv;
    }

    public void setEntEstipCv(BigDecimal entEstipCv) {
        this.entEstipCv = entEstipCv;
    }

    public Short getUltpagadic() {
        return ultpagadic;
    }

    public void setUltpagadic(Short ultpagadic) {
        this.ultpagadic = ultpagadic;
    }

    public String getEntXMLS5() {
        return entXMLS5;
    }

    public void setEntXMLS5(String entXMLS5) {
        this.entXMLS5 = entXMLS5;
    }

    public Short getEntTarj2Cl() {
        return entTarj2Cl;
    }

    public void setEntTarj2Cl(Short entTarj2Cl) {
        this.entTarj2Cl = entTarj2Cl;
    }

    public Short getEntForzarJ() {
        return entForzarJ;
    }

    public void setEntForzarJ(Short entForzarJ) {
        this.entForzarJ = entForzarJ;
    }

    public Short getEntPermPos() {
        return entPermPos;
    }

    public void setEntPermPos(Short entPermPos) {
        this.entPermPos = entPermPos;
    }

    public Short getEntlimDias() {
        return entlimDias;
    }

    public void setEntlimDias(Short entlimDias) {
        this.entlimDias = entlimDias;
    }

    public Short getEntDiasAnt() {
        return entDiasAnt;
    }

    public void setEntDiasAnt(Short entDiasAnt) {
        this.entDiasAnt = entDiasAnt;
    }

    public Short getEntDiasCad() {
        return entDiasCad;
    }

    public void setEntDiasCad(Short entDiasCad) {
        this.entDiasCad = entDiasCad;
    }

    public Short getEntCtrSeNo() {
        return entCtrSeNo;
    }

    public void setEntCtrSeNo(Short entCtrSeNo) {
        this.entCtrSeNo = entCtrSeNo;
    }

    public Short getEntLenCont() {
        return entLenCont;
    }

    public void setEntLenCont(Short entLenCont) {
        this.entLenCont = entLenCont;
    }

    public Short getEntTodosJo() {
        return entTodosJo;
    }

    public void setEntTodosJo(Short entTodosJo) {
        this.entTodosJo = entTodosJo;
    }

    @XmlTransient
    public Collection<Estruc> getEstrucCollection() {
        return estrucCollection;
    }

    public void setEstrucCollection(Collection<Estruc> estrucCollection) {
        this.estrucCollection = estrucCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entCod != null ? entCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dentid)) {
            return false;
        }
        Dentid other = (Dentid) object;
        if ((this.entCod == null && other.entCod != null) || (this.entCod != null && !this.entCod.equals(other.entCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Dentid[ entCod=" + entCod + " ]";
    }
    
}
