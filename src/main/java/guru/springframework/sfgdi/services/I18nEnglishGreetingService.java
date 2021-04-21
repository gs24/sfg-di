package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.respositories.EnglishReadingRepository;

/**
 * Created by jt on 12/27/19.
 */

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishReadingRepository englishReadingRepository;

    public I18nEnglishGreetingService(EnglishReadingRepository englishReadingRepository) {
        this.englishReadingRepository = englishReadingRepository;
    }


    @Override
    public String sayGreeting() {
        return englishReadingRepository.getGreeting();
    }
}
