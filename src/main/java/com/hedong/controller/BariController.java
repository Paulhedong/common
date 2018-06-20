package com.hedong.controller;

import com.hedong.service.bari.BariService;
import com.hedong.annotation.TargetDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2018-06-15 14:20
 * @desc
 **/
@Controller
public class BariController {

    @Autowired
    private BariService bariService;

    @GetMapping(value = "/bari")
    @TargetDataSource("bari")
    public String getLast30DaysWalletCount(Model model){
        List<Map<String, Integer>> last30DaysWalletCount = bariService.getLast30DaysWalletCount();
        model.addAttribute("walletList", last30DaysWalletCount);
        model.addAttribute("totalWallet", bariService.getWalletNum());
        model.addAttribute("totalWalletUser", bariService.getUserNumHasWallet());
        model.addAttribute("tokenWallent", bariService.getWallentCountGroupByToken());
        return "bari_wallet";
    }

}
