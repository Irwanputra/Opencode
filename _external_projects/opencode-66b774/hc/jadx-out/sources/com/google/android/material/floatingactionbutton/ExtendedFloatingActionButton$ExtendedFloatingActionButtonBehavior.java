package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import dev.epro.r0.D15445857918358799638;
import dev.epro.r0.Q9005017131391967988;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends D15445857918358799638 {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q9005017131391967988.c);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
