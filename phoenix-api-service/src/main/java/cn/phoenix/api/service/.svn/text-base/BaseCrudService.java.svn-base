package cn.phoenix.api.service;

import cn.phoenix.api.model.MiuSalesDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author      chase.xi
 * @version     0.1.0
 * @datetime    2016/7/21 10:51
 * @copyright   wonhigh.cn
 */
public interface BaseCrudService<T> {
    /**
     * @param params: query params
     * @return: query all list
     */
    List<T> queryList(@Param("params") Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query list by page
     */
    List<T> queryByPage(@Param("params") Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query count
     */
    int queryCountByParams(@Param("params") Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query model
     */
    T queryModelByParams(@Param("params") Map<String, Object> params);

    /**
     * @param params: update params
     * @return: update result code
     */
    int updateByParams(@Param("params") Map<String, Object> params);

    /**
     * @param params: update list model
     * @return: update result code
     */
    boolean updateByList(@Param("params") Map<String, Object> params);

    /**
     * @param params: delete params
     * @return: delete result code
     */
    int deleteByParams(@Param("params") Map<String, Object> params);
}
