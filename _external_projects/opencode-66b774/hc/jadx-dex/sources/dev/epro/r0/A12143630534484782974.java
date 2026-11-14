package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12143630534484782974 extends android.util.FloatProperty {
    @Override // android.util.Property
    public final java.lang.Float get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((com.google.android.material.focus.FocusRingDrawable) obj).k);
    }

    @Override // android.util.FloatProperty
    public final void setValue(java.lang.Object obj, float f) {
        com.google.android.material.focus.FocusRingDrawable focusRingDrawable = (com.google.android.material.focus.FocusRingDrawable) obj;
        focusRingDrawable.k = f;
        focusRingDrawable.invalidateSelf();
    }
}
