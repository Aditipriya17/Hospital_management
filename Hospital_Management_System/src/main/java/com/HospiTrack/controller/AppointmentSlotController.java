package com.HospiTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospiTrack.entity.AppointmentSlot;
import com.HospiTrack.service.AppointmentSlotService;

@RestController
@RequestMapping("/appointment-slots")
@CrossOrigin
public class AppointmentSlotController {
    @Autowired
    private AppointmentSlotService appointmentSlotService;

    @GetMapping
    public List<AppointmentSlot> getAllAppointmentSlots() {
        return appointmentSlotService.getAllAppointmentSlots();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentSlot> getAppointmentSlotById(@PathVariable Long id) {
        AppointmentSlot appointmentSlot = appointmentSlotService.getAppointmentSlotById(id);
        if (appointmentSlot != null) {
            return ResponseEntity.ok(appointmentSlot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<AppointmentSlot> createAppointmentSlot(@RequestBody AppointmentSlot appointmentSlot) {
        AppointmentSlot createdAppointmentSlot = appointmentSlotService.createAppointmentSlot(appointmentSlot);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAppointmentSlot);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppointmentSlot> updateAppointmentSlot(@PathVariable Long id, @RequestBody AppointmentSlot appointmentSlot) {
        AppointmentSlot updatedAppointmentSlot = appointmentSlotService.updateAppointmentSlot(id, appointmentSlot);
        if (updatedAppointmentSlot != null) {
            return ResponseEntity.ok(updatedAppointmentSlot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointmentSlot(@PathVariable Long id) {
        appointmentSlotService.deleteAppointmentSlot(id);
        return ResponseEntity.noContent().build();
    }
}

