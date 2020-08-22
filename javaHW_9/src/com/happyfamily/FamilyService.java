package com.happyfamily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FamilyService {

    private FamilyDao familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        System.out.println(" * ");
        if(familyDao.getAllFamilies() == null){
            System.out.println("Families is does not exist");
        }else { //если есть
            for (int i=0; i<familyDao.getAllFamilies().size(); i++){
                System.out.println(" ");
                System.out.println((i + 1) + ": " + familyDao.getAllFamilies().get(i));
            }
        }
        System.out.println(" * ");
    }

    public List<Family> getFamiliesBiggerThan(int numHuman){
        System.out.println(" * FAMILIES BIGGER THAN [" + numHuman + " Human] " + " * ");
        List<Family> familiesBiggerThan = new ArrayList<>();
        for(int i=0; i<familyDao.getAllFamilies().size(); i++){
            if(numHuman < familyDao.getAllFamilies().get(i).countFamily()){
                familiesBiggerThan.add(familyDao.getAllFamilies().get(i));
            }
        }
        for (int i=0; i<familiesBiggerThan.size(); i++){
            System.out.println(" ");
            System.out.println((i + 1) + ": " + familiesBiggerThan.get(i));
        }
        System.out.println(" ");
        return familiesBiggerThan;
    }

    public List<Family> getFamiliesLessThan(int numHuman){
        System.out.println(" * FAMILIES LESS THAN [" + numHuman + " Human] " + " * ");
        List<Family> familiesLessThan = new ArrayList<>();
        for(int i=0; i<familyDao.getAllFamilies().size(); i++){
            if(numHuman > familyDao.getAllFamilies().get(i).countFamily()){
                familiesLessThan.add(familyDao.getAllFamilies().get(i));
            }
        }
        for (int i=0; i<familiesLessThan.size(); i++){
            System.out.println(" ");
            System.out.println((i + 1) + ": " + familiesLessThan.get(i));
        }
        System.out.println(" ");
        return familiesLessThan;
    }

    public int countFamiliesWithMemberNumber(int numHuman){
        System.out.println(" * FAMILIES WITH MEMBER NUMBER [" + numHuman + " Human] " + " * ");
        List<Family> familiesWithMemberNumber = new ArrayList<>();
        for(int i=0; i<familyDao.getAllFamilies().size(); i++) {
            if (numHuman == familyDao.getAllFamilies().get(i).countFamily()) {
                familiesWithMemberNumber.add(familyDao.getAllFamilies().get(i));
            }
        }
        int countFamily = familiesWithMemberNumber.size();
        System.out.println(" ");
        System.out.println("Total families is: " + countFamily);
        System.out.println(" ");
        return countFamily;
    }

    public Family createNewFamily(Human father, Human mother){
        Family family = new Family();
        family.setFather(father);
        family.setMother(mother);
        familyDao.saveFamily(family);
        return family;
    }

    public boolean deleteFamilyByIndex(int index){
        return familyDao.deleteFamilyByIndex(index);
    }

    public boolean deleteFamilyByFamily(Family family){
        return familyDao.deleteFamilyByFamily(family);
    }

    public Family bornChild(Family family, String sonName, String doterName){
        if(sonName != null){
            Man son = new Man();
            String sonSurname = family.getFather().getSurname();
            son.setName(sonName);
            son.setSurname(sonSurname);
            family.addChild(son);
        }else if(doterName != null){
            Woman doter = new Woman();
            String doterSurname = family.getFather().getSurname();
            doter.setName(doterName);
            doter.setSurname(doterSurname);
            family.addChild(doter);
        }else {
            return null;
        }
        return family;
    }

    public Family adoptChild(Family family, Human child){
        String surname = family.getFather().getSurname();
        child.setSurname(surname);
        family.addChild(child);
        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> families = familyDao.getAllFamilies();
        Iterator<Family> itrFamilies = families.iterator();
        while (itrFamilies.hasNext()){
            Family family = itrFamilies.next();
            Iterator<Human> itrChildrens = family.getChildren().iterator();
            while (itrChildrens.hasNext()){
                Human child = itrChildrens.next();
                if (2018-child.getYear() > age){
                    itrChildrens.remove();
                }
            }
        }
    }


    public int count(){
        int size = familyDao.getAllFamilies().size();
        System.out.println(" * COUNT FAMILIES * ");
        System.out.println(" ");
        System.out.println("Total families is: " + size);
        System.out.println(" ");
        return size;
    }

    public Set<Pet> getPets(int indexFamily){
        System.out.println(" * PETS OF [" + familyDao.getAllFamilies().get(indexFamily - 1).getFather().getSurname().toUpperCase() + " FAMILY] " + " * ");
        System.out.println(" ");
        Set<Pet> pets = familyDao.getPets(indexFamily);
        int n = 0;
        for (Pet pet:pets){
            n++;
            System.out.println(n +": "+ pet);
        }
        System.out.println(" ");
        return pets;
    }

    public void addPet(int indexFamily, Pet pet){
        familyDao.addPet(indexFamily, pet);
    }

    public void saveFamily(Family family){
        familyDao.saveFamily(family);
    }
}
