package com.yfny.corepojo.entity.demandform.model.demand;

import com.yfny.corepojo.entity.demandform.model.Xqdxx;
import com.yfny.corepojo.entity.demandform.model.Ywyxx;
import com.yfny.corepojo.entity.demandform.model.Yyyxx;

import java.util.Date;
import java.util.List;

public class XqdxxExp extends Xqdxx {
	List<Ywyxx> ywyList;
	List<Yyyxx> yyyList;
	Long shtlsj;
	String cjrmc;
	String fjbz;
	String cxbz;
	String zylb;
	Long shjd;
	String zfyy;//作废原因
	int pagerownum;
	int pagerowid;
	Date startTime;//为了防止接收后会少一天所以用Date接收 用String查询
	Date endTime;
	String beginDate;//开始日期
	String endDate;//结束日期
	String[] xqdhArray; //需求单号数组
	List<String> gdzts;

	public List<String> getGdzts() {
		return gdzts;
	}

	public void setGdzts(List<String> gdzts) {
		this.gdzts = gdzts;
	}

	public String[] getXqdhArray() {
		return xqdhArray;
	}

	public void setXqdhArray(String[] xqdhArray) {
		this.xqdhArray = xqdhArray;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if (beginDate != null) {
			if (beginDate.isEmpty()) {
				this.beginDate = null;
			}
		}
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if (endDate != null) {
			if (endDate.isEmpty()) {
				this.endDate = null;
			}
		}
	}

	public String getCjrmc() {
		return cjrmc;
	}

	public void setCjrmc(String cjrmc) {
		this.cjrmc = cjrmc;
	}

	public String getFjbz() {
		return fjbz;
	}

	public void setFjbz(String fjbz) {
		this.fjbz = fjbz;
	}

	public String getCxbz() {
		return cxbz;
	}

	public void setCxbz(String cxbz) {
		this.cxbz = cxbz;
	}

	public int getPagerownum() {
		return pagerownum;
	}

	public void setPagerownum(int pagerownum) {
		this.pagerownum = pagerownum;
	}

	public int getPagerowid() {
		return pagerowid;
	}

	public void setPagerowid(int pagerowid) {
		this.pagerowid = pagerowid;
	}

	@Override
	public String getZylb() {
		return zylb;
	}

	@Override
	public void setZylb(String zylb) {
		this.zylb = zylb;
	}

	public XqdxxExp(){
		super();
	}

	public XqdxxExp(Xqdxx xqd){
		this.setCjrid(xqd.getCjrid());
		this.setCjsj(xqd.getCjsj());
		this.setGdzt(xqd.getGdzt());
		this.setQwwcsj(xqd.getQwwcsj());
		this.setShr(xqd.getShr());
		this.setShrid(xqd.getShrid());
		this.setShsj(xqd.getShsj());
		this.setShyj(xqd.getShyj());
		this.setSqbmmc(xqd.getSqbmmc());
		this.setSqrlxfs(xqd.getSqrlxfs());
		this.setSqrxm(xqd.getSqrxm());
		this.setSqryx(xqd.getSqryx());
		this.setTcsj(xqd.getTcsj());
		this.setTjsj(xqd.getTjsj());
		this.setXqdh(xqd.getXqdh());
		this.setXqfl(xqd.getXqfl());
		this.setXqmc(xqd.getXqmc());
		this.setXqzs(xqd.getXqzs());
		this.setBmjb(xqd.getBmjb());
		this.setSshrid(xqd.getSshrid());
		this.setWshrid(xqd.getWshrid());
		this.setWjshqr(xqd.getWjshqr());
		this.setWshr(xqd.getWshr());
		this.setZylb(xqd.getZylb());
	}

	public Long getShtlsj() {
		return shtlsj;
	}
	public void setShtlsj(Long shtlsj) {
		this.shtlsj = shtlsj;
	}
	public List<Ywyxx> getYwyList() {
		return ywyList;
	}
	public void setYwyList(List<Ywyxx> ywyList) {
		this.ywyList = ywyList;
	}
	public List<Yyyxx> getYyyList() {
		return yyyList;
	}
	public void setYyyList(List<Yyyxx> yyyList) {
		this.yyyList = yyyList;
	}


	public Long getShjd() {
		return shjd;
	}

	public void setShjd(Long shjd) {
		this.shjd = shjd;
	}

	public String getZfyy() {
		return zfyy;
	}

	public void setZfyy(String zfyy) {
		this.zfyy = zfyy;
	}
}
