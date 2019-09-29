package com.viponetech.test;

import com.viponetech.Main;
import com.viponetech.mappers.FirmMapper;
import com.viponetech.util.Result;
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

    @org.junit.Test
    public void test(){

        new Result();
    }
}
