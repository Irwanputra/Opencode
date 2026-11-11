package p131.p225.p226.p230;

import java.util.Collections;
import java.util.LinkedList;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ざとぅぼこ〺.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2749 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C2773 f10334 = new C2773(C2749.class);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final LinkedList f10332 = new LinkedList();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Thread f10333 = null;

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ざとぅぼこ〺.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static class C2750 extends Thread {
        public C2750(C2752 c2752) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (C2749.f10332) {
                while (true) {
                    LinkedList linkedList = C2749.f10332;
                    if (linkedList.size() == 0) {
                        C2749.f10333 = null;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        C2751 c2751 = (C2751) linkedList.getFirst();
                        long j = c2751.f10335;
                        if (j > currentTimeMillis) {
                            try {
                                linkedList.wait(j - currentTimeMillis);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            linkedList.removeFirst();
                            try {
                                c2751.f10336.run();
                            } catch (Exception e) {
                                C2749.f10334.m4753(20, Crypt.a(Crypt.xrc("\u001bg9\u0019enNgnMag@cgI1hJ7n\u001e4k\u001d6gJ0j\u001a4;\u001a`lM0:\u001cchI0fIah\u001ekk\u0019aiJf<Lbo\u001d3f\u001e")), e);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ざとぅぼこ〺.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2751 implements Comparable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public long f10335;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Runnable f10336;

        public C2751(long j, Runnable runnable, C2752 c2752) {
            this.f10335 = j;
            this.f10336 = runnable;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f10335;
            long j2 = ((C2751) obj).f10335;
            if (j > j2) {
                return 1;
            }
            return j == j2 ? 0 : -1;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final void m4722(C2751 c2751) {
        LinkedList linkedList = f10332;
        synchronized (linkedList) {
            linkedList.remove(c2751);
            Thread thread = f10333;
            if (thread != null) {
                thread.interrupt();
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C2751 m4723(long j, Runnable runnable) {
        C2751 c2751 = new C2751(j, runnable, null);
        LinkedList linkedList = f10332;
        synchronized (linkedList) {
            linkedList.add(c2751);
            Collections.sort(linkedList);
            Thread thread = f10333;
            if (thread != null) {
                thread.interrupt();
            } else {
                C2750 c2750 = new C2750(null);
                f10333 = c2750;
                c2750.setDaemon(true);
                f10333.start();
            }
        }
        return c2751;
    }
}
