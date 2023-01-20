package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        arrayListSamples();
        hashSetSamples();
        hashMapSamples();
    }

    private static void arrayListSamples() {
        //add some colors
        List<String> colorSampler = new ArrayList<>();
        colorSampler.add("Blue");
        colorSampler.add("Yellow");
        colorSampler.add("Green");

        //iterate through
        for(String str : colorSampler){
            System.out.println(str);
        }

        //insert an element at first position
        colorSampler.add(0, "Pink");

        //retrieve an index
        System.out.println(colorSampler.get(0));

        //update an index
        colorSampler.remove(2);
        colorSampler.add(2, "Red");
        System.out.println(colorSampler.get(2));

        //remove the third elemenet
        colorSampler.remove(2);
        System.out.println(colorSampler.get(2));

        //sort the list
        Collections.sort(colorSampler);
        System.out.println(colorSampler);

        //copy list
        List<String> newList =new ArrayList<>();
        newList.addAll(colorSampler);
        System.out.println(newList);

        //shuffle list
        Collections.shuffle(newList);
        System.out.println(newList);

        //reverse list
        Collections.reverse(newList);
        System.out.println(newList);

        //compare two arraylists
        System.out.println(colorSampler.equals(newList));

        //join two arraylists
        System.out.println(colorSampler.addAll(newList));

        //empty an arraylist
        newList.clear();
        System.out.println(newList);


    }

    private static void hashSetSamples() {
        System.out.println("========= HashSet ==========");
        Set<String> setSampler = new HashSet<>();

        //append element
        setSampler.add("Hello");
        setSampler.add("hi");
        setSampler.add("howdy");

        //iterate through element
        for(String str : setSampler){
            System.out.println(str);
        }

        //get number of elements
        System.out.println(setSampler.size());

        //empty hashset
        setSampler.clear();
        System.out.println(setSampler.size());

        //test if hashset is empty
        System.out.println(setSampler.isEmpty());

        //clone a hashset to another hashset
        setSampler.add("Hello");
        setSampler.add("hi");
        setSampler.add("howdy");
        Set<String> newSet = new HashSet<>();
        newSet.addAll(setSampler);
        System.out.println(newSet);

        //convert hashSet to array
        Object[] arrSampler = setSampler.toArray();

        //convert hashSet to a treeSet
        TreeSet<String> treeSampler = new TreeSet<>();
        treeSampler.addAll(setSampler);
        System.out.println(treeSampler);

        //convert hashset to list
        List<String> listSampler = new ArrayList<>();
        listSampler.addAll(setSampler);
        System.out.println(listSampler);

        //compare two hashSet
        System.out.println(setSampler.equals(newSet));

        //compare two sets and retain elements which are same on both sets
        setSampler.add("this shouldnt be added");
        System.out.println(setSampler.retainAll(newSet));

        //remove all elements from a hashset
        setSampler.clear();
        System.out.println(setSampler);



    }

    public static void hashMapSamples(){
        System.out.println("========= HashMap ==========");
        Map<String, Integer> mapSampler = new HashMap<>();
        mapSampler.put("Monday", 1);
        mapSampler.put("Tuesday", 2);
        mapSampler.put("Wednesday", 3);
        mapSampler.put("Thursday", 4);
        mapSampler.put("Friday", 5);
        mapSampler.put("Saturday", 6);
        mapSampler.put("Sunday", 7);

        //number of keysize
        System.out.println(mapSampler.size());

        //copy all the mappings to another map.
        HashMap<String, Integer> copyMap = new HashMap<>();
        copyMap.putAll(copyMap);

        //remove all the mappings
        mapSampler.clear();
        System.out.println(mapSampler.keySet());

        //check if map contains key-value
        System.out.println(mapSampler.isEmpty());

        //shallow copy of hashmap
        mapSampler.putAll(copyMap);

        mapSampler.put("Monday", 1);
        mapSampler.put("Tuesday", 2);
        mapSampler.put("Wednesday", 3);
        mapSampler.put("Thursday", 4);
        mapSampler.put("Friday", 5);
        mapSampler.put("Saturday", 6);
        mapSampler.put("Sunday", 7);

        //test if map contains mapping for specified key
        System.out.println(mapSampler.containsKey("Monday"));

        //test if map contains value
        System.out.println(mapSampler.containsValue(5));

        //get value of specified key
        System.out.println(mapSampler.get("Monday"));

        //get a set of the keys contained in the map
        System.out.println(mapSampler.keySet());

        //get a vollection view of the values
        System.out.println(mapSampler.values());
    }
}