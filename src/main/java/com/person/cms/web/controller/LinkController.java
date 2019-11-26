package com.person.cms.web.controller;

import com.person.cms.bean.Link;
import com.person.cms.service.ILinkService;
import com.person.cms.util.Message;
import com.person.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/link")
@Api(description  = "链接管理")
public class LinkController {

    @Autowired
    private ILinkService linkService;

    @PostMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link) {
        linkService.saveOrUpdateLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/deleteById")
    @ApiOperation("根据id删除链接")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message deleteLink(int id) {
        linkService.deleteLink(id);
        return MessageUtil.success();
    }

    @GetMapping("/queryById")
    @ApiOperation("根据id查询数据")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message<Link> queryById(int id) {
        Link link = linkService.findById(id);
        return  MessageUtil.success(link);
    }

    @PostMapping("/update")
    @ApiOperation("修改链接")
    public Message update(Link link) {
        linkService.saveOrUpdateLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/findAll")
    @ApiOperation("查询所有链接")
    public Message<List<Link>> findAll() {
        List<Link> list = linkService.findAll();
        return MessageUtil.success(list);
    }
}
