/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
// tip: package 第一部分为公司，第二部分为项目名，第三部分为组件名，还有一些觉的功能分类，例如 constants utils dao web api service ......
package company.project.component;

/*
 * tip: 导入包一般可以按以下设计类, 不强制，不般ide自动导入时已经分好类
 * tip: import java.util.*;  import static org.assertj.core.api.Assertions.* ; 这样的导入方式不允许的
 * tip: import static org.assertj.core.api.Assertions.assertThat; 这样的方法生产代码中是不允许的，一般只用于 test 代码中
 * tip: 本部分注解只为说明，不应该存在
 *
 * import java.*
 * tip: 空行隔开
 * import javax.*
 * tip: 空行隔开
 * import all other imports
 * tip: 空行隔开
 * import org.springframework.*
 * tip: 空行隔开
 * import static all other imports
 */

//一般无用的import 代码可以用ide 提供的clean code 功能清理掉

import com.alibaba.fastjson.JSON;
import company.project.api.user.UserApi;
import company.project.component.api.UserApiImpl;
import company.project.component.constants.OrderTypeEnum;
import company.project.component.entity.User;
import company.project.component.exception.DemoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/*
 * tip: 关于格式化代码，在文件未提交到 vcs 中时可以使用，提交后就不建议使用，因为会引起代码难以合并的问题
 * tip: 已经处在于版本管理中的代码，只允许小部分代码片段的格式化
 * tip: 对于单行文本长度换行的问题，0202 都要过了，768分辨率的都不太好意思了，我的建议是 110 左右，别超120 ，80、90 有点少了 具体情况具体分析
 */

/*
 * tip: 关于什么时候加空格，if 后有没有空格，方法定义后有没有空格，参数“，”后有没有空格,应该加几个空格
 * tip: 这样的说明就不展示了，我的作法是当定义完方法后 用ide的默认的方法格式化。使用默认是99%的coder都不会调整
 */

/*
 * tip: 关于缩进，我是强制使用空格代码 tab ,同时配合 editorconfig 配置缩进是4位还是两个
 * tip: 一般来是java coder 可能喜欢4个，前端coder们习惯2个
 */

/*
 *  tip: 关于空行，我是没有强制怎样去使用，但有一般的规律，一些比较重要，或者明显有别于前面代码的逻辑强者结构，你可以按等级加一个或者两个空行。
 *  tip: 下面代码引用来自 spring code style
 *    Add two blank lines before the following elements:
 *      static {} block
 *      Fields
 *      Constructors
 *      Inner classes
 *    Add one blank line after a method signature that is multiline
 */

/*
 * tip: 变量的定义，类的定义一般不允许 “_" 数字”1~0“等特殊字符
 * tip: 常量定义是一个特例，可以使用 ”_" 线
 * tip: 风格使用驼峰式，结构 类等 使用大写开始 ，方法，变量使用小写开始
 */

/**
 * tip: 这是一个 java 编码的 style guides.
 * tip: 说明后一般跟 @author 信息，@see 其它关联类与结构 @since 该类是什么版本时增加
 * tip: 下面用空行隔开
 *
 * @author huang
 * @see String
 * @since 1.0.0
 */
@SuppressWarnings("checkstyle:Indentation")
public class ShowCodeDemo {
    
    /*
     * tip: 尽管java的定义无需按顺序进行，但如果把一些重要的信息放到前面，这样可以增加我们代码的可读性,下面为一般的建议顺序
     * tip: 我的习惯时把setter/getter equals, hashCode, and toString 放到最后，这里一般我们不关心set/get 。
     * tip: equals, hashCode, and toString 等放最后，我可以快速的定位到
     *  static fields
     *  normal fields
     *  constructors
     *  (private) methods called from constructors
     *  static factory methods
     *  method implementations coming from interfaces
     *  private or protected templates that get called from method implementations coming from interfaces
     *  other methods
     *  JavaBean properties (i.e., getters and setters)
     *  equals, hashCode, and toString
     */

    // tip: 当定义一些有意义的值时，像一周有多少秒，可以使用下面的方式，无需担心会产生不必要的计算，编译器会帮我们完成一切
    // tip: 常量使用 CONSTANT_CASE 风格 ，全部大写字母，单词用"_"分开
    private static final Integer ONE_WEEK_IN_SECONDS = 7 * 24 * 3600;

    // tip: 定义日志时使用 private static final Logger logger
    // tip: 输出信息时统一禁止使用System.out
    // tip: 不是所有 static final 都为常量，例如logger 定义
    private static final Logger logger = LoggerFactory.getLogger(ShowCodeDemo.class);

    // tip: 数据定义的"[]"放在类型后，数组每个元素紧跟", " ，例如 int arg [] 这样的定义是不允许的
    public Integer[] justIntArray = new Integer[]{1, 3, 5, 7, 9, 11};

    /**
     * 程序进行的主入口方法，只用于演示，另关心代码逻辑.
     * tip: 下面加一个空行隔开
     *
     * @param args the programs args
     */
    public static void main(final String[] args) {

        // just use to call the demo methods !
        ShowCodeDemo showCodeDemo = new ShowCodeDemo();

        // tip: 当引用静态的常量时，都需要加个类的引用
        // tip: 当引用成员变量时，需要加上this, showCodeDemo.justIntArray , 因为main 入口中无法调用this ,只用showCodeDemo.justIntArray做演示，大家知道即可
        // tip: 如果有些地方单行会超过长度，但不换行的意思更明确，我们不建议换行
        if (logger.isDebugEnabled()) {
            logger.debug("one week have :{} seconds ", ShowCodeDemo.ONE_WEEK_IN_SECONDS);
            logger.debug("the default array is :{}", showCodeDemo.justIntArray);
        }

        Boolean firstCondition = true;
        Boolean secondCondition = false;

        // tip: 不可以使用敏感字定义变量，减少代码扫描工具误判，下面为一个反例
        String password = ""; /*it is bad*/

        if (firstCondition) {
            // tip: debug 的日志需要先判断，调整日志级别后可以提升效率
            // tip: 当不加判断条件直接调用debug 方法时，当参数有计算值时会产生不必要的计算
            // tip: logger.debug("{}", (x + y + z))
            if (logger.isDebugEnabled()) {
                // tip: 日志输出时，禁止拼接字符串
                logger.debug("this is only a debug message :{} ", "helloWorld");
            }
            User user = new User();
            if (logger.isInfoEnabled()) {
                // tip: 错误例子，输出日志时不能使用json 格式化输出，应该实现该对象的toString 方法，
                logger.info("the current user is :{}", JSON.toJSONString(user));
            }
        } else if (secondCondition) {

        }
        BigDecimal orderPrice = new BigDecimal("100");
        BigInteger orderCount = new BigInteger("1000");

        // tip: 当你认为该处代码为一个比较重要的逻辑的开始，你可以在前面加一个空行隔开
        Integer testSumResult = showCodeDemo.sum(orderCount.intValue(), orderCount.intValue(), orderCount.intValue(),
                orderPrice.intValue(), orderPrice.intValue(), orderPrice.intValue(),
                showCodeDemo.justIntArray);
        for (int i = 0; i < testSumResult; i++) {
            testSumResult--;
        }

        // tip: 一些多线程处理的程序 ，或者判断一个定值，== 操作 可以改成 <= 或者 >=。例如减库存等场景
        if (testSumResult <= 0) {
            logger.warn("all the things was out ,current num is :{}", testSumResult);
        }

        // tip: 日志错误信息处理
        try {
            showCodeDemo.methodWillThrowSomeBusinessException(1, OrderTypeEnum.ORDER_TYPE_ONE);
        } catch (DemoException e) {

            // FIXME tip:用fixme 标准某个错误未处理完成，在ide 中可以统一查询该系统

            // tip: 不允许使用 printStackTrace 打印错误信息
            e.printStackTrace();
            // tip: 需要使用日志记录错误的完整信息
            logger.error("业务错误描述；", e); // it`s good
            logger.error("业务错误描述", e.getMessage()); //is`s bad
            // do somethings
        } finally {
            // do somethings
            // tip: finally 中一般不允许有 return ,例子有点奇怪，但知道即可
            return;
        }
    }

    /**
     * tip: 方法名的定义建议使用动词+名词的方式，例如下面方法名，一看就知道业务行为是什么
     */
    public void addOrder() {
    }

    /**
     * 远程 api 调用错误示例
     *
     * @param ids
     */
    public void getUserDetailsInfo(Long... ids) {

        // 假设userApi 是一个远程调用的接口
        UserApi userApi = new UserApiImpl();

        for (Long id : ids) {

        }
    }

    /**
     * tip: 当代码中存在按某几个类型去判断业务时，需要定义对应的常量或者eNum ,例如下面 判断 type == 1 ,type ==2 这样的操作就会带来理解困难.
     *
     * @param type ,参数type 是一个不规范的用法，也就是常说的魔数
     */
    public void methodWillThrowSomeBusinessException(final Integer type /*type is bad*/
            , final OrderTypeEnum orderType /*orderType is good*/) throws DemoException {

        if (new Integer(1).equals(type)) { /*type is bad*/
            throw new DemoException();
        } else if (new Integer("2").equals(type)) {
            //just do something
        }

        if (OrderTypeEnum.ORDER_TYPE_ONE.equals(orderType)) { /*orderType is good*/
            throw new DemoException();
        } else {
            //just do something
        }
    }

    /**
     * 私有方法，一般写在公共方法后，setter/getter前.
     * tip: 下面加一个空行隔开，
     *
     * @param x 第一个参数
     * @param y 第二个参数
     * @return 返回说明
     */
    private Integer add(final Integer x, final Integer y) {
        return x + y;
    }

    /**
     * tip: 当一个方法定义的参数需要换行时，方法体使用一个空行隔开
     * tip: 一般不建意使用不定长参数 ，例如 final Integer ... xyz
     *
     * @param x
     * @param y
     * @param z
     * @param i
     * @param j
     * @param k
     * @return the sum of all the num
     */
    private Integer sum(final Integer x, final Integer y, final Integer z,
                        final Integer i, final Integer j, final Integer k,
                        final Integer... xyz) {

        // tip: there is a blank line before
        Integer xyzSum = Arrays.stream(xyz).reduce(0, this::add);
        // tip: 当一个计算值是有意义时，可以真定义成一个变量再进行处理，或者返回等，这样方便理解
        Integer allSum = xyzSum + x + y + z + i + j + k;
        return allSum;
    }


}
