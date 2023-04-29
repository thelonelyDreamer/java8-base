package com.felixwc.java8.hello;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;

public class MainBootTest {

    @Test
    public void main() throws FileNotFoundException {
        URL url = MainBoot.class.getClassLoader().getResource("read.txt");
        File file = new File(url.getFile());
        Scanner scanner = new Scanner(new FileInputStream(file));
        int i = 1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String[] s = scanner.nextLine().split(" ");
            if (s.length > 0) {
                LinkedList<Integer> integers = new LinkedList<>();
                for (String s1 : s) {
                    if (s1.length() > 0)
                        integers.add(Integer.valueOf(s1));
                }
                if (integers.size() > 0) {
                    map.put(i, integers);
                    i++;
                }
            }
        }
        map.forEach((index, lists) -> {
            System.out.print(index);
            for (Integer list : lists) {
                System.out.print(" ");
                System.out.print(list);
            }
            System.out.println();
        });
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (; ; ) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }

    public int[] testA(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        if (Objects.isNull(nums) || nums.length == 0) {
            return null;
        }
        ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (stack.empty() || stack.peek() * nums[i] > 0) {
                stack.push(nums[i]);
            } else {
                while (true) {
                    if (stack.empty()) {
                        stack.push(nums[i]);
                        break;
                    }
                    int temp = stack.peek();
                    if (0 == temp + nums[i]) {
                        stack.pop();
                        break;
                    } else if (Math.abs(temp) > Math.abs(nums[i])) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        int[] ints = new int[stack.size()];
        for (int i = ints.length - 1; i >= 0; i--) {
            ints[i] = stack.pop();
        }
        return ints;
    }
}