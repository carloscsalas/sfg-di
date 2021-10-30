package guru.springframework.sfgdi.services;


/* Remove for configuration class
@Service*/
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
