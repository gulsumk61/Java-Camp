package kodlamaIODemo.business;

import kodlamaIODemo.dataAccess.TeacherDao;
import kodlamaIODemo.entities.Teacher;
import kodlamaIODemo.logging.Logger;

public class TeacherManager {
    private TeacherDao teacherDao;
    private Logger[] loggers;

    public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
        this.teacherDao=teacherDao;
        this.loggers=loggers;
    }

    public void add(Teacher teacher) {
        teacherDao.add(teacher);

        for(Logger logger: loggers) {
            logger.log(String.valueOf(teacher.getId()));
        }

    }
}
