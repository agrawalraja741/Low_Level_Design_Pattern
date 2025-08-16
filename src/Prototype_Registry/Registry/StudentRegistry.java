package Prototype_Registry.Registry;

import Prototype_Registry.Prototype.Student;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String, Student> hm ;

    public StudentRegistry() {
        hm = new HashMap<>();
    }

    public void registerStudent(String key , Student student)
    {
        hm.put(key, student);
    }

    public void deregisterStudent(String key)
    {
        hm.remove(key);
    }

    public Student getStudent(String key)
    {
        if(key == null)
        {
            throw new NullPointerException("key is null");
        }

        if(!hm.containsKey(key))
        {
            throw new NullPointerException("key is not found");
        }
        return hm.get(key).copy(hm.get(key));
    }
}
