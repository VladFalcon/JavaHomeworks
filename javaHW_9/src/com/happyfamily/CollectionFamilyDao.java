package com.happyfamily;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionFamilyDao implements FamilyDao {

    private List<Family> families = new ArrayList<>();


    public List<Family> getFamilies() { return families; }
    public void setFamilies(List<Family> families) { this.families = families; }


    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int indexFamily) {
        indexFamily -= 1;
        Family getFamily = null;
        if(families == null){
            return null;
        }else if(indexFamily < 0 || indexFamily >= families.size()){
            System.out.println("Семья по задонному индексу отсутствует");
        }else {
            getFamily = families.get(indexFamily);
        }
        return getFamily;
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        index -= 1;
        if(families == null){
            return false;
        }else if(index < 0 || index >= families.size()){
            return false;
        }else{
            families.remove(index);
        }
        return true;
    }

    @Override
    public boolean deleteFamilyByFamily(Family family) {
        if(families == null){
            return false;
        }else{
            families.remove(family);
        }
        return true;
    }

    @Override
    public void saveFamily(Family family) {
        int position = families.indexOf(family);
        if(position == -1){
            families.add(family);
    }else {
        families.set(position, family);
    }
    }

    @Override
    public Set<Pet> getPets(int indexFamily) {
        indexFamily -= 1;
        Family getFamily = families.get(indexFamily);
        Set<Pet> getPets = getFamily.getPets();
        return getPets;
    }

    @Override
    public void addPet(int indexFamily, Pet pet) {
        indexFamily -= 1;
        Set<Pet> pets = families.get(indexFamily).getPets();
        pets.add(pet);
    }
}
