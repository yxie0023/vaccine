package edu.monash.dao;

public class CombinedVaccineDescEffects {
    private String vaccineName;

    private String description;

    private String sideEffects;

    private String vaccineAgeType;

    public String getDescription() {
        return description;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public String getVaccineAgeType() {
        return vaccineAgeType;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
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
