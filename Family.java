package lib;

import java.util.LinkedList;
import java.util.List;

public class Family extends Salary {
    private String spouseName;
	private String spouseIdNumber;

    private int idNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;
	
    public Family (){
        childNames = new LinkedList<String>();
        childIdNumbers = new LinkedList<String>();
    }

    public String getspouseName() {
        return spouseName;
    }

    public String getspouseIdNumber() {
        return spouseIdNumber;
    }

    public void setspouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}

    public int getidNumber(){
        return idNumber;
    }

    public void setidNumber(int idNumber) {
        this.idNumber = idNumber;
    }
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
  
}