package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F4156480969566614324 extends J2215566372910931965 implements V6844203142031704410 {
    public final /* synthetic */ byte q = 1;
    public final N11829648573770870927 r;
    public final X9402207533033946500 s;
    public Object t;

    public F4156480969566614324(P9733793856018248168 p9733793856018248168, N11829648573770870927 n11829648573770870927, X9402207533033946500 x9402207533033946500, D6962450040782876658 d6962450040782876658) {
        this.r = n11829648573770870927;
        this.s = x9402207533033946500;
        this.t = d6962450040782876658;
        h1(p9733793856018248168);
    }

    public static boolean k1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean l1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        boolean zL1;
        long j;
        char c;
        boolean z;
        boolean zK1;
        float f;
        float f2;
        byte b = this.q;
        N11829648573770870927 n11829648573770870927 = this.r;
        X9402207533033946500 x9402207533033946500 = this.s;
        switch (b) {
            case 0:
                D6962450040782876658 d6962450040782876658 = (D6962450040782876658) this.t;
                N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
                n11829648573770870927.j(n16536369055082677148.e());
                if (W8572396779607072172.c(n16536369055082677148.e())) {
                    n17396598995248644478.a();
                    return;
                }
                n17396598995248644478.a();
                n11829648573770870927.d.getValue();
                Canvas canvasA = R14166932666867597588.a(n16536369055082677148.b.A());
                if (X9402207533033946500.f(x9402207533033946500.f)) {
                    zL1 = l1(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(n17396598995248644478.K(d6962450040782876658.d(n17396598995248644478.getLayoutDirection())))) & 4294967295L), x9402207533033946500.c(), canvasA);
                } else {
                    zL1 = false;
                }
                if (X9402207533033946500.f(x9402207533033946500.d)) {
                    EdgeEffect edgeEffectE = x9402207533033946500.e();
                    zL1 = l1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n17396598995248644478.K(d6962450040782876658.b))) & 4294967295L), edgeEffectE, canvasA) || zL1;
                }
                if (X9402207533033946500.f(x9402207533033946500.g)) {
                    EdgeEffect edgeEffectD = x9402207533033946500.d();
                    zL1 = l1(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n17396598995248644478.K(d6962450040782876658.c(n17396598995248644478.getLayoutDirection())) + (-((float) T18016951143603335921.Z(Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zL1;
                }
                if (X9402207533033946500.f(x9402207533033946500.e)) {
                    EdgeEffect edgeEffectB = x9402207533033946500.b();
                    float fK = n17396598995248644478.K(d6962450040782876658.d);
                    zL1 = l1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L))) + fK)) & 4294967295L), edgeEffectB, canvasA) || zL1;
                }
                if (zL1) {
                    n11829648573770870927.d();
                    return;
                }
                return;
            default:
                N16536369055082677148 n165363690550826771482 = n17396598995248644478.a;
                n11829648573770870927.j(n165363690550826771482.e());
                Canvas canvasA2 = R14166932666867597588.a(n165363690550826771482.b.A());
                n11829648573770870927.d.getValue();
                if (W8572396779607072172.c(n165363690550826771482.e())) {
                    n17396598995248644478.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = x9402207533033946500.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = x9402207533033946500.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = x9402207533033946500.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = x9402207533033946500.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = x9402207533033946500.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = x9402207533033946500.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = x9402207533033946500.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = x9402207533033946500.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    n17396598995248644478.a();
                    return;
                }
                float fK2 = n17396598995248644478.K(30.0f);
                boolean z2 = X9402207533033946500.f(x9402207533033946500.d) || X9402207533033946500.g(x9402207533033946500.h) || X9402207533033946500.f(x9402207533033946500.e) || X9402207533033946500.g(x9402207533033946500.i);
                boolean z3 = X9402207533033946500.f(x9402207533033946500.f) || X9402207533033946500.g(x9402207533033946500.j) || X9402207533033946500.f(x9402207533033946500.g) || X9402207533033946500.g(x9402207533033946500.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    m1().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        m1().setPosition(0, 0, (T18016951143603335921.Z(fK2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            n17396598995248644478.a();
                            return;
                        }
                        m1().setPosition(0, 0, canvasA2.getWidth(), (T18016951143603335921.Z(fK2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m1().beginRecording();
                boolean zG = X9402207533033946500.g(x9402207533033946500.j);
                R7000310675073492254 r7000310675073492254 = R7000310675073492254.b;
                if (zG) {
                    EdgeEffect edgeEffectA = x9402207533033946500.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = x9402207533033946500.a(r7000310675073492254);
                        x9402207533033946500.j = edgeEffectA;
                    }
                    k1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.f)) {
                    EdgeEffect edgeEffectC = x9402207533033946500.c();
                    zK1 = k1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (X9402207533033946500.g(x9402207533033946500.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (n11829648573770870927.c() & j));
                        EdgeEffect edgeEffectA2 = x9402207533033946500.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = x9402207533033946500.a(r7000310675073492254);
                            x9402207533033946500.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fD = i >= 31 ? M6916561348591858303.d(edgeEffectC) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat;
                        if (i >= 31) {
                            M6916561348591858303.g(edgeEffectA2, fD, f3);
                        } else {
                            edgeEffectA2.onPull(fD, f3);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zK1 = false;
                }
                boolean zG2 = X9402207533033946500.g(x9402207533033946500.h);
                R7000310675073492254 r70003106750734922542 = R7000310675073492254.a;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = x9402207533033946500.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = x9402207533033946500.a(r70003106750734922542);
                        x9402207533033946500.h = edgeEffectA3;
                    }
                    k1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.d)) {
                    EdgeEffect edgeEffectE2 = x9402207533033946500.e();
                    zK1 = k1(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zK1;
                    if (X9402207533033946500.g(x9402207533033946500.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n11829648573770870927.c() >> c));
                        EdgeEffect edgeEffectA4 = x9402207533033946500.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = x9402207533033946500.a(r70003106750734922542);
                            x9402207533033946500.h = edgeEffectA4;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fD2 = i2 >= 31 ? M6916561348591858303.d(edgeEffectE2) : 0.0f;
                        if (i2 >= 31) {
                            M6916561348591858303.g(edgeEffectA4, fD2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fD2, fIntBitsToFloat2);
                        }
                    }
                }
                if (X9402207533033946500.g(x9402207533033946500.k)) {
                    EdgeEffect edgeEffectA5 = x9402207533033946500.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = x9402207533033946500.a(r7000310675073492254);
                        x9402207533033946500.k = edgeEffectA5;
                    }
                    k1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.g)) {
                    EdgeEffect edgeEffectD2 = x9402207533033946500.d();
                    zK1 = k1(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zK1;
                    if (X9402207533033946500.g(x9402207533033946500.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (n11829648573770870927.c() & j));
                        EdgeEffect edgeEffectA6 = x9402207533033946500.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = x9402207533033946500.a(r7000310675073492254);
                            x9402207533033946500.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fD3 = i3 >= 31 ? M6916561348591858303.d(edgeEffectD2) : 0.0f;
                        if (i3 >= 31) {
                            M6916561348591858303.g(edgeEffectA6, fD3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fD3, fIntBitsToFloat3);
                        }
                    }
                }
                if (X9402207533033946500.g(x9402207533033946500.i)) {
                    EdgeEffect edgeEffectA7 = x9402207533033946500.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = x9402207533033946500.a(r70003106750734922542);
                        x9402207533033946500.i = edgeEffectA7;
                    }
                    k1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.e)) {
                    EdgeEffect edgeEffectB2 = x9402207533033946500.b();
                    boolean z4 = k1(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zK1;
                    if (X9402207533033946500.g(x9402207533033946500.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (n11829648573770870927.c() >> c));
                        EdgeEffect edgeEffectA8 = x9402207533033946500.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = x9402207533033946500.a(r70003106750734922542);
                            x9402207533033946500.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fD4 = i4 >= 31 ? M6916561348591858303.d(edgeEffectB2) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat4;
                        if (i4 >= 31) {
                            M6916561348591858303.g(edgeEffectA8, fD4, f4);
                        } else {
                            edgeEffectA8.onPull(fD4, f4);
                        }
                    }
                    zK1 = z4;
                }
                if (zK1) {
                    n11829648573770870927.d();
                }
                float f5 = z ? 0.0f : fK2;
                float f6 = z2 ? 0.0f : fK2;
                F10342546226345611902 layoutDirection = n17396598995248644478.getLayoutDirection();
                U5519500298982620611 u5519500298982620611 = new U5519500298982620611();
                u5519500298982620611.a = recordingCanvasBeginRecording;
                long jE = n165363690550826771482.e();
                R8540738700654750557 r8540738700654750557C = n165363690550826771482.b.C();
                F10342546226345611902 f10342546226345611902E = n165363690550826771482.b.E();
                V1715405128288489768 v1715405128288489768A = n165363690550826771482.b.A();
                long jF = n165363690550826771482.b.F();
                Q7316561721656982910 q7316561721656982910 = n165363690550826771482.b;
                B9692660393722135472 b9692660393722135472 = (B9692660393722135472) q7316561721656982910.c;
                q7316561721656982910.M(n17396598995248644478);
                q7316561721656982910.O(layoutDirection);
                q7316561721656982910.L(u5519500298982620611);
                q7316561721656982910.P(jE);
                q7316561721656982910.c = null;
                u5519500298982620611.l();
                try {
                    ((H12843822278061842084) n165363690550826771482.b.b).I(f5, f6);
                    try {
                        n17396598995248644478.a();
                        u5519500298982620611.j();
                        Q7316561721656982910 q73165617216569829102 = n165363690550826771482.b;
                        q73165617216569829102.M(r8540738700654750557C);
                        q73165617216569829102.O(f10342546226345611902E);
                        q73165617216569829102.L(v1715405128288489768A);
                        q73165617216569829102.P(jF);
                        q73165617216569829102.c = b9692660393722135472;
                        m1().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f, f2);
                        canvasA2.drawRenderNode(m1());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((H12843822278061842084) n165363690550826771482.b.b).I(-f5, -f6);
                    }
                } catch (Throwable th) {
                    u5519500298982620611.j();
                    Q7316561721656982910 q73165617216569829103 = n165363690550826771482.b;
                    q73165617216569829103.M(r8540738700654750557C);
                    q73165617216569829103.O(f10342546226345611902E);
                    q73165617216569829103.L(v1715405128288489768A);
                    q73165617216569829103.P(jF);
                    q73165617216569829103.c = b9692660393722135472;
                    throw th;
                }
        }
    }

    public RenderNode m1() {
        RenderNode renderNode = (RenderNode) this.t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = U8229365251704901623.f();
        this.t = renderNodeF;
        return renderNodeF;
    }

    public F4156480969566614324(P9733793856018248168 p9733793856018248168, N11829648573770870927 n11829648573770870927, X9402207533033946500 x9402207533033946500) {
        this.r = n11829648573770870927;
        this.s = x9402207533033946500;
        h1(p9733793856018248168);
    }
}
