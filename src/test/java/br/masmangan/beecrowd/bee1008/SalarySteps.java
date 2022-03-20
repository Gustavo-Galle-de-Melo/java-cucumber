package br.masmangan.beecrowd.bee1008;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SalarySteps {

    private final Salary salary = new Salary();
    private double actual;

    @Given("the number is {int}")
    public void number_is(int number) {
        salary.setNumber(number);
    }
    @Given("{int} hours")
    public void hours_is(int hours) {
        salary.setHours(hours);
    }
    @Given("U$ {double} per hour")
    public void average_per_hour_is(int amountPerHour) {
        salary.setAmountPerHour(amountPerHour);
    }
    
    @When("salary is calculated")
    public void salary_is_calculated() {
        actual = salary.getSalary();
    }
    @Then("result should be {double}")
    public void result_should_be(int expected) {
        assertEquals(expected, actual, 0);
    }
}
