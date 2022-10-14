package kodlamaIODemo.business;

import java.util.List;

import kodlamaIODemo.dataAccess.CategoryDao;
import kodlamaIODemo.dataAccess.CourseDao;
import kodlamaIODemo.entities.Category;
import kodlamaIODemo.entities.Course;
import kodlamaIODemo.logging.Logger;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;


    public CourseManager(CourseDao courseDao,Logger[] loggers,List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for(Course cours:courses) {
            if(cours.getCourseName()==course.getCourseName()) {
                throw new Exception ("Kategori isimleri aynı olamaz");
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger:loggers) {
            logger.log(course.getCourseName());
        }
    }
}
