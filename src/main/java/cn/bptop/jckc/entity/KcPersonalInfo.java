package cn.bptop.jckc.entity;

import java.io.Serializable;

/**
 * (KcPersonalInfo)实体类
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
public class KcPersonalInfo implements Serializable
{
    private static final long serialVersionUID = -49767065376752591L;

    private Integer piId;

    private Integer uUserId;
    /**
     * 出生日期
     */
    private String piBirthday;
    /**
     * 性别
     */
    private String piSex;
    /**
     * 民族
     */
    private String piNation;
    /**
     * 政治面貌
     */
    private String piPoliticsStatus;
    /**
     * 籍贯
     */
    private String piBirthplace;
    /**
     * 是否农业户口  1农业 0非农
     */
    private String piIsagricultural;
    /**
     * 现住址
     */
    private String piAddress;
    /**
     * 紧急联系人
     */
    private String piContacts;
    /**
     * 身份证号
     */
    private String piIdCardNo;
    /**
     * 专业
     */
    private String piSpecialty;
    /**
     * 第一学历
     */
    private String piFristEducation;
    /**
     * 其他学历
     */
    private String piOtherEducation;
    /**
     * 毕业学校
     */
    private String piSchooltag;
    /**
     * 毕业时间
     */
    private String piGraduationDate;
    /**
     * 工种
     */
    private String piWorkType;
    /**
     * 工装尺码
     */
    private String piClothesSize;
    /**
     * 工装鞋码
     */
    private String piShoesSize;
    /**
     * 徒弟
     */
    private String piPrentice;
    /**
     * 证书
     */
    private String piCredentials;
    /**
     * 荣誉
     */
    private String piHonor;
    /**
     * 论文
     */
    private String piPaper;
    /**
     * 备用
     */
    private String piExtattr1;
    /**
     * 备用
     */
    private String piExtattr2;
    /**
     * 备用
     */
    private String piExtattr3;

    public Integer getPiId()
    {
        return piId;
    }

    public void setPiId(Integer piId)
    {
        this.piId = piId;
    }

    public Integer getUUserId()
    {
        return uUserId;
    }

    public void setUUserId(Integer uUserId)
    {
        this.uUserId = uUserId;
    }

    public String getPiBirthday()
    {
        return piBirthday;
    }

    public void setPiBirthday(String piBirthday)
    {
        this.piBirthday = piBirthday;
    }

    public String getPiSex()
    {
        return piSex;
    }

    public void setPiSex(String piSex)
    {
        this.piSex = piSex;
    }

    public String getPiNation()
    {
        return piNation;
    }

    public void setPiNation(String piNation)
    {
        this.piNation = piNation;
    }

    public String getPiPoliticsStatus()
    {
        return piPoliticsStatus;
    }

    public void setPiPoliticsStatus(String piPoliticsStatus)
    {
        this.piPoliticsStatus = piPoliticsStatus;
    }

    public String getPiBirthplace()
    {
        return piBirthplace;
    }

    public void setPiBirthplace(String piBirthplace)
    {
        this.piBirthplace = piBirthplace;
    }

    public String getPiIsagricultural()
    {
        return piIsagricultural;
    }

    public void setPiIsagricultural(String piIsagricultural)
    {
        this.piIsagricultural = piIsagricultural;
    }

    public String getPiAddress()
    {
        return piAddress;
    }

    public void setPiAddress(String piAddress)
    {
        this.piAddress = piAddress;
    }

    public String getPiContacts()
    {
        return piContacts;
    }

    public void setPiContacts(String piContacts)
    {
        this.piContacts = piContacts;
    }

    public String getPiIdCardNo()
    {
        return piIdCardNo;
    }

    public void setPiIdCardNo(String piIdCardNo)
    {
        this.piIdCardNo = piIdCardNo;
    }

    public String getPiSpecialty()
    {
        return piSpecialty;
    }

    public void setPiSpecialty(String piSpecialty)
    {
        this.piSpecialty = piSpecialty;
    }

    public String getPiFristEducation()
    {
        return piFristEducation;
    }

    public void setPiFristEducation(String piFristEducation)
    {
        this.piFristEducation = piFristEducation;
    }

    public String getPiOtherEducation()
    {
        return piOtherEducation;
    }

    public void setPiOtherEducation(String piOtherEducation)
    {
        this.piOtherEducation = piOtherEducation;
    }

    public String getPiSchooltag()
    {
        return piSchooltag;
    }

    public void setPiSchooltag(String piSchooltag)
    {
        this.piSchooltag = piSchooltag;
    }

    public String getPiGraduationDate()
    {
        return piGraduationDate;
    }

    public void setPiGraduationDate(String piGraduationDate)
    {
        this.piGraduationDate = piGraduationDate;
    }

    public String getPiWorkType()
    {
        return piWorkType;
    }

    public void setPiWorkType(String piWorkType)
    {
        this.piWorkType = piWorkType;
    }

    public String getPiClothesSize()
    {
        return piClothesSize;
    }

    public void setPiClothesSize(String piClothesSize)
    {
        this.piClothesSize = piClothesSize;
    }

    public String getPiShoesSize()
    {
        return piShoesSize;
    }

    public void setPiShoesSize(String piShoesSize)
    {
        this.piShoesSize = piShoesSize;
    }

    public String getPiPrentice()
    {
        return piPrentice;
    }

    public void setPiPrentice(String piPrentice)
    {
        this.piPrentice = piPrentice;
    }

    public String getPiCredentials()
    {
        return piCredentials;
    }

    public void setPiCredentials(String piCredentials)
    {
        this.piCredentials = piCredentials;
    }

    public String getPiHonor()
    {
        return piHonor;
    }

    public void setPiHonor(String piHonor)
    {
        this.piHonor = piHonor;
    }

    public String getPiPaper()
    {
        return piPaper;
    }

    public void setPiPaper(String piPaper)
    {
        this.piPaper = piPaper;
    }

    public String getPiExtattr1()
    {
        return piExtattr1;
    }

    public void setPiExtattr1(String piExtattr1)
    {
        this.piExtattr1 = piExtattr1;
    }

    public String getPiExtattr2()
    {
        return piExtattr2;
    }

    public void setPiExtattr2(String piExtattr2)
    {
        this.piExtattr2 = piExtattr2;
    }

    public String getPiExtattr3()
    {
        return piExtattr3;
    }

    public void setPiExtattr3(String piExtattr3)
    {
        this.piExtattr3 = piExtattr3;
    }
}