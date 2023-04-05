package org.example;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    CourseFactory courseFactory = new JavaCourseFactory();
    Article article = courseFactory.getArticle();
    Video video = courseFactory.getVideo();
    article.produce();
    video.produce();

    PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
    Article pythonArticle = pythonCourseFactory.getArticle();
    Video pythonVideo = pythonCourseFactory.getVideo();
    pythonArticle.produce();
    pythonVideo.produce();
  }

}
