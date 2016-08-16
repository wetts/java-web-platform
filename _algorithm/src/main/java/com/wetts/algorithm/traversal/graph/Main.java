package com.wetts.algorithm.traversal.graph;

import java.util.Queue;

/**
 * 图的测试类
 */
public class Main {

    public static void main(String[] args) {

        int[][] racs = new int[][]{
                {0, 1, 0, 1, 0,},
                {1, 0, 1, 0, 1,},
                {0, 1, 0, 1, 1,},
                {1, 0, 1, 0, 0,},
                {0, 1, 1, 0, 0,},
        };
        int oo = Integer.MAX_VALUE;
        int[][] racs1 = new int[][]{
                {oo, 1, 1, oo, oo, oo, oo, oo},
                {1, oo, oo, 1, oo, oo, oo, oo},
                {1, oo, oo, 1, 1, oo, oo, oo},
                {oo, 1, 1, oo, oo, 1, 1, oo},
                {oo, oo, 1, oo, oo, oo, oo, 1},
                {oo, oo, oo, 1, oo, oo, 1, oo},
                {oo, oo, oo, 1, oo, 1, oo, oo},
                {oo, oo, oo, oo, 1, oo, oo, oo},
        };

        String[] verticeInfos1 = new String[]{
                "V0", "V1", "V2", "V3", "V4", "V5", "V6", "V7"
        };
        Graph<String> graph = new Graph<String>(racs1, verticeInfos1);
        Queue<String> dr = graph.depthFirstSearch();
        Queue<String> br = graph.breadthFirstSearch();

        System.out.println("--遍历");
        System.out.println("----深度优先结果: " + dr);
        System.out.println("----广度优先结果: " + br);
    }
}