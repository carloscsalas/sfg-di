package guru.springframework.sfgdi.services;


/*the qualifier will take precedence over primary*/
/* for configuration class
@Primary
@Service*/
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - From the Primary bean";
    }
}
