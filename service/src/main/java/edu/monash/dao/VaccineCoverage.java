package edu.monash.dao;

public class VaccineCoverage {

    private String countryName;

    private String countryCode;

    private String year;

    private String vaccineRate;

    private String vaccineName;

    private String vaccineCode;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVaccineRate() {
        return vaccineRate;
    }

    public void setVaccineRate(String vaccineRate) {
        this.vaccineRate = vaccineRate;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCode() {
        return vaccineCode;
    }

    public void setVaccineCode(String vaccineCode) {
        this.vaccineCode = vaccineCode;
    }
}
