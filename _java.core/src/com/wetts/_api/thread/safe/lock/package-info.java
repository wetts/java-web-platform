/**
 * 本包谈论安全锁的问题
 * 
 **********************************************************
 * ReentrantLock 
 * 	拥有Synchronized相同的并发性和内存语义，此外还多了 锁投票，定时锁等候和中断锁等候
 * 
 * ReentrantLock获取锁定与三种方式：
 * 	a) lock(), 如果获取了锁立即返回，如果别的线程持有锁，当前线程则一直处于休眠状态，直到获取锁
 * 	b) tryLock(), 如果获取了锁立即返回true，如果别的线程正持有锁，立即返回false
 * 	c) tryLock(long timeout,TimeUnit unit)，如果获取了锁定立即返回true，如果别的线程正持有锁，会等待参数给定的时间，在等待的过程中，如果获取了锁定，就返回true，如果等待超时，返回false
 * 	d) lockInterruptibly:如果获取了锁定立即返回，如果没有获取锁定，当前线程处于休眠状态，直到或者锁定，或者当前线程被别的线程中断
 * 
 **************************************************************
 * synchronized是在JVM层面上实现的，不但可以通过一些监控工具监控synchronized的锁定，而且在代码执行时出现异常，JVM会自动释放锁定
 * 但是使用Lock则不行，lock是通过代码实现的，要保证锁定一定会被释放，就必须将unLock()放到finally{}中
 * 
 **************************************************************
 * 读写锁：
 * 	ReentrantLock.ReadLock
 * 		读锁可以允许多个进行读操作的线程同时进入，但不允许写进程进入
 * 	ReentrantLock.WriteLock
 * 		写锁只允许一个写进程进入，在这期间任何进程都不能再进入
 * 
 ***************************************************************
 * Lock的主要接口：
 * 	Lock
 * 		lock()
 * 		tryLock()
 * 		tryLock(long time, TimeUnit unit)
 * 		newCondition()
 * 	ReadWriteLock
 * 		readLock()
 * 		writeLock()
 * 	Condition
 * 		await():类似于wait()方法
 * 		awaitUninterruptibly()
 * 		awaitUntil(Date deadline)
 * 		signal():类似于notify()方法
 * 		signalAll():类似于notifyAll()方法
 * 
 * Lock的主要类：
 * 	ReentrantReadWriteLock
 * 		ReadLock
 * 		WriteLock
 * 
 ******************************************************************
 * wait() notify() notifyAll()都只能在synchronzied中出现
 * 
 */
/**
 * @author wetts
 * @created 2015/06/03
 *
 */
package com.wetts._api.thread.safe.lock;
