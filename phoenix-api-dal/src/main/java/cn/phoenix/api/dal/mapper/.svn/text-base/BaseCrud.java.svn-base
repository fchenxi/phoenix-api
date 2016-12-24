package cn.phoenix.api.dal.mapper;



import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @usage       POI Excel标题annotation
 * @author      tong.cx
 * @version     0.1.0
 * @datetime    2016/3/28 18:42
 * @copyright   wonhigh.cn
 */
public interface BaseCrud<T> {
    /**
     * @param params: query params
     * @return: query all list
     */
    List<T> selectList(@Param("params") Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query list by page
     */
    List<T> selectByPage(@Param("params") Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query count
     */
    int selectCountByParams(@Param("params") Map<String, Object> params);

    /**
     * @param params: query params
     * @return: query model
     */
    T selectModelByParams(@Param("params") Map<String, Object> params);

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
