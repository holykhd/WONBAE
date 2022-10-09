package com.wonbae.admin.account;

import com.wonbae.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface AdminAccountRepository extends JpaRepository<Account, Long> {
}
