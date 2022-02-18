package com.felixwc.java8.myenum.method;

/**
 * in order to learn java!
 * created at 2022/2/8 02:32
 *
 * @author wangchao
 */

/**
 * 展示向枚举类中添加新的方法
 */
public class Demo2 {
    public static void main(String[] args) {
        for (Direction value : Direction.values()) {
            System.out.println(value+": "+value.getDescription());
        }
    }

    private enum Direction{
        WEST("west"),NORTH("north"),EAST("east"),SOUTH("south");

        private String description;
        Direction(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
