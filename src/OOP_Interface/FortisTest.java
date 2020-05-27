package OOP_Interface;

public class FortisTest {

	public static void main(String[] args) {
		
		FortisHospital fs=new FortisHospital();
		fs.cardioServices();
		fs.neuroServices();
		fs.medicalInsurance();
		fs.oncologyServices();
		fs.pathologyServices();
		fs.ebola();
		fs.polio();
		fs.pandemic();
		fs.vaccination();
		fs.nursing();
	
	//topcasting
		
	USMedical us=new FortisHospital();
	
	
	us.cardioServices();
	us.neuroServices();
	us.orthoServices();
	us.Services911();
	
	USMedical.medicine();
	System.out.println(USMedical.min_fee);
	
	UKMedical uk=new FortisHospital();
	
	uk.pediatricServices();
	uk.physioServices();
	
	IndianMedical im=new FortisHospital();
	
	im.oncologyServices();
	im.pathologyServices();
	im.radioServices();
	
	
	}
    
	
}
