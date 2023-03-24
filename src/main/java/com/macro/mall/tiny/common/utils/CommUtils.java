package com.macro.mall.tiny.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName CommUtils
 * @Description TODO
 * @Author lr
 * @Date 2023/3/24 9:51
 * @Version 1.0
 */
public class CommUtils {

    /**
     * 获取当前时间
     * @param dateFormatStr
     * @return
     */
    public static String getNowDateLongStr(String dateFormatStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr);
        Date currentDate = new Date();
        String dateStr = dateFormat.format(currentDate);
        return dateStr;
    }
}
