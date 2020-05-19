package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {

    //    @Before
//    public void createJobObject() {
//
//    }
//
    Job j;

    @Before
    public void createJobObject() {
        j = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        createJobObject();

        assertTrue(j instanceof Job);
    }

    @Test
    public void testToString1() {
        createJobObject();
        assertTrue(j.toString().startsWith("\n") && j.toString().endsWith("\n"));
    }

    @Test
    public void testToString2(){
        createJobObject();
        assertEquals(j.toString(), "\n" +
                "ID: 2\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Persistence\n");
    }

    @Before
    public void createJob2(){
        Employer e = new Employer("");
        Location l = new Location("");
        PositionType p = new PositionType("");
        CoreCompetency c = new CoreCompetency("");
        j = new Job("", e, l , p, c);
    }

    @Test
    public void testToString3() {
        createJob2();
        assertTrue(j.toString().contains("Data not available"));
    }
}