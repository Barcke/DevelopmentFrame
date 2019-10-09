package com.viponetech.test;

import com.viponetech.Main;
import com.viponetech.mappers.FirmMapper;
import com.viponetech.service.FirmService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ProjectName developmentFrame
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 14:23
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class,Test.class})
public class Test {

    @Autowired
    @SuppressWarnings("all")
    private FirmMapper firmMapper;

    @Autowired
    private FirmService firmService;

    @org.junit.Test
    public void test(){
        Long i=1L;
        firmService.selectById(i);
        System.out.println();
    }
}
