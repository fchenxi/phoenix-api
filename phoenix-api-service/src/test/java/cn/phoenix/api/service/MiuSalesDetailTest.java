package cn.phoenix.api.service;

import cn.phoenix.api.model.MiuSalesDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author      chase.xi
 * @version     0.1.0
 * @datetime    2016/7/21 10:57
 * @copyright   wonhigh.cn
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:META-INF/spring-phoenix-api-service-test.xml")
public class MiuSalesDetailTest {

    @Resource
    MiuSalesDetailService miuSalesDetailService;

    /**
     * Insert 100 0000 takes 38minutes
     */
    @Test
    public void insertTest() {
        long beginTimeMs = System.currentTimeMillis();
        int oneMillion = 1000000;
        for (int i = 0; i < oneMillion; i++) {
            MiuSalesDetail miuSalesDetail = new MiuSalesDetail(String.valueOf(i), "belle", i, i * 10);
            miuSalesDetailService.add(miuSalesDetail);
        }
        long endTimeMs = System.currentTimeMillis();
        System.out.println("Batch " + oneMillion + " data, it takes " + (endTimeMs - beginTimeMs) / 1000 / 60 + "minutes");
    }
    @Test
    public void queryMiuSalesTest(){
        long beginTimeMs = System.currentTimeMillis();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", "999996");
        List<MiuSalesDetail> miuSalesDetails = miuSalesDetailService.queryVosByParams(params);
        long endTimeMs = System.currentTimeMillis();
        System.out.println("Query " + miuSalesDetails.toString() + "oneMillion" + " data, it takes " + (endTimeMs - beginTimeMs) / 1000 + " seconds");


    }
}
