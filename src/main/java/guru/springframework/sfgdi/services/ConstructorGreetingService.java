package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*Remove this annotation to configure throught configuration class
annotation which tells Spring that this is a Spring managed component and bring it into the Spring Context+/
@Service*/
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Constructor";
    }
}
