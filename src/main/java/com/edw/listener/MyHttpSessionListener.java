package com.edw.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * <pre>
 *     com.edw.listener.MyHttpSessionListener
 * </pre>
 *
 * @author Muhammad Edwin < emuhamma at redhat dot com >
 * 15 Feb 2020 14:46
 */
public class MyHttpSessionListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(" attribute added "+httpSessionBindingEvent.getSession().getAttribute("name"));
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(" attribute removed "+httpSessionBindingEvent.getSession().getAttribute("name"));
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(" attribute replaced "+httpSessionBindingEvent.getSession().getAttribute("name"));
    }
}
