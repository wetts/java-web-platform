package com.wetts;

import com.wetts.base.util.SendEmailUtil;
import org.junit.Test;

/**
 * Created by wetts on 2017/3/14.
 */
public class SendEmailTest {

    @Test
    public void sendEmail() {
        SendEmailUtil.sendEmail("844349046@qq.com", "账号激活邮件", "Java is easy when you watch our tutorials ;)");
        SendEmailUtil.sendEmailBySSL("844349046@qq.com", "ssl", "Java is easy when you watch our tutorials ;)");
    }
}
