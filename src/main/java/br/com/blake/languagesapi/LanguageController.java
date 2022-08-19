package br.com.blake.languagesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages")
    public List<Language> gettingLanguages() {
        return repository.findAll();
    }

    @PostMapping("/languages")
    public Language registerLanguage(@RequestBody Language language) {
        return repository.save(language);
    }
}
