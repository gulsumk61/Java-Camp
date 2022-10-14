package kodlamaIODemoApp;

import kodlamaIODemo.business.CategoryManager;
import kodlamaIODemo.business.CourseManager;
import kodlamaIODemo.business.TeacherManager;
import kodlamaIODemo.dataAccess.CourseDao;
import kodlamaIODemo.dataAccess.HibernateCategoryDao;
import kodlamaIODemo.dataAccess.HibernateTeacherDao;
import kodlamaIODemo.dataAccess.JdbcCourseDao;
import kodlamaIODemo.entities.Category;
import kodlamaIODemo.entities.Course;
import kodlamaIODemo.entities.Teacher;
import kodlamaIODemo.logging.DatabaseLogger;
import kodlamaIODemo.logging.FileLogger;
import kodlamaIODemo.logging.Logger;
import kodlamaIODemo.logging.MailLogger;

public class Main {

    public static void main(String[] args) throws Exception {
        Category category1 = new Category(1,"YAZILIM");
        Category category2 = new Category(2,"YAZILIM");
        Category category3 = new Category(3,"YAZILIM");
        Category category4 = new Category(4,"YAZILIM");
        Category category5 = new Category(5,"YAZILIM");
        Category category6 = new Category(6,"YAZILIM");

        Course course1 = new Course(1,"c#");
        Course course2 = new Course(2,"java");
        Course course3 = new Course(3,"javascript");
        Course course4 = new Course(4,"senior");
        Course course5 = new Course(5,"java last edition");
        Course course6 = new Course(6,"programlamaya giriş");

        Teacher teacher = new Teacher(1,"Professional","Engin","Demiroğ");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers, null);
        categoryManager.add(category6);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers, null);
        courseManager.add(course3);

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(),loggers);

    }

}