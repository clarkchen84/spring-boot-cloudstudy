package sizhe.chen.factory;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;
import java.util.Properties;

/**
 * @Author: sizhe.chen
 * @Date: Create in 11:43 下午 2021/2/14
 * @Description:
 * @Modified:
 * @Version:
 */

public class YmlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        yamlPropertiesFactoryBean.setResources(resource.getResource());
        yamlPropertiesFactoryBean.afterPropertiesSet();
        Properties object = yamlPropertiesFactoryBean.getObject();
        return  new PropertiesPropertySource(resource.getResource().getFilename(), object);

    }
}
