package cn.bptop.jckc.controller;

import cn.bptop.jckc.service.ArticleService;
import cn.bptop.jckc.until.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController
{
    @Autowired
    ArticleService articleService;

    @ResponseBody
    @RequestMapping("/articleList")
    public String articleList()
    {
        List list = new ArrayList();
        list.add(0, articleService.wipeContent(articleService.queryAllbyType("车间文件", 0, 5)));
        list.add(1, articleService.wipeContent(articleService.queryAllbyType("车间要闻", 0, 5)));
        list.add(2, articleService.wipeContent(articleService.queryAllbyType("通知通告", 0, 5)));
        list.add(3, articleService.wipeContent(articleService.queryAllbyType("信息简报", 0, 5)));
        list.add(4, articleService.wipeContent(articleService.queryAllbyType("热点新闻", 0, 5)));
        return Json.toJson(list);
    }
}
