package com.yfny.corepojo.entity.demandform.model.xtgl;



import com.yfny.corepojo.entity.demandform.model.Jsxx;
import com.yfny.corepojo.entity.demandform.model.Xtgn;

import java.util.List;

public class JsxxExp extends Jsxx {
	private List<Xtgn> gnList;
	
	public JsxxExp(){
		super();
	}
	
	public JsxxExp(Jsxx jsxx){
		this.setJsbs(jsxx.getJsbs());
		this.setJsmc(jsxx.getJsmc());
	}

	public List<Xtgn> getGnList() {
		return gnList;
	}

	public void setGnList(List<Xtgn> gnList) {
		this.gnList = gnList;
	}
	
	
}
