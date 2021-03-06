/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.component.utils;

/**
 * tip: 一个工具类应该以Utils 结尾，同时是abstract 的，有一个private 的 constructor.
 * <br> it is only the utils demo
 *
 * @author huang
 * @since 1.0.0
 */
public abstract class SomeUtils {

    /**
     * 单点登录系统
     */
    public static final String SYSTEM_SSO = "sso";

    // tip: prevent anyone from instantiating
    private SomeUtils() {
    }

    /**
     * tip: 方法将来被废弃时，记得使用 @Deprecated 标记，并标准一些替换方法.
     */
    @Deprecated
    public static void deprecatedMethod() {
    }

    /**
     * 一个简单的工具类例子
     *
     * @return
     */
    public static String sayHello() {
        return "hello";
    }
}
