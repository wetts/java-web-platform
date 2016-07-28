package com.wetts.base.util.weight;

import java.util.Map;

/**
 * @author wetts
 * @Description: 权重辅助类
 * @date 2016/07/26
 */
public class WeightHelper {

    public static <T> WeightMeta<T> buildWeightMeta(final Map<T, Integer> weightMap) {
        final int size = weightMap.size();
        Object[] nodes = new Object[size];
        int[] weights = new int[size];
        int index = 0;
        int weightAdder = 0;
        for (Map.Entry<T, Integer> each : weightMap.entrySet()) {
            nodes[index] = each.getKey();
            weights[index++] = (weightAdder = weightAdder + each.getValue());
        }
        return new WeightMeta<T>((T[]) nodes, weights);
    }

}
