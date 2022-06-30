package com.example.modul_1_zaniatie_3_dom_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Присваиваем переменной incomeData - параметры от устройства в виде строки
        String incomeData = "<voltage=220,power=3200,speed=0,silent_mode=0>";

        String firstSymbol = String.valueOf(incomeData.charAt(0));
        String lastSymbol = String.valueOf(incomeData.charAt(incomeData.length()-1));

        if (firstSymbol.equals("<")){
            if (lastSymbol.equals(">")){

                // Remove first and last symbol from String incomeData
                incomeData = incomeData.replace("<","");
                incomeData = incomeData.replace(">", "");

                // Обозначаем массив String[] allParameters,  присваиваем ему елементы из переменной (входящей строки) incomeData, которые разделены ","
                String[] allParameters = incomeData.split(",");

                // Solution using Loop for
                Log.d("MYLOG", "- - - LOOP for - - -");

                for (int i = 0; i < allParameters.length; i++){
                    // Обозначаем массивы String[] parameter, присваиваем им елементы из строк масива allParameters, которые разделены "="
                    String[] parameter = allParameters[i].split("=");
                    String value = parameter[1];

                    if (parameter[0].equals("voltage")){
                        Log.d("MYLOG", "Voltage: " + value);
                    }else if (parameter[0].equals("power")){
                        Log.d("MYLOG", "Power: " + value);
                    }else if (parameter[0].equals("speed")){
                        Log.d("MYLOG", "Speed: " + value);
                    }else if (parameter[0].equals("silent_mode")){
                        Log.d("MYLOG", "Silent mode: " + value);
                    }
                }

                // Solution using Loop for each
                Log.d("MYLOG", "- - - LOOP for each - - -");

                for (String item : allParameters){
                    // Обозначаем массивы String[] parameter, присваиваем им елементы из строк масива allParameters, которые разделены "="
                    String[] parameter = item.split("=");
                    String value = parameter[1];

                    if (parameter[0].equals("voltage")){
                        Log.d("MYLOG", "Voltage: " + value);
                    }else if (parameter[0].equals("power")){
                        Log.d("MYLOG", "Power: " + value);
                    }else if (parameter[0].equals("speed")){
                        Log.d("MYLOG", "Speed: " + value);
                    }else if (parameter[0].equals("silent_mode")){
                        Log.d("MYLOG", "Silent mode: " + value);
                    }
                }

            }else{
                Log.d("MYLOG", "Income data is not full. Last symbol is not '>'");
            }
        }else{
            Log.d("MYLOG", "Income data is not full. First symbol is not '<'");
        }


    }
}