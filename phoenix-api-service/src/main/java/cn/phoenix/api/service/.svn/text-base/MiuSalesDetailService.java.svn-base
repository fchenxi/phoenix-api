package cn.phoenix.api.service;

import cn.phoenix.api.model.MiuSalesDetail;

import java.util.List;
import java.util.Map;

/**
 * @author      chase.xi
 * @version     0.1.0
 * @datetime    2016/7/21 10:47
 * @copyright   wonhigh.cn
 */
public interface MiuSalesDetailService {

    int add(MiuSalesDetail miuSalesDetail);

    /**
     * @param params: query params
     * @return: query all list
     */
    List<MiuSalesDetail> queryList(Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query list by page
     */
    List<MiuSalesDetail> queryVosByParams(Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query count
     */
    int queryCountByParams(Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query model
     */
    MiuSalesDetail queryModelByParams(Map<String, Object> params);

    /**
     * @param params: update params
     * @return: update result code
     */
    int updateByParams(Map<String, Object> params);

    /**
     * @param params: update list model
     * @return: update result code
     */
    boolean updateByList(Map<String, Object> params);

    /**
     * @param params: delete params
     * @return: delete result code
     */
    int deleteByParams(Map<String, Object> params);
}
