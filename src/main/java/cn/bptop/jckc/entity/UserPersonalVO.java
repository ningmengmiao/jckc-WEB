package cn.bptop.jckc.entity;

public class UserPersonalVO
{
    private KcUser kcUser;
    private KcPersonalInfo kcPersonalInfo;

    public KcUser getKcUser()
    {
        return kcUser;
    }

    public void setKcUser(KcUser kcUser)
    {
        this.kcUser = kcUser;
    }

    public KcPersonalInfo getKcPersonalInfo()
    {
        return kcPersonalInfo;
    }

    public void setKcPersonalInfo(KcPersonalInfo kcPersonalInfo)
    {
        this.kcPersonalInfo = kcPersonalInfo;
    }
}
