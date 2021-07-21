package steps;

import io.cucumber.java.en.Then;
import utils.DbUtils;
import utils.GlobalVariables;

public class DbSteps {
    @Then("query the HRMS database")
    public void query_the_hrms_database() {
        String query="select emp_firstname,emp_middle_name,emp_lastname " +
                "from HS_HR_EMPLOYEES where employee_id="+ GlobalVariables.empId;
        GlobalVariables.tableData=DbUtils.getTableDataAsListOfMaps(query);
    }
}
