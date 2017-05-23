package com.igz.rssreader.mock;

import android.support.test.InstrumentationRegistry;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

 class ResponseProvider {

     static String loadFile(String assetPath){
        try{
            InputStream is = InstrumentationRegistry.getContext()
                    .getResources()
                    .getAssets()
                    .open(assetPath);
            return readFile(is);
        }catch (IOException e){
            return "";
        }
    }

    private static String readFile(InputStream is){
        Scanner scanner = new Scanner(is, "UTF-8").useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "";
    }
}
