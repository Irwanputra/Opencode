package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean l1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        boolean z;
        long j;
        char c;
        RecordingCanvas beginRecording;
        boolean z2;
        boolean z3;
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
                Canvas a = R14166932666867597588.a(n16536369055082677148.b.A());
                if (X9402207533033946500.f(x9402207533033946500.f)) {
                    z = l1(270.0f, (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L))) << 32) | (Float.floatToRawIntBits(n17396598995248644478.K(d6962450040782876658.d(n17396598995248644478.getLayoutDirection()))) & 4294967295L), x9402207533033946500.c(), a);
                } else {
                    z = false;
                }
                if (X9402207533033946500.f(x9402207533033946500.d)) {
                    z = l1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n17396598995248644478.K(d6962450040782876658.b))) & 4294967295L), x9402207533033946500.e(), a) || z;
                }
                if (X9402207533033946500.f(x9402207533033946500.g)) {
                    z = l1(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n17396598995248644478.K(d6962450040782876658.c(n17396598995248644478.getLayoutDirection())) + (-((float) T18016951143603335921.Z(Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32))))))) & 4294967295L), x9402207533033946500.d(), a) || z;
                }
                if (X9402207533033946500.f(x9402207533033946500.e)) {
                    EdgeEffect b2 = x9402207533033946500.b();
                    z = l1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L))) + n17396598995248644478.K(d6962450040782876658.d))) & 4294967295L), b2, a) || z;
                }
                if (z) {
                    n11829648573770870927.d();
                    return;
                }
                return;
            default:
                N16536369055082677148 n165363690550826771482 = n17396598995248644478.a;
                n11829648573770870927.j(n165363690550826771482.e());
                Canvas a2 = R14166932666867597588.a(n165363690550826771482.b.A());
                n11829648573770870927.d.getValue();
                if (W8572396779607072172.c(n165363690550826771482.e())) {
                    n17396598995248644478.a();
                    return;
                }
                if (!a2.isHardwareAccelerated()) {
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
                float K = n17396598995248644478.K(30.0f);
                boolean z4 = X9402207533033946500.f(x9402207533033946500.d) || X9402207533033946500.g(x9402207533033946500.h) || X9402207533033946500.f(x9402207533033946500.e) || X9402207533033946500.g(x9402207533033946500.i);
                boolean z5 = X9402207533033946500.f(x9402207533033946500.f) || X9402207533033946500.g(x9402207533033946500.j) || X9402207533033946500.f(x9402207533033946500.g) || X9402207533033946500.g(x9402207533033946500.k);
                if (z4 && z5) {
                    j = 4294967295L;
                    c = ' ';
                    m1().setPosition(0, 0, a2.getWidth(), a2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z4) {
                        m1().setPosition(0, 0, (T18016951143603335921.Z(K) * 2) + a2.getWidth(), a2.getHeight());
                    } else {
                        if (!z5) {
                            n17396598995248644478.a();
                            return;
                        }
                        m1().setPosition(0, 0, a2.getWidth(), (T18016951143603335921.Z(K) * 2) + a2.getHeight());
                    }
                }
                beginRecording = m1().beginRecording();
                boolean g = X9402207533033946500.g(x9402207533033946500.j);
                R7000310675073492254 r7000310675073492254 = R7000310675073492254.b;
                if (g) {
                    EdgeEffect edgeEffect9 = x9402207533033946500.j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = x9402207533033946500.a(r7000310675073492254);
                        x9402207533033946500.j = edgeEffect9;
                    }
                    k1(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.f)) {
                    EdgeEffect c2 = x9402207533033946500.c();
                    z3 = k1(270.0f, c2, beginRecording);
                    if (X9402207533033946500.g(x9402207533033946500.f)) {
                        z2 = z5;
                        float intBitsToFloat = Float.intBitsToFloat((int) (n11829648573770870927.c() & j));
                        EdgeEffect edgeEffect10 = x9402207533033946500.j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = x9402207533033946500.a(r7000310675073492254);
                            x9402207533033946500.j = edgeEffect10;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float d = i >= 31 ? M6916561348591858303.d(c2) : 0.0f;
                        float f3 = 1.0f - intBitsToFloat;
                        if (i >= 31) {
                            M6916561348591858303.g(edgeEffect10, d, f3);
                        } else {
                            edgeEffect10.onPull(d, f3);
                        }
                    } else {
                        z2 = z5;
                    }
                } else {
                    z2 = z5;
                    z3 = false;
                }
                boolean g2 = X9402207533033946500.g(x9402207533033946500.h);
                R7000310675073492254 r70003106750734922542 = R7000310675073492254.a;
                if (g2) {
                    EdgeEffect edgeEffect11 = x9402207533033946500.h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = x9402207533033946500.a(r70003106750734922542);
                        x9402207533033946500.h = edgeEffect11;
                    }
                    k1(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.d)) {
                    EdgeEffect e = x9402207533033946500.e();
                    z3 = k1(0.0f, e, beginRecording) || z3;
                    if (X9402207533033946500.g(x9402207533033946500.d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (n11829648573770870927.c() >> c));
                        EdgeEffect edgeEffect12 = x9402207533033946500.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = x9402207533033946500.a(r70003106750734922542);
                            x9402207533033946500.h = edgeEffect12;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float d2 = i2 >= 31 ? M6916561348591858303.d(e) : 0.0f;
                        if (i2 >= 31) {
                            M6916561348591858303.g(edgeEffect12, d2, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(d2, intBitsToFloat2);
                        }
                    }
                }
                if (X9402207533033946500.g(x9402207533033946500.k)) {
                    EdgeEffect edgeEffect13 = x9402207533033946500.k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = x9402207533033946500.a(r7000310675073492254);
                        x9402207533033946500.k = edgeEffect13;
                    }
                    k1(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.g)) {
                    EdgeEffect d3 = x9402207533033946500.d();
                    z3 = k1(90.0f, d3, beginRecording) || z3;
                    if (X9402207533033946500.g(x9402207533033946500.g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (n11829648573770870927.c() & j));
                        EdgeEffect edgeEffect14 = x9402207533033946500.k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = x9402207533033946500.a(r7000310675073492254);
                            x9402207533033946500.k = edgeEffect14;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float d4 = i3 >= 31 ? M6916561348591858303.d(d3) : 0.0f;
                        if (i3 >= 31) {
                            M6916561348591858303.g(edgeEffect14, d4, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(d4, intBitsToFloat3);
                        }
                    }
                }
                if (X9402207533033946500.g(x9402207533033946500.i)) {
                    EdgeEffect edgeEffect15 = x9402207533033946500.i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = x9402207533033946500.a(r70003106750734922542);
                        x9402207533033946500.i = edgeEffect15;
                    }
                    k1(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (X9402207533033946500.f(x9402207533033946500.e)) {
                    EdgeEffect b3 = x9402207533033946500.b();
                    boolean z6 = k1(180.0f, b3, beginRecording) || z3;
                    if (X9402207533033946500.g(x9402207533033946500.e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (n11829648573770870927.c() >> c));
                        EdgeEffect edgeEffect16 = x9402207533033946500.i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = x9402207533033946500.a(r70003106750734922542);
                            x9402207533033946500.i = edgeEffect16;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float d5 = i4 >= 31 ? M6916561348591858303.d(b3) : 0.0f;
                        float f4 = 1.0f - intBitsToFloat4;
                        if (i4 >= 31) {
                            M6916561348591858303.g(edgeEffect16, d5, f4);
                        } else {
                            edgeEffect16.onPull(d5, f4);
                        }
                    }
                    z3 = z6;
                }
                if (z3) {
                    n11829648573770870927.d();
                }
                float f5 = z2 ? 0.0f : K;
                float f6 = z4 ? 0.0f : K;
                F10342546226345611902 layoutDirection = n17396598995248644478.getLayoutDirection();
                U5519500298982620611 u5519500298982620611 = new U5519500298982620611();
                u5519500298982620611.a = beginRecording;
                long e2 = n165363690550826771482.e();
                R8540738700654750557 C = n165363690550826771482.b.C();
                F10342546226345611902 E = n165363690550826771482.b.E();
                V1715405128288489768 A = n165363690550826771482.b.A();
                long F = n165363690550826771482.b.F();
                Q7316561721656982910 q7316561721656982910 = n165363690550826771482.b;
                B9692660393722135472 b9692660393722135472 = (B9692660393722135472) q7316561721656982910.c;
                q7316561721656982910.M(n17396598995248644478);
                q7316561721656982910.O(layoutDirection);
                q7316561721656982910.L(u5519500298982620611);
                q7316561721656982910.P(e2);
                q7316561721656982910.c = null;
                u5519500298982620611.l();
                try {
                    ((H12843822278061842084) n165363690550826771482.b.b).I(f5, f6);
                    try {
                        n17396598995248644478.a();
                        u5519500298982620611.j();
                        Q7316561721656982910 q73165617216569829102 = n165363690550826771482.b;
                        q73165617216569829102.M(C);
                        q73165617216569829102.O(E);
                        q73165617216569829102.L(A);
                        q73165617216569829102.P(F);
                        q73165617216569829102.c = b9692660393722135472;
                        m1().endRecording();
                        int save = a2.save();
                        a2.translate(f, f2);
                        a2.drawRenderNode(m1());
                        a2.restoreToCount(save);
                        return;
                    } finally {
                        ((H12843822278061842084) n165363690550826771482.b.b).I(-f5, -f6);
                    }
                } catch (Throwable th) {
                    u5519500298982620611.j();
                    Q7316561721656982910 q73165617216569829103 = n165363690550826771482.b;
                    q73165617216569829103.M(C);
                    q73165617216569829103.O(E);
                    q73165617216569829103.L(A);
                    q73165617216569829103.P(F);
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
        RenderNode f = U8229365251704901623.f();
        this.t = f;
        return f;
    }

    public F4156480969566614324(P9733793856018248168 p9733793856018248168, N11829648573770870927 n11829648573770870927, X9402207533033946500 x9402207533033946500) {
        this.r = n11829648573770870927;
        this.s = x9402207533033946500;
        h1(p9733793856018248168);
    }
}
