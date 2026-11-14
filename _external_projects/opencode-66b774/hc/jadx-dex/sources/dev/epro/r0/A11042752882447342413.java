package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A11042752882447342413 implements dev.epro.r0.I9906786506247477813 {
    public dev.epro.r0.Q13169198992966610970 a;
    public dev.epro.r0.Q13169198992966610970 b;
    public dev.epro.r0.Q13169198992966610970 c;
    public dev.epro.r0.Q13169198992966610970 d;
    public dev.epro.r0.S17354436298385972004 e;
    public dev.epro.r0.S17354436298385972004 f;
    public dev.epro.r0.S17354436298385972004 g;
    public dev.epro.r0.S17354436298385972004 h;
    public dev.epro.r0.T13350664027331345869 i;
    public dev.epro.r0.T13350664027331345869 j;
    public dev.epro.r0.T13350664027331345869 k;
    public dev.epro.r0.T13350664027331345869 l;

    public static dev.epro.r0.E13848202552933286136 e(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        dev.epro.r0.W8078457053980686709 w8078457053980686709 = new dev.epro.r0.W8078457053980686709(0.0f);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Q9005017131391967988.j, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return f(contextThemeWrapper.obtainStyledAttributes(dev.epro.r0.Q9005017131391967988.o), w8078457053980686709);
    }

    public static dev.epro.r0.E13848202552933286136 f(android.content.res.TypedArray typedArray, dev.epro.r0.W8078457053980686709 w8078457053980686709) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            dev.epro.r0.S17354436298385972004 s17354436298385972004G = g(typedArray, 5, w8078457053980686709);
            dev.epro.r0.S17354436298385972004 s17354436298385972004G2 = g(typedArray, 8, s17354436298385972004G);
            dev.epro.r0.S17354436298385972004 s17354436298385972004G3 = g(typedArray, 9, s17354436298385972004G);
            dev.epro.r0.S17354436298385972004 s17354436298385972004G4 = g(typedArray, 7, s17354436298385972004G);
            dev.epro.r0.S17354436298385972004 s17354436298385972004G5 = g(typedArray, 6, s17354436298385972004G);
            dev.epro.r0.E13848202552933286136 e13848202552933286136 = new dev.epro.r0.E13848202552933286136();
            e13848202552933286136.a = dev.epro.r0.C9869900372345142877.u(i2);
            e13848202552933286136.e = s17354436298385972004G2;
            e13848202552933286136.b = dev.epro.r0.C9869900372345142877.u(i3);
            e13848202552933286136.f = s17354436298385972004G3;
            e13848202552933286136.c = dev.epro.r0.C9869900372345142877.u(i4);
            e13848202552933286136.g = s17354436298385972004G4;
            e13848202552933286136.d = dev.epro.r0.C9869900372345142877.u(i5);
            e13848202552933286136.h = s17354436298385972004G5;
            return e13848202552933286136;
        } finally {
            typedArray.recycle();
        }
    }

    public static dev.epro.r0.S17354436298385972004 g(android.content.res.TypedArray typedArray, int i, dev.epro.r0.S17354436298385972004 s17354436298385972004) {
        android.util.TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new dev.epro.r0.W8078457053980686709(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new dev.epro.r0.F10802198521110867507(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return s17354436298385972004;
    }

    public final dev.epro.r0.A11042752882447342413 a(float f) {
        dev.epro.r0.E13848202552933286136 e13848202552933286136I = i();
        e13848202552933286136I.e = new dev.epro.r0.W8078457053980686709(f);
        e13848202552933286136I.f = new dev.epro.r0.W8078457053980686709(f);
        e13848202552933286136I.g = new dev.epro.r0.W8078457053980686709(f);
        e13848202552933286136I.h = new dev.epro.r0.W8078457053980686709(f);
        return e13848202552933286136I.a();
    }

    public final boolean d() {
        return false;
    }

    public final boolean h(android.graphics.RectF rectF) {
        boolean z = this.l.getClass().equals(dev.epro.r0.T13350664027331345869.class) && this.j.getClass().equals(dev.epro.r0.T13350664027331345869.class) && this.i.getClass().equals(dev.epro.r0.T13350664027331345869.class) && this.k.getClass().equals(dev.epro.r0.T13350664027331345869.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && (this.b instanceof dev.epro.r0.Z17967803306442720428) && (this.a instanceof dev.epro.r0.Z17967803306442720428) && (this.c instanceof dev.epro.r0.Z17967803306442720428) && (this.d instanceof dev.epro.r0.Z17967803306442720428);
    }

    public final dev.epro.r0.E13848202552933286136 i() {
        dev.epro.r0.E13848202552933286136 e13848202552933286136 = new dev.epro.r0.E13848202552933286136();
        e13848202552933286136.a = this.a;
        e13848202552933286136.b = this.b;
        e13848202552933286136.c = this.c;
        e13848202552933286136.d = this.d;
        e13848202552933286136.e = this.e;
        e13848202552933286136.f = this.f;
        e13848202552933286136.g = this.g;
        e13848202552933286136.h = this.h;
        e13848202552933286136.i = this.i;
        e13848202552933286136.j = this.j;
        e13848202552933286136.k = this.k;
        e13848202552933286136.l = this.l;
        return e13848202552933286136;
    }

    public final java.lang.String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    public final dev.epro.r0.A11042752882447342413 c() {
        return this;
    }

    public final dev.epro.r0.A11042752882447342413 b(int[] iArr) {
        return this;
    }
}
