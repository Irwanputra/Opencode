package com.google.android.material.carousel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class CarouselLayoutManager extends dev.epro.r0.Y2666402291564931474 {
    public dev.epro.r0.K2485896354922890436 a;

    public CarouselLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        android.graphics.Paint paint = new android.graphics.Paint();
        java.util.Collections.unmodifiableList(new java.util.ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Q9005017131391967988.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            o(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void o(int i) {
        dev.epro.r0.K2485896354922890436 k2485896354922890436;
        if (i != 0 && i != 1) {
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.n(i, "invalid orientation:"));
            return;
        }
        dev.epro.r0.K2485896354922890436 k24858963549228904362 = this.a;
        if (k24858963549228904362 == null || i != k24858963549228904362.a) {
            if (i == 0) {
                k2485896354922890436 = new dev.epro.r0.K2485896354922890436(0);
            } else {
                if (i != 1) {
                    dev.epro.r0.S10973172697741180971.j("invalid orientation");
                    return;
                }
                k2485896354922890436 = new dev.epro.r0.K2485896354922890436(1);
            }
            this.a = k2485896354922890436;
        }
    }

    public CarouselLayoutManager() {
        android.graphics.Paint paint = new android.graphics.Paint();
        java.util.Collections.unmodifiableList(new java.util.ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        o(0);
    }
}
