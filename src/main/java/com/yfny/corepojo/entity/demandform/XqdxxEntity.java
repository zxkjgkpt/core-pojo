package com.yfny.corepojo.entity.demandform;

import com.yfny.corepojo.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * 需求单详情Entity
 * Author auto
 * Date  2019-04-04
 */
@Table(name = "imp_xqd_xqdxx")
public class XqdxxEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "XQDH")
    private String xqdh;

    @Column(name = "SQBMMC")
    private String sqbmmc;

    @Column(name = "TCSJ")
    private String tcsj;

    @Column(name = "XQMC")
    private String xqmc;

    @Column(name = "SQRXM")
    private String sqrxm;

    @Column(name = "SQRLXFS")
    private String sqrlxfs;

    @Column(name = "SQRYX")
    private String sqryx;

    @Column(name = "XQFL")
    private String xqfl;

    @Column(name = "QWWCSJ")
    private String qwwcsj;

    @Column(name = "CJRID")
    private String cjrid;

    @Column(name = "CJSJ")
    private String cjsj;

    @Column(name = "SHRID")
    private String shrid;

    @Column(name = "SHR")
    private String dshr;

    @Column(name = "SHYJ")
    private String shyj;

    @Column(name = "SHSJ")
    private String shsj;

    @Column(name = "GDZT")
    private String gdzt;

    @Column(name = "TJSJ")
    private String tjsj;

    @Column(name = "XQZS")
    private String xqzs;

    @Column(name = "ZZID")
    private String zzid;

    @Column(name = "BMJB")
    private String bmjb;

    @Column(name = "WJSHQR")
    private String wjshqr;

    @Column(name = "SSHRID")
    private String sshrid;

    @Column(name = "SSHR")
    private String sshr;

    @Column(name = "SSHYJ")
    private String sshyj;

    @Column(name = "SSHSJ")
    private String sshsj;

    @Column(name = "WSHRID")
    private String wshrid;

    @Column(name = "WSHR")
    private String wshr;

    @Column(name = "WSHYJ")
    private String wshyj;

    @Column(name = "WSHSJ")
    private String wshsj;

    @Column(name = "ZYLB")
    private String zylb;

    @Column(name = "SHTLSJ")
    private Long shtlsj;

    @Column(name = "SJSHQR")
    private String sjshqr;

    @Column(name = "TASK_ID")
    private String taskId;


    public XqdxxEntity(){
    }

    public String getXqdh() {
        return xqdh;
    }

    public void setXqdh(String xqdh) {
        this.xqdh = xqdh;
    }

    public String getSqbmmc() {
        return sqbmmc;
    }

    public void setSqbmmc(String sqbmmc) {
        this.sqbmmc = sqbmmc;
    }

    public String getTcsj() {
        return tcsj;
    }

    public void setTcsj(String tcsj) {
        this.tcsj = tcsj;
    }

    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc;
    }

    public String getSqrxm() {
        return sqrxm;
    }

    public void setSqrxm(String sqrxm) {
        this.sqrxm = sqrxm;
    }

    public String getSqrlxfs() {
        return sqrlxfs;
    }

    public void setSqrlxfs(String sqrlxfs) {
        this.sqrlxfs = sqrlxfs;
    }

    public String getSqryx() {
        return sqryx;
    }

    public void setSqryx(String sqryx) {
        this.sqryx = sqryx;
    }

    public String getXqfl() {
        return xqfl;
    }

    public void setXqfl(String xqfl) {
        this.xqfl = xqfl;
    }

    public String getQwwcsj() {
        return qwwcsj;
    }

    public void setQwwcsj(String qwwcsj) {
        this.qwwcsj = qwwcsj;
    }

    public String getCjrid() {
        return cjrid;
    }

    public void setCjrid(String cjrid) {
        this.cjrid = cjrid;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getShrid() {
        return shrid;
    }

    public void setShrid(String shrid) {
        this.shrid = shrid;
    }

    public String getDshr() {
        return dshr;
    }

    public void setDshr(String dshr) {
        this.dshr = dshr;
    }

    public String getShyj() {
        return shyj;
    }

    public void setShyj(String shyj) {
        this.shyj = shyj;
    }

    public String getShsj() {
        return shsj;
    }

    public void setShsj(String shsj) {
        this.shsj = shsj;
    }

    public String getGdzt() {
        return gdzt;
    }

    public void setGdzt(String gdzt) {
        this.gdzt = gdzt;
    }

    public String getTjsj() {
        return tjsj;
    }

    public void setTjsj(String tjsj) {
        this.tjsj = tjsj;
    }

    public String getXqzs() {
        return xqzs;
    }

    public void setXqzs(String xqzs) {
        this.xqzs = xqzs;
    }

    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid;
    }

    public String getBmjb() {
        return bmjb;
    }

    public void setBmjb(String bmjb) {
        this.bmjb = bmjb;
    }

    public String getWjshqr() {
        return wjshqr;
    }

    public void setWjshqr(String wjshqr) {
        this.wjshqr = wjshqr;
    }

    public String getSshrid() {
        return sshrid;
    }

    public void setSshrid(String sshrid) {
        this.sshrid = sshrid;
    }

    public String getSshr() {
        return sshr;
    }

    public void setSshr(String sshr) {
        this.sshr = sshr;
    }

    public String getSshyj() {
        return sshyj;
    }

    public void setSshyj(String sshyj) {
        this.sshyj = sshyj;
    }

    public String getSshsj() {
        return sshsj;
    }

    public void setSshsj(String sshsj) {
        this.sshsj = sshsj;
    }

    public String getWshrid() {
        return wshrid;
    }

    public void setWshrid(String wshrid) {
        this.wshrid = wshrid;
    }

    public String getWshr() {
        return wshr;
    }

    public void setWshr(String wshr) {
        this.wshr = wshr;
    }

    public String getWshyj() {
        return wshyj;
    }

    public void setWshyj(String wshyj) {
        this.wshyj = wshyj;
    }

    public String getWshsj() {
        return wshsj;
    }

    public void setWshsj(String wshsj) {
        this.wshsj = wshsj;
    }

    public String getZylb() {
        return zylb;
    }

    public void setZylb(String zylb) {
        this.zylb = zylb;
    }

    public Long getShtlsj() {
        return shtlsj;
    }

    public void setShtlsj(Long shtlsj) {
        this.shtlsj = shtlsj;
    }

    public String getSjshqr() {
        return sjshqr;
    }

    public void setSjshqr(String sjshqr) {
        this.sjshqr = sjshqr;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**************************************此下为非数据库字段属性**************************************/

    @Transient
    private List<YwyxxEntity> ywyxxList;


    @Transient
    private List<YyyxxEntity> yyyxxList;

    public List<YwyxxEntity> getYwyxxList() {
        return ywyxxList;
    }

    public void setYwyxxList(List<YwyxxEntity> ywyxxList) {
        this.ywyxxList = ywyxxList;
    }

    public List<YyyxxEntity> getYyyxxList() {
        return yyyxxList;
    }

    public void setYyyxxList(List<YyyxxEntity> yyyxxList) {
        this.yyyxxList = yyyxxList;
    }

}
