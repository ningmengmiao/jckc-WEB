package cn.bptop.jckc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JCKCApplication
{
    public static final String SERVICEURL = "bptop.vaiwan.com";

    public static void main(String[] args)
    {
        SpringApplication.run(JCKCApplication.class, args);
    }
}
