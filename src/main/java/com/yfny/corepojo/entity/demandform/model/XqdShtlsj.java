package com.yfny.corepojo.entity.demandform.model;

/**
 * Created by jinboYu on 2018/12/5
 * 需求单审核停留时间类
 **/
public class XqdShtlsj {

    //部门ID
    private String bmid;

    //部门名称
    private String bmmc;

    //审核停留时间
    private long shtlsj;


    public String getBmid() {
        return bmid;
    }

    public void setBmid(String bmid) {
        this.bmid = bmid;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    public long getShtlsj() {
        return shtlsj;
    }

    public void setShtlsj(long shtlsj) {
        this.shtlsj = shtlsj;
    }

    public XqdShtlsj(String bmid, String bmmc, long shtlsj) {
        this.bmid = bmid;
        this.bmmc = bmmc;
        this.shtlsj = shtlsj;
    }

    public XqdShtlsj() {
    }
}
