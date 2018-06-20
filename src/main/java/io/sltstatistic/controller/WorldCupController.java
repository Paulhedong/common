package io.sltstatistic.controller;

import io.sltstatistic.annotation.TargetDataSource;
import io.sltstatistic.service.turin.WorldCupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhaozhihong
 * @create 2018-06-15 16:28
 * @desc 世界杯活动
 **/
@Controller
public class WorldCupController {

    @Autowired
    private WorldCupService worldCupService;

    @GetMapping(value = "/world-cup")
    @TargetDataSource("turin")
    public String getWorldCupStatistic(Model model){
        model.addAttribute("countryRank",worldCupService.getBetCountryRank());
        model.addAttribute("betCount", worldCupService.getWorldCupBetCount());
        return "world_cup_bet";
    }

}
