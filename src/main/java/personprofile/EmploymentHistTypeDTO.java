package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmploymentHistType")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmploymentHistTypeDTO {

    private String id;
    private Boolean currentJob;
    private String  jobTitle;
    private String employedFrom;
    private String employedTo;
    private String orgName;
    private CcmTypeDTO orgCountry;
    private String orgCity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(Boolean currentJob) {
        this.currentJob = currentJob;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployedFrom() {
        return employedFrom;
    }

    public void setEmployedFrom(String employedFrom) {
        this.employedFrom = employedFrom;
    }

    public String getEmployedTo() {
        return employedTo;
    }

    public void setEmployedTo(String employedTo) {
        this.employedTo = employedTo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public CcmTypeDTO getOrgCountry() {
        return orgCountry;
    }

    public void setOrgCountry(CcmTypeDTO orgCountry) {
        this.orgCountry = orgCountry;
    }

    public String getOrgCity() {
        return orgCity;
    }

    public void setOrgCity(String orgCity) {
        this.orgCity = orgCity;
    }
}
