package com.wetts.spring.init_destroy;

/**
 * Created by wetts on 2016/8/10.
 */
public class XML {

    public XML() {
        System.out.println("XML Construt....");
    }

    public void  init(){
        System.out.println("XML I'm init method using @PostConstrut....");
    }

    public void  dostory(){
        System.out.println("XML I'm destory method using @PreDestroy.....");
    }

}
