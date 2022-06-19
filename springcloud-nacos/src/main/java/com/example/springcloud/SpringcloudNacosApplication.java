package com.example.springcloud;

import com.example.springcloud.test.Building;
import com.example.springcloud.test.Observer;
import com.example.springcloud.test.Subject;
import com.example.springcloud.test.Yourself;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.example.*")
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.example.springcloud.mapper"})
public class SpringcloudNacosApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(SpringcloudNacosApplication.class, args);
//    }
    public static void main(String[] args) {
        Subject subject = new Building();

        Observer ye1 = new Yourself("张三");
        Observer ye2 = new Yourself("李四");
        Observer ye3 = new Yourself("王五");

        subject.reg(ye1);
        subject.reg(ye2);
        subject.reg(ye3);
        subject.unreg(ye2);

        subject.sendmessage("楼盘房价降低了");
    }
}
