package org.example.services;

public class DefaultServiceLocator {
    private static AccountService accountService = new AccountServiceImpl();

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}
