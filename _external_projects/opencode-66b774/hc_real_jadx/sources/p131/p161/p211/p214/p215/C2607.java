package p131.p161.p211.p214.p215;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p131.p161.p211.AbstractC2532;
import p131.p161.p211.C2541;
import p131.p161.p211.C2655;
import p131.p161.p211.C2660;
import p131.p161.p211.C2670;
import p131.p161.p211.p213.C2534;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2607 extends C2534 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final Writer f10021 = new C2608();

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final C2655 f10022 = new C2655("closed");

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public AbstractC2532 f10023;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final List<AbstractC2532> f10024;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String f10025;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2608 extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C2607() {
        super(f10021);
        this.f10024 = new ArrayList();
        this.f10023 = C2660.f10117;
    }

    @Override // p131.p161.p211.p213.C2534, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f10024.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f10024.add(f10022);
    }

    @Override // p131.p161.p211.p213.C2534, java.io.Flushable
    public void flush() {
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ぇとしたべど */
    public C2534 mo4541() {
        m4607(C2660.f10117);
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: えがぐせほち */
    public C2534 mo4542(Boolean bool) {
        if (bool == null) {
            m4607(C2660.f10117);
            return this;
        }
        m4607(new C2655(bool));
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ぉひのべい */
    public C2534 mo4543() {
        C2541 c2541 = new C2541();
        m4607(c2541);
        this.f10024.add(c2541);
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: おかぷせ〱 */
    public C2534 mo4544(String str) {
        if (this.f10024.isEmpty() || this.f10025 != null) {
            throw new IllegalStateException();
        }
        if (!(m4608() instanceof C2541)) {
            throw new IllegalStateException();
        }
        this.f10025 = str;
        return this;
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public final void m4607(AbstractC2532 abstractC2532) {
        if (this.f10025 != null) {
            if (!(abstractC2532 instanceof C2660) || this.f9888) {
                ((C2541) m4608()).m4587(this.f10025, abstractC2532);
            }
            this.f10025 = null;
            return;
        }
        if (this.f10024.isEmpty()) {
            this.f10023 = abstractC2532;
            return;
        }
        AbstractC2532 m4608 = m4608();
        if (!(m4608 instanceof C2670)) {
            throw new IllegalStateException();
        }
        ((C2670) m4608).f10126.add(abstractC2532);
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: けときぜと */
    public C2534 mo4545() {
        if (this.f10024.isEmpty() || this.f10025 != null) {
            throw new IllegalStateException();
        }
        if (!(m4608() instanceof C2541)) {
            throw new IllegalStateException();
        }
        this.f10024.remove(r0.size() - 1);
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: こ〲しでおか */
    public C2534 mo4547(boolean z) {
        m4607(new C2655(Boolean.valueOf(z)));
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ごまけがぢは */
    public C2534 mo4548(String str) {
        if (str == null) {
            m4607(C2660.f10117);
            return this;
        }
        m4607(new C2655(str));
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ち〴みぎ〻び */
    public C2534 mo4551(long j) {
        m4607(new C2655(Long.valueOf(j)));
        return this;
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public final AbstractC2532 m4608() {
        return this.f10024.get(r0.size() - 1);
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ばおぢでぎか */
    public C2534 mo4554(Number number) {
        if (number == null) {
            m4607(C2660.f10117);
            return this;
        }
        if (!this.f9887) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m4607(new C2655(number));
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ぷぞてのほき */
    public C2534 mo4555() {
        if (this.f10024.isEmpty() || this.f10025 != null) {
            throw new IllegalStateException();
        }
        if (!(m4608() instanceof C2670)) {
            throw new IllegalStateException();
        }
        this.f10024.remove(r0.size() - 1);
        return this;
    }

    @Override // p131.p161.p211.p213.C2534
    /* renamed from: ぺづげぺが */
    public C2534 mo4557() {
        C2670 c2670 = new C2670();
        m4607(c2670);
        this.f10024.add(c2670);
        return this;
    }
}
