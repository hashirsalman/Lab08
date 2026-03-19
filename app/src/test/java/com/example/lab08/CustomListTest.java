package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);


        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelete() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // Verify it was added
        assertTrue(list.hasCity(calgary));

        // This will show an error because delete() doesn't exist yet!
        list.delete(calgary);

        // Verify it was actually removed
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testDeleteException() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        // This will show an error because delete() doesn't exist yet!
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(calgary);
        });
    }



}