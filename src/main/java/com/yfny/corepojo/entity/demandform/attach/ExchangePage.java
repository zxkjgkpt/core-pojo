package com.yfny.corepojo.entity.demandform.attach;

import com.duan.attach.response.Response;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.net.URLDecoder;

public class ExchangePage {

	
	private String action;
	private int respv;
	private EnumUploadMode mode;
	private int cloumn;

	private FileInfo fileInfo;
	private FileBlockInfo blockInfo;


	public ExchangePage(JSONObject json) throws Exception {
		//
		super();
		if ( json != null && !json.isEmpty() ) {
			String head = json.getString("head");
			this.action = head.split(":")[0];
			this.respv = Integer.parseInt(head.split(":")[1]);
			this.mode = EnumUploadMode.ERRUpload;

			FileInfo f = new FileInfo();
			f.setFileId(json.getString("fileId"));
			f.setFileMd5(json.getString("fileMd5"));
			f.setBlockSize(new BigDecimal(json.getString("blockSize")));
			f.setBlockNo(new BigDecimal(json.getString("blockNo")));
			f.setBlockNum(new BigDecimal(json.getString("blockNum")));
			f.setFileName(URLDecoder.decode(URLDecoder.decode(json.getString("fileName")),"UTF-8"));
			f.setFileType(json.getString("fileType"));
			f.setFileSize(Double.parseDouble(json.getString("fileSize")));
			f.setUserId(json.getString("userId"));
			f.setGroupId(json.getString("groupId"));
			f.setPath(json.getString("path"));
//			f.setVersion(json.getString("version"));
			f.setDescription(json.getString("desc"));
//			f.setApplication(json.getString("application"));

			FileBlockInfo b = new FileBlockInfo();
			b.setBlockId(json.getString("blockId"));
			b.setFileMd5(json.getString("fileMd5"));
			b.setBlockNo(new BigDecimal(json.getString("blockNo")));
			b.setBlockMd5(json.getString("blockMd5"));
			b.setBlockSize(Double.parseDouble(json.getString("blockSize")));

			this.fileInfo = f;
			this.blockInfo = b;
		}
	}


    public String getAction() {
    	return action;
    }

    public void setAction(String action) {
    	this.action = action == null ? null : action.trim();
    }

    public int getRespv() {
    	return respv;
    }

    public void setRespv(int respv) {
    	this.respv = respv;
    }

    public int getCloumn() {
    	return cloumn;
    }

    public void setCloumn(int cloumn) {
    	this.cloumn = cloumn;
    }

    public EnumUploadMode getMode() {
    	return mode;
    }
    
    public void setMode(EnumUploadMode mode) {
    	this.mode = mode;
    }
    
    public FileInfo getFileInfo() {
    	return fileInfo;
    }
    
    public void setFileInfo(FileInfo fileInfo) {
    	this.fileInfo = fileInfo;
    }
    
    public FileBlockInfo getFileBlockInfo() {
    	return blockInfo;
    }
    
    public void setFileBlockInfo(FileBlockInfo blockInfo) {
    	this.blockInfo = blockInfo;
    }
    
    
	public void combineFileInfo(FileInfo fileInfo)
	{		
		FileInfo f = this.getFileInfo();
		f.setBlockSize(fileInfo.getBlockSize());
		f.setBlockNo(fileInfo.getBlockNo());
		f.setBlockNum(fileInfo.getBlockNum());
		f.setFileState(fileInfo.getFileState());
		this.setFileInfo(f);
	}
    
    public JSONObject toJson() {
    	FileInfo info = this.fileInfo;
    	Response response = new Response();	
    	response.setAction(this.action + ":" + this.respv);
    	response.setFileId(info.getFileId());
    	response.setFileMd5(info.getFileMd5());
    	response.setBlockNo(info.getBlockNo());
    	response.setBlockSize(info.getBlockSize());
    	return JSONObject.fromObject(response);
    }
}
