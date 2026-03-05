package bankapp.accounts.service;

import bankapp.accounts.entity.AccountEntity;
import bankapp.accounts.mapper.AccountMapper;
import bankapp.accounts.repository.AccountRepository;
import com.swagger.bank.model.AccountDTO;
import com.swagger.bank.model.DepositAmount;
import com.swagger.bank.model.WithdrawAmount;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    public ResponseEntity<String> createAccount(AccountDTO accountDTO) {
        AccountEntity accountEntity = accountMapper.DTOToEntity(accountDTO);
        accountRepository.save(accountEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Account was successfully created");
    }

    public ResponseEntity<AccountDTO> depositAmount(String accountNumber , DepositAmount amount) {
        AccountEntity accountEntity = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(()-> new RuntimeException("Account Number not found"));
        accountMapper.depositAmount(accountEntity , amount.getDepositAmount());
        accountRepository.save(accountEntity);
        return ResponseEntity.ok(accountMapper.entityToDTO(accountEntity));
    }

    public ResponseEntity<List<AccountDTO>> getAllAccounts() {
        List<AccountEntity> accountEntityList = accountRepository.findAll();

        List<AccountDTO> accountList = accountEntityList.stream()
                .map(accountMapper::entityToDTO)
                .toList();

        return ResponseEntity.ok(accountList);
    }

    public ResponseEntity<AccountDTO> withdrawAmount(String accountNumber, WithdrawAmount amount) {
        AccountEntity accountEntity = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(()-> new RuntimeException("Account Number not found"));

        if(accountEntity.getBalanceAmount() < amount.getWithdrawAmount()){
            throw new RuntimeException("Insufficient Balance");
        }

        accountMapper.withdrawAmount(accountEntity , amount.getWithdrawAmount());
        accountRepository.save(accountEntity);
        return ResponseEntity.ok(accountMapper.entityToDTO(accountEntity));
    }
}
