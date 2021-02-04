package com.ysi.bim.web;

import com.ysi.bim.model.Notice;
import com.ysi.bim.service.BimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BimController {
    @Autowired
    private BimService bimService;

    @GetMapping("/bim/notice/list")
    @ResponseBody
    public Notice noticeList(@RequestParam("page.number") int number, @RequestParam("page.size") int size) {
        return bimService.getNotice(number, size).getBody();
    }
}