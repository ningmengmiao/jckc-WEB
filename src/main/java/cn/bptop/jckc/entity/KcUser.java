package cn.bptop.jckc.entity;

import java.io.Serializable;

/**
 * (KcUser)实体类
 *
 * @author makejava
 * @since 2020-02-17 15:58:40
 */
public class KcUser implements Serializable
{
    private static final long serialVersionUID = 852623374887729725L;

    private Integer userId;
    /**
     * 档案号
     */
    private String uFn;
    /**
     * 钉钉id
     */
    private String uDdid;
    /**
     * 姓名
     */
    private String uName;
    /**
     * 手机号
     */
    private String uMobile;
    /**
     * 邮箱
     */
    private String uEmail;
    /**
     * 开始工作时间
     */
    private String uStartWork;
    /**
     * 头像URL
     */
    private String uAvatar;
    /**
     * 备注
     */
    private String uNote;
    /**
     * 备用
     */
    private String uExtattr1;

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUFn()
    {
        return uFn;
    }

    public void setUFn(String uFn)
    {
        this.uFn = uFn;
    }

    public String getUDdid()
    {
        return uDdid;
    }

    public void setUDdid(String uDdid)
    {
        this.uDdid = uDdid;
    }

    public String getUName()
    {
        return uName;
    }

    public void setUName(String uName)
    {
        this.uName = uName;
    }

    public String getUMobile()
    {
        return uMobile;
    }

    public void setUMobile(String uMobile)
    {
        this.uMobile = uMobile;
    }

    public String getUEmail()
    {
        return uEmail;
    }

    public void setUEmail(String uEmail)
    {
        this.uEmail = uEmail;
    }

    public String getUStartWork()
    {
        return uStartWork;
    }

    public void setUStartWork(String uStartWork)
    {
        this.uStartWork = uStartWork;
    }

    public String getUAvatar()
    {
        return uAvatar;
    }

    public void setUAvatar(String uAvatar)
    {
        this.uAvatar = uAvatar;
    }

    public String getUNote()
    {
        return uNote;
    }

    public void setUNote(String uNote)
    {
        this.uNote = uNote;
    }

    public String getUExtattr1()
    {
        return uExtattr1;
    }

    public void setUExtattr1(String uExtattr1)
    {
        this.uExtattr1 = uExtattr1;
    }
}