package Serializater;

import Entity.Pet;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class PetSerializater implements JsonSerializer<Pet> {
    @Override
    public JsonElement serialize(Pet pet, Type type, JsonSerializationContext context) {
        JsonObject petObject = new JsonObject();
        petObject.addProperty("namePet", pet.getName());
        petObject.addProperty("typePet", pet.getType());
        petObject.addProperty("agePet", pet.getAge());
        return petObject;
    }
}
