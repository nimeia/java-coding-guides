/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.component.utils;

/**
 * 全局工具类样例
 */
public abstract class DemoUtils {

    public static final String DEMO_SUBFIX = "demo";

    //避免实例化
    private DemoUtils() {
    }

    /**
     * only a demo method
     *
     * @param demoStr
     * @return
     */
    public static String addDemoStr(final String demoStr) {
        return demoStr + DEMO_SUBFIX;
    }

}
