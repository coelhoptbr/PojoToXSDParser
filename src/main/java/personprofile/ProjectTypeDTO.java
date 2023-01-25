package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ProjectType")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectTypeDTO {

    private CommonTypeDTO program;
    private String number;
    private String dg;
    private int internalId;
    private String iamRdg;
    private String iamProgramAbbreviation;
    private CommonTypeDTO call;
    private String acronym;
    private String title;
    private String phase;
    private String status;
    private CommonTypeDTO fundingScheme;
    private CommonTypeDTO subFundingScheme;
    private int minidashboardMessagesCount;
    private List<String> actions;
    private String source;
    private String businessIdentifier;
    private long startDate;
    private int duration;

    public CommonTypeDTO getCall() {
        return call;
    }

    public void setCall(CommonTypeDTO call) {
        this.call = call;
    }

    public CommonTypeDTO getFundingScheme() {
        return fundingScheme;
    }

    public void setFundingScheme(CommonTypeDTO fundingScheme) {
        this.fundingScheme = fundingScheme;
    }

    public CommonTypeDTO getSubFundingScheme() {
        return subFundingScheme;
    }

    public void setSubFundingScheme(CommonTypeDTO subFundingScheme) {
        this.subFundingScheme = subFundingScheme;
    }

    public CommonTypeDTO getProgram() {
        return program;
    }

    public void setProgram(CommonTypeDTO program) {
        this.program = program;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }

    public String getIamRdg() {
        return iamRdg;
    }

    public void setIamRdg(String iamRdg) {
        this.iamRdg = iamRdg;
    }

    public String getIamProgramAbbreviation() {
        return iamProgramAbbreviation;
    }

    public void setIamProgramAbbreviation(String iamProgramAbbreviation) {
        this.iamProgramAbbreviation = iamProgramAbbreviation;
    }


    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMinidashboardMessagesCount() {
        return minidashboardMessagesCount;
    }

    public void setMinidashboardMessagesCount(int minidashboardMessagesCount) {
        this.minidashboardMessagesCount = minidashboardMessagesCount;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBusinessIdentifier() {
        return businessIdentifier;
    }

    public void setBusinessIdentifier(String businessIdentifier) {
        this.businessIdentifier = businessIdentifier;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
