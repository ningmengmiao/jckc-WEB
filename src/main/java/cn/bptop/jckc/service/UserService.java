package cn.bptop.jckc.service;

import cn.bptop.jckc.dao.KcPersonalInfoDao;
import cn.bptop.jckc.dao.KcUserDao;
import cn.bptop.jckc.entity.KcPersonalInfo;
import cn.bptop.jckc.entity.KcUser;
import cn.bptop.jckc.until.Ding;
import com.dingtalk.api.response.OapiUserGetResponse;
import com.taobao.api.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    KcUserDao kcUserDao;
    @Autowired
    KcPersonalInfoDao kcPersonalInfoDao;

    /**
     * 通过钉钉免登查询用户是否存在,有返回用户信息,无新建后返回
     *
     * @param user 用户实体类
     * @return: 用户信息VO类
     * @time: 2020/2/22 15:36
     */
    public cn.bptop.jckc.entity.UserPersonalVO isUser(KcUser user) throws ApiException
    {
        List<KcUser> users = kcUserDao.queryAll(user);
        if (users.size() == 0)
        {
            OapiUserGetResponse ddUser = Ding.getDdUser(user.getUDdid());
            if (ddUser.getEmail() != null && ddUser.getEmail() != "")
            {
                user.setUEmail(ddUser.getEmail());
            }
            if (ddUser.getJobnumber() != null && ddUser.getJobnumber() != "")
            {
                user.setUFn(ddUser.getJobnumber());
            }
            if (ddUser.getMobile() != null && ddUser.getMobile() != "")
            {
                user.setUMobile(ddUser.getMobile());
            }
            if (ddUser.getName() != null && ddUser.getName() != "")
            {
                user.setUName(ddUser.getName());
            }
            if (ddUser.getHiredDate() != null)
            {
                user.setUStartWork(ddUser.getHiredDate().toString());
            }
            Integer userId = kcUserDao.insert(user);
            KcPersonalInfo kcPersonalInfo = new KcPersonalInfo();
            kcPersonalInfo.setUUserId(userId);
            kcPersonalInfoDao.insert(kcPersonalInfo);
            return kcUserDao.queryUserPersonalById(userId);
        }
        else
        {
            return kcUserDao.queryUserPersonalById(users.get(0).getUserId());
        }
    }
}
