package com.yfny.corepojo.entity.demandform;

import com.yfny.corepojo.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * 需求单业务域详情Entity
 * Author auto
 * Date  2019-04-04
 */
@Table(name = "imp_xqd_ywyxx")
public class YwyxxEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "YWYBS")
    private String ywybs;

    @Column(name = "XQDH")
    private String xqdh;

    @Column(name = "SSYWY")
    private String ssywy;

    @Column(name = "SSYWFL")
    private String ssywfl;

    @Column(name = "SSYWMC")
    private String ssywmc;

    @Column(name = "SSYWMS")
    private String ssywms;

    @Column(name = "SSYWGFCL")
    private String ssywgfcl;

    @Column(name = "YWLCMC")
    private String ywlcmc;

    @Column(name = "YWLCMS")
    private String ywlcms;

    @Column(name = "YWLCGFCL")
    private String ywlcgfcl;

    @Column(name = "LCJDMC")
    private String lcjdmc;

    @Column(name = "LCJDMS")
    private String lcjdms;

    @Column(name = "LCJDGFCL")
    private String lcjdgfcl;


    public YwyxxEntity(){
    }

    public String getYwybs() {
        return ywybs;
    }

    public void setYwybs(String ywybs) {
        this.ywybs = ywybs;
    }

    public String getXqdh() {
        return xqdh;
    }

    public void setXqdh(String xqdh) {
        this.xqdh = xqdh;
    }

    public String getSsywy() {
        return ssywy;
    }

    public void setSsywy(String ssywy) {
        this.ssywy = ssywy;
    }

    public String getSsywfl() {
        return ssywfl;
    }

    public void setSsywfl(String ssywfl) {
        this.ssywfl = ssywfl;
    }

    public String getSsywmc() {
        return ssywmc;
    }

    public void setSsywmc(String ssywmc) {
        this.ssywmc = ssywmc;
    }

    public String getSsywms() {
        return ssywms;
    }

    public void setSsywms(String ssywms) {
        this.ssywms = ssywms;
    }

    public String getSsywgfcl() {
        return ssywgfcl;
    }

    public void setSsywgfcl(String ssywgfcl) {
        this.ssywgfcl = ssywgfcl;
    }

    public String getYwlcmc() {
        return ywlcmc;
    }

    public void setYwlcmc(String ywlcmc) {
        this.ywlcmc = ywlcmc;
    }

    public String getYwlcms() {
        return ywlcms;
    }

    public void setYwlcms(String ywlcms) {
        this.ywlcms = ywlcms;
    }

    public String getYwlcgfcl() {
        return ywlcgfcl;
    }

    public void setYwlcgfcl(String ywlcgfcl) {
        this.ywlcgfcl = ywlcgfcl;
    }

    public String getLcjdmc() {
        return lcjdmc;
    }

    public void setLcjdmc(String lcjdmc) {
        this.lcjdmc = lcjdmc;
    }

    public String getLcjdms() {
        return lcjdms;
    }

    public void setLcjdms(String lcjdms) {
        this.lcjdms = lcjdms;
    }

    public String getLcjdgfcl() {
        return lcjdgfcl;
    }

    public void setLcjdgfcl(String lcjdgfcl) {
        this.lcjdgfcl = lcjdgfcl;
    }

    /**************************************此下为非数据库字段属性**************************************/
}
