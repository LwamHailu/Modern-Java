package Lesson2;

import java.sql.Date;
import java.util.List;

class Sprint {
	
	private Date dueDate;
	private List<Feature> featureList;
	private Release release;

	public Sprint(Date dueDate, List<Feature> featureList, Release release) {
		super();
		this.dueDate = dueDate;
		this.featureList = featureList;
		this.release = release;
	}
	
	public void addFeature(Feature feature){
		featureList.add(feature);
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public List<Feature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}

	public Release getRelease() {
		return release;
	}

	public void setRelease(Release release) {
		this.release = release;
	}
	
	
}
