package com.hongghe.patternexample.masterworker;

import java.util.Map;
import java.util.Set;

/**
 * 利用Master-Worker模式实现计算立方和的应用。计算1^3+2^3+3^3+…+100^3。
 * 这个计算任务被划分成100个子任务，每个任务仅仅用于计算单独的立方和。
 *
 * @author hongghe 2018/8/18
 */
public class Demo {

    /**
     * 运行的调用函数如下。在主函数中首先通过Master类创建4个Worker工作进程和Worker工作实例PlusWorker。
     * 在提交了100个子任务后，边开始子任务的计算。这些子任务中由这4个进程共同完成。
     * Master不用等待所有Worker计算完成才开始汇总，而是子任务在计算的过程中，Master就开始汇总了。
     */

    public static void main(String[] args) {
        //固定使用4个Workde
        Master master = new Master(new PlusWorker(), 4);
        for(int i=1; i<=100; i++) //提交100个子任务
            master.submit(i);
        master.execute(); //开始计算

        Map<String, Object> resultMap = master.getResultMap();

        int re = 0;  //最终计算结果保存在此
        //不需要等待所有Worker都执行完即可
        while(true) {
            Set<String> keys = resultMap.keySet();  //开始计算最终结果
            String key = null;
            for(String k : keys) {
                key = k;
                break;
            }
            Integer i = null;
            if(key != null) {
                i = (Integer) resultMap.get(key);
            }
            if(i != null) {
                re += i; //最终结果
            }
            if(key != null) {
                resultMap.remove(key); //移除已被计算过的项目
            }
            if(master.isComplete() && resultMap.size()==0) {
                break;
            }
        }
        System.out.println(re);
    }
}
