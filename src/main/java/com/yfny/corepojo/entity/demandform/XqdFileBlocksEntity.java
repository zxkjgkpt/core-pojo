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
 * Date  2019-04-16
 */
@Table(name = "imp_xqd_fileblocks")
public class XqdFileBlocksEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "BLOCK_ID")
    private String blockId;

    @Column(name = "FILE_MD5")
    private String fileMd5;

    @Column(name = "BLOCK_NO")
    private BigDecimal blockNo;

    @Column(name = "BLOCK_MD5")
    private String blockMd5;

    @Column(name = "BLOCK_STATUS")
    private BigDecimal blockStatus;

    @Column(name = "BLOCK_SIZE")
    private Double blockSize;

    @Column(name = "MODIF_DATE")
    private Date modifDate;

    @Column(name = "PATH")
    private String path;

    @Column(name = "COLUMN_9")
    private String column9;

    @Column(name = "COLUMN_10")
    private String column10;

    @Column(name = "COLUMN_11")
    private String column11;


    public XqdFileBlocksEntity(){
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public BigDecimal getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(BigDecimal blockNo) {
        this.blockNo = blockNo;
    }

    public String getBlockMd5() {
        return blockMd5;
    }

    public void setBlockMd5(String blockMd5) {
        this.blockMd5 = blockMd5;
    }

    public BigDecimal getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(BigDecimal blockStatus) {
        this.blockStatus = blockStatus;
    }

    public Double getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Double blockSize) {
        this.blockSize = blockSize;
    }

    public Date getModifDate() {
        return modifDate;
    }

    public void setModifDate(Date modifDate) {
        this.modifDate = modifDate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getColumn9() {
        return column9;
    }

    public void setColumn9(String column9) {
        this.column9 = column9;
    }

    public String getColumn10() {
        return column10;
    }

    public void setColumn10(String column10) {
        this.column10 = column10;
    }

    public String getColumn11() {
        return column11;
    }

    public void setColumn11(String column11) {
        this.column11 = column11;
    }

    /**************************************此下为非数据库字段属性**************************************/
}
