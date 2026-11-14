package dev.epro.r0;

import android.util.FloatProperty;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A12143630534484782974 extends FloatProperty {
    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((FocusRingDrawable) obj).k);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        focusRingDrawable.k = f;
        focusRingDrawable.invalidateSelf();
    }
}
