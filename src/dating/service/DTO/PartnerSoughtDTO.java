package dating.service.DTO;

public class PartnerSoughtDTO {
    
    public String Gender;
    public Integer MinAge;
    public Integer MaxAge;
    public Integer MinIncome;
    public Integer MaxIncome;

    public PartnerSoughtDTO() {
        this.Gender = "";
        this.MinAge = 0;
        this.MaxAge = 0;
        this.MinIncome = 0;
        this.MaxIncome = 0;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Integer getMinAge() {
        return MinAge;
    }

    public void setMinAge(Integer MinAge) {
        this.MinAge = MinAge;
    }

    public Integer getMaxAge() {
        return MaxAge;
    }

    public void setMaxAge(Integer MaxAge) {
        this.MaxAge = MaxAge;
    }

    public Integer getMinIncome() {
        return MinIncome;
    }

    public void setMinIncome(Integer MinIncome) {
        this.MinIncome = MinIncome;
    }

    public Integer getMaxIncome() {
        return MaxIncome;
    }

    public void setMaxIncome(Integer MaxIncome) {
        this.MaxIncome = MaxIncome;
    }
    
}
