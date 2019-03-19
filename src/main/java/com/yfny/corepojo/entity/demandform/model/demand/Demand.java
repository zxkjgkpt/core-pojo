package com.yfny.corepojo.entity.demandform.model.demand;



import com.yfny.corepojo.entity.demandform.model.Xqdxx;
import com.yfny.corepojo.entity.demandform.model.Ywyxx;
import com.yfny.corepojo.entity.demandform.model.Yyyxx;

import java.util.List;

public class Demand extends Xqdxx {
	
	private List<Ywyxx> ywList;
	private List<Yyyxx> yyList;
	
	
	public void setYwList(List<Ywyxx> list)
	{
		this.ywList = list;
	}
	public List<Yyyxx> getYyList() {
		return yyList;
	}
	public void setYyList(List<Yyyxx> yyList) {
		this.yyList = yyList;
	}
	public List<Ywyxx> getYwList() {
		return ywList;
	}
	
}
