package com.huorong.dao;

import com.huorong.domain.Toolkit;

import java.util.List;
import java.util.Map;

/**
 * Created by huorong on 17/10/12.
 */
public interface ToolKitDao {
    int insertToolKit(Map params);

    String selectUserId(String cookie);

    List<Toolkit> selectTookies(String userId);

    List<Toolkit> searchKey(Map params);

    int updateCountById(Map params);

    int deleteToolkit(Map params);
}
