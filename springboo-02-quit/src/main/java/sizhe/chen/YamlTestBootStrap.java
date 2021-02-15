package sizhe.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;
import sizhe.chen.converter.StringToDateConverter;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: sizhe.chen
 * @Date: Create in 8:26 下午 2021/2/14
 * @Description:
 * @Modified:
 * @Version:
 */
@SpringBootApplication
public class YamlTestBootStrap {
    public static void main(String[] args) {

        SpringApplication.run(YamlTestBootStrap.class,args);
    }


//    @Bean
//    public ConversionServiceFactoryBean conversionService(StringToDateConverter converter){
//        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
//
//        Set<Converter> converters = new HashSet<>();
//
//        converters.add(converter);
//
//        bean.setConverters(converters);
//        return bean;
//    }
}
