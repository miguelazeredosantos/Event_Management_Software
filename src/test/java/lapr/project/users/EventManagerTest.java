/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManagerTest {

    @Test
    public static void EnsureSameObjectEventManagerIsEqual() {
        lapr.project.Users.EventManager eManager = new lapr.project.Users.EventManager("mario", "m@gmail.com", "mario1", "m123");
        assertEquals(eManager, eManager);
    }

    @Test
    public static void EnsureSameObjectsEventManagerAreNotEqual() {
        lapr.project.Users.EventManager eManager = new lapr.project.Users.EventManager("mario", "m@gmail.com", "mario1", "m123");
        lapr.project.Users.EventManager expectedResult = new lapr.project.Users.EventManager("Z", "c", "b", "a");
        assertNotEquals(expectedResult, eManager);
    }

    @Test
    public static void EnsureDifferentObjectsEventManagerAreNotEqual() {
        lapr.project.Users.EventManager eManager = new lapr.project.Users.EventManager("mario", "m@gmail.com", "mario1", "m123");
        Object expectedResult = new Object();
        assertNotEquals(eManager, expectedResult);
    }
}
