package com.wonbae.admin.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/order")
public class AdminOrderController {

    /**
     * http://openmarkets3d.cgimall.co.kr/admin/openmarket_jangboo_detail.php?or_no=1650438317-51436&number=2774
     */

    /**
     * 주문 목록
     */
    @GetMapping("/orderCompleteList")
    public String orderList() {
        return "admin/order/orderCompleteList";
    }

    /**
     * 주문 상세
     */
    @GetMapping("/orderDetail")
    public String orderDetail() {
        return "orderCompleteDetail";
    }

    /**
     * 주문 취소 목록
     */
    @GetMapping("/orderCancelList")
    public String orderCancelList() {
        return "admin/order/orderCancelList";
    }

    /**
     * 주문 취소 상세
     */
    @GetMapping("/orderCancelDetail")
    public String orderCancelDetail() {
        return "admin/order/orderCancelDetail";
    }

    /**
     * 주문 현황 목록
     */
    @GetMapping("/orderStaticList")
    public String orderStaticList() {
        return "admin/order/orderStaticList";
    }

    /**
     * 주문 현황 상세
     */
    @GetMapping("/orderStaticDetail")
    public String orderStaticDetail() {
        return "admin/order/orderStaticDetail";
    }

    /**
     * 정산 목록
     */
    @GetMapping("/orderCalcList")
    public String orderCalcList() {
        return "admin/order/orderCalcList";
    }

    /**
     * 정산 상세
     */
    @GetMapping("/orderCalcDetail")
    public String orderCalcDetail() {
        return "admin/order/orderCalcDetail";
    }

    /**
     * 교환/반품 목록
     */
    @GetMapping("/orderReturnList")
    public String orderReturnList() {
        return "admin/order/orderReturnList";
    }

    /**
     * 교환/반품 상세
     */
    @GetMapping("/orderReturnDetail")
    public String orderReturnDetail() {
        return "admin/order/orderReturnDetail";
    }
}