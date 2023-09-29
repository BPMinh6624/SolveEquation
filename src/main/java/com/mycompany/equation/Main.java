/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equation;

import com.mycompany.equation.Controller.EquationSolve;
import com.mycompany.equation.Model.EquationModel;

/**
 *
 * @author tuanh
 */
public class Main {

    public static void main(String[] args) {
        EquationModel equationModel = new EquationModel();
        
        new EquationSolve(equationModel).run();
    }
}
