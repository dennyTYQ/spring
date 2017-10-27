package com.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


@Configuration
@ComponentScan("com.springel")
@PropertySource("classpath:test.properties")
public class ELConfig {
    @Value("I love You")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private  String osName;

    @Value("#{ T(java.lang.Math).random()*100.0}")
    private  double randomNumber;

    @Value("#{demoService.annother}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testurl;

    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment environment;
    @Bean
    public  static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }
  public  void outputSource(){

        try {


        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        System.out.println(IOUtils.toString(testFile.getInputStream()));
        System.out.println(IOUtils.toString(testurl.getInputStream()));
        System.out.println(bookName);
        System.out.println(environment.getProperty("book.author"));

        }catch (Exception e )
        {
            e.printStackTrace();
        }        }
}
