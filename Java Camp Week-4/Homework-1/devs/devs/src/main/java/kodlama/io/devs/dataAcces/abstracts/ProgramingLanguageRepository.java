package kodlama.io.devs.dataAcces.abstracts;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProgramingLanguageRepository {
    List<ProgramingLanguage> getAll();
    ProgramingLanguage getById(int id) throws Exception;
    void add(ProgramingLanguage programingLanguage) throws Exception;
    void delete(ProgramingLanguage programingLanguage) throws Exception;
    void update(ProgramingLanguage programingLanguage) throws Exception;

}
