package sizhe.chen.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: sizhe.chen
 * @Date: Create in 8:48 下午 2021/2/14
 * @Description:
 * @Modified:
 * @Version:
 */
@Component
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }
}
