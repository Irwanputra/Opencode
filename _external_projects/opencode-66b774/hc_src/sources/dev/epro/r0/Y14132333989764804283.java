package dev.epro.r0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class Y14132333989764804283 implements Closeable, Flushable {
    public static final Pattern l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] m = new String[128];
    public static final String[] n;
    public final Writer a;
    public int[] b;
    public int c;
    public A16798789777035163011 d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public Y14132333989764804283(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            iArr = Arrays.copyOf(iArr, 0);
            this.b = iArr;
        }
        int i = this.c;
        this.c = i + 1;
        iArr[i] = 6;
        this.h = 2;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        s(A16798789777035163011.d);
    }

    public void A(long j) {
        F();
        b();
        this.a.write(Long.toString(j));
    }

    public void B(Boolean bool) {
        if (bool == null) {
            p();
            return;
        }
        F();
        b();
        this.a.write(bool.booleanValue() ? "true" : "false");
    }

    public void C(Number number) {
        if (number == null) {
            p();
            return;
        }
        F();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.h != 1) {
                    S10973172697741180971.j("Numeric values must be finite, but was ".concat(obj));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !l.matcher(obj).matches()) {
                S10973172697741180971.l("String created by ", cls, " is not a valid JSON number: ", obj);
                return;
            }
        }
        b();
        this.a.append((CharSequence) obj);
    }

    public void D(String str) {
        if (str == null) {
            p();
            return;
        }
        F();
        b();
        v(str);
    }

    public void E(boolean z) {
        F();
        b();
        this.a.write(z ? "true" : "false");
    }

    public final void F() {
        if (this.j != null) {
            int q = q();
            if (q == 5) {
                this.a.write(this.f);
            } else if (q != 3) {
                S10973172697741180971.m("Nesting problem.");
                return;
            }
            o();
            this.b[this.c - 1] = 4;
            v(this.j);
            this.j = null;
        }
    }

    public final void b() {
        int q = q();
        if (q == 1) {
            this.b[this.c - 1] = 2;
            o();
            return;
        }
        Writer writer = this.a;
        if (q == 2) {
            writer.append((CharSequence) this.f);
            o();
            return;
        }
        if (q == 4) {
            writer.append((CharSequence) this.e);
            this.b[this.c - 1] = 5;
            return;
        }
        if (q != 6) {
            if (q != 7) {
                S10973172697741180971.m("Nesting problem.");
                return;
            } else if (this.h != 1) {
                S10973172697741180971.m("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    public void c() {
        F();
        b();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i * 2);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 1;
        this.a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            Q11088980322693754445.h("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    public void d() {
        F();
        b();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i * 2);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 3;
        this.a.write(123);
    }

    public final void e(int i, int i2, char c) {
        int q = q();
        if (q != i2 && q != i) {
            S10973172697741180971.m("Nesting problem.");
            return;
        }
        if (this.j != null) {
            D11988991656201568495.k("Dangling name: ", this.j);
            return;
        }
        this.c--;
        if (q == i2) {
            o();
        }
        this.a.write(c);
    }

    public void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            S10973172697741180971.m("JsonWriter is closed.");
        }
    }

    public void g() {
        e(1, 2, ']');
    }

    public void h() {
        e(3, 5, '}');
    }

    public void j(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            S10973172697741180971.m("Already wrote a name, expecting a value.");
            return;
        }
        int q = q();
        if (q == 3 || q == 5) {
            this.j = str;
        } else {
            S10973172697741180971.m("Please begin an object before writing a name.");
        }
    }

    public final void o() {
        if (this.g) {
            return;
        }
        String str = this.d.a;
        Writer writer = this.a;
        writer.write(str);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.d.b);
        }
    }

    public Y14132333989764804283 p() {
        if (this.j != null) {
            if (!this.k) {
                this.j = null;
                return this;
            }
            F();
        }
        b();
        this.a.write("null");
        return this;
    }

    public final int q() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        S10973172697741180971.m("JsonWriter is closed.");
        return 0;
    }

    public final void s(A16798789777035163011 a16798789777035163011) {
        Objects.requireNonNull(a16798789777035163011);
        this.d = a16798789777035163011;
        this.f = ",";
        if (a16798789777035163011.c) {
            this.e = ": ";
            if (a16798789777035163011.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        this.g = this.d.a.isEmpty() && this.d.b.isEmpty();
    }

    public final void u(int i) {
        if (i == 0) {
            throw null;
        }
        this.h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = dev.epro.r0.Y14132333989764804283.n
            goto L9
        L7:
            java.lang.String[] r0 = dev.epro.r0.Y14132333989764804283.m
        L9:
            java.io.Writer r7 = r7.a
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y14132333989764804283.v(java.lang.String):void");
    }

    public void z(double d) {
        F();
        if (this.h == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            b();
            this.a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }
}
