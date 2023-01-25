package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EducationType")
@XmlAccessorType(XmlAccessType.FIELD)
public class EducationTypeDTO {

    private String id;
    private String year;
    private String institution;
    private String department;
    private DiplomaTypeDTO diplomaType;
    private String countryText;
    private CcmTypeDTO country;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public DiplomaTypeDTO getDiplomaType() {
        return diplomaType;
    }

    public void setDiplomaType(DiplomaTypeDTO diplomaType) {
        this.diplomaType = diplomaType;
    }

    public String getCountryText() {
        return countryText;
    }

    public void setCountryText(String countryText) {
        this.countryText = countryText;
    }

    public CcmTypeDTO getCountry() {
        return country;
    }

    public void setCountry(CcmTypeDTO country) {
        this.country = country;
    }
}
