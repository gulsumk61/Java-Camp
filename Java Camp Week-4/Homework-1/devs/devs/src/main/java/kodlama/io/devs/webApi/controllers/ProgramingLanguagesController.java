package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping ("/api/ProgramingLanguages")
public class ProgramingLanguagesController{
    private ProgramingLanguageService programingLanguageService;
    @Autowired
    public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService){
        this.programingLanguageService = programingLanguageService;
    }
    @GetMapping("/getall")
    public List<ProgramingLanguage> getAll(){
        return programingLanguageService.getAll();

    }
}
