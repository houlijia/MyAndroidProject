package com.example.myandroidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        Bitmap bitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
        Bitmap bitmap02 = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_4444);
        Bitmap bitmap03 = Bitmap.createBitmap(16, 16, Bitmap.Config.RGB_565);

        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.rgb(255,140,0));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.myandroidproject", appContext.getPackageName());
    }
}