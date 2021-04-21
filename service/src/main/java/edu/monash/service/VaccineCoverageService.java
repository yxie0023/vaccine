package edu.monash.service;

import edu.monash.dao.VaccineCoverage;

import java.util.List;

public interface VaccineCoverageService {

    List<VaccineCoverage> getVaccineRate();
}
