package Main;

public class CalculateSum {	
	ValidateSum validateSum;
	ModelSum modelSum;	
	public CalculateSum(ModelSum sumObj){
		modelSum = sumObj;
		validateSum = new ValidateSum(sumObj);		
	}
	public int sum() {
		if(validateSum.checkIfInputIsValid()) {
			return modelSum.getFirstValue() +  modelSum.getSecondValue();
		}else {
			return 0;
		}		
	}
}
