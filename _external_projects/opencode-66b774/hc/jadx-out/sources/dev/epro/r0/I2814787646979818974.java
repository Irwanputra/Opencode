package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I2814787646979818974 extends View {
    public static final U6068910839918238195 m = new U6068910839918238195((byte) 3);
    public final I9570621155112813784 a;
    public final G3509037795884611271 b;
    public final N16536369055082677148 c;
    public boolean d;
    public Outline e;
    public boolean f;
    public R8540738700654750557 g;
    public F10342546226345611902 h;
    public F4096073349764486348 i;
    public B9692660393722135472 j;
    public float k;
    public float l;

    public I2814787646979818974(I9570621155112813784 i9570621155112813784, G3509037795884611271 g3509037795884611271, N16536369055082677148 n16536369055082677148) {
        super(i9570621155112813784.getContext());
        this.a = i9570621155112813784;
        this.b = g3509037795884611271;
        this.c = n16536369055082677148;
        setOutlineProvider(m);
        this.f = true;
        this.g = A10225670138084435446.e;
        this.h = F10342546226345611902.a;
        Y257452374762370649.a.getClass();
        this.i = J6249063375258466235.z;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        U5519500298982620611 u5519500298982620611;
        Q7316561721656982910 q7316561721656982910;
        R8540738700654750557 r8540738700654750557C;
        F10342546226345611902 f10342546226345611902E;
        V1715405128288489768 v1715405128288489768A;
        long jF;
        B9692660393722135472 b9692660393722135472;
        float f = this.k;
        N16536369055082677148 n16536369055082677148 = this.c;
        G3509037795884611271 g3509037795884611271 = this.b;
        if (f > 0.0f || this.l > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.k, this.l);
            u5519500298982620611 = g3509037795884611271.a;
            Canvas canvas2 = u5519500298982620611.a;
            u5519500298982620611.a = canvas;
            R8540738700654750557 r8540738700654750557 = this.g;
            F10342546226345611902 f10342546226345611902 = this.h;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            B9692660393722135472 b96926603937221354722 = this.j;
            F4096073349764486348 f4096073349764486348 = this.i;
            Q7316561721656982910 q73165617216569829102 = n16536369055082677148.b;
            q7316561721656982910 = n16536369055082677148.b;
            r8540738700654750557C = q73165617216569829102.C();
            f10342546226345611902E = q7316561721656982910.E();
            v1715405128288489768A = q7316561721656982910.A();
            jF = q7316561721656982910.F();
            b9692660393722135472 = (B9692660393722135472) q7316561721656982910.c;
            q7316561721656982910.M(r8540738700654750557);
            q7316561721656982910.O(f10342546226345611902);
            q7316561721656982910.L(u5519500298982620611);
            q7316561721656982910.P(jFloatToRawIntBits);
            q7316561721656982910.c = b96926603937221354722;
            u5519500298982620611.l();
            try {
                f4096073349764486348.invoke(n16536369055082677148);
                u5519500298982620611.j();
                q7316561721656982910.M(r8540738700654750557C);
                q7316561721656982910.O(f10342546226345611902E);
                q7316561721656982910.L(v1715405128288489768A);
                q7316561721656982910.P(jF);
                q7316561721656982910.c = b9692660393722135472;
                g3509037795884611271.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            u5519500298982620611 = g3509037795884611271.a;
            Canvas canvas3 = u5519500298982620611.a;
            u5519500298982620611.a = canvas;
            R8540738700654750557 r85407387006547505572 = this.g;
            F10342546226345611902 f103425462263456119022 = this.h;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            B9692660393722135472 b96926603937221354723 = this.j;
            F4096073349764486348 f40960733497644863482 = this.i;
            Q7316561721656982910 q73165617216569829103 = n16536369055082677148.b;
            q7316561721656982910 = n16536369055082677148.b;
            r8540738700654750557C = q73165617216569829103.C();
            f10342546226345611902E = q7316561721656982910.E();
            v1715405128288489768A = q7316561721656982910.A();
            jF = q7316561721656982910.F();
            b9692660393722135472 = (B9692660393722135472) q7316561721656982910.c;
            q7316561721656982910.M(r85407387006547505572);
            q7316561721656982910.O(f103425462263456119022);
            q7316561721656982910.L(u5519500298982620611);
            q7316561721656982910.P(jFloatToRawIntBits2);
            q7316561721656982910.c = b96926603937221354723;
            u5519500298982620611.l();
            try {
                f40960733497644863482.invoke(n16536369055082677148);
                u5519500298982620611.j();
                q7316561721656982910.M(r8540738700654750557C);
                q7316561721656982910.O(f10342546226345611902E);
                q7316561721656982910.L(v1715405128288489768A);
                q7316561721656982910.P(jF);
                q7316561721656982910.c = b9692660393722135472;
                g3509037795884611271.a.a = canvas3;
            } finally {
            }
        }
        this.d = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    public final G3509037795884611271 getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
