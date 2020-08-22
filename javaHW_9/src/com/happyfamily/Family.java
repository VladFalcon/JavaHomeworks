package com.happyfamily;

import java.util.*;

public class Family{
    static {
        System.out.println(" ");
        System.out.println("Загрузка класса: Family");
    }

    private Human father;
    private Human mother;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pets = new HashSet<>();
    private String[] namesWoman = {"Moli", "Popi", "Zeta", "Greta", "Anna"};
    private String[] namesMan = {"Bobi", "Gogi", "Toti", "Boris", "Dodi"};

    {
        System.out.println("Cоздается новый объект: Family");
    }


    public Family(){}
    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        mother.setFamily(this);
        father.setFamily(this);
    }

    ///GET-SET
    public Human getFather() { return father; }
    public void setFather(Human father) { this.father = father; }
    public Human getMother() { return mother; }
    public void setMother(Human mother) { this.mother = mother; }

    public Set<Pet> getPets() { return pets; }
    public void setPets(Set<Pet> pets) { this.pets = pets; }

    public List<Human> getChildren() { return children; }
    public void setChildren(List<Human> children) {
        this.children = children;
    }



    public void addChild(Human child) {
        int position = children.indexOf(child);
        if(position == -1){
            children.add(child);
        }else {
            children.set(position, child);
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
    public String toString(){
        return "Family" + " {" +
                "father = " + father + ", " +
                "mother = " + mother + ", " +
                "children = " + children + ", " +
                "pet = " + pets + ", " +
                "count Family = " + countFamily() +"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(father, family.father) &&
                Objects.equals(mother, family.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother);
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize family: " + toString());
    }


}
