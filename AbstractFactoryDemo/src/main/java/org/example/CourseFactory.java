package org.example;

/**
 * 定义一个虚拟工厂，具体继承子类为真实工厂，制造对应一族的产品<BR/>
 * 抽象类或接口均可，具体查看抽象类介绍
 * @see org.example.AbstractShape
 */
public abstract class CourseFactory {

  abstract Video getVideo();

  abstract Article getArticle();
}
