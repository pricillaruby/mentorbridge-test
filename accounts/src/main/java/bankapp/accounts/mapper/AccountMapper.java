package bankapp.accounts.mapper;

import bankapp.accounts.entity.AccountEntity;
import com.swagger.bank.model.AccountDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountMapper {

    private final ModelMapper modelMapper;

    public AccountDTO entityToDTO(AccountEntity accountEntity){
        return modelMapper.map(accountEntity , AccountDTO.class);
    }

    public AccountEntity DTOToEntity(AccountDTO accountDTO){
        return modelMapper.map(accountDTO , AccountEntity.class);
    }

    public void depositAmount(AccountEntity accountEntity , double amount){
        accountEntity.setBalanceAmount(accountEntity.getBalanceAmount() + amount);
    }

    public void withdrawAmount(AccountEntity accountEntity,double amount){
        accountEntity.setBalanceAmount(accountEntity.getBalanceAmount() - amount);
    }
}
