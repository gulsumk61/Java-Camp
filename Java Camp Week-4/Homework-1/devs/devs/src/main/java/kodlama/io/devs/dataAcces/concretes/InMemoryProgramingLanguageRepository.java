package kodlama.io.devs.dataAcces.concretes;

import kodlama.io.devs.dataAcces.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository //Bu sınıf bir DataAcces nesnesidir
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository {
    List<ProgramingLanguage> ProgramingLanguages;
    public InMemoryProgramingLanguageRepository(){
        ProgramingLanguages =new ArrayList<ProgramingLanguage>();
        ProgramingLanguages.add(new ProgramingLanguage(1,"C#"));
        ProgramingLanguages.add(new ProgramingLanguage(2,"Java"));
        ProgramingLanguages.add(new ProgramingLanguage(3,"Python"));
    }
    @Override
    public List<ProgramingLanguage> getAll() {
        return ProgramingLanguages;
    }

    @Override
    public ProgramingLanguage getById(int id) throws Exception {
        return null;
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) throws Exception {

    }

    @Override
    public void delete(ProgramingLanguage programingLanguage) throws Exception {

    }

    @Override
    public void update(ProgramingLanguage programingLanguage) throws Exception {

    }
}
