package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "LegalEntity")
@XmlAccessorType(XmlAccessType.FIELD)
public class LegalEntityDTO {
    private LegalEntityTypeEnum type;
    private String id;
    private String title;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String nationality1;
    private String nationality2;
    private String nationality3;
    private String birthDate;
    private String countryOfBirth;
    private String cityOfBirth;
    private String biography;
    private List<String> languages;
    private String ecasId;
    private List<ProjectTypeDTO> projects;
    private long lastModified;
    private List<String> keywords;
    private List<KeywordTypeDTO> areaOfExpertise;
    private List<EmploymentHistTypeDTO> employment;
    private List<OrganisationTypeDTO> organisations;
    private String country;
    private String city;
    private String orcId;
    private List<PublicationTypeDTO> publications;
    private List<EducationTypeDTO> educations;
    private List<CvOtherInformationTypeDTO> cvIds;
    private List<CvOtherInformationTypeDTO> cvLinks;
    private String professionalProfile;
    private int noOfProjects;
    private int noOfPartnerSearch;
    private Boolean hasPartnerSearch;
    private String url;
    private List<String> keywordIds;
    private List<String> programmes;
    private List<String> topics;
    private List<Object> announcements;//TODO: review data type
    private String careerStage;
    private List<String> cvTypeCcmIds;

    public LegalEntityTypeEnum getType() {
        return type;
    }

    public void setType(LegalEntityTypeEnum type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality1() {
        return nationality1;
    }

    public void setNationality1(String nationality1) {
        this.nationality1 = nationality1;
    }

    public String getNationality2() {
        return nationality2;
    }

    public void setNationality2(String nationality2) {
        this.nationality2 = nationality2;
    }

    public String getNationality3() {
        return nationality3;
    }

    public void setNationality3(String nationality3) {
        this.nationality3 = nationality3;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getEcasId() {
        return ecasId;
    }

    public void setEcasId(String ecasId) {
        this.ecasId = ecasId;
    }

    public List<ProjectTypeDTO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectTypeDTO> projects) {
        this.projects = projects;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<KeywordTypeDTO> getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(List<KeywordTypeDTO> areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    public List<EmploymentHistTypeDTO> getEmployment() {
        return employment;
    }

    public void setEmployment(List<EmploymentHistTypeDTO> employment) {
        this.employment = employment;
    }

    public List<OrganisationTypeDTO> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(List<OrganisationTypeDTO> organisations) {
        this.organisations = organisations;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrcId() {
        return orcId;
    }

    public void setOrcId(String orcId) {
        this.orcId = orcId;
    }

    public List<PublicationTypeDTO> getPublications() {
        return publications;
    }

    public void setPublications(List<PublicationTypeDTO> publications) {
        this.publications = publications;
    }

    public List<EducationTypeDTO> getEducations() {
        return educations;
    }

    public void setEducations(List<EducationTypeDTO> educations) {
        this.educations = educations;
    }

    public List<CvOtherInformationTypeDTO> getCvIds() {
        return cvIds;
    }

    public void setCvIds(List<CvOtherInformationTypeDTO> cvIds) {
        this.cvIds = cvIds;
    }

    public List<CvOtherInformationTypeDTO> getCvLinks() {
        return cvLinks;
    }

    public void setCvLinks(List<CvOtherInformationTypeDTO> cvLinks) {
        this.cvLinks = cvLinks;
    }

    public String getProfessionalProfile() {
        return professionalProfile;
    }

    public void setProfessionalProfile(String professionalProfile) {
        this.professionalProfile = professionalProfile;
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

    public int getNoOfPartnerSearch() {
        return noOfPartnerSearch;
    }

    public void setNoOfPartnerSearch(int noOfPartnerSearch) {
        this.noOfPartnerSearch = noOfPartnerSearch;
    }

    public Boolean getHasPartnerSearch() {
        return hasPartnerSearch;
    }

    public void setHasPartnerSearch(Boolean hasPartnerSearch) {
        this.hasPartnerSearch = hasPartnerSearch;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getKeywordIds() {
        return keywordIds;
    }

    public void setKeywordIds(List<String> keywordIds) {
        this.keywordIds = keywordIds;
    }

    public List<String> getProgrammes() {
        return programmes;
    }

    public void setProgrammes(List<String> programmes) {
        this.programmes = programmes;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public List<Object> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Object> announcements) {
        this.announcements = announcements;
    }

    public String getCareerStage() {
        return careerStage;
    }

    public void setCareerStage(String careerStage) {
        this.careerStage = careerStage;
    }

    public List<String> getCvTypeCcmIds() {
        return cvTypeCcmIds;
    }

    public void setCvTypeCcmIds(List<String> cvTypeCcmIds) {
        this.cvTypeCcmIds = cvTypeCcmIds;
    }
}