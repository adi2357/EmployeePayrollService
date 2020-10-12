package com.bridgelabz.employeepayrollservice;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.employeepayrollservice.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployees = { 
				new EmployeePayrollData(1, "Aditya Verma", 800000.0),
				new EmployeePayrollData(2, "Akhil Singh", 850000.0),
				new EmployeePayrollData(3, "Anamika Bhatt", 900000.0) };

		EmployeePayrollService payrollServiceObject = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		payrollServiceObject.writeEmployeeDdate(IOService.FILE_IO);
		payrollServiceObject.printEmployeePayrollData();

		Assert.assertEquals(3, payrollServiceObject.countEnteries(IOService.FILE_IO));
	}

}
