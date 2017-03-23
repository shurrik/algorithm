package com.shurrik.algorithm.datastructure.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exe = Executors.newFixedThreadPool(5);
		Callable<String> call = new Callable() {
			
			public String call() throws Exception {
				// TODO Auto-generated method stub
				Thread.sleep(5000);
				String msg = "task is over";
				return msg;
			}
		};
		
		Future<String> task = exe.submit(call);
		
		while(!task.isDone())
		{
			System.out.println("do other thing");
		}
		
		String res = task.get();
		System.out.println(res);
		exe.shutdown(); //如果不加这句进程不会关闭
	}
}
