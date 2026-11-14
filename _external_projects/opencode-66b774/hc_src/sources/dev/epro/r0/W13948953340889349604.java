package dev.epro.r0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.RejectedExecutionException;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final /* synthetic */ class W13948953340889349604 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    static {
        izmyclvb.qgayjvbiagej2(1711);
    }

    public /* synthetic */ W13948953340889349604(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        J3436373395468761580 j3436373395468761580 = (J3436373395468761580) this.b;
        synchronized (j3436373395468761580.c) {
            try {
                if (j3436373395468761580.d) {
                    return;
                }
                Runnable runnable = (Runnable) j3436373395468761580.c.pollFirst();
                j3436373395468761580.d = runnable != null;
                while (runnable != null) {
                    try {
                        runnable.run();
                        synchronized (j3436373395468761580.c) {
                            runnable = (Runnable) j3436373395468761580.c.pollFirst();
                            j3436373395468761580.d = runnable != null;
                        }
                    } catch (Throwable th) {
                        synchronized (j3436373395468761580.c) {
                            j3436373395468761580.d = false;
                            try {
                                j3436373395468761580.a.execute(j3436373395468761580.b);
                            } catch (RejectedExecutionException unused) {
                            }
                            throw th;
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void b() {
        View findFocus;
        J17256830230353952700 j17256830230353952700 = (J17256830230353952700) this.b;
        Q7316561721656982910 q7316561721656982910 = j17256830230353952700.b;
        Boolean bool = null;
        j17256830230353952700.n = null;
        D389890677992184566 d389890677992184566 = j17256830230353952700.m;
        View view = j17256830230353952700.a;
        if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
            d389890677992184566.i();
            return;
        }
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        Boolean bool2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            K13343232784169554427 k13343232784169554427 = (K13343232784169554427) objArr[i2];
            int ordinal = k13343232784169554427.ordinal();
            if (ordinal == 0) {
                bool = Boolean.TRUE;
            } else if (ordinal == 1) {
                bool = Boolean.FALSE;
            } else if (ordinal != 2 && ordinal != 3) {
                Z3383101362411723454.g();
                return;
            } else {
                if (!S10823041268949770285.t(bool, Boolean.FALSE)) {
                    bool2 = Boolean.valueOf(k13343232784169554427 == K13343232784169554427.c);
                }
            }
            bool2 = bool;
        }
        d389890677992184566.i();
        if (S10823041268949770285.t(bool, Boolean.TRUE)) {
            ((InputMethodManager) ((K7493131619793429513) q7316561721656982910.c).getValue()).restartInput((View) q7316561721656982910.b);
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                ((M9197813449740923653) ((M9197813449740923653) q7316561721656982910.d).b).p();
            } else {
                ((M9197813449740923653) ((M9197813449740923653) q7316561721656982910.d).b).f();
            }
        }
        if (S10823041268949770285.t(bool, Boolean.FALSE)) {
            ((InputMethodManager) ((K7493131619793429513) q7316561721656982910.c).getValue()).restartInput((View) q7316561721656982910.b);
        }
    }

    @Override // java.lang.Runnable
    public final native void run();

    public /* synthetic */ W13948953340889349604(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }
}
