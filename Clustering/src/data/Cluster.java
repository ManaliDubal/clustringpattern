package data;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
	
	//Attributes
	private List<Pattern> patternsList;
	public List<Pattern> getPatternsList() {
		return patternsList;
	}

	private List<Cluster> clusterList;
	
	public Cluster() {
		// TODO Auto-generated constructor stub
	}

	public List<Cluster> getClusterList() {
		return clusterList;
	}
	
	public List<Pattern> getPatterns(){
		List<Pattern> containedPatterns = new ArrayList<Pattern>();
		containedPatterns.addAll(patternsList);
		for(Cluster c : clusterList){
				containedPatterns.addAll(c.getPatterns());
		}
		return containedPatterns;
	}

	
}