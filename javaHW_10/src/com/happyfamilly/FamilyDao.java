package com.happyfamilly;

import java.util.List;
import java.util.Set;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamilyByIndex(int index);
    boolean deleteFamilyByFamily(Family family);
    void saveFamily(Family family);
    Set<Pet> getPets(int index);
    void addPet(int indexFamily, Pet pet);
}

