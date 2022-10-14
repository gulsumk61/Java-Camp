package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Jdbc veri tabanına eklendi");
    }
}
