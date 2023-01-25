package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrganisationType")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrganisationTypeDTO {

    private String pic;
    private String legalName;
    private String legalStatus;
    private CommonTypeDTO validationStatus;
    private CommonTypeDTO organisationClassificationType;
    private AddressTypeDTO address;
    private double maxRankingScore;
    private double avgRankingScore;
    private double projectMatchingNumber;
    private boolean hasViewOrganisationDetailPanelRight;
    private String businessName;
    private String vat;
    private String legalRegNumber;
    private String erasmusInstitutionCode;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public CommonTypeDTO getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(CommonTypeDTO validationStatus) {
        this.validationStatus = validationStatus;
    }

    public CommonTypeDTO getOrganisationClassificationType() {
        return organisationClassificationType;
    }

    public void setOrganisationClassificationType(CommonTypeDTO organisationClassificationType) {
        this.organisationClassificationType = organisationClassificationType;
    }

    public AddressTypeDTO getAddress() {
        return address;
    }

    public void setAddress(AddressTypeDTO address) {
        this.address = address;
    }

    public double getMaxRankingScore() {
        return maxRankingScore;
    }

    public void setMaxRankingScore(double maxRankingScore) {
        this.maxRankingScore = maxRankingScore;
    }

    public double getAvgRankingScore() {
        return avgRankingScore;
    }

    public void setAvgRankingScore(double avgRankingScore) {
        this.avgRankingScore = avgRankingScore;
    }

    public double getProjectMatchingNumber() {
        return projectMatchingNumber;
    }

    public void setProjectMatchingNumber(double projectMatchingNumber) {
        this.projectMatchingNumber = projectMatchingNumber;
    }

    public boolean isHasViewOrganisationDetailPanelRight() {
        return hasViewOrganisationDetailPanelRight;
    }

    public void setHasViewOrganisationDetailPanelRight(boolean hasViewOrganisationDetailPanelRight) {
        this.hasViewOrganisationDetailPanelRight = hasViewOrganisationDetailPanelRight;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getLegalRegNumber() {
        return legalRegNumber;
    }

    public void setLegalRegNumber(String legalRegNumber) {
        this.legalRegNumber = legalRegNumber;
    }

    public String getErasmusInstitutionCode() {
        return erasmusInstitutionCode;
    }

    public void setErasmusInstitutionCode(String erasmusInstitutionCode) {
        this.erasmusInstitutionCode = erasmusInstitutionCode;
    }
}
