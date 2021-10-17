package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*annotation which tells Spring that this is a Spring managed component and bring it into the Spring Context*/
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
