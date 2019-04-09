package com.yfny.corepojo;

import com.yfny.utilscommon.generator.invoker.RelationInvoker;
import com.yfny.utilscommon.generator.invoker.SingleInvoker;
import com.yfny.utilscommon.generator.invoker.base.Invoker;

/**
 * 代码生成器测试主类
 * Created by jisongZhou on 2019/3/5.
 **/
public class GeneratorPojo {

    public static void main(String[] args) {
        singleInvokerTest();
        relationInvoker();
    }

    public static void singleInvokerTest() {

//        Invoker invoker1 = new SingleInvoker.Builder()
//                .setTableName("imp_xqd_xqdxx")
//                .setClassName("Xqdxx")
//                .setDescription("需求单详情")
//                .setFirst(true)
//                .build();
//        invoker1.execute();
//
//        Invoker invoker2 = new SingleInvoker.Builder()
//                .setTableName("imp_xqd_ywyxx")
//                .setClassName("Ywyxx")
//                .setDescription("需求单业务域详情")
//                .setFirst(false)
//                .build();
//        invoker2.execute();

        Invoker invoker3 = new SingleInvoker.Builder()
                .setTableName("imp_xqd_yyyxx")
                .setClassName("Yyyxx")
                .setDescription("需求单应用域详情")
                .setFirst(false)
                .build();
        invoker3.execute();

    }

    public static void relationInvoker() {
        Invoker invoker1 = new RelationInvoker.Builder()
                .setClassName("Xqdxx")
                .setRelationClass("Ywyxx", RelationInvoker.Builder.ONE_TO_MANY)
                .setRelationClass("Yyyxx", RelationInvoker.Builder.ONE_TO_MANY)
                .setWriteType(RelationInvoker.Builder.ENTITY_FILE)
                .build();
        invoker1.execute();
    }

}
