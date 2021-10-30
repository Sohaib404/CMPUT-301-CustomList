package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();

        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());

    }

    @Test
    public void hasCityTest() {
        list.addCity(new City("Charlottetown", "Prince Edward Island"));

        assertTrue(list.hasCity(new City("Charlottetown", "Prince Edward Island")));
    }

    @Test
    public void deleteCityTest() {
        list.add(new City("Charlottetown", "Prince Edward Island"));
        list.add(new City("Calgary", "Alberta"));
        City city = new City("Calgary", "Alberta");
        list.deleteCity(city);
        assertTrue(!list.hasCity(new City("Calgary", "Alberta")));
    }

}
