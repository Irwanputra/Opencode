package dev.epro.r0;

import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y5433946636275846014 implements Runnable {
    public final N12253737202470468561 a;
    public final X5127101262035123109 b;
    public final boolean c;
    public final int d;

    public Y5433946636275846014(N12253737202470468561 n12253737202470468561, X5127101262035123109 x5127101262035123109, boolean z, int i) {
        n12253737202470468561.getClass();
        x5127101262035123109.getClass();
        this.a = n12253737202470468561;
        this.b = x5127101262035123109;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H1239233717680269921 b;
        boolean z = this.c;
        N12253737202470468561 n12253737202470468561 = this.a;
        X5127101262035123109 x5127101262035123109 = this.b;
        if (z) {
            int i = this.d;
            n12253737202470468561.getClass();
            String str = x5127101262035123109.a.a;
            synchronized (n12253737202470468561.k) {
                b = n12253737202470468561.b(str);
            }
            N12253737202470468561.d(b, i);
        } else {
            int i2 = this.d;
            n12253737202470468561.getClass();
            String str2 = x5127101262035123109.a.a;
            synchronized (n12253737202470468561.k) {
                try {
                    if (n12253737202470468561.f.get(str2) != null) {
                        B14824868959299866349.n().getClass();
                    } else {
                        Set set = (Set) n12253737202470468561.h.get(str2);
                        if (set != null && set.contains(x5127101262035123109)) {
                            N12253737202470468561.d(n12253737202470468561.b(str2), i2);
                        }
                    }
                } finally {
                }
            }
        }
        B14824868959299866349 n = B14824868959299866349.n();
        B14824868959299866349.o("StopWorkRunnable");
        String str3 = this.b.a.a;
        n.getClass();
    }
}
