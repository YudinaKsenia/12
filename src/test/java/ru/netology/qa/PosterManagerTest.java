package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    PosterManager manager = new PosterManager();

    @Test

    public void testAddNoMovie() {

        String[] expected = { };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals( expected, actual);
    }

    @Test

    public void testAddMovie() {

        manager.addMovie("Bloodshot");

        String[] expected = { "Bloodshot" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals( expected, actual);
    }

    @Test

    public void testAddMovie1() {

        manager.addMovie("Bloodshot");
        manager.addMovie("Onward");
        manager.addMovie("Belgrade Hotel");
        manager.addMovie("The Gentlemen");
        manager.addMovie("The Invisible Man");
        manager.addMovie("Trolls");
        manager.addMovie("Number 1");

        String[] expected = { "Bloodshot", "Onward","Belgrade Hotel", "The Gentlemen", "The Invisible Man", "Trolls", "Number 1" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals( expected, actual);
    }

    @Test

    public void testFindLast() {

        manager.addMovie("Bloodshot");
        manager.addMovie("Onward");
        manager.addMovie("Belgrade Hotel");
        manager.addMovie("The Gentlemen");
        manager.addMovie("The Invisible Man");


        String[] expected = { "The Invisible Man", "The Gentlemen","Belgrade Hotel", "Onward", "Bloodshot" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals( expected, actual);
    }

}