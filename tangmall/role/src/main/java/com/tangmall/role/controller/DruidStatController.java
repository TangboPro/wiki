package com.tangmall.role.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DruidStatController {
    @GetMapping("/druid/stat")
    public Object druidStat(){
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
