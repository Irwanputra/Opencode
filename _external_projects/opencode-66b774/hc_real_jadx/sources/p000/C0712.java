package p000;

import java.io.Closeable;
import javax.annotation.Nullable;
import p000.C0597;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.なぶひせが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0712 implements Closeable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    @Nullable
    public final AbstractC0592 f4752;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0595 f4753;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C0597 f4754;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    @Nullable
    public final C0712 f4755;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final EnumC0721 f4756;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f4757;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final long f4758;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    @Nullable
    public final C0594 f4759;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final long f4760;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f4761;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public volatile C0693 f4762;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    @Nullable
    public final C0712 f4763;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    @Nullable
    public final C0712 f4764;

    /* renamed from: 〳ぜぞぜべっ.なぶひせが$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0713 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public C0712 f4765;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public EnumC0721 f4766;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public AbstractC0592 f4767;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public C0712 f4768;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f4769;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0595 f4770;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        @Nullable
        public C0594 f4771;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public long f4772;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C0597.C0598 f4773;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public String f4774;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public C0712 f4775;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public long f4776;

        public C0713() {
            this.f4769 = -1;
            this.f4773 = new C0597.C0598();
        }

        public C0713(C0712 c0712) {
            this.f4769 = -1;
            this.f4770 = c0712.f4753;
            this.f4766 = c0712.f4756;
            this.f4769 = c0712.f4761;
            this.f4774 = c0712.f4757;
            this.f4771 = c0712.f4759;
            this.f4773 = c0712.f4754.m1742();
            this.f4767 = c0712.f4752;
            this.f4765 = c0712.f4763;
            this.f4775 = c0712.f4755;
            this.f4768 = c0712.f4764;
            this.f4776 = c0712.f4758;
            this.f4772 = c0712.f4760;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0713 m1974(@Nullable C0712 c0712) {
            if (c0712 != null) {
                m1975("cacheResponse", c0712);
            }
            this.f4775 = c0712;
            return this;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m1975(String str, C0712 c0712) {
            if (c0712.f4752 != null) {
                throw new IllegalArgumentException(C2098.m4205(str, ".body != null"));
            }
            if (c0712.f4763 != null) {
                throw new IllegalArgumentException(C2098.m4205(str, ".networkResponse != null"));
            }
            if (c0712.f4755 != null) {
                throw new IllegalArgumentException(C2098.m4205(str, ".cacheResponse != null"));
            }
            if (c0712.f4764 != null) {
                throw new IllegalArgumentException(C2098.m4205(str, ".priorResponse != null"));
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0712 m1976() {
            if (this.f4770 == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f4766 == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f4769 >= 0) {
                if (this.f4774 != null) {
                    return new C0712(this);
                }
                throw new IllegalStateException("message == null");
            }
            StringBuilder m4207 = C2098.m4207("code < 0: ");
            m4207.append(this.f4769);
            throw new IllegalStateException(m4207.toString());
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C0713 m1977(C0597 c0597) {
            this.f4773 = c0597.m1742();
            return this;
        }
    }

    public C0712(C0713 c0713) {
        this.f4753 = c0713.f4770;
        this.f4756 = c0713.f4766;
        this.f4761 = c0713.f4769;
        this.f4757 = c0713.f4774;
        this.f4759 = c0713.f4771;
        this.f4754 = new C0597(c0713.f4773);
        this.f4752 = c0713.f4767;
        this.f4763 = c0713.f4765;
        this.f4755 = c0713.f4775;
        this.f4764 = c0713.f4768;
        this.f4758 = c0713.f4776;
        this.f4760 = c0713.f4772;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC0592 abstractC0592 = this.f4752;
        if (abstractC0592 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC0592.close();
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Response{protocol=");
        m4207.append(this.f4756);
        m4207.append(", code=");
        m4207.append(this.f4761);
        m4207.append(", message=");
        m4207.append(this.f4757);
        m4207.append(", url=");
        m4207.append(this.f4753.f4248);
        m4207.append('}');
        return m4207.toString();
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public C0693 m1973() {
        C0693 c0693 = this.f4762;
        if (c0693 != null) {
            return c0693;
        }
        C0693 m1942 = C0693.m1942(this.f4754);
        this.f4762 = m1942;
        return m1942;
    }
}
