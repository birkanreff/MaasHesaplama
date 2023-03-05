
public class Employee {

	String name;
    int salary;
	int workHours;
	int hireYear;
	double bonus;
	double tax;
	double raiseSalary;
	
	public Employee (String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
 
	double tax() {
	double tax = 0;	
		if (this.salary > 1000) {
			 
		tax= this.salary * 0.03;
		}	
	return tax;
	}
	int bonus() {
		int bonus=0;
		if (workHours > 40) {
			
          bonus=  (workHours-40) * 30;
		}
	return bonus;
	
	}
	double raiseSalary() {
		double raise=0;
		
		int workYear = 2021 - hireYear ;
		
		if (workYear < 10) {
		raise =  (this.salary * 0.05);
			
		} else if ((workYear > 9) && (workYear < 20)) {
			raise =  (this.salary * 0.10);
			
		} else if (workYear > 20) {
             raise = this.salary * 0.15;
		}
	return raise;
	
	}
	public String toString() {
		return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours + "\nBaşlangıç Yılı: " + this.hireYear
				+ "\nVergi: " + this.tax() + "\nBonus: " + this.bonus() + "\nMaaş Artışı: " + this.raiseSalary()
				+ "\nVergi ve Bonuslar ile Birlikte Maaş: " + (this.raiseSalary() - this.tax() + this.bonus())
				+ "\nToplam Maaş: " + (this.salary + this.raiseSalary() + this.bonus() - this.tax());
		
		
		
	}
}

