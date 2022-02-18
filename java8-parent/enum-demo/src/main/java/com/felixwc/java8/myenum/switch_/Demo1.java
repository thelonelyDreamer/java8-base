package com.felixwc.java8.myenum.switch_;

/**
 * in order to learn java!
 * created at 2022/2/8 02:05
 *
 * @author wangchao
 */

/**
 * 演示在switch语句中使用枚举类型
 * 在Signal 枚举类中定义交通信号灯的状态
 */
public class Demo1 {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }

    private enum Signal {GREEN, YELLOW, RED,}

    public static class TrafficLight {
        Signal color = Signal.RED;

        public void change() {
            switch (color) {
                case RED:
                    color = Signal.GREEN;
                    break;
                case GREEN:
                    color = Signal.YELLOW;
                    break;
                case YELLOW:
                    color = Signal.RED;
                    break;
            }
        }
        @Override
        public String toString() {
            return "TrafficLight{" +
                    "color=" + color +
                    '}';
        }
    }
}
