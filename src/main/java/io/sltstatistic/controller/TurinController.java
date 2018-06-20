package io.sltstatistic.controller;

import io.sltstatistic.annotation.TargetDataSource;
import io.sltstatistic.service.turin.TurinStatisticService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * @className: TrurinController
 * @description:
 * @author: hedong@ibeesaas.com
 * @date: 2018-06-08 19:11
 **/
@Controller
@RequestMapping("/turin")
public class TurinController {

    @Resource
    private TurinStatisticService turinStatisticService;

    @GetMapping
    @TargetDataSource("turin")
    public String get(Model model) {
        int userCount = turinStatisticService.getUserCount();
        model.addAttribute("totalUserCount", userCount);
        String totalHoneyCount = turinStatisticService.getTotalHoneyCount();
        model.addAttribute("totalHoneyCount", totalHoneyCount);
        List<Map<String, Object>> honeyRankList = turinStatisticService.getHoneyRankList();
        model.addAttribute("honeyRank", honeyRankList);
        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedString = localDate.format(formatter);
        int newUserCount = turinStatisticService.getNewUserCount(formattedString + " 00:00:00", formattedString + " 23:59:59");
        model.addAttribute("todayRegist", newUserCount);
        int dailyUserCount = turinStatisticService.getDailyUserCount(formattedString + " 00:00:00", formattedString + " 23:59:59");
        model.addAttribute("todayActive", dailyUserCount);
        return "turin_game";
    }
}
