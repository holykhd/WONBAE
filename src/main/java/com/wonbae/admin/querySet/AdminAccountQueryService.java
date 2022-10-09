package com.wonbae.admin.querySet;

import com.querydsl.core.QueryFactory;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.wonbae.admin.account.AdminAccountService;
import com.wonbae.admin.account.form.AccountForm;
import com.wonbae.domain.enumType.UserRole;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.wonbae.domain.QAccount.account;

@Slf4j
@Component
@RequiredArgsConstructor
public class AdminAccountQueryService {
    private final JPAQueryFactory queryFactory;

    // 회원 정보 가져오기
    public List<AccountForm> selectAccountQuery(Pageable pageable, UserRole role) {
        List<AccountForm> fetchResult = queryFactory.select(Projections.bean(AccountForm.class,
                        account.id
                        , account.addr1
                        , account.addr2
                        , account.agreeEmail
                        , account.agreePrivacy
                        , account.agreeService
                        , account.agreeSms
                        , account.createdDate
                        , account.email
                        , account.firstFavStore
                        , account.gender
                        , account.name
                        , account.phone
                        , account.postCode
                        , account.role
                        , account.secondFavStore
                        , account.city
                        , account.guGun
                        , account.dong
                        , account.aptName
                        , account.dongHo))
                .from(account)
                .where(userRoleEqCond(role))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();
        return fetchResult;
    }

    // 회원 권한별 검색 조건
    private BooleanExpression userRoleEqCond(UserRole user) {
        if (user.equals(UserRole.USER)) {
            return account.role.eq(UserRole.USER);
        }
        if (user.equals(UserRole.MART_MANAGER)) {
            return account.role.eq(UserRole.MART_MANAGER);
        }
        return null;
    }

    // 전체 조회 수 가져오기
    public Long selectAccountTotalCnt(UserRole role) {
        Long totalCnt = queryFactory.select(account.count())
                .from(account)
                .where(userRoleEqCond(role))
                .fetchOne();
        return totalCnt;
    }
}