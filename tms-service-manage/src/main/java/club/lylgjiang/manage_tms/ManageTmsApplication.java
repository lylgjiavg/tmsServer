package club.lylgjiang.manage_tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname ManageCmsApplication
 * @Description cms 微服务 启动类
 * @Date 2020/1/28 16:29
 * @Created by 姜立成
 */
@SpringBootApplication
// @EntityScan("club.lylgjiang.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages={"club.lylgjiang.api"})//扫描接口
// @ComponentScan(basePackages = {"club.lylgjiang.framework"})//扫描common模块
@ComponentScan(basePackages={"club.lylgjiang.manage_tms"})//扫描本项目下的所有类
public class ManageTmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageTmsApplication.class, args);
    }

}
