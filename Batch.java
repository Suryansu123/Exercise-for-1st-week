package com.htc.exercise1stwk.main;

public class Batch{
	
	public String batchCode;
	public int startDate;
	public int endDate;
	public String Trainee[];
	
	public Trainee[] getTrainees(String gender) {
		System.out.println("gender" + gender);
		return null;
		
	}
	public Trainee[] getTrainee(int traineeId)throws TraineeNotFoundException {
		
		System.out.println("TraineeID" + traineeId);
		return null;
	   }
  }


