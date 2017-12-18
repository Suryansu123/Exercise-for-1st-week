package com.htc.exercise1stwk.main;

public class Trainee {
   public String traineeId;
   public String traineeName;
   public int contactNo;
   public String emailId;
   public String gender;
   public int age;
   
   
   public static void main(String[] args) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
       Batch bch= new Batch();
       bch.getTrainee(10);
       bch.getTrainees("Male");
                     
                   
	}
 }
