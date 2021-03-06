/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.component.constants;

/**
 * 全局的常量
 *
 * @author huang
 */
public abstract class GlobalContants {

    // 避免实例化
    private GlobalContants() {
    }

    /**
     * tip: 一些全局使用的常量的定义，只有在自身模块的定义到对应的模块中
     */
    public static final String API_SYSTEM_PATH = "/apis";

}
