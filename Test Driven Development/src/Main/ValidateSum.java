package Main;

public class ValidateSum {
	ModelSum modelSum;
	public ValidateSum(ModelSum sumObj) {
		modelSum = sumObj;
	}
	
	public boolean checkIfInputIsValid() {
		if(modelSum.getFirstValue()==' ' || modelSum.getSecondValue()== ' ') {
			return false;
		}else {
			return true;
		}
	}
}
