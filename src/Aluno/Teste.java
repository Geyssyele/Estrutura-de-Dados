/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aluno;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author 20171TINF0137
 */
public class Teste {
    private static final int IDADE_MINIMA = 15;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;
    private static final int QUANT_MAX_NOTAS = 4;

    public static double arredondar(double valor, String formatoCasas){
        DecimalFormat formato = new DecimalFormat(formatoCasas);
        formato.setRoundingMode(RoundingMode.DOWN);
        String formatoString = formato.format(valor);
        formatoString = formatoString.replace(',', '.');
        return Double.parseDouble(formatoString);
    }
    
    public static double arredondarDuasCasas(double valor) {
        return arredondar(valor, "0.00");
    }
    
    public static int getQuantidadeMaximaNotas() {
        return QUANT_MAX_NOTAS;
    }

    public static int getIdadeMinima() {
        return IDADE_MINIMA;
    }

    public static double getNotaMinimaPermitida() {
        return NOTA_MINIMA;
    }

    public static double getNotaMaximaPermitida() {
        return NOTA_MAXIMA;
}
    
}
