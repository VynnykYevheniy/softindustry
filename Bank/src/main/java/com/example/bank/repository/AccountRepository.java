package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.domain.Account;


public interface AccountRepository extends JpaRepository<Account, String> {
	Account findByAccountId(String accountId);
}
