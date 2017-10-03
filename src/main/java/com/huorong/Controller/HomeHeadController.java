package com.huorong.Controller;

import com.huorong.domain.Result;
import com.huorong.service.HomeHeadService;
import com.huorong.utils.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by huorong on 17/9/30.
 */
@RestController
@RequestMapping("home")
public class HomeHeadController {
    @Autowired
    HomeHeadService homeHeadService;

    @RequestMapping("/headList")
    public Result headList(@RequestParam Map params) {
        return Result.build("0", "ok", MapUtils.asMap("routerList", homeHeadService.routerList(params)));
    }
}
