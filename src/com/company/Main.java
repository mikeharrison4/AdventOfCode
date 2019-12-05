package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.source.tree.BreakTree;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



    }


}









//    File file = new File("./src/assets/input.txt");
//    BufferedReader br = null;
//
//        try {
//                /// === file reader shit
//                br = new BufferedReader(new FileReader(file));
//                String str;
//                // ================
//                while ((str = br.readLine()) != null) {
//
//
//                String[] stringCode = str.split(",");
//                int size = stringCode.length;
//                int[] intCode = new int[size];
//                for(int i = 0; i < size; i++) intCode[i] = Integer.parseInt(stringCode[i]);
//
//
//        }
//
//        } catch (IOException e) {
//        e.printStackTrace();
//        }



// ========== Day 1, part 1

//    private static int getFuelRequirement(int mass) {
//        int fuelRequired = 0;
//
//        while( (int) Math.floor( mass / 3 ) - 2 > 0 ) {
//            mass = (int) Math.floor( mass / 3 ) - 2;
//            fuelRequired += mass;
//        }
//
//        return fuelRequired;
//    }/


// ========= Day 2, part 1

//                part1(stringCode, intCode, 12, 2);

//    private static int part1(String[] stringCode, int[] intCode, int replacement1, int replacement2) {
//
//        intCode[1] = replacement1;
//        intCode[2] = replacement2;
//
//        int position = 0;
//
//        while ( intCode[position] != 99 ) {
//
//            int input1index = intCode[position + 1];
//            int input2index = intCode[position + 2];
//            int outputIndex = intCode[position + 3];
//
//            int sum = intCode[position] == 1 ? intCode[input1index] + intCode[input2index] : intCode[input1index] * intCode[input2index];
//            intCode[outputIndex] = sum;
//
//            position += 4;
//        }
//
//        int answer = intCode[0];
//
//        if(intCode[position] == 99) { // reset array
//            for (int i = 0; i < stringCode.length; i++) {
//                intCode[i] = Integer.parseInt(stringCode[i]);
//            }
//        }
//
//        return answer;
//
//    }


// ========= Day 2, part 2

//    part2( stringCode, intCode, 19690720);

//    private static int part2(String[] stringCode, int[] intCode, int expectedNum) {
//
//        int answer = 0;
//
//        for (int noun = 0; noun < 100; noun++) {
//            for(int verb = 0; verb < 100; verb++) {
//                int result = part1(stringCode, intCode, noun, verb);
//
//                if(result == expectedNum) {
//                    answer = 100 * noun + verb;
//                    break;
//                }
//
//            }
//        }
//
//        return answer;
//    }