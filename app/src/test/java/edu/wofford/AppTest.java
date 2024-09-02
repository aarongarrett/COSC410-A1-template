package edu.wofford;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

class AppTest {

    float runTest(float l, float w, float h, String type) {
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            try {
                List<String> args = new ArrayList<>();
                args.add(String.valueOf(l));
                args.add(String.valueOf(w));
                args.add(String.valueOf(h));
                if (type.length() > 0) {
                    args.add("--type");
                    args.add(type);
                }
                App.main(args.toArray(new String[0]));
            } catch (NoSuchElementException e) { }
            return Float.parseFloat(outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test 
    void testDefault1() {
        assertEquals(runTest(5, 5, 5, ""), 125);
    }
    @Test 
    void testDefault2() {
        assertEquals(runTest(2, 3, 4, ""), 24);
    }
    @Test 
    void testBox1() {
        assertEquals(runTest(7, 6, 5, "box"), 210);
    }
    @Test 
    void testBox2() {
        assertEquals(runTest(8, 2, 3, ""), 48);
    }
    @Test 
    void testPyramid1() {
        assertEquals(runTest(7, 6, 5, "pyramid"), 70);
    }
    @Test 
    void testPyramid2() {
        assertEquals(runTest(8, 2, 3, "pyramid"), 16);
    }
    @Test 
    void testEllipsoid1() {
        assertEquals(runTest(7, 6, 5, "ellipsoid"), 879.646f);
    }
    @Test 
    void testEllipsoid2() {
        assertEquals(runTest(8, 2, 3, "ellipsoid"), 201.06194f);
    }
}
