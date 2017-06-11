package Lesson2;

import java.util.List;

public class Release {
	
	private List<Sprint> sprintList;
	private List<Feature> featureList;
	private Project project;
	
	public Release(List<Sprint> sprintList, List<Feature> featureList,Project project) {
		super();
		this.sprintList = sprintList;
		this.featureList = featureList;
		this.project = project;
	}

	public void addSprint(Sprint sprint){
		sprintList.add(sprint);
	}

	public void addFeature(Feature feature){
		featureList.add(feature);
	}

	public List<Sprint> getSprintList() {
		return sprintList;
	}

	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}

	public List<Feature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	

}

