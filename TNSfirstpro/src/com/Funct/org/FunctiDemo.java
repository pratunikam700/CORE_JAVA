package com.Funct.org;

public class FunctiDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//         System.err.println("------------Main----------");
//         Runnable r=()->{
//        	 for(int i=1;i<=50;i++)
//        		 System.out.println(Thread.currentThread().getName()+"Hello");
//        	 try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//         };
//         Thread t1=new Thread(r,"Thread1");
//         Thread t2=new Thread(r,"Thread2");
//       
//         t1.start();
//         t2.start();
//        // t3.start();
//         r= ()->{
//        	 int i=2;
//        	 while(i<=100) {
//        		 System.out.println(Thread.currentThread().getName()+i);
//        		 i+=2;
//        		 try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//        	 }
//         };
//         Thread  t3=new Thread(r,"Thread3");
//         t3.start();
		
		GreetInter1 greet=(s) -> "Hello"+s;
		System.out.println(greet.sayHello("pratu"));
		greet=(s)->"hii"+"How are you?"+s;
		System.out.println(greet.sayHello("chinguu"));
	}

}
