package Test;
import Main.ModelSum;

import java.util.HashMap;
import java.util.Map;

public class MockSum {
	private Map<Integer, ModelSum> modelSumMap;
	public MockSum() {
		modelSumMap = new HashMap<Integer, ModelSum>();
		mockObjects();
	}
	public void mockObjects() {
		ModelSum firstObject = new ModelSum();
		firstObject.setFirstValue(-1);
		firstObject.setSecondValue(1);
		modelSumMap.put(0, firstObject);
		
		ModelSum secondObject = new ModelSum();
		secondObject.setFirstValue(0);
		secondObject.setSecondValue(0);
		modelSumMap.put(1, firstObject);
		
		ModelSum thirdObject = new ModelSum();
		thirdObject.setFirstValue(1);
		thirdObject.setSecondValue(1);
		modelSumMap.put(2, firstObject);
		
		ModelSum fourthObject = new ModelSum();
		fourthObject.setFirstValue(-1);
		fourthObject.setSecondValue(-1);
		modelSumMap.put(3, firstObject);
	}
	
	public ModelSum loadObject(int passedIndexOfMap) {
		return modelSumMap.get(passedIndexOfMap);
	}
}
