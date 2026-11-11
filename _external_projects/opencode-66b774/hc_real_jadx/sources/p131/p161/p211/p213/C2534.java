package p131.p161.p211.p213;

import androidx.core.app.NotificationCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2534 implements Closeable, Flushable {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final String[] f9883;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final String[] f9884 = new String[NotificationCompat.FLAG_HIGH_PRIORITY];

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f9885;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Writer f9886;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f9887;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f9888;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f9890;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f9891;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f9893;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int[] f9889 = new int[32];

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9892 = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            f9884[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f9884;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f9883 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C2534(Writer writer) {
        m4553(6);
        this.f9891 = ":";
        this.f9888 = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f9886 = writer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9886.close();
        int i = this.f9892;
        if (i > 1 || (i == 1 && this.f9889[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9892 = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f9892 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f9886.flush();
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m4539() {
        if (this.f9890 == null) {
            return;
        }
        this.f9886.write(10);
        int i = this.f9892;
        for (int i2 = 1; i2 < i; i2++) {
            this.f9886.write(this.f9890);
        }
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final void m4540(int i) {
        this.f9889[this.f9892 - 1] = i;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public C2534 mo4541() {
        if (this.f9893 != null) {
            if (!this.f9888) {
                this.f9893 = null;
                return this;
            }
            m4556();
        }
        m4549();
        this.f9886.write("null");
        return this;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public C2534 mo4542(Boolean bool) {
        if (bool == null) {
            return mo4541();
        }
        m4556();
        m4549();
        this.f9886.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public C2534 mo4543() {
        m4556();
        m4549();
        m4553(3);
        this.f9886.write(123);
        return this;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public C2534 mo4544(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f9893 != null) {
            throw new IllegalStateException();
        }
        if (this.f9892 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f9893 = str;
        return this;
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public C2534 mo4545() {
        m4550(3, 5, '}');
        return this;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final int m4546() {
        int i = this.f9892;
        if (i != 0) {
            return this.f9889[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public C2534 mo4547(boolean z) {
        m4556();
        m4549();
        this.f9886.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public C2534 mo4548(String str) {
        if (str == null) {
            return mo4541();
        }
        m4556();
        m4549();
        m4552(str);
        return this;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m4549() {
        int m4546 = m4546();
        if (m4546 == 1) {
            m4540(2);
        } else {
            if (m4546 != 2) {
                if (m4546 == 4) {
                    this.f9886.append((CharSequence) this.f9891);
                    m4540(5);
                    return;
                }
                if (m4546 != 6) {
                    if (m4546 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f9887) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                m4540(7);
                return;
            }
            this.f9886.append(',');
        }
        m4539();
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final C2534 m4550(int i, int i2, char c) {
        int m4546 = m4546();
        if (m4546 != i2 && m4546 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f9893 != null) {
            StringBuilder m4207 = C2098.m4207("Dangling name: ");
            m4207.append(this.f9893);
            throw new IllegalStateException(m4207.toString());
        }
        this.f9892--;
        if (m4546 == i2) {
            m4539();
        }
        this.f9886.write(c);
        return this;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public C2534 mo4551(long j) {
        m4556();
        m4549();
        this.f9886.write(Long.toString(j));
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4552(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f9885
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p131.p161.p211.p213.C2534.f9883
            goto L9
        L7:
            java.lang.String[] r0 = p131.p161.p211.p213.C2534.f9884
        L9:
            java.io.Writer r1 = r8.f9886
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f9886
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f9886
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f9886
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f9886
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p213.C2534.m4552(java.lang.String):void");
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final void m4553(int i) {
        int i2 = this.f9892;
        int[] iArr = this.f9889;
        if (i2 == iArr.length) {
            this.f9889 = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f9889;
        int i3 = this.f9892;
        this.f9892 = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public C2534 mo4554(Number number) {
        if (number == null) {
            return mo4541();
        }
        m4556();
        String obj = number.toString();
        if (this.f9887 || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m4549();
            this.f9886.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public C2534 mo4555() {
        m4550(1, 2, ']');
        return this;
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public final void m4556() {
        if (this.f9893 != null) {
            int m4546 = m4546();
            if (m4546 == 5) {
                this.f9886.write(44);
            } else if (m4546 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m4539();
            m4540(4);
            m4552(this.f9893);
            this.f9893 = null;
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public C2534 mo4557() {
        m4556();
        m4549();
        m4553(1);
        this.f9886.write(91);
        return this;
    }
}
