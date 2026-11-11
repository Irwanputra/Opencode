package p034.p086.p087.p088.p089;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p086.p087.C1558;
import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1520;
import p034.p086.p087.p088.C1544;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1540 {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static int f7145;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7146;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7147;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public ArrayList<C1544> f7148 = new ArrayList<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ArrayList<C1541> f7150 = null;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7149 = -1;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.へぬ〴づぞ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1541 {
        public C1541(C1540 c1540, C1544 c1544, C1558 c1558, int i) {
            new WeakReference(c1544);
            c1558.m3482(c1544.f7235);
            c1558.m3482(c1544.f7179);
            c1558.m3482(c1544.f7202);
            c1558.m3482(c1544.f7228);
            c1558.m3482(c1544.f7189);
        }
    }

    public C1540(int i) {
        this.f7146 = -1;
        this.f7147 = 0;
        int i2 = f7145;
        f7145 = i2 + 1;
        this.f7146 = i2;
        this.f7147 = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f7147;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f7146);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<C1544> it = this.f7148.iterator();
        while (it.hasNext()) {
            C1544 next = it.next();
            StringBuilder m4179 = C2098.m4179(sb2, " ");
            m4179.append(next.f7172);
            sb2 = m4179.toString();
        }
        return C2098.m4205(sb2, " >");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3400(ArrayList<C1540> arrayList) {
        int size = this.f7148.size();
        if (this.f7149 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1540 c1540 = arrayList.get(i);
                if (this.f7149 == c1540.f7146) {
                    m3403(this.f7147, c1540);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int m3401(C1558 c1558, int i) {
        int m3482;
        C1517 c1517;
        if (this.f7148.size() == 0) {
            return 0;
        }
        ArrayList<C1544> arrayList = this.f7148;
        C1520 c1520 = (C1520) arrayList.get(0).f7203;
        c1558.m3486();
        c1520.mo3316(c1558, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo3316(c1558, false);
        }
        if (i == 0 && c1520.f7026 > 0) {
            C2786.m4765(c1520, c1558, arrayList, 0);
        }
        if (i == 1 && c1520.f7032 > 0) {
            C2786.m4765(c1520, c1558, arrayList, 1);
        }
        try {
            c1558.m3481();
        } catch (Exception unused) {
        }
        this.f7150 = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f7150.add(new C1541(this, arrayList.get(i3), c1558, i));
        }
        if (i == 0) {
            m3482 = c1558.m3482(c1520.f7235);
            c1517 = c1520.f7202;
        } else {
            m3482 = c1558.m3482(c1520.f7179);
            c1517 = c1520.f7228;
        }
        int m34822 = c1558.m3482(c1517);
        c1558.m3486();
        return m34822 - m3482;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m3402(C1544 c1544) {
        if (this.f7148.contains(c1544)) {
            return false;
        }
        this.f7148.add(c1544);
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3403(int i, C1540 c1540) {
        Iterator<C1544> it = this.f7148.iterator();
        while (it.hasNext()) {
            C1544 next = it.next();
            c1540.m3402(next);
            if (i == 0) {
                next.f7223 = c1540.f7146;
            } else {
                next.f7215 = c1540.f7146;
            }
        }
        this.f7149 = c1540.f7146;
    }
}
