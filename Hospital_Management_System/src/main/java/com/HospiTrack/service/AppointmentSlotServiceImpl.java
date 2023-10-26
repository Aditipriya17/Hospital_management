package com.HospiTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospiTrack.entity.AppointmentSlot;
import com.HospiTrack.repository.AppointmentSlotRepository;

@Service
public class AppointmentSlotServiceImpl implements AppointmentSlotService {
    @Autowired
    private AppointmentSlotRepository appointmentSlotRepository;

    @Override
    public List<AppointmentSlot> getAllAppointmentSlots() {
        return appointmentSlotRepository.findAll();
    }

    @Override
    public AppointmentSlot getAppointmentSlotById(Long id) {
        return appointmentSlotRepository.findById(id).orElse(null);
    }

    @Override
    public AppointmentSlot createAppointmentSlot(AppointmentSlot appointmentSlot) {
        return appointmentSlotRepository.save(appointmentSlot);
    }

    @Override
    public AppointmentSlot updateAppointmentSlot(Long id, AppointmentSlot appointmentSlot) {
        AppointmentSlot existingAppointmentSlot = appointmentSlotRepository.findById(id).orElse(null);
        if (existingAppointmentSlot != null) {
            existingAppointmentSlot.setStartTime(appointmentSlot.getStartTime());
            existingAppointmentSlot.setEndTime(appointmentSlot.getEndTime());
            existingAppointmentSlot.setDoctor(appointmentSlot.getDoctor());
            return appointmentSlotRepository.save(existingAppointmentSlot);
        }
        return null;
    }

    @Override
    public void deleteAppointmentSlot(Long id) {
        appointmentSlotRepository.deleteById(id);
    }
}
