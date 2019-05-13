package com.yfny.corepojo.entity.demandform;

import com.yfny.utilscommon.basemvc.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 需求单应用域详情Entity
 * Author auto
 * Date  2019-04-09
 */
@Table(name = "imp_xqd_yyyxx")
public class YyyxxEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "YYYBS")
    private String yyybs;

    @Column(name = "XQDH")
    private String xqdh;

    @Column(name = "YYY")
    private String yyy;

    @Column(name = "YY")
    private String yy;

    @Column(name = "YYMKMC")
    private String yymkmc;

    @Column(name = "YYMKMS")
    private String yymkms;

    @Column(name = "YYGNMC")
    private String yygnmc;

    @Column(name = "YYGDMS")
    private String yygdms;

    @Column(name = "FGNXQ")
    private String fgnxq;


    public YyyxxEntity(){
    }

    public String getYyybs() {
        return yyybs;
    }

    public void setYyybs(String yyybs) {
        this.yyybs = yyybs;
    }

    public String getXqdh() {
        return xqdh;
    }

    public void setXqdh(String xqdh) {
        this.xqdh = xqdh;
    }

    public String getYyy() {
        return yyy;
    }

    public void setYyy(String yyy) {
        this.yyy = yyy;
    }

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy;
    }

    public String getYymkmc() {
        return yymkmc;
    }

    public void setYymkmc(String yymkmc) {
        this.yymkmc = yymkmc;
    }

    public String getYymkms() {
        return yymkms;
    }

    public void setYymkms(String yymkms) {
        this.yymkms = yymkms;
    }

    public String getYygnmc() {
        return yygnmc;
    }

    public void setYygnmc(String yygnmc) {
        this.yygnmc = yygnmc;
    }

    public String getYygdms() {
        return yygdms;
    }

    public void setYygdms(String yygdms) {
        this.yygdms = yygdms;
    }

    public String getFgnxq() {
        return fgnxq;
    }

    public void setFgnxq(String fgnxq) {
        this.fgnxq = fgnxq;
    }

    /**************************************此下为非数据库字段属性**************************************/
}
