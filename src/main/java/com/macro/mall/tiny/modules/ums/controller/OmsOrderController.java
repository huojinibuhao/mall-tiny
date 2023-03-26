package com.macro.mall.tiny.modules.ums.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName OmsOrderController
 * @Description 订单管理
 * @Author lr
 * @Date 2023/3/25 13:17
 * @Version 1.0
 */

@Controller
@Api(tags = "OmsOrderController")
@Tag(name = "OmsOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsOrderController {




}
