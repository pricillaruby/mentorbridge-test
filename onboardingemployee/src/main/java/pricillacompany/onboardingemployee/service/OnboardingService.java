package pricillacompany.onboardingemployee.service;

import com.swaggerexample.Swaggerex.model.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pricillacompany.onboardingemployee.entity.OnboardingEntity;
import pricillacompany.onboardingemployee.mapper.OnboardingMapper;
import pricillacompany.onboardingemployee.repository.OnboardingRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OnboardingService {

    @Autowired
    private final OnboardingRepository onboardingRepository;

    @Autowired
    private final OnboardingMapper onboardingMapper;

    public ResponseEntity<String> addEmployee(EmployeeDTO employeeDTO) {
        OnboardingEntity onboardingEntity = onboardingMapper.dtoToEntity(employeeDTO);

        onboardingRepository.save(onboardingEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created");

    }

    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        List<OnboardingEntity> employeeEntity = onboardingRepository.findAll();

        List<EmployeeDTO> employeeDTO = employeeEntity.stream()
                .map(onboardingMapper::entityToDTO)
                .toList();

        return ResponseEntity.ok(employeeDTO);
    }
}
