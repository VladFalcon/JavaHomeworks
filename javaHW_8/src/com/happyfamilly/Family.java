package com.happyfamilly;

import com.happyfamilly.humans.Human;

import java.util.*;

public class Family implements HumanCreator {

    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pets = new HashSet<>();

    public Family(){}
    public Family(Human mother, Human father){
        this.mother = mother;
        this.father = father;

    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public List<Human> getChildren() { return children; }

    public Set<Pet> getPets() { return pets; }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }


    public void setPets(Set<Pet> pets) { this.pets = pets; }

    public void addPets(Pet pet){
        if(!pets.contains(pet)) {
            pets.add(pet);
        }
    }

    public void addChild(Human child) {
        if(!children.contains(child)) {
            children.add(child);
            child.setFamily(this);
        }
    }


    public boolean deleteChild(int index){
        if(children == null){
            return false;
        }else if(index < 0 || index >= children.size()){
            return false;
        }else{
            children.remove(index);
            return true;
        }
    }


    public boolean deleteChild(Human child) {
        if(children.contains(child)){
            children.remove(child);
            return true;
        }
        return false;
    }

    public int countFamily() {
        int mNum = 0;
        int fNum = 0;
        int cNum = 0;
        if (mother != null) {
            mNum = 1;
        }
        if (father != null) {
            fNum = 1;
        }
        if(children != null){
            cNum = children.size();
        }
        return mNum + fNum + cNum;
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString(){
        return "Family" + " {" +
                "father = " + father + ", " +
                "mother = " + mother + ", " +
                "children = " + children + ", " +
                "pet = " + pets + ", " +
                "count Family = " + countFamily() +"}";
    }


    @Override
    protected void finalize(){
        System.out.println("Finalize family: " + toString());
    }

    // demo
    @Override
    public Human bornChild() {
        return null;
    }
}
