package Abstraction;

import Encapsulation.InstructorDetails;
import Inheritance.SpecializedModule;
import Polymorphism.DiscountProgramCost;
import Polymorphism.ProgramCost;

public class CourseTest {

	public static void main(String[] args) {
		System.out.println("----Course Name----");
		CourseName coursename = new CourseDetails();
		coursename.Selenium();
		coursename.QTP();
		coursename.Performance();

		CourseSchedule courseschedule = new CourseSchedule();
		courseschedule.Course();

		CourseDuration courseduration = new CourseSchedule();
		courseduration.Selenium();
		courseduration.QTP();
		courseduration.Performance();

		System.out.println("Selenium instructor:");
		InstructorDetails seleniuminstructordetails = new InstructorDetails();
		seleniuminstructordetails.setInstructorId(111);
		seleniuminstructordetails.setInstructorName("Mafi");
		seleniuminstructordetails.setInstructorPhone("123-222-1234");
		seleniuminstructordetails.setInstructorEmail("mafi@gmail.com");
		System.out.println("ID:" + seleniuminstructordetails.getInstructorId() + " " + "Name:"
				+ seleniuminstructordetails.getInstructorName() + " " + "Phone:"
				+ seleniuminstructordetails.getInstructorPhone() + " " + "Email: "
				+ seleniuminstructordetails.getInstructorEmail());

		System.out.println("QTP instructor:");
		InstructorDetails qtpinstructordetails = new InstructorDetails();
		qtpinstructordetails.setInstructorId(112);
		qtpinstructordetails.setInstructorName("Jay");
		qtpinstructordetails.setInstructorPhone("124-222-2345");
		qtpinstructordetails.setInstructorEmail("jay@gmail.com");
		System.out.println("ID:" + qtpinstructordetails.getInstructorId() + " " + "Name:"
				+ qtpinstructordetails.getInstructorName() + " " + "Phone:" + qtpinstructordetails.getInstructorPhone()
				+ " " + "Email: " + qtpinstructordetails.getInstructorEmail());

		System.out.println("Performance instructor:");
		InstructorDetails performanceinstructordetails = new InstructorDetails();
		performanceinstructordetails.setInstructorId(113);
		performanceinstructordetails.setInstructorName("Paul");
		performanceinstructordetails.setInstructorPhone("144-256-2345");
		performanceinstructordetails.setInstructorEmail("paul@gmail.com");
		System.out.println("ID:" + performanceinstructordetails.getInstructorId() + " " + "Name:"
				+ performanceinstructordetails.getInstructorName() + " " + "Phone:"
				+ performanceinstructordetails.getInstructorPhone() + " " + "Email: "
				+ performanceinstructordetails.getInstructorEmail());

		System.out.println("Class Module");
		SpecializedModule specializedmodule = new SpecializedModule();
		specializedmodule.core();
		specializedmodule.Specialized();

		ProgramCost programcost = new ProgramCost();
		int fourinstallment = programcost.installment(1000, 1000, 1000, 1000);
		System.out.println("Four intallment: " + fourinstallment);
		int threeinstallment = programcost.installment(1000, 1000, 1000);
		System.out.println("Three installment: " + threeinstallment);

		DiscountProgramCost programcost1 = new DiscountProgramCost();
		int cost = programcost1.installment(1000, 1000, 1000, 1000);
		System.out.println("Discount price:" + cost);
	}

}
