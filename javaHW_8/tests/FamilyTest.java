import com.happyfamilly.Family;
import com.happyfamilly.humans.Human;
import com.happyfamilly.humans.Man;
import com.happyfamilly.humans.Woman;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FamilyTest {
    public Family family;
    Man mother = new Man("Belcalis", "Almánzar",25);
    Woman father = new Woman("Kiari", "Cephus",25);
    Man chield = new Man("Quavious", "Marshall",5);

//    @Test
//    public void toString_Should_ReturnCorrectString(){
//        Family family = new Family(father, mother);
//        List<Human> children = new ArrayList<>();
//        children.add(chield);
//        family.setChildren(children);
//        chield.setFamily(family);
//        String expResult = "Family  {father = 'Human  {name = 'Belcalis', surname = 'Almánzar', year = 25, iq = 0,  schedule= null }', mother = 'Human  {name = 'Kiari', surname = 'Cephus', year = 25, iq = 0,  schedule= null }', children = '[Human  {name = 'Quavious', surname = 'Marshall', year = 5, iq = 0,  schedule= null }]', Pet = 'null', Count Family = '3'}";
//        String result = family.toString();
//        assertEquals(expResult, result);
//    }


    @Test
    public void deleteChildByHumanShouldDeleteChild(){
        Family family = new Family(father, mother);
        List<Human> children = new ArrayList<>();
        children.add(chield);
         family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);

        boolean isDeletedChild = children.remove(chield);
        assertEquals(family.countFamily(), 2);
        assertTrue(isDeletedChild);

        for (Object index : family.getChildren()) {
            assertNotEquals(chield, index);
        }
    }


    @Test
    public void deleteChildByHuman_Should_ReturnTrueIfChildIsDeleted(){
        Family family = new Family(father, mother);
        List<Human> children = new ArrayList<>();
        children.add(chield);
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);

        boolean isDeletedChild = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        boolean isDeletedChildNotExist = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(false, isDeletedChildNotExist);

        for (Object index : family.getChildren()) {
            assertNotEquals(chield, index);
        }
    }


    @Test
    public void deleteChildByIndex_ShouldDeleteChild(){
        Family family = new Family(father, mother);
        List<Human> children = new ArrayList<>();
        children.add(chield);
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);
        boolean isDeletedChild = family.deleteChild(0);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        for (Object index : family.getChildren()) {
            assertNotEquals(chield, index);
        }
    }

    @Test
    public void deleteChildByIndex_Should_ReturnTrueIfChildIsDeleted(){
        Family family = new Family(father, mother);
        List<Human> children = new ArrayList<>();
        children.add(chield);
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);

        boolean isDeletedChild = family.deleteChild(0);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        boolean isDeletedChildNotExist = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(false, isDeletedChildNotExist);

        for (Object index : family.getChildren()) {
            assertNotEquals(chield, index);
        }
    }

    @Test
    public void addChildByHumanShouldReturnThatTheArrChildrenSizeIncreaseOnOneElem(){
        Family family = new Family(father, mother);
        List<Human> children = new ArrayList<>();
        children.add(chield);
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(1, family.getChildren().size());
          }


    @Test
    public void countFamily_Should_ReturnTrueCorrectSizeFamily(){
        Family family = new Family(father, mother);
        List<Human> children = new ArrayList<>();
        children.add(chield);
        family.setChildren(children);
        chield.setFamily(family);
        assertTrue(family.countFamily() == 3);
    }












}
