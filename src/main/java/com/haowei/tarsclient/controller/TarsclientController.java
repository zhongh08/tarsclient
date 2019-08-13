package com.haowei.tarsclient.controller;

import com.haowei.tarsclient.client.testapp.HelloPrx;
import com.haowei.tarsclient.client.testapp.TestPrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarsclientController {

    @RequestMapping("/hello")
    public String hello(int no, String name) throws Exception {
        CommunicatorConfig cfg = CommunicatorConfig.load("src/main/resources/TestApp.Tarstest.config.conf");

        //构建通信器
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        //通过通信器，生成代理对象
        HelloPrx proxy = communicator.stringToProxy(HelloPrx.class, "TestApp.tarstest.HelloObj");
        String ret = proxy.hello(1000, "HelloWorld");
        System.out.println(ret);

        return ret;
    }

    @RequestMapping("/test")
    public String test(String name) throws Exception {
        CommunicatorConfig cfg = CommunicatorConfig.load("src/main/resources/TestApp.Tarstest.config.conf");

        //构建通信器
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        //通过通信器，生成代理对象
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, "TestApp.tarstest.TestObj");
        String ret = proxy.test(name);
        System.out.println(ret);

        return ret;
    }

}
