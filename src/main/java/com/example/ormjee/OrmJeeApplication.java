package com.example.ormjee;

import com.example.ormjee.entities.Patient;
import com.example.ormjee.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmJeeApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patienRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmJeeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      patienRepository.save(new Patient(null,"nom","2002-06-01",true,7));
      patienRepository.save(new Patient(null,"nom2","2001-06-01",false,2));
      patienRepository.save(new Patient(null,"nom3","2000-06-01",true,3));
      List<Patient> patients=patienRepository.findAll();
      patients.forEach(p->
      { System.out.println(patients.toString());
      });
      Patient patient=patienRepository.findById(Long.valueOf(1)).get();
        System.out.println("**********");
        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDateN());
        System.out.println(patient.getScore());
        System.out.println("**********");
        System.out.println("--------");
       patienRepository.deleteById(Long.valueOf(1));
        List<Patient> patients2=patienRepository.findAll();
        patients2.forEach(p->
        { System.out.println(patients2.toString());
        });
        System.out.println("--------");

    }

}
