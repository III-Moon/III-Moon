package org.example;

import org.example.extendClass.JavaArticle;
import org.example.extendClass.JavaVideo;

public class JavaCourseFactory extends CourseFactory {

  @Override
  public Video getVideo() {
    return new JavaVideo();
  }

  @Override
  public Article getArticle() {
    return new JavaArticle();
  }
}
