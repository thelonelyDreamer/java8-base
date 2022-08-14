package com.felixwc.java8.interview.p;

/**
 * in order to learn java!
 * created at 2022/7/29 10:06
 *
 * @author felixwc
 */

public class B extends A implements Ifnc{

    private int edge;

    public int getVolume() {
        return edge*edge*edge;
    }

    @Override
    public int getArea() {
        return 6*edge*edge;
    }

    @Override
    public  int func1(int M) {
        //这里参数不合法要抛异常的，
        // return M/6的平方根
        return 0;
    }

    @Override
    public int func2(int T) {
        //这里参数不合法要抛异常的，
        // return T 的三次根
        return 0;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
}
