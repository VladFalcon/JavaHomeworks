import com.HappyFamily.Family;
import com.HappyFamily.Human;
import org.junit.Test;
import static org.junit.Assert.*;

public class FamilyTest {
    public Family family;
    Human mother = new Human("Belcalis", "Almánzar",25);
    Human father = new Human("Kiari", "Cephus",25);
    Human chield = new Human("Quavious", "Marshall",5);

    @Test
    public void toString_Should_ReturnCorrectString(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        String expResult = "Family  {father = 'Human  {name = 'Belcalis', surname = 'Almánzar', year = 25, iq = 0,  schedule= null }', mother = 'Human  {name = 'Kiari', surname = 'Cephus', year = 25, iq = 0,  schedule= null }', children = '[Human  {name = 'Quavious', surname = 'Marshall', year = 5, iq = 0,  schedule= null }]', Pet = 'null', Count Family = '3'}";
        String result = family.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void toString_Should_ReturnNotCorrectString(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        String expResult = "Family  {father = 'Human  {name = 'Belcalis1', surname = 'Almánzar', year = 25, iq = 0,  schedule= null }', mother = 'Human  {name = 'Kiari', surname = 'Cephus', year = 25, iq = 0,  schedule= null }', children = '[Human  {name = 'Quavious', surname = 'Marshall', year = 5, iq = 0,  schedule= null }]', Pet = 'null', Count Family = '3'}";
        String result = family.toString();
        assertEquals(expResult, result);
    }
    @Test
    public void deleteChildByHuman_Should_DeleteChild(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);
        boolean isDeletedChild = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        for (int i = 0; i < family.getChildren().length ; i++) {
            assertNotEquals(chield, family.getChildren()[i]);
        }
    }

    @Test
    public void deleteChildByHuman_Should_ReturnTrueIfChildIsDeleted(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);

        boolean isDeletedChild = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        boolean isDeletedChildNotExist = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(false, isDeletedChildNotExist);

        for (int i = 0; i < family.getChildren().length ; i++) {
            assertNotEquals(chield, family.getChildren()[i]);
        }
    }


    @Test
    public void deleteChildByIndex_ShouldDeleteChild(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);
        boolean isDeletedChild = family.deleteChild(0);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        for (int i = 0; i < family.getChildren().length ; i++) {
            assertNotEquals(chield, family.getChildren()[i]);
        }
    }

    @Test
    public void deleteChildByIndex_Should_ReturnTrueIfChildIsDeleted(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(family.countFamily(), 3);

        boolean isDeletedChild = family.deleteChild(0);
        assertEquals(family.countFamily(), 2);
        assertEquals(true, isDeletedChild);

        boolean isDeletedChildNotExist = family.deleteChild(chield);
        assertEquals(family.countFamily(), 2);
        assertEquals(false, isDeletedChildNotExist);

        for (int i = 0; i < family.getChildren().length ; i++) {
            assertNotEquals(chield, family.getChildren()[i]);
        }
    }

    @Test
    public void addChildByHuman_Should_ReturnThatTheArrChildrenSizeIncreaseOnOneElem(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        assertEquals(1, family.getChildren().length);
         }

    @Test
    public void countFamily_Should_ReturnTrueCorrectSizeFamily(){
        Family family = new Family(father, mother);
        Human[] children = {chield};
        family.setChildren(children);
        chield.setFamily(family);
        assertTrue(family.countFamily() == 3);
    }












}
