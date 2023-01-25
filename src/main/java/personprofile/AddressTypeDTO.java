package personprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddressType")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressTypeDTO {

    private String street;
    private String city;
    private CommonTypeDTO country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CommonTypeDTO getCountry() {
        return country;
    }

    public void setCountry(CommonTypeDTO country) {
        this.country = country;
    }
}
