package pricillacompany.onboardingemployee.mapper;

import com.swaggerexample.Swaggerex.model.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import pricillacompany.onboardingemployee.entity.OnboardingEntity;

@Component
@AllArgsConstructor
public class OnboardingMapper {

    public final ModelMapper modelMapper;

    public EmployeeDTO entityToDTO(OnboardingEntity onboardingEntity){
        return modelMapper.map(onboardingEntity , EmployeeDTO.class);
    }

    public OnboardingEntity dtoToEntity(EmployeeDTO employeeDTO){
        return modelMapper.map(employeeDTO , OnboardingEntity.class);
    }
}
