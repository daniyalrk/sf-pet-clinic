package bnv.com.sfpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> {

    protected Map<T,ID> map = new HashMap<T,ID>();

    Set<T> findAll(){
        return new HashSet(map.values());
    }

    T findById(ID id)
    {
        return (T) map.get(id);
    }

    T save(ID id,T object)
    {
        map.put(object, id);
        return object;
    }
    void deleteById(ID id)
    {
        map.remove(id);
    }
    void delete(T object)
    {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
