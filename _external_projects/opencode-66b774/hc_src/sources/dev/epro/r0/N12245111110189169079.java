package dev.epro.r0;

import ads_mobile_sdk.mu3;
import ads_mobile_sdk.zt3;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N12245111110189169079 implements O313374706087262796 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N12245111110189169079(dev.epro.r0.P8646985343900033725 r13, dev.epro.r0.E686369837194379706 r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N12245111110189169079.<init>(dev.epro.r0.P8646985343900033725, dev.epro.r0.E686369837194379706):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new dev.epro.r0.W8455343525638953052(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.b;
        r17 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new dev.epro.r0.N12245111110189169079(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.b;
        r21 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new dev.epro.r0.W8455343525638953052(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new dev.epro.r0.W8455343525638953052(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.N12245111110189169079 e(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N12245111110189169079.e(android.content.res.Resources, int, android.content.res.Resources$Theme):dev.epro.r0.N12245111110189169079");
    }

    public static N12245111110189169079 f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 8) {
            byteBuffer.position(byteBuffer.limit());
            return null;
        }
        int position = byteBuffer.position();
        int i = byteBuffer.getShort() & 65535;
        int i2 = 65535 & byteBuffer.getShort();
        long j = byteBuffer.getInt() & 4294967295L;
        if (j - 8 > byteBuffer.remaining()) {
            byteBuffer.position(byteBuffer.limit());
            return null;
        }
        if (i2 < 8) {
            throw new I3603276906376719046(G6547577305291411977.o(i2, "Malformed chunk: header too short: ", " bytes"));
        }
        if (i2 <= j) {
            int i3 = i2 + position;
            long j2 = position + j;
            N12245111110189169079 n12245111110189169079 = new N12245111110189169079(i, I18375393507362144511.f(position, i3, byteBuffer), I18375393507362144511.g(byteBuffer, i3, j2));
            byteBuffer.position((int) j2);
            return n12245111110189169079;
        }
        throw new I3603276906376719046("Malformed chunk: header too long: " + i2 + " bytes. Chunk size: " + j + " bytes");
    }

    @Override // dev.epro.r0.O313374706087262796
    public byte a(zt3 zt3Var, int i) {
        byte[] bArr = (byte[]) this.c;
        int d = i >>> (C468629748621011703.d(993115750, 1213092095, -122082883, 1967905751) ^ 1229180);
        if (d != this.b) {
            ((mu3) this.d).a(d, bArr);
            this.b = d;
        }
        return (byte) (((zt3Var.a(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    public void b(int i, C2164091577132444055 c2164091577132444055) {
        if (i < 0) {
            Y16081827717826519461.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        D2029916669724210805 d2029916669724210805 = new D2029916669724210805(this.b, i, c2164091577132444055);
        this.b += i;
        ((D389890677992184566) this.c).b(d2029916669724210805);
    }

    public void c() {
        L11462694090053902638 l11462694090053902638;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            T11496100853119631009.a(drawable);
        }
        if (drawable == null || (l11462694090053902638 = (L11462694090053902638) this.d) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = D6070089955350435999.b;
        B5275173104802412095.i(drawable, l11462694090053902638, drawableState);
    }

    public A13981518004556070623 d() {
        J15576308165180871922 j15576308165180871922 = (J15576308165180871922) this.d;
        if (j15576308165180871922 != null) {
            throw j15576308165180871922.a();
        }
        A13981518004556070623 b = A13981518004556070623.b(this.b, (Object[]) this.c, this);
        J15576308165180871922 j155763081651808719222 = (J15576308165180871922) this.d;
        if (j155763081651808719222 == null) {
            return b;
        }
        throw j155763081651808719222.a();
    }

    public D2029916669724210805 g(int i) {
        if (i < 0 || i >= this.b) {
            Y16081827717826519461.e("Index " + i + ", size " + this.b);
        }
        D2029916669724210805 d2029916669724210805 = (D2029916669724210805) this.d;
        if (d2029916669724210805 != null) {
            int i2 = d2029916669724210805.a;
            if (i < d2029916669724210805.b + i2 && i2 <= i) {
                return d2029916669724210805;
            }
        }
        D389890677992184566 d389890677992184566 = (D389890677992184566) this.c;
        D2029916669724210805 d20299166697242108052 = (D2029916669724210805) d389890677992184566.a[Z860808776098365610.v(i, d389890677992184566)];
        this.d = d20299166697242108052;
        return d20299166697242108052;
    }

    public ByteBuffer h() {
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        ByteBuffer slice = byteBuffer.slice();
        slice.order(byteBuffer.order());
        return slice;
    }

    public int i(Object obj) {
        M8849337839148886240 m8849337839148886240 = (M8849337839148886240) this.c;
        int d = m8849337839148886240.d(obj);
        if (d >= 0) {
            return m8849337839148886240.c[d];
        }
        return -1;
    }

    public Object j(int i) {
        Object[] objArr = (Object[]) this.d;
        int i2 = i - this.b;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int k(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i9 = this.b;
        int i10 = i9 + 3;
        this.b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.c = Arrays.copyOf(jArr, max);
            this.d = Arrays.copyOf((long[]) this.d, max);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            P753981624812481271.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            P753981624812481271.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = T17075709905302039733.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (Math.min((i9 - i7) / 3, 1023) << 50);
        return i9;
    }

    public boolean l() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void m(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = Y17304307076558258116.f;
        I1632105416032993715 t = I1632105416032993715.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) t.c;
        W10240872260424387225.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) t.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = M9216324016624295870.G(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                T11496100853119631009.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(t.f(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(T11496100853119631009.b(typedArray.getInt(3, -1), null));
            }
            t.v();
        } catch (Throwable th) {
            t.v();
            throw th;
        }
    }

    public void n(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, Y582199805280922215.r(objArr.length, i));
        }
        U15853425786981391261.x(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public void o(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = T17075709905302039733.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i7 = this.b;
            jArr2[0] = (j & (-1125899873288193L)) | ((i & 33554431) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = ((((int) j6) + i3) & 4294967295L) | ((((int) (j6 >> 32)) + i2) << 32);
                        jArr[i15] = ((((int) j7) + i3) & 4294967295L) | ((((int) (j7 >> 32)) + i2) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = T17075709905302039733.b;
                            jArr2[i8] = (j5 & j2) | (((i10 + 3) & i14) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder();
                if (((P10544952747155442696) this.c) == P10544952747155442696.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // dev.epro.r0.O313374706087262796
    public zt3 a(zt3 zt3Var, int i, int i2) {
        byte[] bArr;
        if (i >= 0 && i <= i2 && i2 <= zt3Var.a.length) {
            int i3 = i2 - i;
            byte[] bArr2 = new byte[i3];
            int i4 = 0;
            while (i < i2) {
                bArr2[i4] = a(zt3Var, i);
                i++;
                i4++;
            }
            if (i3 == 0) {
                bArr = new byte[0];
            } else {
                bArr = new byte[i3];
                System.arraycopy(bArr2, 0, bArr, 0, i3);
            }
            return new zt3(bArr);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // dev.epro.r0.O313374706087262796
    public /* bridge */ /* synthetic */ O313374706087262796 a() {
        return new N12245111110189169079((mu3) this.d);
    }

    public N12245111110189169079(mu3 mu3Var) {
        this.a = (byte) 1;
        this.b = C468629748621011703.d(1639930109, -1705198021, 164110942, 67728125) ^ 161650728;
        this.c = new byte[8];
        this.d = mu3Var;
    }

    public N12245111110189169079(P10544952747155442696 p10544952747155442696, int i, String str) {
        this.a = (byte) 11;
        this.c = p10544952747155442696;
        this.b = i;
        this.d = str;
    }

    public N12245111110189169079(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = (byte) 2;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            S10973172697741180971.j("changes cannot be empty");
            throw null;
        }
    }

    public N12245111110189169079(ImageView imageView) {
        this.a = (byte) 3;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ N12245111110189169079(byte b) {
        this.a = b;
    }

    public N12245111110189169079(Shader shader, ColorStateList colorStateList, int i) {
        this.a = (byte) 5;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public N12245111110189169079() {
        this.a = (byte) 7;
        this.c = new D389890677992184566(0, new D2029916669724210805[16]);
    }

    public N12245111110189169079(K1865709164992808030 k1865709164992808030) {
        this.a = (byte) 4;
        this.c = k1865709164992808030;
    }

    public N12245111110189169079(int i) {
        this.a = (byte) 6;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public N12245111110189169079(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.a = (byte) 0;
        this.b = i;
        this.c = byteBuffer;
        this.d = byteBuffer2;
    }
}
