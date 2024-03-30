package emsi.tp2_spring.Web;

import emsi.tp2_spring.entities.Patient;
import emsi.tp2_spring.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/patients")// http://localhost:8082/patients affiche la liste de tous patients
    public List<Patient> patientList(){
        return patientRepository.findAll();
    }
}
