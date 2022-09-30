package com.felixwc.pc1.obj;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * in order to learn java!
 * created at 2022/9/23 15:18
 *
 * @author felixwc
 */
public class Plate {
    private List<Product> products = new LinkedList<>();
    private Object o1 = new Object(); // 生成者
    private Object o2 = new Object(); // 消费者

    public void add(Product product) throws InterruptedException {
        if (add0(product)) {
            synchronized (o2) {
                o2.notifyAll();
            }
        } else {
            synchronized (o1) {
                o1.wait();
            }
            add(product);
        }
    }

    public Product get() throws InterruptedException {
        Product product = get0();
        if (Objects.nonNull(product)) {
            synchronized (o1) {
                o1.notifyAll();
            }
        } else {
            synchronized (o2) {
                o2.wait();
            }
            product = get();
        }
        return product;
    }

    public boolean add0(Product product) {
        boolean ret;
        synchronized (products) {
            if (products.size() < 10) {
                products.add(product);
                ret = true;
            } else {
                ret = false;
            }
        }
        return ret;
    }

    public Product get0() {
        Product product = null;
        synchronized (products) {
            if (products.size() > 0) {
                product = products.remove(0);
//                System.out.println("products size" + products.size());
            }
        }
        return product;
    }
}