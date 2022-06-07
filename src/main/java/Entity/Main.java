package Entity;

import Serializater.HumanSerializater;
import Serializater.PetSerializater;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Pet pet = new Pet("Sharik", "Dog", 5);
        Pet pet1 = new Pet("Murzik", "Cat", 2);
        List<Pet> pets = new ArrayList<>();
        pets.add(pet);
        pets.add(pet1);
        Human human = new Human("Oleg","Male", 45, 78, 180, pets);

        System.out.println(human + "  " + pet);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //сериализация
        String humanStr = gson.toJson(human);
        System.out.println(humanStr);
        String petStr = gson.toJson(pet);
        System.out.println(petStr);
        //десериализация
        human = gson.fromJson(humanStr, Human.class);
        System.out.println(human);
        pet = gson.fromJson(petStr, Pet.class);
        System.out.println(pet);
        //Сериализация с изменениями ДЗ №2
        Gson gson1 = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Pet.class, new PetSerializater())
                .registerTypeAdapter(Human.class, new HumanSerializater())
                .create();
        String petStr1 = gson1.toJson(human);
        System.out.println(petStr1);

    }
}
