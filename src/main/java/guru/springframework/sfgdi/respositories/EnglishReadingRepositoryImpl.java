package guru.springframework.sfgdi.respositories;

public class EnglishReadingRepositoryImpl implements EnglishReadingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
