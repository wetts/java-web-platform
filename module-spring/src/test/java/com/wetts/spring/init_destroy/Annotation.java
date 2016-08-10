package com.wetts.spring.init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by wetts on 2016/8/10.
 */
public class Annotation {

    public Annotation() {
        System.out.println("Annotation Construt....");
    }

    @PostConstruct
    public void  init(){
        System.out.println("Annotation I'm init method using @PostConstrut....");
    }

    @PreDestroy
    public void  dostory(){
        System.out.println("Annotation I'm destory method using @PreDestroy.....");
    }

}
