package sizhe.chen.bean;

/**
 * @Author: sizhe.chen
 * @Date: Create in 8:06 下午 2021/2/14
 * @Description:
 * @Modified:
 * @Version:
 */

public class Dog {
    private String name;
    private String age;

    @Override
    public String  toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
