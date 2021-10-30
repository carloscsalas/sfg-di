package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/* Remove for configuration class
@Service*/
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - Setter";
    }
}
