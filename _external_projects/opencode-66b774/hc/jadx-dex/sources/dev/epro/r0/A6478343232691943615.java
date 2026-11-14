package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A6478343232691943615 {
    public boolean a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;

    public void a(dev.epro.r0.G15471856606567993098 g15471856606567993098, java.lang.Object... objArr) {
        ((java.util.ArrayList) this.e).add(new dev.epro.r0.L14430836125261710634(g15471856606567993098, objArr));
    }

    public boolean b() {
        if (!((java.util.ArrayList) this.e).isEmpty()) {
            return true;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            if (((dev.epro.r0.G3762749879526332652) obj).c()) {
                return true;
            }
        }
        return false;
    }

    public boolean c(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        dev.epro.r0.Q12881097977637718264 q12881097977637718264D;
        int i6;
        int i7;
        int[] iArr3;
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) this.d;
        if (this.a && (q12881097977637718264D = d(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = (int[]) this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (q12881097977637718264D instanceof dev.epro.r0.Q12881097977637718264) {
                    q12881097977637718264D.c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (q12881097977637718264D instanceof dev.epro.r0.O1691962481981067592) {
                        ((dev.epro.r0.O1691962481981067592) q12881097977637718264D).e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            q12881097977637718264D.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                            nestedScrollView = nestedScrollView;
                        } catch (java.lang.AbstractMethodError unused) {
                            nestedScrollView = nestedScrollView;
                            java.util.Objects.toString(q12881097977637718264D);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public android.view.ViewParent d(int i) {
        if (i == 0) {
            return (android.view.ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (android.view.ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(dev.epro.r0.V10300877997588547986 v10300877997588547986, dev.epro.r0.S7974369370986781936 s7974369370986781936, boolean z) {
        java.lang.Object[] objArr;
        int i;
        int i2;
        dev.epro.r0.T11693019737995189368 t11693019737995189368 = (dev.epro.r0.T11693019737995189368) this.c;
        dev.epro.r0.Z12993664435766561681 z12993664435766561681 = (dev.epro.r0.Z12993664435766561681) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            dev.epro.r0.N10542843603712830247 n10542843603712830247J = ((dev.epro.r0.F6942723054099263096) this.d).j(v10300877997588547986, s7974369370986781936);
            dev.epro.r0.A18377563779865231301 a18377563779865231301 = (dev.epro.r0.A18377563779865231301) n10542843603712830247J.b;
            int iF = a18377563779865231301.f();
            for (int i3 = 0; i3 < iF; i3++) {
                dev.epro.r0.N13196868278329319633 n13196868278329319633 = (dev.epro.r0.N13196868278329319633) a18377563779865231301.g(i3);
                if (!n13196868278329319633.d && !n13196868278329319633.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iF2 = a18377563779865231301.f();
            for (int i4 = 0; i4 < iF2; i4++) {
                dev.epro.r0.N13196868278329319633 n131968682783293196332 = (dev.epro.r0.N13196868278329319633) a18377563779865231301.g(i4);
                if (objArr != false || dev.epro.r0.I3887072968740112330.r(n131968682783293196332)) {
                    ((dev.epro.r0.H11725168162114556860) this.b).A(n131968682783293196332.c, z12993664435766561681, n131968682783293196332.i, true);
                    if (!z12993664435766561681.a.h()) {
                        t11693019737995189368.a(n131968682783293196332.a, z12993664435766561681, dev.epro.r0.I3887072968740112330.r(n131968682783293196332));
                        z12993664435766561681.clear();
                    }
                }
            }
            boolean zB = t11693019737995189368.b(n10542843603712830247J, z);
            if (n10542843603712830247J.a) {
                i = 0;
            } else {
                int iF3 = a18377563779865231301.f();
                for (int i5 = 0; i5 < iF3; i5++) {
                    dev.epro.r0.N13196868278329319633 n131968682783293196333 = (dev.epro.r0.N13196868278329319633) a18377563779865231301.g(i5);
                    if (!dev.epro.r0.L2216691091636065972.b(dev.epro.r0.I3887072968740112330.G(n131968682783293196333, true), 0L) && n131968682783293196333.c()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iF4 = a18377563779865231301.f();
            int i6 = 0;
            while (true) {
                if (i6 >= iF4) {
                    i2 = 0;
                    break;
                }
                if (((dev.epro.r0.N13196868278329319633) a18377563779865231301.g(i6)).c()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (java.lang.Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
