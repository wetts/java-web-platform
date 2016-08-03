package com.wetts._api.array;

import java.util.Arrays;

/**
 * 拷贝数组的方法都是浅拷贝
 *
 * @author wetts
 * @created 2015/06/09
 */
public class ArrayCopy {

    public static void main(String[] args) {
        Base[] i = new Base[5];
        for (int j = 0; j < i.length; j++) {
            i[j] = new Base(j);
        }
        System.out.println(Arrays.toString(i));

        Base[] ii = Arrays.copyOf(i, i.length);
        System.out.println(Arrays.toString(ii));

        Base[] iii = new Base[i.length];
        System.arraycopy(i, 0, iii, 0, i.length);
        System.out.println(Arrays.toString(iii));

        i[3].setI(10);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(ii));
        System.out.println(Arrays.toString(iii));
    }
}

class Base {

    private int i;

    public Base(int i) {
        super();
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "" + i;
    }
}
