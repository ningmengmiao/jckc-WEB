package cn.bptop.jckc.entity;

import java.io.Serializable;

/**
 * (KcUser)实体类
 *
 * @author makejava
 * @since 2020-02-20 10:40:55
 */
public class KcUser implements Serializable
{
    private static final long serialVersionUID = -28623071865271374L;

    private Integer userId;

    public KcUser()
    {
        super();
        this.uFn = "";
        this.uDdid = "";
        this.uName = "";
        this.uMobile = "";
        this.uPassword = "";
        this.uEmail = "";
        this.uStartWork = "";
        this.uAvatar = "";
        this.uNote = "";
        this.uExtattr1 = "";
    }

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
     * 密码
     */
    private String uPassword;
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

    public String getUPassword()
    {
        return uPassword;
    }

    public void setUPassword(String uPassword)
    {
        this.uPassword = uPassword;
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