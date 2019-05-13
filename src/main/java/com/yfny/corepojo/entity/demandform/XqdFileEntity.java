package com.yfny.corepojo.entity.demandform;

import com.yfny.utilscommon.basemvc.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * 需求单附件Entity
 * Author auto
 * Date  2019-04-10
 */
@Table(name = "imp_xqd_files")
public class XqdFileEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "FILE_ID")
    private String fileId;

    @Column(name = "FILE_MD5")
    private String fileMd5;

    @Column(name = "BLOCK_NUM")
    private BigDecimal blockNum;

    @Column(name = "BLOCK_NO")
    private BigDecimal blockNo;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "FILE_SIZE")
    private Double fileSize;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "GROUP_ID")
    private String groupId;

    @Column(name = "PATH")
    private String path;

    @Column(name = "MODIF_DATE")
    private Date modifDate;

    @Column(name = "FILE_STATE")
    private BigDecimal fileState;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "APPLICATION")
    private BigDecimal application;

    @Column(name = "FILE_ALIAS")
    private String fileAlias;

    @Column(name = "COLUMN_17")
    private String column17;

    @Column(name = "COLUMN_18")
    private String column18;


    public XqdFileEntity(){
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public BigDecimal getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(BigDecimal blockNum) {
        this.blockNum = blockNum;
    }

    public BigDecimal getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(BigDecimal blockNo) {
        this.blockNo = blockNo;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getModifDate() {
        return modifDate;
    }

    public void setModifDate(Date modifDate) {
        this.modifDate = modifDate;
    }

    public BigDecimal getFileState() {
        return fileState;
    }

    public void setFileState(BigDecimal fileState) {
        this.fileState = fileState;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getApplication() {
        return application;
    }

    public void setApplication(BigDecimal application) {
        this.application = application;
    }

    public String getFileAlias() {
        return fileAlias;
    }

    public void setFileAlias(String fileAlias) {
        this.fileAlias = fileAlias;
    }

    public String getColumn17() {
        return column17;
    }

    public void setColumn17(String column17) {
        this.column17 = column17;
    }

    public String getColumn18() {
        return column18;
    }

    public void setColumn18(String column18) {
        this.column18 = column18;
    }

    /**************************************此下为非数据库字段属性**************************************/
}
