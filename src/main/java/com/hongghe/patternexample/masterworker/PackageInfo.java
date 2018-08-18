package com.hongghe.patternexample.masterworker;

/**
 * Master-Worker模式是常用的并行模式之一，它的核心思想是：系统由两类进程协同工作，
 * 即Master进程和Worker进程，Master负责接收和分配任务，Wroker负责处理子任务。
 * 当各个Worker进程将子任务处理完成后，将结果返回给Master进程，由Master进程进行汇总，
 * 从而得到最终的结果。
 *
 * @author hongghe 2018/8/18
 */

