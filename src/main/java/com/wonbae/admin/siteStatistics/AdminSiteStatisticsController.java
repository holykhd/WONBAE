package com.wonbae.admin.siteStatistics;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/siteStatistics")
public class AdminSiteStatisticsController {

    /**
     * 일별 접속 관리 목록
     */
    @GetMapping("/dayList")
    public String dayList() {
        return "/admin/siteStatistics/dayList";
    }

    /**
     * 일별 접속 관리 등록 폼
     */
    @GetMapping("/dayEdit")
    public String dayEditForm() {
        return "/admin/siteStatistics/dayEdit";
    }

    /**
     * 일별 접속 관리 등록
     */
    @PostMapping("/dayEdit")
    public String dayEdit() {
        return "redirect:/admin/siteStatistics/dayList";
    }

    /**
     * 일별 접속 관리 상세
     */
    @GetMapping("/dayDetail")
    public String dayDetail() {
        return "/admin/siteStatistics/dayDetail";
    }

    /**
     * 일별 접속 관리 수정
     */

    /**
     * 일별 접속 관리 삭제
     */
    @GetMapping("/dayRemove")
    public String dayRemove() {
        return "/admin/siteStatistics/dayRemove";
    }

    /**
     * 시간별 접속 관리 목록
     */
    @GetMapping("/timeList")
    public String timeList() {
        return "/admin/siteStatistics/timeList";
    }

    /**
     * 시간별 접속 관리 등록 폼
     */
    @GetMapping("/timeEdit")
    public String timeEditForm() {
        return "/admin/siteStatistics/timeEdit";
    }

    /**
     * 시간별 접속 관리 등록
     */
    @PostMapping("/timeEdit")
    public String timeEdit() {
        return "redirect:/admin/siteStatistics/timeList";
    }

    /**
     * 시간별 접속 관리 상세
     */
    @GetMapping("/timeDetail")
    public String timeDetail() {
        return "/admin/siteStatistics/timeDetail";
    }

    /**
     * 시간별 접속 관리 수정
     */

    /**
     * 시간별 접속 관리 삭제
     */
    @GetMapping("/timeRemove")
    public String timeRemove() {
        return "/admin/siteStatistics/timeRemove";
    }


    /**
     * 월별 접속 관리 목록
     */
    @GetMapping("/monthList")
    public String monthList() {
        return "/admin/siteStatistics/monthList";
    }

    /**
     * 월별 접속 관리 등록 폼
     */
    @GetMapping("/monthEdit")
    public String monthEditForm() {
        return "/admin/siteStatistics/monthEdit";
    }

    /**
     * 월별 접속 관리 등록
     */
    @PostMapping("/monthEdit")
    public String monthEdit() {
        return "redirect:/admin/siteStatistics/monthList";
    }

    /**
     * 월별 접속 관리 상세
     */
    @GetMapping("/monthDetail")
    public String monthDetail() {
        return "/admin/siteStatistics/monthDetail";
    }

    /**
     * 월별 접속 관리 수정
     */

    /**
     * 월별 접속 관리 삭제
     */
    @GetMapping("/monthRemove")
    public String monthRemove() {
        return "/admin/siteStatistics/monthRemove";
    }


    /**
     * 년도별 접속 관리 목록
     */
    @GetMapping("/yearList")
    public String yearList() {
        return "/admin/siteStatistics/yearList";
    }

    /**
     * 년도별 접속 관리 등록 폼
     */
    @GetMapping("/yearEdit")
    public String yearEditForm() {
        return "/admin/siteStatistics/yearEdit";
    }

    /**
     * 년도별 접속 관리 등록
     */
    @PostMapping("/yearEdit")
    public String yearEdit() {
        return "redirect:/admin/siteStatistics/yearList";
    }

    /**
     * 년도별 접속 관리 상세
     */
    @GetMapping("/yearDetail")
    public String yearDetail() {
        return "/admin/siteStatistics/yearDetail";
    }

    /**
     * 년도별 접속 관리 수정
     */

    /**
     * 년도별 접속 관리 삭제
     */
    @GetMapping("/yearRemove")
    public String yearRemove() {
        return "/admin/siteStatistics/yearRemove";
    }


    /**
     * 접속 경로별 통계 목록
     */
    @GetMapping("/pathList")
    public String pathList() {
        return "/admin/siteStatistics/pathList";
    }

    /**
     * 접속 경로별 통계 등록 폼
     */
    @GetMapping("/pathEdit")
    public String pathEditForm() {
        return "/admin/siteStatistics/pathEdit";
    }

    /**
     * 접속 경로별 통계 등록
     */
    @PostMapping("/pathEdit")
    public String pathEdit() {
        return "redirect:/admin/siteStatistics/pathList";
    }

    /**
     * 접속 경로별 통계 상세
     */
    @GetMapping("/pathDetail")
    public String pathDetail() {
        return "/admin/siteStatistics/pathDetail";
    }

    /**
     * 접속 경로별 통계 수정
     */

    /**
     * 접속 경로별 통계 삭제
     */
    @GetMapping("/pathRemove")
    public String pathRemove() {
        return "/admin/siteStatistics/pathRemove";
    }


    /**
     * 상세 로그 목록
     */
    @GetMapping("/detailLogList")
    public String detailLogList() {
        return "/admin/siteStatistics/detailLogList";
    }

    /**
     * 상세 로그 등록 폼
     */
    @GetMapping("/detailLogEdit")
    public String detailLogEditForm() {
        return "/admin/siteStatistics/detailLogEdit";
    }

    /**
     * 상세 로그 등록
     */
    @PostMapping("/detailLogEdit")
    public String detailLogEdit() {
        return "redirect:/admin/siteStatistics/detailLogList";
    }

    /**
     * 상세 로그 상세
     */
    @GetMapping("/detailLogDetail")
    public String detailLogDetail() {
        return "/admin/siteStatistics/detailLogDetail";
    }

    /**
     * 상세 로그 수정
     */

    /**
     * 상세 로그 삭제
     */
    @GetMapping("/detailLogRemove")
    public String detailLogRemove() {
        return "/admin/siteStatistics/detailLogRemove";
    }


    /**
     * 운영체제별 통계 목록
     */
    @GetMapping("/osList")
    public String osList() {
        return "/admin/siteStatistics/osList";
    }

    /**
     * 운영체제별 통계 등록 폼
     */
    @GetMapping("/osEdit")
    public String osEditForm() {
        return "/admin/siteStatistics/osEdit";
    }

    /**
     * 운영체제별 통계 등록
     */
    @PostMapping("/osEdit")
    public String osEdit() {
        return "redirect:/admin/siteStatistics/osList";
    }

    /**
     * 운영체제별 통계 상세
     */
    @GetMapping("/osDetail")
    public String osDetail() {
        return "/admin/siteStatistics/osDetail";
    }

    /**
     * 운영체제별 통계 수정
     */

    /**
     * 운영체제별 통계 삭제
     */
    @GetMapping("/osRemove")
    public String osRemove() {
        return "/admin/siteStatistics/osRemove";
    }


    /**
     * 브라우저별 통계 목록
     */
    @GetMapping("/browserList")
    public String browserList() {
        return "/admin/siteStatistics/browserList";
    }

    /**
     * 브라우저별 통계 등록 폼
     */
    @GetMapping("/browserEdit")
    public String browserEditForm() {
        return "/admin/siteStatistics/browserEdit";
    }

    /**
     * 브라우저별 통계 등록
     */
    @PostMapping("/browserEdit")
    public String browserEdit() {
        return "redirect:/admin/siteStatistics/browserList";
    }

    /**
     * 브라우저별 통계 상세
     */
    @GetMapping("/browserDetail")
    public String browserDetail() {
        return "/admin/siteStatistics/browserDetail";
    }

    /**
     * 브라우저별 통계 수정
     */

    /**
     * 브라우저별 통계 삭제
     */
    @GetMapping("/browserRemove")
    public String browserRemove() {
        return "/admin/siteStatistics/browserRemove";
    }

}