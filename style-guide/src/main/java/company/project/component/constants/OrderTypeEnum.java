/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.component.constants;

/**
 * tip: 系统中常用类别可以按系统业务列举
 */
public enum OrderTypeEnum {

    // TODO tip: 可以用todo 标记记录后面需要完成的事情，例如
    // TODO 将来会有第三种订单类型，
    ORDER_TYPE_ONE(1), ORDER_TYPE_TWO(2);

    private int type;

    OrderTypeEnum(int i) {
        this.type = i;
    }

    public int getType() {
        return type;
    }
}
