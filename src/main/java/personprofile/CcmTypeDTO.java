package personprofile;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CcmType")
@XmlAccessorType(XmlAccessType.FIELD)
public class CcmTypeDTO {

    private String Id;

    private String Description;

    public String getId() {
        return Id;
    }

    public String getDescription() {
        return Description;
    }
}
