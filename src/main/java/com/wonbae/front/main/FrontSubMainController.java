package com.wonbae.front.main;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class FrontSubMainController {

    /**
     * 정육코너 메인
     */
    @GetMapping("/main/meat")
    public String meatMain() {
        return "front/shop/subMain/meat";
    }

    /**
     * 과일코너 메인
     */
    @GetMapping("/main/fruit")
    public String fruitMain() {
        return "front/shop/subMain/fruit";
    }

    /**
     * 야채코너 메인
     */
    @GetMapping("/main/vagetable")
    public String vagetable() {
        return "front/shop/subMain/vagetable";
    }

    /**
     * 공산코너 메인
     */
    @GetMapping("/main/goods")
    public String goods() {
        return "front/shop/subMain/goods";
    }

    /**
     * 할인/이벤트 코너 메인
     */
    @GetMapping("/main/event")
    public String event() {
        return "front/shop/subMain/event";
    }

    /**
     * 할인/이벤트 상세
     */
    @GetMapping("/event/detail")
    public String eventDetail() {
        return "front/shop/eventDetail";
    }

    /**
     * 쇼핑 상세 페이지
     */
    @GetMapping("/detail")
    public String detail() {
        return "front/shop/details";
    }

    /**
     * 카트
     */
    @GetMapping("/cart")
    public String cart() {
        return "front/cart";
    }

    /**
     * 주문
     */
    @GetMapping("/checkout")
    public String checkout() {
        return "front/shop/checkout";
    }

}
