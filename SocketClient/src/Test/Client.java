package Test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.opcfoundation.ua.builtintypes.NodeId;

public class Client extends Thread {

	/*
	 * static int num = 0; public static final String IP_ADDR =
	 * "202.117.15.49";// 服务器地址 这里要改成服务器的ip public static final int PORT =
	 * 12345;// 服务器端口号
	 * 
	 * 
	 * @Override public void run() { while (true) { try { new
	 * Thread().sleep(500); if (num > 100) { num = 0; } DataEntity de = new
	 * DataEntity(); NodeId Id = new NodeId(2, "MyLevel"); de.setId(Id);
	 * SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss"); Date
	 * time = new Date(); f.format(time); de.setTime(time); de.setValue(num);
	 * register(de); } catch (InterruptedException e) { e.printStackTrace(); } }
	 */
	public static void main(String[] args) {
		//ScheduledExecutorService pool = Executors.newScheduledThreadPool(6);
		//pool.scheduleAtFixedRate(new MyThread(), 1000, 1000, TimeUnit.MILLISECONDS);
		for(int i=0;i<5;i++){  
			System.out.println("i="+i);
            //pool.submit(new MyThread());  
            Thread myThread=new MyThread2();
            myThread.start();
            try {
				sleep(100);
				myThread.join();  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        }  
		
		//pool.shutdown();

	}

}
