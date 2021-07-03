package com.gh;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author Eric
 * @Date 2021/7/3 10:52
 * @Version 1.0
 */
public class Coll {
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Coll{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
