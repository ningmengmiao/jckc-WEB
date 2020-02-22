package cn.bptop.jckc.controller;

import cn.bptop.jckc.entity.KcUser;
import cn.bptop.jckc.service.UserService;
import cn.bptop.jckc.until.Ding;
import cn.bptop.jckc.until.Json;
import com.taobao.api.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    UserService userService;

    /**
     * 钉钉免登陆
     *
     * @param code 用户免登授权码
     * @return:
     * @time: 2020/2/21 17:02
     */
    @ResponseBody
    @RequestMapping("/ddLogin")
    public String ddLogin(String code) throws ApiException
    {
        String ddUserId = Ding.getDdUserId(code);
        KcUser kcUser = new KcUser();
        kcUser.setUDdid(ddUserId);
        return Json.toJson(userService.isUser(kcUser));
    }
}
