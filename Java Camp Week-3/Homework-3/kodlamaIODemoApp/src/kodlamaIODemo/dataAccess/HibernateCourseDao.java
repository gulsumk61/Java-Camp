
package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Course;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Hibernate Veri tabanına eklendi");

    }

}