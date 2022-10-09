-- /* 회원 정보*/
-- admin@gmail.com / 12345
INSERT INTO account (addr1, addr2, first_fav_store, phone, post_code, second_fav_store, apt_name, city, dong, dong_ho,
                     gu_gun, agree_email, agree_privacy, agree_service, agree_sms, created_date, email, password, role)
values ('광주광역시 광산구 수등로 123번길 22', '204동 903호', '수완 M마트', '010-9010-9642', '62308', '영암마트 수완점', '수완 휴먼시아 2단지', '광주광역시',
        '신가동', '204동 903호', '광산구', false, true, true, false, '2022-10-04 11:14:03.079000', 'admin@gmail.com',
        '$2a$10$5nakivbY3OZg5EMkeWWlG.YO1zQoqlVaBytHfHkT7RKPPo17celUS', 'ADMIN');
-- /* 회원 테이블 시퀀스 변경*/
ALTER SEQUENCE account_id_seq restart with 2;


-- 카테고리 정보
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과일', 1, 100, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('사과/배', 1, 101, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('감귤/만감류HOT', 2, 102, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('수박/멜론/참외/토마토', 3, 103, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('딸기/키위/블루베리', 4, 104, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('포도/자두/복숭아', 5, 105, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('감/곶감', 6, 106, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('바나나/파인애플', 7, 107, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('오렌지/자몽/레몬', 8, 108, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('망고/열대과일', 9, 109, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('체리/석류/아보카도', 10, 110, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건과일/분말', 11, 111, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과일세트', 12, 112, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('냉동/간편과일', 13, 113, 100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('기타 과일', 14, 114, 100);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('채소', 2, 200, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('두부/콩나물/숙주나물HOT', 1, 201, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('고구마/감자', 2, 202, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('양파/마늘/파/생강HOT', 3, 203, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('오이/가지/호박/옥수수', 4, 204, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('상추/깻잎/쌈채소', 5, 205, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('고추/피망/파프리카', 6, 206, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('시금치/부추/나물', 7, 207, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('양배추/양상추/브로콜리', 8, 208, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('샐러드/어린잎채소', 9, 209, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('당근/우엉/연근/마', 10, 210, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('버섯', 11, 211, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('배추/무/김장채소', 12, 212, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('아스파라거스/허브류/기타', 13, 213, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('인삼/더덕/약선재료', 14, 214, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('간편 채소', 15, 215, 200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('채소세트', 16, 216, 200);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('쌀/잡곡/견과', 3, 300, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('백미HOT', 1, 301, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('찹쌀/현미/흑미HOT', 2, 302, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('혼합곡', 3, 303, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('콩/팥/보리/귀리', 4, 304, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('수수/조/깨/잡곡', 5, 305, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('견과류', 6, 306, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('선식/곡물가공', 7, 307, 300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('쌀/잡곡 선물세트', 8, 308, 300);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('정육/계란류', 4, 400, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('계란/알류HOT', 1, 401, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('닭/오리고기HOT', 2, 402, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('양고기', 3, 403, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('돼지고기HOT', 4, 404, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('국내산소고기HOT', 5, 405, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('수입산소고기HOT', 6, 406, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('양념육/가공육', 7, 407, 400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('축산선물세트', 8, 408, 400);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('수산물/건해산', 5, 500, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('생선', 1, 501, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('오징어/낙지/주꾸미/문어', 2, 502, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('새우/게/랍스터', 3, 503, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('전복/굴/멍게/조개류', 4, 504, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('회/명란/날치알/장', 5, 505, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('김/미역/기타해조류', 6, 506, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('멸치/황태/노가리', 7, 507, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건오징어/건어물/다시팩', 8, 508, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('간편/모듬수산물', 9, 509, 500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('수산/건해산 세트', 10, 510, 500);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('우유/유제품', 6, 600, 600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('우유HOT', 1, 601, 600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('요거트/요구르트HOT', 2, 602, 600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('두유', 3, 603, 600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('치즈HOT', 4, 604, 600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('버터/생크림/연유', 5, 605, 600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('분유', 6, 606, 600);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('밀키트/간편식', 7, 700, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('밀키트HOT', 1, 701, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('볶음밥/찌개/죽/스프', 2, 702, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('만두/돈가스/치킨/튀김HOT', 3, 703, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('떡갈비/스테이크/전', 4, 704, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('햄/단무지/어묵/맛살HOT', 5, 705, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('유부/묵/떡', 6, 706, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('피자/핫도그/파스타/떡볶이', 7, 707, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('훈제오리/족발/곱창/볶음/찜', 8, 708, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('중식/일식/세계요리', 9, 709, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('즉석밥/컵밥', 10, 710, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('카레/짜장/즉석요리', 11, 711, 700);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('간편이유식', 12, 712, 700);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('김치/반찬/델리', 8, 800, 800);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('김치HOT', 1, 801, 800);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('반찬/젓갈HOT', 2, 802, 800);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('김밥/도시락/델리', 3, 803, 800);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('샐러드', 4, 804, 800);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('매장 즉석조리식품', 5, 805, 800);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('생수/음료/주류', 9, 900, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('생수HOT', 1, 901, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('탄산수', 2, 902, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('탄산음료', 3, 903, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과일/야채음료', 4, 904, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('스포츠/건강음료', 5, 905, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('전통/차/기타음료', 6, 906, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('음료선물세트', 7, 907, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('전통주', 8, 908, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('와인/양주 매장픽업', 9, 909, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('무알콜맥주/칵테일', 10, 910, 900);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('어린이 음료', 11, 911, 900);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('커피/원두/차', 10, 1000, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('커피믹스', 1, 1001, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('원두/생두', 2, 1002, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('드립백/캡슐/더치커피', 3, 1003, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('홈카페재료', 4, 1004, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('커피음료', 5, 1005, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('녹차/보리차/뿌리차', 6, 1006, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('홍차/밀크티', 7, 1007, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('보이차/허브차/꽃차', 8, 1008, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과실/곡물/전통차', 9, 1009, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('코코아/핫초코', 10, 1010, 1000);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('커피/차 선물세트', 11, 1011, 1000);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('면류/통조림', 11, 1100, 1100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('라면HOT', 1, 1101, 1100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('즉석면요리', 2, 1102, 1100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('파스타면/생면/건면', 3, 1103, 1100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('참치/스팸/축수산통조림HOT', 4, 1104, 1100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('옥수수/피클/과일통조림', 5, 1105, 1100);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('통조림선물세트', 6, 1106, 1100);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('장류/양념/가루/오일', 12, 1200, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('장류/양념', 1, 1201, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('파스타소스/페스토', 2, 1202, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('케찹/마요네즈/디핑소스', 3, 1203, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('돈까스/스테이크소스', 4, 1204, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('중식/일식/기타소스', 5, 1205, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('샐러드 드레싱', 6, 1206, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('밀가루/분말류', 7, 1207, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('소금/설탕/후추/향신료', 8, 1208, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('조미료/액젓/물엿/식초', 9, 1209, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('식용유/참기름/오일류', 10, 1210, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('조미료/오일 선물세트', 11, 1211, 1200);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('시럽/제빵믹스/재료', 12, 1212, 1200);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과자/간식', 13, 1300, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과자/쿠키/파이HOT', 1, 1301, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('떡/한과/전통과자', 2, 1302, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('소시지/원물/안주스낵', 3, 1303, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('사탕/캬라멜/껌', 4, 1304, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('젤리/푸딩', 5, 1305, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('초콜릿/초코바', 6, 1306, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('시리얼', 7, 1307, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('빙과/아이스크림', 8, 1308, 1300);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('얼음/빙수재료', 9, 1309, 1300);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('베이커리/잼', 14, 1400, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('식빵', 1, 1401, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('베이커리빵', 2, 1402, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('쿠키/디저트/케이크', 3, 1403, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('샌드위치', 4, 1404, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('일반빵', 5, 1405, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('호빵/찐빵', 6, 1406, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('생지/냉동반죽', 7, 1407, 1400);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('잼/스프레드', 8, 1408, 1400);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건강식품', 15, 1500, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('홍삼/인삼/녹용', 1, 1501, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건강즙/건강액', 2, 1502, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건강분말/건강환', 3, 1503, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건강차/건강재료', 4, 1504, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('꿀/로얄젤리/프로폴리스', 5, 1505, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('비타민', 6, 1506, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('유산균', 7, 1507, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('미네랄', 8, 1508, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('영양제/건강기능식품', 9, 1509, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('다이어트/뷰티', 10, 1510, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('헬스보충제', 11, 1511, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('영양식/기타 건강식품', 12, 1512, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('기능별 건강식품', 13, 1513, 1500);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('대상별 건강식품', 14, 1514, 1500);

INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('친환경/유기농', 16, 1600, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과일/채소', 1, 1601, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('정육/계란류', 2, 1602, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('쌀/잡곡/견과', 3, 1603, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('수산물/건해산물', 4, 1604, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('우유/유제품/유아식', 5, 1605, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('냉장/냉동/간편식', 6, 1606, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('장류/양념/분말/오일', 7, 1607, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('라면/즉석식품/통조림', 8, 1608, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('차/음료/커피', 9, 1609, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('과자/스낵/시리얼/빙과', 10, 1610, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('건강식품/즙', 11, 1611, 1600);
INSERT INTO category (cate_name, cate_order, cate_code, cate_parent_code)
VALUES ('유기농/친환경 선물세트', 12, 1612, 1600);
ALTER SEQUENCE category_id_seq restart with 179;


