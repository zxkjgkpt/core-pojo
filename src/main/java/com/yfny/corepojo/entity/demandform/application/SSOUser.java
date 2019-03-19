package com.yfny.corepojo.entity.demandform.application;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;

public class SSOUser implements Serializable {
	private static final long serialVersionUID = -1236603497545689179L;


	private String name;
	private String ip;
	private String tgt;
	private Date logintime;
	private String deploytype;
	private String password;
	private String orgid;
	private String account;
	private String userid;
	private String ticket;
	private String signCode;
	private String miKey;
	private String userAccount;
	private String realPassword;





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTgt() {
		return tgt;
	}

	public void setTgt(String tgt) {
		this.tgt = tgt;
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getDeploytype() {
		return deploytype;
	}

	public void setDeploytype(String deploytype) {
		this.deploytype = deploytype;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getMiKey() {
		return miKey;
	}

	public void setMiKey(String miKey) {
		this.miKey = miKey;
	}

	public String getSignCode() {
		return signCode;
	}

	public void setSignCode(String signCode) {
		this.signCode = signCode;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getRealPassword() {
		return realPassword;
	}

	public void setRealPassword(String realPassword) {
		this.realPassword = realPassword;
	}



	public LoginType loginType(){
		if(StringUtils.isNotBlank(signCode) && StringUtils.isNotBlank(miKey)){
			return LoginType.pki;
		}else if(StringUtils.isNotBlank(userAccount) && StringUtils.isNotBlank(realPassword)){
			return LoginType.password;
		}
		return null;
	}
}
