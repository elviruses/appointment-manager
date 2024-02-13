package net.appointment.controller;

import net.appointment.api.CompaniesApi;
import net.appointment.model.*;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@RestController
public class CompaniesController implements CompaniesApi {

    @Override
    public ResponseEntity<Company> createCompany(Company company) {
        return CompaniesApi.super.createCompany(company);
    }

    @Override
    public ResponseEntity<Employee> createEmployee(String companyId, Employee employee) {
        return CompaniesApi.super.createEmployee(companyId, employee);
    }

    @Override
    public ResponseEntity<Review> createReviewForCompany(String companyId, ReviewInput reviewInput) {
        return CompaniesApi.super.createReviewForCompany(companyId, reviewInput);
    }

    @Override
    public ResponseEntity<Service> createService(String companyId, Service service) {
        return CompaniesApi.super.createService(companyId, service);
    }

    @Override
    public ResponseEntity<Void> deleteCompanyById(String companyId) {
        return CompaniesApi.super.deleteCompanyById(companyId);
    }

    @Override
    public ResponseEntity<List<GetAvailableAppointmentSlots200ResponseInner>> getAvailableAppointmentSlots(String companyId, String employeeId, String serviceId, LocalDate date) {
        return CompaniesApi.super.getAvailableAppointmentSlots(companyId, employeeId, serviceId, date);
    }

    @Override
    public ResponseEntity<List<Company>> getCompanies() {
        return CompaniesApi.super.getCompanies();
    }

    @Override
    public ResponseEntity<Company> getCompanyById(String companyId) {
        return CompaniesApi.super.getCompanyById(companyId);
    }

    @Override
    public ResponseEntity<Resource> getCompanyLogo(String companyId) {
        return CompaniesApi.super.getCompanyLogo(companyId);
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployeesByCompany(String companyId) {
        return CompaniesApi.super.getEmployeesByCompany(companyId);
    }

    @Override
    public ResponseEntity<List<Review>> getReviewsByCompany(String companyId) {
        return CompaniesApi.super.getReviewsByCompany(companyId);
    }

    @Override
    public ResponseEntity<Resource> getServiceImage(String companyId, String serviceId) {
        return CompaniesApi.super.getServiceImage(companyId, serviceId);
    }

    @Override
    public ResponseEntity<List<Service>> getServicesByCompany(String companyId) {
        return CompaniesApi.super.getServicesByCompany(companyId);
    }

    @Override
    public ResponseEntity<List<Employee>> searchEmployees(String companyId, String name) {
        return CompaniesApi.super.searchEmployees(companyId, name);
    }

    @Override
    public ResponseEntity<Company> updateCompanyById(String companyId, Company company) {
        return CompaniesApi.super.updateCompanyById(companyId, company);
    }

    @Override
    public ResponseEntity<Void> uploadCompanyLogo(String companyId, MultipartFile file) {
        return CompaniesApi.super.uploadCompanyLogo(companyId, file);
    }

    @Override
    public ResponseEntity<Void> uploadServiceImage(String companyId, String serviceId, MultipartFile file) {
        return CompaniesApi.super.uploadServiceImage(companyId, serviceId, file);
    }
}
