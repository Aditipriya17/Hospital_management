package com.HospiTrack.service;

import java.util.List;

import com.HospiTrack.entity.AppointmentSlot;

public interface AppointmentSlotService {
    List<AppointmentSlot> getAllAppointmentSlots();
    AppointmentSlot getAppointmentSlotById(Long id);
    AppointmentSlot createAppointmentSlot(AppointmentSlot appointmentSlot);
    AppointmentSlot updateAppointmentSlot(Long id, AppointmentSlot appointmentSlot);
    void deleteAppointmentSlot(Long id);
}

