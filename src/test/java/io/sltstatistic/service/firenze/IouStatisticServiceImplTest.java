package io.sltstatistic.service.firenze;

import io.sltstatistic.BootApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IouStatisticServiceImplTest extends BootApplicationTests {

    @Autowired
    private IouStatisticService iouStatisticService;

    @Test
    public void getTotalIouNum() {
        iouStatisticService.getTotalIouNum();
    }
}