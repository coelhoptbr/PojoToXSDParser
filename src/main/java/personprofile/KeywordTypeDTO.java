package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "KeywordType")
@XmlAccessorType(XmlAccessType.FIELD)
public class KeywordTypeDTO {

    private String id;
    private String description;
    private String ccmId;
    private String fullPath;
    public String getId() {
        return id;
    }
    String getCcmId() {
        return ccmId;
    }
    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCcmId(String ccmId) {
        this.ccmId = ccmId;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
}
