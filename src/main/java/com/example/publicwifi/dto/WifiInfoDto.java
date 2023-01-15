package com.example.publicwifi.dto;

import com.example.publicwifi.domain.WifiInfo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WifiInfoDto {

    private Long id;
//"x_swifi_inout_door":"실내",
    private String inoutdoor;
// "x_swifi_instl_floor":""
    private String installFloor;
// ,"x_swifi_instl_mby":"서울시(AP)"
    private String installmby;
// ,"x_swifi_remars3":"",
    private String remars3;
// "x_swifi_instl_ty":"7-1. 공공 - 행정"
    private String instlTy;
// ,"x_swifi_mgr_no":"ARI00001"
    private String mgrNo;
// ,"x_swifi_wrdofc":"서대문구"
    private String wrdofc;
// ,"x_swifi_adres1":"서소문로 51"
    private String adres1;
// ,"x_swifi_adres2":"본관 1F",
    private String adres2;
// "x_swifi_cmcwr":"수도사업소자가망",
    private String cmcwr;
// "work_dttm":1673661490000,
    private String dttm;
// "x_swifi_svc_se":"공공WiFi",
    private String svcSe;
// "x_swifi_main_nm":"상수도사업본부",
    private String mainNm;
// "lnt":"37.561924",
    private  String lnt;
// "x_swifi_cnstc_year":"2014",
    private String cnstcYear;
// "lat":"126.96675"
    private String lat;

    public static WifiInfoDto fromEntity(WifiInfo wifiInfo){
        return WifiInfoDto.builder()
                .id(wifiInfo.getId())
                .inoutdoor(wifiInfo.getInoutdoor())
                .installFloor(wifiInfo.getInstallFloor())
                .installmby(wifiInfo.getInstallmby())
                .remars3(wifiInfo.getRemars3())
                .instlTy(wifiInfo.getInstlTy())
                .mgrNo(wifiInfo.getMgrNo())
                .wrdofc(wifiInfo.getWrdofc())
                .adres1(wifiInfo.getAdres1())
                .adres2(wifiInfo.getAdres2())
                .cmcwr(wifiInfo.getCmcwr())
                .dttm(wifiInfo.getDttm())
                .svcSe(wifiInfo.getSvcSe())
                .mainNm(wifiInfo.getMainNm())
                .lnt(wifiInfo.getLnt())
                .cnstcYear(wifiInfo.getCnstcYear())
                .lat(wifiInfo.getLat())
                .build();
    }

}
