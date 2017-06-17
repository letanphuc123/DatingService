package dating.service.DTO;

public class PartnerSoughtDTO {
    
    public String Gender;
    public Integer MinAge;
    public Integer MaxAge;
    public Float MinIncome;
    public Float MaxIncome;

    public PartnerSoughtDTO() {
        this.Gender = "";
        this.MinAge = 0;
        this.MaxAge = 0;
        this.MinIncome = 0f;
        this.MaxIncome = 0f;
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

    public Float getMinIncome() {
        return MinIncome;
    }

    public void setMinIncome(Float MinIncome) {
        this.MinIncome = MinIncome;
    }

    public Float getMaxIncome() {
        return MaxIncome;
    }

    public void setMaxIncome(Float MaxIncome) {
        this.MaxIncome = MaxIncome;
    }
    
}
