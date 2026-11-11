package p131.p161.p211.p213;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.p214.AbstractC2621;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2535 implements Closeable {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final char[] f9894 = ")]}'\n".toCharArray();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Reader f9896;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public long f9898;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int[] f9899;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public String[] f9900;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String f9903;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int[] f9905;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f9907;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f9909;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f9901 = false;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final char[] f9906 = new char[1024];

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f9902 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f9904 = 0;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f9897 = 0;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f9895 = 0;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f9908 = 0;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2536 extends AbstractC2621 {
    }

    static {
        AbstractC2621.f10054 = new C2536();
    }

    public C2535(Reader reader) {
        int[] iArr = new int[32];
        this.f9905 = iArr;
        this.f9907 = 0;
        this.f9907 = 0 + 1;
        iArr[0] = 6;
        this.f9900 = new String[32];
        this.f9899 = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f9896 = reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9908 = 0;
        this.f9905[0] = 8;
        this.f9907 = 1;
        this.f9896.close();
    }

    public String toString() {
        return getClass().getSimpleName() + m4579();
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public final IOException m4558(String str) {
        StringBuilder m4207 = C2098.m4207(str);
        m4207.append(m4579());
        throw new C2537(m4207.toString());
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public EnumC2533 mo4559() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        switch (i) {
            case 1:
                return EnumC2533.BEGIN_OBJECT;
            case 2:
                return EnumC2533.END_OBJECT;
            case 3:
                return EnumC2533.BEGIN_ARRAY;
            case 4:
                return EnumC2533.END_ARRAY;
            case 5:
            case 6:
                return EnumC2533.BOOLEAN;
            case 7:
                return EnumC2533.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC2533.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC2533.NAME;
            case 15:
            case 16:
                return EnumC2533.NUMBER;
            case 17:
                return EnumC2533.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public final void m4560() {
        char c;
        do {
            if (this.f9902 >= this.f9904 && !m4566(1)) {
                return;
            }
            char[] cArr = this.f9906;
            int i = this.f9902;
            int i2 = i + 1;
            this.f9902 = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f9897++;
                this.f9895 = i2;
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public String mo4561() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f9907;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f9905[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f9899[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f9900;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public boolean mo4562() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 5) {
            this.f9908 = 0;
            int[] iArr = this.f9899;
            int i2 = this.f9907 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            StringBuilder m4207 = C2098.m4207("Expected a boolean but was ");
            m4207.append(mo4559());
            m4207.append(m4579());
            throw new IllegalStateException(m4207.toString());
        }
        this.f9908 = 0;
        int[] iArr2 = this.f9899;
        int i3 = this.f9907 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean mo4563() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public long mo4564() {
        String m4584;
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 15) {
            this.f9908 = 0;
            int[] iArr = this.f9899;
            int i2 = this.f9907 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f9898;
        }
        if (i == 16) {
            this.f9903 = new String(this.f9906, this.f9902, this.f9909);
            this.f9902 += this.f9909;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                StringBuilder m4207 = C2098.m4207("Expected a long but was ");
                m4207.append(mo4559());
                m4207.append(m4579());
                throw new IllegalStateException(m4207.toString());
            }
            if (i == 10) {
                m4584 = m4569();
            } else {
                m4584 = m4584(i == 8 ? '\'' : '\"');
            }
            this.f9903 = m4584;
            try {
                long parseLong = Long.parseLong(this.f9903);
                this.f9908 = 0;
                int[] iArr2 = this.f9899;
                int i3 = this.f9907 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9908 = 11;
        double parseDouble = Double.parseDouble(this.f9903);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            StringBuilder m42072 = C2098.m4207("Expected a long but was ");
            m42072.append(this.f9903);
            m42072.append(m4579());
            throw new NumberFormatException(m42072.toString());
        }
        this.f9903 = null;
        this.f9908 = 0;
        int[] iArr3 = this.f9899;
        int i4 = this.f9907 - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final void m4565() {
        if (this.f9901) {
            return;
        }
        m4558("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final boolean m4566(int i) {
        int i2;
        int i3;
        char[] cArr = this.f9906;
        int i4 = this.f9895;
        int i5 = this.f9902;
        this.f9895 = i4 - i5;
        int i6 = this.f9904;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f9904 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f9904 = 0;
        }
        this.f9902 = 0;
        do {
            Reader reader = this.f9896;
            int i8 = this.f9904;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f9904 + read;
            this.f9904 = i2;
            if (this.f9897 == 0 && (i3 = this.f9895) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f9902++;
                this.f9895 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public final void m4567(char c) {
        char[] cArr = this.f9906;
        while (true) {
            int i = this.f9902;
            int i2 = this.f9904;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f9902 = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.f9902 = i3;
                        m4575();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.f9897++;
                            this.f9895 = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f9902 = i;
                    if (!m4566(1)) {
                        m4558("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public final void m4568(int i) {
        int i2 = this.f9907;
        int[] iArr = this.f9905;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f9905 = Arrays.copyOf(iArr, i3);
            this.f9899 = Arrays.copyOf(this.f9899, i3);
            this.f9900 = (String[]) Arrays.copyOf(this.f9900, i3);
        }
        int[] iArr2 = this.f9905;
        int i4 = this.f9907;
        this.f9907 = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m4565();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m4569() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f9902
            int r4 = r3 + r2
            int r5 = r6.f9904
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f9906
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m4565()
            goto L5c
        L4e:
            char[] r3 = r6.f9906
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m4566(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f9906
            int r4 = r6.f9902
            r1.append(r3, r4, r2)
            int r3 = r6.f9902
            int r3 = r3 + r2
            r6.f9902 = r3
            r2 = 1
            boolean r2 = r6.m4566(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f9906
            int r3 = r6.f9902
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f9906
            int r3 = r6.f9902
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f9902
            int r2 = r2 + r0
            r6.f9902 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p213.C2535.m4569():java.lang.String");
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public void mo4570() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i != 2) {
            StringBuilder m4207 = C2098.m4207("Expected END_OBJECT but was ");
            m4207.append(mo4559());
            m4207.append(m4579());
            throw new IllegalStateException(m4207.toString());
        }
        int i2 = this.f9907 - 1;
        this.f9907 = i2;
        this.f9900[i2] = null;
        int[] iArr = this.f9899;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f9908 = 0;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final boolean m4571(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m4565();
        return false;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public void mo4572() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i != 7) {
            StringBuilder m4207 = C2098.m4207("Expected null but was ");
            m4207.append(mo4559());
            m4207.append(m4579());
            throw new IllegalStateException(m4207.toString());
        }
        this.f9908 = 0;
        int[] iArr = this.f9899;
        int i2 = this.f9907 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r1 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r9.f9902 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r9.f9902 = r4 - 1;
        r2 = m4566(2);
        r9.f9902++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        m4565();
        r2 = r9.f9902;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r4 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r9.f9902 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if ((r9.f9902 + 2) <= r9.f9904) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (m4566(2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r3 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        m4558("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r1 = r9.f9906;
        r2 = r9.f9902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r1[r2] != '\n') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r9.f9897++;
        r9.f9895 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        r9.f9902++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        if (r4 >= 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        if (r9.f9906[r9.f9902 + r4] == "*\/".charAt(r4)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0073, code lost:
    
        if (r4 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0076, code lost:
    
        r9.f9902 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ca, code lost:
    
        r9.f9902 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ce, code lost:
    
        if (r1 != '#') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        m4565();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:
    
        return r1;
     */
    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4573(boolean r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p213.C2535.m4573(boolean):int");
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void mo4574() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 3) {
            m4568(1);
            this.f9899[this.f9907 - 1] = 0;
            this.f9908 = 0;
        } else {
            StringBuilder m4207 = C2098.m4207("Expected BEGIN_ARRAY but was ");
            m4207.append(mo4559());
            m4207.append(m4579());
            throw new IllegalStateException(m4207.toString());
        }
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public final char m4575() {
        int i;
        int i2;
        if (this.f9902 == this.f9904 && !m4566(1)) {
            m4558("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f9906;
        int i3 = this.f9902;
        int i4 = i3 + 1;
        this.f9902 = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.f9897++;
            this.f9895 = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                m4558("Invalid escape sequence");
                throw null;
            }
            if (i4 + 4 > this.f9904 && !m4566(4)) {
                m4558("Unterminated escape sequence");
                throw null;
            }
            char c2 = 0;
            int i5 = this.f9902;
            int i6 = i5 + 4;
            while (i5 < i6) {
                char c3 = this.f9906[i5];
                char c4 = (char) (c2 << 4);
                if (c3 < '0' || c3 > '9') {
                    if (c3 >= 'a' && c3 <= 'f') {
                        i = c3 - 'a';
                    } else {
                        if (c3 < 'A' || c3 > 'F') {
                            StringBuilder m4207 = C2098.m4207("\\u");
                            m4207.append(new String(this.f9906, this.f9902, 4));
                            throw new NumberFormatException(m4207.toString());
                        }
                        i = c3 - 'A';
                    }
                    i2 = i + 10;
                } else {
                    i2 = c3 - '0';
                }
                c2 = (char) (i2 + c4);
                i5++;
            }
            this.f9902 += 4;
            return c2;
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0205, code lost:
    
        if (m4571(r6) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0207, code lost:
    
        if (r13 != 2) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0209, code lost:
    
        if (r15 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020f, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0211, code lost:
    
        if (r16 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0217, code lost:
    
        if (r10 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0219, code lost:
    
        if (r16 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021b, code lost:
    
        if (r16 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021e, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x021f, code lost:
    
        r19.f9898 = r10;
        r19.f9902 += r9;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0239, code lost:
    
        r19.f9908 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022b, code lost:
    
        if (r13 == 2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022e, code lost:
    
        if (r13 == 4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0231, code lost:
    
        if (r13 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0233, code lost:
    
        r19.f9909 = r9;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0268 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0269  */
    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m4576() {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p213.C2535.m4576():int");
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public int mo4577() {
        String m4584;
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 15) {
            long j = this.f9898;
            int i2 = (int) j;
            if (j != i2) {
                StringBuilder m4207 = C2098.m4207("Expected an int but was ");
                m4207.append(this.f9898);
                m4207.append(m4579());
                throw new NumberFormatException(m4207.toString());
            }
            this.f9908 = 0;
            int[] iArr = this.f9899;
            int i3 = this.f9907 - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.f9903 = new String(this.f9906, this.f9902, this.f9909);
            this.f9902 += this.f9909;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                StringBuilder m42072 = C2098.m4207("Expected an int but was ");
                m42072.append(mo4559());
                m42072.append(m4579());
                throw new IllegalStateException(m42072.toString());
            }
            if (i == 10) {
                m4584 = m4569();
            } else {
                m4584 = m4584(i == 8 ? '\'' : '\"');
            }
            this.f9903 = m4584;
            try {
                int parseInt = Integer.parseInt(this.f9903);
                this.f9908 = 0;
                int[] iArr2 = this.f9899;
                int i4 = this.f9907 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9908 = 11;
        double parseDouble = Double.parseDouble(this.f9903);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            StringBuilder m42073 = C2098.m4207("Expected an int but was ");
            m42073.append(this.f9903);
            m42073.append(m4579());
            throw new NumberFormatException(m42073.toString());
        }
        this.f9903 = null;
        this.f9908 = 0;
        int[] iArr3 = this.f9899;
        int i6 = this.f9907 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public double mo4578() {
        String m4584;
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 15) {
            this.f9908 = 0;
            int[] iArr = this.f9899;
            int i2 = this.f9907 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f9898;
        }
        if (i == 16) {
            this.f9903 = new String(this.f9906, this.f9902, this.f9909);
            this.f9902 += this.f9909;
        } else {
            if (i == 8 || i == 9) {
                m4584 = m4584(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                m4584 = m4569();
            } else if (i != 11) {
                StringBuilder m4207 = C2098.m4207("Expected a double but was ");
                m4207.append(mo4559());
                m4207.append(m4579());
                throw new IllegalStateException(m4207.toString());
            }
            this.f9903 = m4584;
        }
        this.f9908 = 11;
        double parseDouble = Double.parseDouble(this.f9903);
        if (!this.f9901 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C2537("JSON forbids NaN and infinities: " + parseDouble + m4579());
        }
        this.f9903 = null;
        this.f9908 = 0;
        int[] iArr2 = this.f9899;
        int i3 = this.f9907 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public String m4579() {
        return " at line " + (this.f9897 + 1) + " column " + ((this.f9902 - this.f9895) + 1) + " path " + mo4561();
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public String mo4580() {
        String str;
        char c;
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 10) {
            str = m4569();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f9903;
                this.f9903 = null;
            } else if (i == 15) {
                str = Long.toString(this.f9898);
            } else {
                if (i != 16) {
                    StringBuilder m4207 = C2098.m4207("Expected a string but was ");
                    m4207.append(mo4559());
                    m4207.append(m4579());
                    throw new IllegalStateException(m4207.toString());
                }
                str = new String(this.f9906, this.f9902, this.f9909);
                this.f9902 += this.f9909;
            }
            str = m4584(c);
        }
        this.f9908 = 0;
        int[] iArr = this.f9899;
        int i2 = this.f9907 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0093. Please report as an issue. */
    /* renamed from: はつきどっ, reason: contains not printable characters */
    public void mo4581() {
        char c;
        int i = 0;
        do {
            int i2 = this.f9908;
            if (i2 == 0) {
                i2 = m4576();
            }
            if (i2 == 3) {
                m4568(1);
            } else if (i2 == 1) {
                m4568(3);
            } else {
                if (i2 == 4 || i2 == 2) {
                    this.f9907--;
                    i--;
                } else if (i2 == 14 || i2 == 10) {
                    do {
                        int i3 = 0;
                        while (true) {
                            int i4 = this.f9902 + i3;
                            if (i4 < this.f9904) {
                                char c2 = this.f9906[i4];
                                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                                    if (c2 != '#') {
                                        if (c2 != ',') {
                                            if (c2 != '/' && c2 != '=') {
                                                if (c2 != '{' && c2 != '}' && c2 != ':') {
                                                    if (c2 != ';') {
                                                        switch (c2) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i3++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f9902 = i4;
                            }
                        }
                        m4565();
                        this.f9902 += i3;
                    } while (m4566(1));
                } else {
                    if (i2 == 8 || i2 == 12) {
                        c = '\'';
                    } else if (i2 == 9 || i2 == 13) {
                        c = '\"';
                    } else if (i2 == 16) {
                        this.f9902 += this.f9909;
                    }
                    m4567(c);
                }
                this.f9908 = 0;
            }
            i++;
            this.f9908 = 0;
        } while (i != 0);
        int[] iArr = this.f9899;
        int i5 = this.f9907;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f9900[i5 - 1] = "null";
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public String mo4582() {
        char c;
        String m4584;
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 14) {
            m4584 = m4569();
        } else {
            if (i == 12) {
                c = '\'';
            } else {
                if (i != 13) {
                    StringBuilder m4207 = C2098.m4207("Expected a name but was ");
                    m4207.append(mo4559());
                    m4207.append(m4579());
                    throw new IllegalStateException(m4207.toString());
                }
                c = '\"';
            }
            m4584 = m4584(c);
        }
        this.f9908 = 0;
        this.f9900[this.f9907 - 1] = m4584;
        return m4584;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public void mo4583() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i != 4) {
            StringBuilder m4207 = C2098.m4207("Expected END_ARRAY but was ");
            m4207.append(mo4559());
            m4207.append(m4579());
            throw new IllegalStateException(m4207.toString());
        }
        int i2 = this.f9907 - 1;
        this.f9907 = i2;
        int[] iArr = this.f9899;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f9908 = 0;
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public final String m4584(char c) {
        char[] cArr = this.f9906;
        StringBuilder sb = null;
        while (true) {
            int i = this.f9902;
            int i2 = this.f9904;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f9902 = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.f9902 = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(m4575());
                    } else {
                        if (c2 == '\n') {
                            this.f9897++;
                            this.f9895 = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.f9902 = i;
                    if (!m4566(1)) {
                        m4558("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void mo4585() {
        int i = this.f9908;
        if (i == 0) {
            i = m4576();
        }
        if (i == 1) {
            m4568(3);
            this.f9908 = 0;
        } else {
            StringBuilder m4207 = C2098.m4207("Expected BEGIN_OBJECT but was ");
            m4207.append(mo4559());
            m4207.append(m4579());
            throw new IllegalStateException(m4207.toString());
        }
    }
}
