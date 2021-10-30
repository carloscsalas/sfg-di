package guru.springframework.pets;

import org.springframework.stereotype.Service;

/*Define as bean in configuration class. because I'm going to say that PetService is a third party utility,
so we don´t have any of these bean(DogPetService and CatPetService). So let's say that we don't have access to this,
but it's a really cool utility that we want to include in our project.
We need it for some functionality and we are going to use Java configuration to provide this.
@Service*/
public class PetServiceFactory {

    public PetService getPetService(String type){
        switch (type){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }

}
