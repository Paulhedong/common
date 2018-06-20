package com.hedong.controller;

import com.hedong.service.firenze.IouStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2017-12-28 15:49
 * @desc 测试用控制器
 **/
@Controller
public class FirenzeController {

    @Autowired
    private IouStatisticService iouStatisticService;

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/firenze")
    public String getRealNameUserNum(Model model) {
        model.addAllAttributes(iouStatisticService.getTotalIouNum());
        model.addAttribute("realName", iouStatisticService.getRealNameUserNum());
        Map<String, Object> sltNum = iouStatisticService.getSltNum();
        model.addAttribute("sltNum", sltNum.get("sltList"));
        model.addAttribute("sltTotalCount", sltNum.get("totalSlt"));
        model.addAttribute("top30User", iouStatisticService.getIouUserOrderBySlt());
        Map<String, Object> recieveMoney = iouStatisticService.getRecieveMoney();
        model.addAttribute("income", recieveMoney.get("list"));
        model.addAttribute("totalAmount", recieveMoney.get("totalAmount"));
        return "firenze_iou";
    }


}
