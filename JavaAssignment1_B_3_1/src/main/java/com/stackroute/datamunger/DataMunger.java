package com.stackroute.datamunger;

import java.util.List;

import com.stackroute.datamunger.query.Query;
import com.stackroute.datamunger.query.QueryParser;
import com.stackroute.datamunger.restrictions.Restriction;

public class DataMunger {
	
	public static void main(String[] args){
		
     Query query=new Query();
     
     QueryParser queryParser=query.executeQuery("select * from Employee.csv where dept=HR and Salary>=35000");
      
     List<Restriction> restrictions=queryParser.getRestrictionList();
     int count=1;
     for(Restriction restriction : restrictions)
     {
    	 System.out.println("Restriction - "+count);
    	 System.out.println("PropertyName :"+restriction.getPropertyName());
    	 System.out.println("PropertyValue :"+restriction.getPropertyValue());
    	 System.out.println("conditionalOperator :"+restriction.getConditionalOperator());
    	 count++;
     }
     

	}

}
