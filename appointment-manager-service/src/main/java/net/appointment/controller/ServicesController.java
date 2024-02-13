package net.appointment.controller;

import net.appointment.api.ServicesApi;
import net.appointment.model.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicesController implements ServicesApi {

    @Override
    public ResponseEntity<Void> deleteServiceById(String serviceId) {
        return ServicesApi.super.deleteServiceById(serviceId);
    }

    @Override
    public ResponseEntity<Service> getServiceById(String serviceId) {
        return ServicesApi.super.getServiceById(serviceId);
    }

    @Override
    public ResponseEntity<Service> updateServiceById(String serviceId, Service service) {
        return ServicesApi.super.updateServiceById(serviceId, service);
    }
}
