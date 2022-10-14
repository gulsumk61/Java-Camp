package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

    @Override
    public void add(Teacher teacher) {
        System.out.println("Hibernate veri tabanına eklendi");

    }

}