package class9.FactorialSwing.controller;

import class9.FactorialSwing.err.FactorialModelException;
import class9.FactorialSwing.model.*;
/**
 * Created by fsouto on 19/05/16.
 */
public class FactorialController {
    public static String calculateFactorial(String n) {
        try {
            int fn = Integer.parseInt(n);
            FactorialModel fac = new FactorialModel(fn);
            String data = "F(" + n + ") = " + fac.getFat();
            return data;
        } catch(NumberFormatException err) {
            return "Error, '" + n + "' is not a valid number!";
        } catch(FactorialModelException err) {
            return err.getMessage();
        }
    }
}
