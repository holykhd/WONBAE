package com.wonbae.admin.martStore;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.wonbae.admin.account.AdminAccountRepository;
import com.wonbae.admin.account.form.AccountForm;
import com.wonbae.admin.querySet.AdminAccountQueryService;
import com.wonbae.common.ResponseMessage;
import com.wonbae.domain.Account;
import com.wonbae.domain.enumType.UserRole;
import com.wonbae.handler.frontHandler.exception.AlertScriptException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AdminMartStoreService {
    private final AdminAccountRepository adminAccountRepository;
    private final AdminAccountQueryService adminAccountQueryService;

    private final JPAQueryFactory queryFactory;


    // 마트 관리자 목록
    @Transactional(readOnly = true)
    public PageImpl<AccountForm> martStoreManagerListProcessor(Pageable pageable) {
        // 회원 정보 가져오기
        List<AccountForm> fetchResult = adminAccountQueryService.selectAccountQuery(pageable, UserRole.MART_MANAGER);

        // 토탈 카운트 가져오기
        Long totalCnt = adminAccountQueryService.selectAccountTotalCnt(UserRole.MART_MANAGER);

        return new PageImpl<>(fetchResult, pageable, totalCnt);
    }

    // 마트 관리자 상세
    @Transactional(readOnly = true)
    public Account selectAccountDetailProcessor(long id) {
        return adminAccountRepository.findById(id).orElseThrow(() -> new AlertScriptException(HttpStatus.NOT_FOUND, ResponseMessage.NOT_FOUND_MEMBER, null));
    }
}
