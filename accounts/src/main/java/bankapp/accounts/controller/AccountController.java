package bankapp.accounts.controller;

import bankapp.accounts.service.AccountService;
import com.swagger.bank.api.AccountApi;
import com.swagger.bank.model.AccountDTO;
import com.swagger.bank.model.AccountIdBody;
import com.swagger.bank.model.AccountIdBody1;
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
    public ResponseEntity<AccountDTO> depositAmount(Integer id, AccountIdBody1 accountDetails) {
        return accountService.depositAmount(id, accountDetails);
    }

    @Override
    public ResponseEntity<List<AccountDTO>> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @Override
    public ResponseEntity<AccountDTO> withdrawAmount(Integer id, AccountIdBody accountInfo) {
        return accountService.withdrawAmount(id, accountInfo);
    }
}
