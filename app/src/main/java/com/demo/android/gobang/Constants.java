package com.demo.android.gobang;
/**
 *
 * */
public class Constants {

    // 五子连珠
    public final static int MAX_COUNT_IN_LINE = 5;
    // 棋盘的行数
    final static int MAX_LINE = 15;

    // 检查的方向
    final static int HORIZONTAL = 0;//水平五字
    final static int VERTICAL = 1;//竖五字
    final static int LEFT_DIAGONAL = 2;//左斜
    final static int RIGHT_DIAGONAL = 3;//右斜

    //初级中级玩家胜场
    final static String SIMPLEBLACKCOUNT = "simpleblackcount";
    final static String SIMPLEWHITECOUNT = "simplewhitecount";
    final static String SIMPLEBLACKAIWIN = "simpleblackaiwin";
    final static String SIMPLEWHITEAIWIN = "simplewhiteaiwin";
    final static String HARDBLACKCOUNT = "hardblackcount";
    final static String HARDWHITECOUNT = "hardwhitecount";
    final static String HARDBLACKAIWIN = "hardblackaiwin";
    final static String HARDWHITEAIWIN = "hardwhiteaiwin";
}
