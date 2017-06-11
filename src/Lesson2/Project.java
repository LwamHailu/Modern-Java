package Lesson2;

import java.util.List;

public class Project {
	private String projectId;
	private List<Feature>featureList;
	private List<Release>releaseList;
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public List<Feature> getFeaturelist() {
		return featureList;
	}
	public void setFeaturelist(List<Feature> featurelist) {
		this.featureList = featurelist;
	}
	public List<Release> getReleaselist() {
		return releaseList;
	}
	public void setReleaselist(List<Release> releaselist) {
		this.releaseList = releaselist;
	}
	
	public void addRelease(Release release){
		releaseList.add(release);
	}
	
public Project( String projectId,List<Release>releaseList,List<Feature>featureList){
	
this.projectId = projectId;
this.releaseList = releaseList;
this.featureList = featureList;
}}
