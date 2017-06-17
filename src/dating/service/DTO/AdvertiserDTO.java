package dating.service.DTO;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import java.util.ArrayList;
import java.util.List;
//</editor-fold>

public class AdvertiserDTO {
    
    public String UserName;
    public String Password;
    public String Gender;
    public Integer Age;
    public Float Income;
    public String AdvertDescription;
    public PartnerSoughtDTO PartnerSought;
    public List<AdvertiserReplyDTO> AdvertiserReplyList; 

    public AdvertiserDTO() {
        this.UserName = "";
        this.Password = "";
        this.Gender = "";
        this.Age = 0;
        this.Income = 0f;
        this.AdvertDescription = "";
        this.PartnerSought = new PartnerSoughtDTO();
        this.AdvertiserReplyList = new ArrayList<>();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public Float getIncome() {
        return Income;
    }

    public void setIncome(Float Income) {
        this.Income = Income;
    }

    public String getAdvertDescription() {
        return AdvertDescription;
    }

    public void setAdvertDescription(String AdvertDescription) {
        this.AdvertDescription = AdvertDescription;
    }

    public PartnerSoughtDTO getPartnerSought() {
        return PartnerSought;
    }

    public void setPartnerSought(PartnerSoughtDTO PartnerSought) {
        this.PartnerSought = PartnerSought;
    }

    public List<AdvertiserReplyDTO> getAdvertiserReplyList() {
        return AdvertiserReplyList;
    }

    public void setAdvertiserReplyList(List<AdvertiserReplyDTO> AdvertiserReplyList) {
        this.AdvertiserReplyList = AdvertiserReplyList;
    }
    
}
