package com.yfny.corepojo;

import com.yfny.utilscommon.generator.invoker.*;
import com.yfny.utilscommon.generator.invoker.base.Invoker;

/**
 * 代码生成器测试主类
 * Created by jisongZhou on 2019/3/5.
 **/
public class GeneratorPojo {

    public static void main(String[] args) {
        singleInvokerTest();
    }

    public static void singleInvokerTest() {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("imp_xqd_xqdxx")
                .setClassName("Xqdxx")
                .setDescription("需求单详情")
                .setFirst(true)
                .build();
        invoker.execute();
    }

}
