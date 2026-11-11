package p131.p135.p138;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.androidnetworking.widget.ANImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;
import p000.C0586;
import p000.InterfaceC0720;
import p000.p001.C0629;
import p000.p001.p003.C0608;
import p000.p001.p003.InterfaceC0612;
import p000.p001.p007.C0643;
import p000.p001.p007.C0645;
import p131.p135.p137.C1982;
import p131.p135.p143.C2026;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1990 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final int f8690;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final int f8691;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static C1990 f8692;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1992 f8695;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Runnable f8696;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final HashMap<String, C1991> f8693 = new HashMap<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final HashMap<String, C1991> f8694 = new HashMap<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Handler f8698 = new Handler(Looper.getMainLooper());

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public BitmapFactory.Options f8697 = new BitmapFactory.Options();

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public class C1991 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Bitmap f8699;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C2026 f8700;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1982 f8701;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final LinkedList<C1995> f8702;

        public C1991(C1990 c1990, C1982 c1982, C1995 c1995) {
            LinkedList<C1995> linkedList = new LinkedList<>();
            this.f8702 = linkedList;
            this.f8701 = c1982;
            linkedList.add(c1995);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m4105(C1995 c1995) {
            InterfaceC0612 interfaceC0612;
            C0645 c0645;
            this.f8702.remove(c1995);
            if (this.f8702.size() != 0) {
                return false;
            }
            C1982 c1982 = this.f8701;
            c1982.getClass();
            try {
                c1982.f8631 = true;
                InterfaceC0720 interfaceC0720 = c1982.f8633;
                if (interfaceC0720 != null) {
                    C0608 c0608 = ((C0586) interfaceC0720).f4225;
                    c0608.f4286 = true;
                    C0643 c0643 = c0608.f4284;
                    if (c0643 != null) {
                        synchronized (c0643.f4381) {
                            c0643.f4380 = true;
                            interfaceC0612 = c0643.f4382;
                            c0645 = c0643.f4374;
                        }
                        if (interfaceC0612 != null) {
                            interfaceC0612.cancel();
                        } else if (c0645 != null) {
                            C0629.m1819(c0645.f4396);
                        }
                    }
                }
                Future future = c1982.f8627;
                if (future != null) {
                    future.cancel(true);
                }
                if (!c1982.f8632) {
                    c1982.m4095(new C2026());
                }
            } catch (Exception unused) {
            }
            C1982 c19822 = this.f8701;
            if (c19822.f8631) {
                c19822.m4100();
                C1998 m4107 = C1998.m4107();
                C1982 c19823 = this.f8701;
                m4107.getClass();
                try {
                    m4107.f8717.remove(c19823);
                } catch (Exception unused2) {
                }
            }
            return true;
        }
    }

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC1992 {
    }

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1993 implements Runnable {
        public RunnableC1993() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C1991 c1991 : C1990.this.f8694.values()) {
                Iterator<C1995> it = c1991.f8702.iterator();
                while (it.hasNext()) {
                    C1995 next = it.next();
                    InterfaceC1994 interfaceC1994 = next.f8704;
                    if (interfaceC1994 != null) {
                        if (c1991.f8700 == null) {
                            next.f8706 = c1991.f8699;
                            ((ANImageView.C0331) interfaceC1994).m1108(next, false);
                        } else {
                            ANImageView aNImageView = ANImageView.this;
                            int i = aNImageView.f2000;
                            if (i != 0) {
                                aNImageView.setImageResource(i);
                            }
                        }
                    }
                }
            }
            C1990.this.f8694.clear();
            C1990.this.f8696 = null;
        }
    }

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〺つふすそ$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC1994 {
    }

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〺つふすそ$びぐびあび, reason: contains not printable characters */
    public class C1995 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final InterfaceC1994 f8704;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final String f8705;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Bitmap f8706;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final String f8708;

        public C1995(Bitmap bitmap, String str, String str2, InterfaceC1994 interfaceC1994) {
            this.f8706 = bitmap;
            this.f8708 = str;
            this.f8705 = str2;
            this.f8704 = interfaceC1994;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m4106() {
            HashMap<String, C1991> hashMap;
            if (this.f8704 == null) {
                return;
            }
            C1991 c1991 = C1990.this.f8693.get(this.f8705);
            if (c1991 == null) {
                C1991 c19912 = C1990.this.f8694.get(this.f8705);
                if (c19912 == null) {
                    return;
                }
                c19912.m4105(this);
                if (c19912.f8702.size() != 0) {
                    return;
                } else {
                    hashMap = C1990.this.f8694;
                }
            } else if (!c1991.m4105(this)) {
                return;
            } else {
                hashMap = C1990.this.f8693;
            }
            hashMap.remove(this.f8705);
        }
    }

    static {
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        f8691 = maxMemory;
        f8690 = maxMemory / 8;
    }

    public C1990(InterfaceC1992 interfaceC1992) {
        this.f8695 = interfaceC1992;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4104(String str, C1991 c1991) {
        this.f8694.put(str, c1991);
        if (this.f8696 == null) {
            RunnableC1993 runnableC1993 = new RunnableC1993();
            this.f8696 = runnableC1993;
            this.f8698.postDelayed(runnableC1993, 100);
        }
    }
}
