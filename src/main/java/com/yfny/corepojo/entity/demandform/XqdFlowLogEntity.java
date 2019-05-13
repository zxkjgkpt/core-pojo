package com.yfny.corepojo.entity.demandform;

import com.yfny.utilscommon.basemvc.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 需求单操作记录Entity
 * Author auto
 * Date  2019-05-08
 */
@Table(name = "imp_flow_log")
public class XqdFlowLogEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "DH")
    private String dh;

    @Column(name = "LX")
    private short lx;

    @Column(name = "GDZT")
    private String gdzt;

    @Column(name = "KSSJ")
    private String kssj;

    @Column(name = "JSSJ")
    private String jssj;

    @Column(name = "CLRID")
    private String clrid;

    @Column(name = "CLRMC")
    private String clrmc;

    @Column(name = "RZJL")
    private String rzjl;

    @Column(name = "ZFYY")
    private String zfyy;


    public XqdFlowLogEntity(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public short getLx() {
        return lx;
    }

    public void setLx(short lx) {
        this.lx = lx;
    }

    public String getGdzt() {
        return gdzt;
    }

    public void setGdzt(String gdzt) {
        this.gdzt = gdzt;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }

    public String getClrid() {
        return clrid;
    }

    public void setClrid(String clrid) {
        this.clrid = clrid;
    }

    public String getClrmc() {
        return clrmc;
    }

    public void setClrmc(String clrmc) {
        this.clrmc = clrmc;
    }

    public String getRzjl() {
        return rzjl;
    }

    public void setRzjl(String rzjl) {
        this.rzjl = rzjl;
    }

    public String getZfyy() {
        return zfyy;
    }

    public void setZfyy(String zfyy) {
        this.zfyy = zfyy;
    }

    /**************************************此下为非数据库字段属性**************************************/
}
