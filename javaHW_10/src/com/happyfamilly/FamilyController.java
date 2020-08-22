package com.happyfamilly;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController {

    private FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }
    public void displayAllFamilies(){
        familyService.displayAllFamilies();
    }
    public void saveFamily(Family family){
        familyService.saveFamily(family);
    }
    public List<Family> getFamiliesBiggerThan(int numHuman){
        return familyService.getFamiliesBiggerThan(numHuman);
    }
    public List<Family> getFamiliesLessThan(int numHuman){
        return familyService.getFamiliesLessThan(numHuman);
    }
    public int countFamiliesWithMemberNumber(int numHuman){
        return familyService.countFamiliesWithMemberNumber(numHuman);
    }
    public Family createNewFamily(Human father, Human mother){
        return  familyService.createNewFamily(father, mother);
    }
    public boolean deleteFamilyByIndex(int index){
        return familyService.deleteFamilyByIndex(index);
    }
    public boolean deleteFamilyByFamily(Family family){
        return familyService.deleteFamilyByFamily(family);
    }
    public Family bornChild(Family family, String sonName, String doterName){
        return familyService.bornChild(family, sonName, doterName);
    }
    public Family adoptChild(Family family, Human child){
        return familyService.adoptChild(family, child);
    }
    public int count(){
        return familyService.count();
    }
    public void addPet(int indexFamily, Pet pet){
        familyService.addPet(indexFamily, pet);
    }
    public Set<Pet> getPets(int indexFamily){
        return familyService.getPets(indexFamily);
    }
    public void deleteAllChildrenOlderThen(int age) throws ParseException {
        familyService.deleteAllChildrenOlderThen(age);
    }


}
