package p015.p016.p019;

import java.util.Iterator;
import p015.p016.p019.AbstractC0917;
import p015.p016.p020.C0976;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0901 extends AbstractC0917 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC0917 f5234;

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public static class C0902 extends AbstractC0901 {
        public C0902(AbstractC0917 abstractC0917) {
            this.f5234 = abstractC0917;
        }

        public String toString() {
            return String.format(":ImmediateParent%s", this.f5234);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0976 c09763;
            return (c0976 == c09762 || (c09763 = (C0976) c09762.f5308) == null || !this.f5234.mo2237(c0976, c09763)) ? false : true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C0903 extends AbstractC0917 {
        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c0976 == c09762;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0904 extends AbstractC0901 {
        public C0904(AbstractC0917 abstractC0917) {
            this.f5234 = abstractC0917;
        }

        public String toString() {
            return String.format(":prev%s", this.f5234);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0976 m2302;
            return (c0976 == c09762 || (m2302 = c09762.m2302()) == null || !this.f5234.mo2237(c0976, m2302)) ? false : true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0905 extends AbstractC0901 {
        public C0905(AbstractC0917 abstractC0917) {
            this.f5234 = abstractC0917;
        }

        public String toString() {
            return String.format(":has(%s)", this.f5234);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            c09762.getClass();
            Iterator<C0976> it = C1687.m3663(new AbstractC0917.C0933(), c09762).iterator();
            while (it.hasNext()) {
                C0976 next = it.next();
                if (next != c09762 && this.f5234.mo2237(c0976, next)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$づざかべべ, reason: contains not printable characters */
    public static class C0906 extends AbstractC0901 {
        public C0906(AbstractC0917 abstractC0917) {
            this.f5234 = abstractC0917;
        }

        public String toString() {
            return String.format(":parent%s", this.f5234);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            if (c0976 == c09762) {
                return false;
            }
            do {
                c09762 = (C0976) c09762.f5308;
                if (this.f5234.mo2237(c0976, c09762)) {
                    return true;
                }
            } while (c09762 != c0976);
            return false;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C0907 extends AbstractC0901 {
        public C0907(AbstractC0917 abstractC0917) {
            this.f5234 = abstractC0917;
        }

        public String toString() {
            return String.format(":prev*%s", this.f5234);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            if (c0976 == c09762) {
                return false;
            }
            do {
                c09762 = c09762.m2302();
                if (c09762 == null) {
                    return false;
                }
            } while (!this.f5234.mo2237(c0976, c09762));
            return true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$びぐびあび, reason: contains not printable characters */
    public static class C0908 extends AbstractC0901 {
        public C0908(AbstractC0917 abstractC0917) {
            this.f5234 = abstractC0917;
        }

        public String toString() {
            return String.format(":not%s", this.f5234);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return !this.f5234.mo2237(c0976, c09762);
        }
    }
}
