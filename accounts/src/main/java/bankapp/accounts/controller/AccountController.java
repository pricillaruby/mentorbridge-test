package bankapp.accounts.controller;

import bankapp.accounts.service.AccountService;
import com.swagger.bank.api.AccountApi;
import com.swagger.bank.model.WithdrawAmount;
import com.swagger.bank.model.DepositAmount;
import com.swagger.bank.model.AccountDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AccountController implements AccountApi {

    private final AccountService accountService;

    @Override
    public ResponseEntity<String> createAccount(AccountDTO accountDTO) {
        return accountService.createAccount(accountDTO);
    }

    @Override
    public ResponseEntity<AccountDTO> depositAmount(String accountNumber, DepositAmount amount) {
        return accountService.depositAmount(accountNumber, amount);
    }

    @Override
    public ResponseEntity<List<AccountDTO>> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @Override
    public ResponseEntity<AccountDTO> withdrawAmount(String accountNumber, WithdrawAmount amount) {
        return accountService.withdrawAmount(accountNumber, amount);
    }
}
