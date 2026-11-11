package p010.p011.p012.p013;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0770 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public TreeSet<C0771> f4931 = new TreeSet<>();

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0771 implements Comparable<C0771> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public BigInteger f4932;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public BigInteger f4933;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f4934;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f4935;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public BigInteger f4936;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f4937;

        public C0771(BigInteger bigInteger, int i, boolean z, boolean z2) {
            this.f4932 = bigInteger;
            this.f4934 = i;
            this.f4937 = z;
            this.f4935 = z2;
        }

        public C0771(Inet6Address inet6Address, int i, boolean z) {
            this.f4934 = i;
            this.f4937 = z;
            this.f4932 = BigInteger.ZERO;
            int length = inet6Address.getAddress().length;
            int i2 = NotificationCompat.FLAG_HIGH_PRIORITY;
            for (int i3 = 0; i3 < length; i3++) {
                i2 -= 8;
                this.f4932 = this.f4932.add(BigInteger.valueOf(r6[i3] & 255).shiftLeft(i2));
            }
        }

        public C0771(C0749 c0749, boolean z) {
            this.f4937 = z;
            this.f4932 = BigInteger.valueOf(C0749.m2023(c0749.f4863));
            this.f4934 = c0749.f4862;
            this.f4935 = true;
        }

        @Override // java.lang.Comparable
        public int compareTo(C0771 c0771) {
            C0771 c07712 = c0771;
            int compareTo = m2081().compareTo(c07712.m2081());
            if (compareTo != 0) {
                return compareTo;
            }
            int i = this.f4934;
            int i2 = c07712.f4934;
            if (i > i2) {
                return -1;
            }
            return i2 == i ? 0 : 1;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0771)) {
                return super.equals(obj);
            }
            C0771 c0771 = (C0771) obj;
            return this.f4934 == c0771.f4934 && c0771.m2081().equals(m2081());
        }

        public String toString() {
            boolean z = this.f4935;
            String a = Crypt.a(Crypt.xrc("IghK7hI6m@c=NfoLbiLkkKjg\u0019cj\u001ec>L4"));
            return z ? String.format(Locale.US, a, m2083(), Integer.valueOf(this.f4934)) : String.format(Locale.US, a, m2087(), Integer.valueOf(this.f4934));
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public BigInteger m2081() {
            if (this.f4936 == null) {
                this.f4936 = m2086(false);
            }
            return this.f4936;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public C0771[] m2082() {
            C0771 c0771 = new C0771(m2081(), this.f4934 + 1, this.f4937, this.f4935);
            return new C0771[]{c0771, new C0771(c0771.m2085().add(BigInteger.ONE), this.f4934 + 1, this.f4937, this.f4935)};
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public String m2083() {
            long longValue = this.f4932.longValue();
            return String.format(Locale.US, Crypt.a(Crypt.xrc("\u001dk<Acj\u001d69N0i\u001c4<N1f\u001ec<O4h\u0019gi@d9\u001d1")), Long.valueOf((longValue >> 24) % 256), Long.valueOf((longValue >> 16) % 256), Long.valueOf((longValue >> 8) % 256), Long.valueOf(longValue % 256));
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m2084(C0771 c0771) {
            BigInteger m2081 = m2081();
            BigInteger m2085 = m2085();
            return (m2081.compareTo(c0771.m2081()) != 1) && (m2085.compareTo(c0771.m2085()) != -1);
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public BigInteger m2085() {
            if (this.f4933 == null) {
                this.f4933 = m2086(true);
            }
            return this.f4933;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final BigInteger m2086(boolean z) {
            BigInteger bigInteger = this.f4932;
            int i = this.f4935 ? 32 - this.f4934 : 128 - this.f4934;
            for (int i2 = 0; i2 < i; i2++) {
                bigInteger = z ? bigInteger.setBit(i2) : bigInteger.clearBit(i2);
            }
            return bigInteger;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public String m2087() {
            BigInteger bigInteger = this.f4932;
            String str = null;
            boolean z = true;
            while (bigInteger.compareTo(BigInteger.ZERO) == 1) {
                long longValue = bigInteger.mod(BigInteger.valueOf(65536L)).longValue();
                if (str != null || longValue != 0) {
                    if (str == null && !z) {
                        str = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
                    }
                    str = z ? String.format(Locale.US, Crypt.a(Crypt.xrc("@ai\u001aakHjmLbnO0g\u001bekJei\u0019doJcm\u0019eoNk")), Long.valueOf(longValue), str) : String.format(Locale.US, Crypt.a(Crypt.xrc("\u001e0i\u001egl\u0019j9O7jA4lAbgI3:\u001dbl@1<Lc<Oe")), Long.valueOf(longValue), str);
                }
                bigInteger = bigInteger.shiftRight(16);
                z = false;
            }
            return str == null ? Crypt.a(Crypt.xrc("@cmNkmH3kHbl\u001c6fAbmK3h\u001daoHbk\u001cbkMj")) : str;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Collection<C0771> m2078(boolean z) {
        Vector vector = new Vector();
        Iterator<C0771> it = this.f4931.iterator();
        while (it.hasNext()) {
            C0771 next = it.next();
            if (next.f4937 == z) {
                vector.add(next);
            }
        }
        return vector;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Collection<C0771> m2079() {
        boolean z;
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.f4931);
        TreeSet treeSet = new TreeSet();
        C0771 c0771 = (C0771) priorityQueue.poll();
        if (c0771 != null) {
            while (c0771 != null) {
                C0771 c07712 = (C0771) priorityQueue.poll();
                if (c07712 == null || c0771.m2085().compareTo(c07712.m2081()) == -1) {
                    treeSet.add(c0771);
                } else if (!c0771.m2081().equals(c07712.m2081()) || c0771.f4934 < c07712.f4934) {
                    if (c0771.f4937 != c07712.f4937) {
                        C0771[] m2082 = c0771.m2082();
                        if (m2082[1].f4934 != c07712.f4934) {
                            priorityQueue.add(m2082[1]);
                        }
                        priorityQueue.add(c07712);
                        c0771 = m2082[0];
                    }
                } else if (c0771.f4937 != c07712.f4937) {
                    C0771[] m20822 = c07712.m2082();
                    if (!priorityQueue.contains(m20822[1])) {
                        priorityQueue.add(m20822[1]);
                    }
                    if (!m20822[0].m2085().equals(c0771.m2085()) && !priorityQueue.contains(m20822[0])) {
                        priorityQueue.add(m20822[0]);
                    }
                }
                c0771 = c07712;
            }
        }
        Vector vector = new Vector();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            C0771 c07713 = (C0771) it.next();
            if (c07713.f4937) {
                vector.add(c07713);
            }
        }
        if (Build.VERSION.SDK_INT < 19) {
            Iterator<C0771> it2 = this.f4931.iterator();
            while (it2.hasNext()) {
                C0771 next = it2.next();
                if (next.f4937 && !treeSet.contains(next)) {
                    Iterator it3 = treeSet.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        C0771 c07714 = (C0771) it3.next();
                        if (!c07714.f4937 && next.m2084(c07714)) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        vector.add(next);
                    }
                }
            }
        }
        return vector;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2080(C0749 c0749, boolean z) {
        C2098.m4181(c0749, z, this.f4931);
    }
}
