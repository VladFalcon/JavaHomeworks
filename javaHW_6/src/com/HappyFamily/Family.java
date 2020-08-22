package com.HappyFamily;

import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

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

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setChildren(Human[] childred) {
        this.children = childred;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild (Human child) {
        if(children != null) {
            Human[] newChildrenArr = new Human[children.length + 1];
            for(int i=0; i<children.length; i++){
                newChildrenArr[i] = children[i];
            }
            newChildrenArr[newChildrenArr.length - 1] = child;
            this.setChildren(newChildrenArr);
        }else{
            Human[] newChildrenArr = new Human[1];
            newChildrenArr[0] = child;
            this.setChildren(newChildrenArr);
        }
        child.setFamily(this);
    }

    public boolean deleteChild(int index){
        if(children == null){
            return false;
        }else if(index < 0 || index >= children.length){
            return false;
        }else{
            Human[] newChildrenArrDel = new Human[children.length - 1];
            for(int j=0, i=0; i<children.length; i++){
                if(index == i){
                    continue;
                }
                newChildrenArrDel[j++] = children[i];
            }
            this.setChildren(newChildrenArrDel);
            return true;
        }
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                if(this.deleteChild(i)){
                    return true;
                }
            }
        }
        return false;
    }



    public int countFamily(){

        return 2 + children.length;
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
        return "Family " + " {" + "father = \'" + father + "\', " + "mother = \'" + mother + "\', " + "children = \'" + Arrays.toString(children) + "\', " + "Pet = \'" + pet + "\', " + "Count Family = \'" + countFamily() +"\'}";
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize family: " + toString());
    }


}
