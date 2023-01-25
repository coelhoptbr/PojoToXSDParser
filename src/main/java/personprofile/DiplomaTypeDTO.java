package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DiplomaType")
@XmlAccessorType(XmlAccessType.FIELD)
public class DiplomaTypeDTO {

    private String id;
    private String value;
    private String description;
    private String diplomaLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiplomaLevel() {
        return diplomaLevel;
    }

    public void setDiplomaLevel(String diplomaLevel) {
        this.diplomaLevel = diplomaLevel;
    }
}
