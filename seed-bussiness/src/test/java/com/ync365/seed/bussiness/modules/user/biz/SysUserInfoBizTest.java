package com.ync365.seed.bussiness.modules.user.biz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ync365.seed.bussiness.modules.Base.BaseTest;
import com.ync365.seed.bussiness.modules.user.bo.UserInfoBO;
import com.ync365.seed.bussiness.modules.user.bo.UserUsInfoSearchBo;
import com.ync365.seed.bussiness.modules.user.entity.SysUserInfo;
import com.ync365.seed.bussiness.modules.user.util.NumGenerator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context-bussiness.xml")
public class SysUserInfoBizTest extends BaseTest{
    @Autowired
    private SysUserInfoBiz biz;

    @Test
    public void testInsert() {
        SysUserInfo record = new SysUserInfo();
        record.setUserNum(NumGenerator.getPoPNum());
        record.setSysUserAddress(111);
        record.setSysUserGender(0);
        int amount = biz.insertSelective(record);
        Assert.assertEquals(1, amount);
    }

    @Test
    public void testOne() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userNum", "1fd827769bde4a1a965b232abc9967f7");
        List<SysUserInfo> list = biz.selectPageByMap(map);
        if (null != list && list.size() > 0) {
            for (SysUserInfo temp : list) {
                System.out.println("============" + temp.getSysUserIdCard() + "===========");
            }
        } else {
            System.out.println("list--------------为空");
        }
    }

    /*@Test
    public void testCount() {
    	Map<String ,Object> map=new HashMap<String,Object>();
    	map.put("userNum", "1fd827769bde4a1a965b232abc9967f7");
    	int a = biz.selectPageCount(map);
    	
    	System.out.println("list--------"+a);
    	
    }*/
    @Test
    public void testSelectByNum() {

        UserUsInfoSearchBo sear = new UserUsInfoSearchBo();
        sear.setUserNum("0115101700000002");
        List<UserInfoBO> list = biz.selectUserInfoByParam(sear);
        System.out.println(list.size());
    }

    @Test
    public void testDel() {

        int a = biz.deleteByPrimaryKeyUserNum("1fd827769bde4a1a965b232abc9967f7");

        System.out.println("list--------" + a);

    }
}
