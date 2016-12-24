package cn.phoenix.api.service.impl;

import cn.phoenix.api.dal.mapper.MiuSalesDetailMapper;
import cn.phoenix.api.model.MiuSalesDetail;
import cn.phoenix.api.service.MiuSalesDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author      chase.xi
 * @version     0.1.0
 * @datetime    2016/7/21 10:48
 * @copyright   wonhigh.cn
 */
@Service("miuSalesDetailService")
public class MiuSalesDetailServiceImpl implements MiuSalesDetailService{

    @Resource
    MiuSalesDetailMapper miuSalesDetailMapper;

    @Override
    public int add(MiuSalesDetail miuSalesDetail){
        return miuSalesDetailMapper.insert(miuSalesDetail);
    }

    @Override
    public List<MiuSalesDetail> queryList(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<MiuSalesDetail> queryVosByParams(Map<String, Object> params) {
        return miuSalesDetailMapper.selectByParams(params);
    }

    @Override
    public int queryCountByParams(Map<String, Object> params) {
        return 0;
    }

    @Override
    public MiuSalesDetail queryModelByParams(Map<String, Object> params) {
        return null;
    }

    @Override
    public int updateByParams(Map<String, Object> params) {
        return 0;
    }

    @Override
    public boolean updateByList(Map<String, Object> params) {
        return false;
    }

    @Override
    public int deleteByParams(Map<String, Object> params) {
        return 0;
    }
}
