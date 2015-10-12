/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;
/*import com.ampl.AMPL;
import com.ampl.DataFrame;
import com.ampl.Objective;
import com.ampl.Parameter;
import com.ampl.Variable;
import java.io.IOException;
/**
 *
 * @author mahith
 */
  /* public class Simulation {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    /*    public static void main(String[] args)throws Exception{
            //creating an instancee for AMPL to run the model
            /*
                    AMPL ampl;
             ampl = new AMPL();
             // Try-catch to read the     
             try{
                  //Define the directory where models are located    
                  String modelpath;
                  modelpath="F:/Master thesis/operation room/Other stuff/ampl-demo-mswin/ampl-demo/amplapi/examples/models";

                  // Read the files from the directory 
                  ampl.read(modelpath + "/op_plan.mod");
                  ampl.readData(modelpath + "/data.dat");
                  //ampl.read( modelpath + "/op_plan.run");
                  
                  // selecting the solver
                  ampl.setOption("solver","cplex");
                  ampl.setOption("cplex_options","mipdisplay=2");
                  //ampl.setOption("log_file",modelpath + "/x.txt");
                  
                  //solves the optimization model with the given input values and expernal defined constraints 
                  ampl.solve();
                  ampl.getValue("_solve_elapsed_time");
                  ampl.display("_solve_elapsed_time");
                  ampl.display("M");
                  
                  // Retrieve the objective value and print the objectiveective function
                  Objective overtime_cost=ampl.getObjective("overtime_cost");
                  System.out.format( "The objective function :%f%n",overtime_cost.value());
                 
                  //Displays the objective value in another way
                  ampl.display("overtime_cost");
                  //Display number of operating rooms
                  ampl.display("OPERATING_ROOMS");
                  ampl.display("SURGERIES");
                  ampl.display("SURGERIES_IN_ROOM");
            
                  // Retrieve the variable to perform necessary operations(get & set data)
                  Parameter preop_time=ampl.getParameter("preop_time");
                  System.out.println("Preop_time is :");
                  System.out.println(preop_time.getValues());
                  
                  Parameter op_time=ampl.getParameter("op_time");
                  DataFrame df1=op_time.getValues();
                  System.out.println("Op_time is :");
                  System.out.println(df1);
                  
                  Variable preop_start_time=ampl.getVariable("preop_start_time");
                  System.out.println("Preop_start_time is:");
                  System.out.println(preop_start_time.getValues());
                  
                  Variable op_start_time=ampl.getVariable("op_start_time");
                  System.out.println("opstart_time is :");
                  System.out.println(op_start_time.getValues());
                
                  Variable op_end_time=ampl.getVariable("op_end_time");
                  DataFrame df=op_end_time.getValues();
                  System.out.println("op_end_time is :");
                  System.out.println(df);
                  
                  ampl.display("y");
                  ampl.display("z");
                  ampl.display("overtime");
                  ampl.display("daily_work_time_mins");
                  ampl.display("pretime_betw_op");
                  ampl.display("num_resources");
                  
                }
             catch (IOException e){
                  throw new RuntimeException(e);
                }
             finally{
                   // Free the resources   
                   ampl.close();
                }
            */        
      //   }
    
   // } 
                    
// variable ante output vachevi...... parameter ante input check diet.mod
//.value()single instance........ getvalues() all instances.


