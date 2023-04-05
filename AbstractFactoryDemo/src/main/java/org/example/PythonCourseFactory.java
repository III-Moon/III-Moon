package org.example;

import org.example.extendClass.PythonArticle;
import org.example.extendClass.PythonVideo;

public class PythonCourseFactory extends CourseFactory {

  @Override
  public Video getVideo() {
    return new PythonVideo();
  }

  @Override
  public Article getArticle() {
    return new PythonArticle();
  }
}
