package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by asapu on 12/20/2017.
 */
public class ListQuestionsStepDefs {
    @Given("^the user has access to the listQuestionsCatalog service$")
    public void the_user_has_access_to_the_listQuestionsCatalog_service() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @When("^the user requests the service with the below request body$")
    public void the_user_requests_the_service_with_the_below_request_body(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the service returns successful response code (\\d+)XX$")
    public void the_service_returns_successful_response_code_XX(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response message should be 'Data not found'$")
    public void the_response_message_should_be_Data_not_found() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Given("^the listQuestionsCatalog service is up and running$")
    public void the_listQuestionsCatalog_service_is_up_and_running() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @When("^the user requests the service with the below details$")
    public void the_user_requests_the_service_with_the_below_details(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the service returns unauthorized error with response code (\\d+)$")
    public void the_service_returns_unauthorized_error_with_response_code(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the service returns error response code as (\\d+)XX$")
    public void the_service_returns_error_response_code_as_XX(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response message should be 'Invalid channelId error'$")
    public void the_response_message_should_be_Invalid_channelId_error() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response message should be 'Request missing required field: channelID'$")
    public void the_response_message_should_be_Request_missing_required_field_channelID() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the service returns all data along with sucess response$")
    public void the_service_returns_all_data_along_with_sucess_response() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response should return all data related to the questions$")
    public void the_response_should_return_all_data_related_to_the_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the service returns only the data related to a question$")
    public void the_service_returns_only_the_data_related_to_a_question() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response should return only the data related to a question$")
    public void the_response_should_return_only_the_data_related_to_a_question(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the service returns success response code as (\\d+)XX$")
    public void the_service_returns_success_response_code_as_XX(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response should return all the question choices$")
    public void the_response_should_return_all_the_question_choices(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return same choice twice when its related to two different questions$")
    public void the_response_should_return_same_choice_twice_when_its_related_to_two_different_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should not return duplicate questions$")
    public void the_response_should_not_return_duplicate_questions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("^the response should have the below fields$")
    public void the_response_should_have_the_below_fields(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return input and choice type questions$")
    public void the_response_should_return_input_and_choice_type_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return multiple tips per single choice questions$")
    public void the_response_should_return_multiple_tips_per_single_choice_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return multiple tips with unique statuses per single choice questions$")
    public void the_response_should_return_multiple_tips_with_unique_statuses_per_single_choice_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return single tip per multiple choice question$")
    public void the_response_should_return_single_tip_per_multiple_choice_question(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return valid next questionID for each choice based questions$")
    public void the_response_should_return_valid_next_questionID_for_each_choice_based_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return null as nextQuestionID for last choice based questions$")
    public void the_response_should_return_null_as_nextQuestionID_for_last_choice_based_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return same set of input based field for multiple questions$")
    public void the_response_should_return_same_set_of_input_based_field_for_multiple_questions(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return multiple sets of input fields for a question$")
    public void the_response_should_return_multiple_sets_of_input_fields_for_a_question(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response return valid call to action ids$")
    public void the_response_return_valid_call_to_action_ids(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return multiple call to actions associated to single tip$")
    public void the_response_should_return_multiple_call_to_actions_associated_to_single_tip(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return multiple call to actions associated to multiple tips$")
    public void the_response_should_return_multiple_call_to_actions_associated_to_multiple_tips(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return single call to action which is associated to multiple tips$")
    public void the_response_should_return_single_call_to_action_which_is_associated_to_multiple_tips(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

    @Then("^the response should return single call to action which is associated to single tip$")
    public void the_response_should_return_single_call_to_action_which_is_associated_to_single_tip(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       
    }

}
