package emsi.tp2_spring.service;

import emsi.tp2_spring.entities.Consultation;
import emsi.tp2_spring.entities.Medecin;
import emsi.tp2_spring.entities.Patient;
import emsi.tp2_spring.entities.RendezVous;

public interface IHospitalService {
    public  Patient savePatient(Patient patient);
    public  Medecin saveMedecin(Medecin medecin);
    public  RendezVous saveRendezVous(RendezVous rendezVous);
    public  Consultation saveConsultation(Consultation consultation);

}
