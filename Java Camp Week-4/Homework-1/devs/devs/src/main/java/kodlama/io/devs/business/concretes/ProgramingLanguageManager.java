package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.dataAcces.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Bu sınıf bir business nesnesidir
public class ProgramingLanguageManager implements ProgramingLanguageService {
    private ProgramingLanguageRepository programingLanguageRepository;
    @Autowired
    public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository){
        this.programingLanguageRepository = programingLanguageRepository;
    }
    @Override
    public List<ProgramingLanguage> getAll() {
        //iş kuralları

        return programingLanguageRepository.getAll();
    }
}
