package cn.phoenix.api.dal.mapper;
import cn.phoenix.api.model.MiuSalesDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author      tong.cx
 * @version     0.1.0
 * @datetime    2016/3/28 18:42
 * @copyright   wonhigh.cn
 */
@Repository
public interface MiuSalesDetailMapper extends BaseCrud<MiuSalesDetail> {
    /**
     * @param params: query params
     * @return: query sales list by page
     */
    List<MiuSalesDetail> selectByParams(@Param("params") Map<String, Object> params);

    int insert(MiuSalesDetail miuSalesDetail);
}
