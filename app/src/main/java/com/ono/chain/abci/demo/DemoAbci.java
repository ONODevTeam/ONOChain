package com.ono.chain.abci.demo;

import com.ono.chain.jabci.socket.ExceptionListener.Event;
import com.ono.chain.jabci.socket.TSocket;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @project_name：ono-chain
 * @package_name：com.ono.chain.abci.demo
 * @describe：***
 * @creater wangze (1215360909@qq.com) 
 * @creat_time 2019/3/29 2:56 PM 
 * @changer   ***  
 * @change_time 2019/3/29 2:56 PM 
 * @remark   ***
 * @version V0.1
 */
@Component
public class DemoAbci implements CommandLineRunner {
    
    private TSocket socket;
    
    @Override
    public void run(String... args) throws Exception {
        demoAbci();
    }
    
    public void demoAbci() throws InterruptedException {
        System.out.println("starting counter");
        socket = new TSocket((socket, event, exception) -> {
            if (event == Event.SocketHandler_handleRequest) {
                exception.printStackTrace();
            } else if (event == Event.SocketHandler_readFromStream) {
                System.err.println("error on " + socket.orElse("NONAME") + "-> SocketHandler_readFromStream: " + exception.getMessage());
            }
        }, (socketName, count) -> {
            System.out.println("CONNECT socketname: " + socketName + " count: " + count);
        }, (socketName, count) -> {
            System.out.println("DISCONNET socketname: " + socketName + " count: " + count);
        });
        
        socket.registerListener(this);
        
        Thread t = new Thread(() -> socket.start(TSocket.DEFAULT_LISTEN_SOCKET_PORT));
        t.setName("Java DemoAbci Main Thread");
        t.start();
    }
    
}
