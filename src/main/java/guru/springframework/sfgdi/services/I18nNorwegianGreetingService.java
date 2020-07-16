package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"NO", "default"})
@Service("i18nService")
public class I18nNorwegianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hei Verden - NO";
    }
}
