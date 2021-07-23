package employeepayroll;

public class EmployeePayRollMain 
{
	public static void main(String[] args) 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		System.out.println("Welcolme to Employee PayRoll");
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}
}
