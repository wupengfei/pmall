package edu.bjtu.sse.entity;

import edu.bjtu.sse.anno.FieldName;
import org.junit.Test;

/**
 * ClassName:Student
 * Description:
 * Package:edu.bjtu.sse.entity
 *
 * @Date: 2020/5/6 22:23
 * @Author: wupengfei@bjtu.edu.cn
 */
public class Student {

    @FieldName(value = "姓名",length = 12)
    private String name;

    @FieldName(value = "年龄",length = 2)
    private int age;

    @FieldName(value = "性别",length = 12)
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Test
    public void test(){

    }
}
