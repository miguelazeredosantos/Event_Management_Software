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
public class OrganizerTest {

    @Test
    public static void EnsureSameObjectOrganizerIsEqual() {
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        assertEquals(organizer, organizer);
    }

    @Test
    public static void EnsureSameObjectsOrganizerAreNotEqual() {
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer expectedResult = new Organizer("Z", "c", "b", "a");
        assertNotEquals(organizer, expectedResult);
    }

    @Test
    public static void EnsureDifferentObjectsOrganizerAreNotEqual() {
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Object expectedResult = new Object();
        assertNotEquals(organizer, expectedResult);
    }
}