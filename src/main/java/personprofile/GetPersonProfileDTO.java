package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "GetPersonProfile")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetPersonProfileDTO {

    public static enum ResponseCode {
        UNKNOWN_ECAS_EMAIL, //err
        PERSON_PROFILE_NOT_FOUND,
        PERSON_PROFILE_NOT_PUBLISHED,
        PERSON_PROFILE_PUBLISHED    //ok
    }

    private ResponseCode responseCode;
    private LegalEntityDTO personProfile;

    public GetPersonProfileDTO() {
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public LegalEntityDTO getPersonProfile() {
        return personProfile;
    }

    public void setPersonProfile(LegalEntityDTO personProfile) {
        this.personProfile = personProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPersonProfileDTO that = (GetPersonProfileDTO) o;
        return responseCode == that.responseCode && Objects.equals(personProfile, that.personProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode, personProfile);
    }
}
