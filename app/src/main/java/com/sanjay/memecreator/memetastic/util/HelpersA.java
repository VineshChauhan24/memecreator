package com.sanjay.memecreator.memetastic.util;

import android.app.Activity;

public class HelpersA extends com.sanjay.memecreator.opoc.util.HelpersA {
    private HelpersA(Activity activity) {
        super(activity);
    }

    public static HelpersA get(Activity activity) {
        return new HelpersA(activity);
    }
}
