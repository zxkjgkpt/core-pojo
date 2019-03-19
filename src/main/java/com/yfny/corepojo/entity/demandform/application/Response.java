package com.yfny.corepojo.entity.demandform.application;

import java.math.BigDecimal;


public class Response {

	private String action;
    private String fileId;
    private String fileMd5;
    private BigDecimal blockSize;
    private BigDecimal blockNo;
 
    public Response(String action, String fileId, String fileMd5, BigDecimal blockSize, BigDecimal blockNo) {
        this.action = action;
    	this.fileId = fileId;
        this.fileMd5 = fileMd5;
        this.blockSize = blockSize;
        this.blockNo = blockNo;
    }
    
    public Response() {
	    super();
	}
	
    public String getAction() {
    	return action;
    }
    
    public void setAction(String action) {
    	this.action = action == null ? null : action.trim();
    }

	public String getFileId() {
	    return fileId;
	}
	
	public void setFileId(String fileId) {
	    this.fileId = fileId == null ? null : fileId.trim();
	}

	public String getFileMd5() {
	    return fileMd5;
	}

	public void setFileMd5(String fileMd5) {
	    this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
	}
	
	public BigDecimal getBlockSize() {
	    return blockSize;
	}
	
	public void setBlockSize(BigDecimal blockSize) {
	    this.blockSize = blockSize;
	}

	public BigDecimal getBlockNo() {
	    return blockNo;
	}

	public void setBlockNo(BigDecimal blockNo) {
	    this.blockNo = blockNo;
	}
	
	
}
