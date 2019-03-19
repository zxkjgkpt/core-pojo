package com.yfny.corepojo.entity.demandform.model.login;


import com.yfny.corepojo.entity.demandform.model.Xtgn;

import java.util.List;

public class XtgnExp extends Xtgn {
	List<XtgnExp> children;
	Boolean selected;
	String icon2;// 图标鼠标悬停图片改造

	public String getIcon2() {
		return icon2;
	}

	public void setIcon2(String icon2) {
		this.icon2 = icon2;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public List<XtgnExp> getChildren() {
		return children;
	}

	public void setChildren(List<XtgnExp> children) {
		this.children = children;
	}
	
	public XtgnExp(){
		super();
	}

	public XtgnExp(Xtgn xtgn){
		selected=false;
		this.setFjd(xtgn.getFjd());
		this.setGnbs(xtgn.getGnbs());
		this.setGnmc(xtgn.getGnmc());
		this.setGnurl(xtgn.getGnurl());
		this.setIcon(xtgn.getIcon());
	}
}
