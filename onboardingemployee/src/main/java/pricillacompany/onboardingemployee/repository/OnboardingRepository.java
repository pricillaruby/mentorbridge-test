package pricillacompany.onboardingemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pricillacompany.onboardingemployee.entity.OnboardingEntity;

public interface OnboardingRepository extends JpaRepository<OnboardingEntity , Integer> {
}
