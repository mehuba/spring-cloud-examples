package com.example.servicehi;

import com.example.serviceribbon.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Config.class})
public class ServiceRibbonApplicationTests {

    @Test
    public void contextLoads() {
    }

}
