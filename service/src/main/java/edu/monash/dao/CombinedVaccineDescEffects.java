package edu.monash.dao;

public class CombinedVaccineDescEffects {
    private String vaccineName;

    private String description;

    private String sideEffect;

    private String vaccineAgeType;

    public String getDescription() {
        return description;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public String getVaccineAgeType() {
        return vaccineAgeType;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public void setVaccineAgeType(String vaccineAgeType) {
        this.vaccineAgeType = vaccineAgeType;
    }
}
