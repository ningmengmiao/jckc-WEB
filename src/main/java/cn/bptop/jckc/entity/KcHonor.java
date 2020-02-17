package cn.bptop.jckc.entity;

import java.io.Serializable;

/**
 * (KcHonor)实体类
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
public class KcHonor implements Serializable
{
    private static final long serialVersionUID = -72759712680993122L;
    /**
     * 荣誉Id
     */
    private Integer hHonorId;
    /**
     * 荣誉名称
     */
    private String hHonorName;
    /**
     * 荣誉等级
     */
    private String hHonorLevel;
    /**
     * 荣誉分类
     */
    private String hHonorType;

    public Integer getHHonorId()
    {
        return hHonorId;
    }

    public void setHHonorId(Integer hHonorId)
    {
        this.hHonorId = hHonorId;
    }

    public String getHHonorName()
    {
        return hHonorName;
    }

    public void setHHonorName(String hHonorName)
    {
        this.hHonorName = hHonorName;
    }

    public String getHHonorLevel()
    {
        return hHonorLevel;
    }

    public void setHHonorLevel(String hHonorLevel)
    {
        this.hHonorLevel = hHonorLevel;
    }

    public String getHHonorType()
    {
        return hHonorType;
    }

    public void setHHonorType(String hHonorType)
    {
        this.hHonorType = hHonorType;
    }
}