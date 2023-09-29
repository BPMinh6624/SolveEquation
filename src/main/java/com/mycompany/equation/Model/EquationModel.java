/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equation.Model;

import java.util.ArrayList;
import java.util.List;

public class EquationModel {
    public List<Float> calculateSuperlative(float a, float b) {
        List<Float> results = new ArrayList<>();
        
        results.add(a); //thêm vào danh sách để xét even, odd, square
        results.add(b);

        if (a == 0) {
            return results; //Ko có nghiệm nào
        }
        float x = -b / a;
        results.add(x);
        return results;
    }

    public List<Float> calculateQuadratic(float a, float b, float c) {
        List<Float> results = new ArrayList<>();
        
        

        float delta = b * b - 4 * a * c;

        if (delta < 0) {
            return results; // Không có nghiệm thực
        } else if (delta == 0) {  
            float x = -b / (2 * a);   //nghiệm kép
            results.add(x);
        } else {
            float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            results.add(x1);
            results.add(x2);
        }
        return results;
    }

}
