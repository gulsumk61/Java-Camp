package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    List<ProgramingLanguage> getAll();
}
