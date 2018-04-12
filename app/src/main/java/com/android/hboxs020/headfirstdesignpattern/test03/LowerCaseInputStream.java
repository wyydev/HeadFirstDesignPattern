package com.android.hboxs020.headfirstdesignpattern.test03;

import android.support.annotation.NonNull;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hboxs020 on 2018/4/9.
 */

public class LowcCaseInputStream extends FilterInputStream {

    protected LowcCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c =  super.read();
        return c == -1 ? c:Character.toLowerCase((char) c);
    }

    @Override
    public int read(@NonNull byte[] b, int off, int len) throws IOException {
        int length =  super.read(b, off, len);
        for (int i=off;i< off +length;i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return length;
    }
}
