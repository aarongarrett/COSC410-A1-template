package edu.wofford.cucumber;

import edu.wofford.App;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.util.*;

public class StepDefinitions {
    float length = 0;
    float width = 0;
    float height = 0;
    String type = "";
    String outputString = "";

    @Given("the length is {float}")
    public void the_length_is(Float val) {
        length = val;
    }

    @Given("the width is {float}")
    public void the_width_is(Float val) {
        width = val;
    }

    @Given("the height is {float}")
    public void the_height_is(Float val) {
        height = val;
    }

    @Given("the type is {string}")
    public void the_type_is(String type1) {
        type = type1.trim();
    }

    @When("the calculation is made")
    public void the_calculation_is_made() {
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            try {
                List<String> args = new ArrayList<>();
                args.add(String.valueOf(length));
                args.add(String.valueOf(width));
                args.add(String.valueOf(height));
                if (type.length() > 0) {
                    args.add("--type");
                    args.add(type);
                }
                App.main(args.toArray(new String[0]));
            } catch (NoSuchElementException e) { }
            outputString = outContent.toString();
        } finally {
            System.setOut(originalOut);
        }
    }

    @Then("the output should be {float}")
    public void the_output_should_be(Float val) {
        assertEquals(val, Float.parseFloat(outputString));
    }
}