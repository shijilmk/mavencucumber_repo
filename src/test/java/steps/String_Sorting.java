package steps;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class String_Sorting {
	

	@Given("^Input file has valid data$")
	public void input_file_has_valid_data() throws Throwable {
		
	}

	@When("^I do sorting$")
	public void i_do_sorting() throws Throwable {

	}

	@Then("^I values has to be sorted$")
	public void i_values_has_to_be_sorted() throws Throwable {
		Sort("C:\\Users\\shijilj\\Documents\\Eclipse_Project\\dockertest_shijil\\data\\inputdata\\input.csv");
	}
	
 public void Sort(String filepath) throws IOException{
	        String cvsSplitBy = ",";
	        String output="";
	        String[] states;
	        String names = "";
	        String temp; 
	        int i, j, k, result;
	        
		//input file
	        FileReader fr = new FileReader(filepath);
	        BufferedReader br = new BufferedReader(fr);
	        //output file
	        FileWriter fw = new FileWriter("C:\\Users\\shijilj\\Documents\\Eclipse_Project\\dockertest_shijil\\data\\outputdata\\output.csv");
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pw = new PrintWriter(bw);

	        //load data into array
	        	names=br.readLine();
	        	states = names.split(cvsSplitBy);
	        br.close();
	        //sort data
	        System.out.println("input data string : " + names); //inputfile data
	        for(i=1; i<states.length; i++){
	           for (j=0; j<states.length-i; j++){
	               result = states[j].compareToIgnoreCase(states[j+1]);
	               if (result > 0){
	                  temp = states[j];
	                  states[j] = states[j+1];
	                  states[j+1] = temp;
	               }
	           }
	        }
	        //write data
	        for (k = states.length-1; k > 0; k--){
	        	if(k == 1){
	        		output = output.concat(states[k]);
	        		break;
	        	}
	        	output = output.concat(states[k] + ",");
	        }
	        pw.println(output);
	        System.out.println("output data string in desending order : "+ output); //check outputdata
	        pw.close();
	        
	 
	 }
}
