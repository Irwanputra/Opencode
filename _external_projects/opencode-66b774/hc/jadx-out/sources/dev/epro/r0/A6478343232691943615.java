package dev.epro.r0;

import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A6478343232691943615 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public void a(G15471856606567993098 g15471856606567993098, Object... objArr) {
        ((ArrayList) this.e).add(new L14430836125261710634(g15471856606567993098, objArr));
    }

    public boolean b() {
        if (!((ArrayList) this.e).isEmpty()) {
            return true;
        }
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((G3762749879526332652) obj).c()) {
                return true;
            }
        }
        return false;
    }

    public boolean c(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentD;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentD = d(i5)) != null) {
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
                if (viewParentD instanceof Q12881097977637718264) {
                    ((Q12881097977637718264) viewParentD).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentD instanceof O1691962481981067592) {
                        ((O1691962481981067592) viewParentD).e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentD.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                            nestedScrollView = nestedScrollView;
                        } catch (AbstractMethodError unused) {
                            nestedScrollView = nestedScrollView;
                            Objects.toString(viewParentD);
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

    public ViewParent d(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(V10300877997588547986 v10300877997588547986, S7974369370986781936 s7974369370986781936, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        T11693019737995189368 t11693019737995189368 = (T11693019737995189368) this.c;
        Z12993664435766561681 z12993664435766561681 = (Z12993664435766561681) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            N10542843603712830247 n10542843603712830247J = ((F6942723054099263096) this.d).j(v10300877997588547986, s7974369370986781936);
            A18377563779865231301 a18377563779865231301 = (A18377563779865231301) n10542843603712830247J.b;
            int iF = a18377563779865231301.f();
            for (int i3 = 0; i3 < iF; i3++) {
                N13196868278329319633 n13196868278329319633 = (N13196868278329319633) a18377563779865231301.g(i3);
                if (!n13196868278329319633.d && !n13196868278329319633.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iF2 = a18377563779865231301.f();
            for (int i4 = 0; i4 < iF2; i4++) {
                N13196868278329319633 n131968682783293196332 = (N13196868278329319633) a18377563779865231301.g(i4);
                if (objArr != false || I3887072968740112330.r(n131968682783293196332)) {
                    ((H11725168162114556860) this.b).A(n131968682783293196332.c, z12993664435766561681, n131968682783293196332.i, true);
                    if (!z12993664435766561681.a.h()) {
                        t11693019737995189368.a(n131968682783293196332.a, z12993664435766561681, I3887072968740112330.r(n131968682783293196332));
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
                    N13196868278329319633 n131968682783293196333 = (N13196868278329319633) a18377563779865231301.g(i5);
                    if (!L2216691091636065972.b(I3887072968740112330.G(n131968682783293196333, true), 0L) && n131968682783293196333.c()) {
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
                if (((N13196868278329319633) a18377563779865231301.g(i6)).c()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
