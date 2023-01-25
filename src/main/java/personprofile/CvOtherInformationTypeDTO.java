package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CvOtherInformationType")
@XmlAccessorType(XmlAccessType.FIELD)
public class CvOtherInformationTypeDTO {

    private String id;
    private String cv;
    private String cvDomainCcmId;
    private String cvDomainIdentifier;
    private String domain;
    private String link;

    public String getId() {
        return id;
    }
    public String getCvDomainCcmId() {
        return cvDomainCcmId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public void setCvDomainCcmId(String cvDomainCcmId) {
        this.cvDomainCcmId = cvDomainCcmId;
    }

    public String getCvDomainIdentifier() {
        return cvDomainIdentifier;
    }

    public void setCvDomainIdentifier(String cvDomainIdentifier) {
        this.cvDomainIdentifier = cvDomainIdentifier;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
