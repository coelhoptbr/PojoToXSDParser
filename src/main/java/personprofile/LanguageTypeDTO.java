package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LanguageType")
@XmlAccessorType(XmlAccessType.FIELD)
public class LanguageTypeDTO {

    private CcmTypeDTO languageCode;
    private String priority;
    private Boolean motherTongue;
    private CompositeLevelTypeDTO compositeLevel;

    public CcmTypeDTO getLanguageCode() {
        return languageCode;
    }

    public Boolean isMotherTongue() {
        return motherTongue;
    }

    public CompositeLevelTypeDTO getCompositeLevel() {
        return compositeLevel;
    }

    public void setLanguageCode(CcmTypeDTO languageCode) {
        this.languageCode = languageCode;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Boolean getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(Boolean motherTongue) {
        this.motherTongue = motherTongue;
    }

    public void setCompositeLevel(CompositeLevelTypeDTO compositeLevel) {
        this.compositeLevel = compositeLevel;
    }
}
