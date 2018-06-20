package com.hedong.service.firenze;

import com.hedong.BootApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IouStatisticServiceImplTest extends BootApplicationTests {

    @Autowired
    private IouStatisticService iouStatisticService;

    @Test
    public void getTotalIouNum() {
        iouStatisticService.getTotalIouNum();
    }
}