package cn.bptop.jckc.entity;

import java.io.Serializable;

/**
 * (KcFile)实体类
 *
 * @author makejava
 * @since 2020-02-23 11:14:08
 */
public class File implements Serializable
{
    private static final long serialVersionUID = 259935127314565498L;
    /**
     * 文件id
     */
    private Integer fFileId;
    /**
     * 文件名
     */
    private String fName;
    /**
     * 文件地址
     */
    private String fAddress;
    /**
     * 相关文章id
     */
    private Integer aArticleId;
    /**
     * 文件类型
     */
    private String fType;

    public Integer getFFileId()
    {
        return fFileId;
    }

    public void setFFileId(Integer fFileId)
    {
        this.fFileId = fFileId;
    }

    public String getFName()
    {
        return fName;
    }

    public void setFName(String fName)
    {
        this.fName = fName;
    }

    public String getFAddress()
    {
        return fAddress;
    }

    public void setFAddress(String fAddress)
    {
        this.fAddress = fAddress;
    }

    public Integer getAArticleId()
    {
        return aArticleId;
    }

    public void setAArticleId(Integer aArticleId)
    {
        this.aArticleId = aArticleId;
    }

    public String getFType()
    {
        return fType;
    }

    public void setFType(String fType)
    {
        this.fType = fType;
    }
}