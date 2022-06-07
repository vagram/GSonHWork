package Serializater;

import Entity.Human;
import Entity.Pet;
import com.google.gson.*;

import java.lang.reflect.Type;

public class HumanSerializater implements JsonSerializer<Human> {
    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {
        JsonObject humanObject = new JsonObject();
        humanObject.addProperty("name", human.getName());
        humanObject.addProperty("gender", human.getGender());
        humanObject.addProperty("age", human.getAge());
        humanObject.addProperty("height", human.getHeight());

        JsonArray petArray = new JsonArray();
        for (Pet pet: human.getPets()){
            petArray.add(context.serialize(pet));
        }
        humanObject.add("pets", petArray);
        return humanObject;
    }
}
