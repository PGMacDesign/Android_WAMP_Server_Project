package com.pgmacdesign.firstwampserver.misc;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by pmacdowell on 8/10/2015.
 */
public class L {

    /**
     * Quick println
     * @param myObject The string to print (or double, int, whatever)
     * @param <E> Extends object
     */
    public static <E> void m(E myObject){
        System.out.println("" + myObject);
    }

    /**
     * Short toast
     * @param context context
     * @param myObject String to print (If other things are passed in, it converts it to a String first)
     */
    public static <E> void toast(Context context, E myObject){
        String str = myObject + ""; //Cast it to a String
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    /**
     * Long toast
     * @param context context
     * @param myObject String to print (If other things are passed in, it converts it to a String first)
     */
    public static <E> void Toast(Context context, E myObject){
        String str = myObject + ""; //Cast it to a String
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
