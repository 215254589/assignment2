package ChadBoswell;

import java.util.*;

public class Class2 implements Collections_Interface {
    private ArrayList name;
    private Set achievements;
    private Map skills;

    public Class2(){

        name = new ArrayList();
        achievements = new HashSet();
        skills = new HashMap();

    }
    @Override
    public void addArrayList(String item) {

        name.add(item);
        name.add(item);
    }

    @Override
    public void addSet(String item) {

        achievements.add(item);
    }
    @Override
    public void addToMap(String key, String value) {

        skills.put(key, value);
    }
    public static void main(String[] args) {

    }
}
