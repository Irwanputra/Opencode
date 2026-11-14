package dev.epro.r0;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I15162792415829416729 {
    public static final byte[] f = new byte[0];
    public final /* synthetic */ byte a = 3;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public I15162792415829416729(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            T12055643479535528558.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            T12055643479535528558.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new R13385188873504756834(charSequence, i));
    }

    public static V17780983785905150922 l(String str) {
        int iIndexOf = str.indexOf(": ");
        return iIndexOf == -1 ? new V17780983785905150922(str, "") : new V17780983785905150922(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new Z3874088516406380299(this, i));
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbP = E12098517352909843120.p(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbP.append(i3);
        sbP.append("]");
        T12055643479535528558.a(sbP.toString());
    }

    public int c() {
        T17027910246883169756 t17027910246883169756 = (T17027910246883169756) this.e;
        String str = (String) this.d;
        if (t17027910246883169756 == null) {
            return str.length();
        }
        return (t17027910246883169756.b - t17027910246883169756.a()) + (str.length() - (this.c - this.b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!D3638978315442423989.d()) {
                    return false;
                }
                D3638978315442423989 d3638978315442423989A = D3638978315442423989.a();
                if (d3638978315442423989A.c() != 1 || d3638978315442423989A.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return M14643676963617488237.l(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (S10823041268949770285.t(unicodeBlockOf, unicodeBlock) && S10823041268949770285.t(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return S10823041268949770285.t(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && S10823041268949770285.t(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!D3638978315442423989.d()) {
                return false;
            }
            D3638978315442423989 d3638978315442423989A = D3638978315442423989.a();
            if (d3638978315442423989A.c() != 1 || d3638978315442423989A.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return M14643676963617488237.l(Character.codePointAt((CharSequence) this.d, i));
    }

    public int j(int i) {
        b(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (h(iFollowing + (-1)) && h(iFollowing) && !g(iFollowing)) ? j(iFollowing) : iFollowing;
    }

    public void k(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = C15025379344307230271.a(typeface, i, (this.c & 2) != 0);
        }
        L11832743611999248019 l11832743611999248019 = (L11832743611999248019) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (l11832743611999248019.n) {
            l11832743611999248019.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = l11832743611999248019.j;
                if (zIsAttachedToWindow) {
                    textView.post(new F11468989804357310467(textView, typeface, i2));
                } else {
                    L11832743611999248019.d(textView, typeface, i2);
                }
            }
        }
    }

    public int m(int i) {
        b(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (h(iPreceding) && d(iPreceding) && !g(iPreceding)) ? m(iPreceding) : iPreceding;
    }

    public String n() {
        byte[] bArr = (byte[]) this.e;
        byte[] bArr2 = f;
        if (bArr == null || bArr.length != 0) {
            byte[] bArrO = o();
            byte[] bArr3 = (byte[]) this.e;
            if (bArrO == null) {
                if (bArr3 != null) {
                    this.e = null;
                    bArr2 = bArr3;
                } else {
                    bArr2 = null;
                }
            } else if (bArrO.length != 0) {
                if (bArr3 != null) {
                    if (bArrO.length == 0 || bArrO[0] != 32) {
                        this.e = bArrO;
                        bArr2 = bArr3;
                    } else {
                        this.e = null;
                        int length = bArrO.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(bArrO, 1, bArr4, bArr3.length, length);
                        bArrO = bArr4;
                    }
                }
                while (true) {
                    byte[] bArrO2 = o();
                    if (bArrO2 == null) {
                        break;
                    }
                    if (bArrO2.length != 0) {
                        if (bArrO2[0] != 32) {
                            this.e = bArrO2;
                            break;
                        }
                        int length2 = bArrO2.length - 1;
                        byte[] bArr5 = new byte[bArrO.length + length2];
                        System.arraycopy(bArrO, 0, bArr5, 0, bArrO.length);
                        System.arraycopy(bArrO2, 1, bArr5, bArrO.length, length2);
                        bArrO = bArr5;
                    } else {
                        this.e = bArr2;
                        break;
                    }
                }
                bArr2 = bArrO;
            } else if (bArr3 != null) {
                this.e = bArr2;
                bArr2 = bArr3;
            }
        } else {
            this.e = null;
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    public byte[] o() {
        int i;
        byte[] bArr = (byte[]) this.d;
        int i2 = this.b;
        int i3 = this.c;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            if (i4 >= i3) {
                i4 = -1;
                i = -1;
                break;
            }
            byte b = bArr[i4];
            if (b == 13) {
                i = i4 + 1;
                if (i < i3 && bArr[i] == 10) {
                    i = i4 + 2;
                }
            } else {
                if (b == 10) {
                    i = i4 + 1;
                    break;
                }
                i4++;
            }
        }
        if (i4 == -1) {
            i4 = i3;
        } else {
            i3 = i;
        }
        this.b = i3;
        return i4 == i2 ? f : Arrays.copyOfRange(bArr, i2, i4);
    }

    public Q9839587184380308437 p() {
        int i;
        String strN;
        do {
            i = this.b;
            strN = n();
            if (strN == null) {
                return null;
            }
        } while (strN.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(l(strN));
        while (true) {
            String strN2 = n();
            if (strN2 == null || strN2.length() == 0) {
                break;
            }
            arrayList.add(l(strN2));
        }
        return new Q9839587184380308437(arrayList, i, this.b - i);
    }

    public void q(int i, int i2, String str) {
        if (i > i2) {
            T12055643479535528558.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            T12055643479535528558.a("start must be non-negative, but was " + i);
        }
        T17027910246883169756 t17027910246883169756 = (T17027910246883169756) this.e;
        if (t17027910246883169756 == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            T17027910246883169756 t170279102468831697562 = new T17027910246883169756((byte) 0);
            t170279102468831697562.b = iMax;
            t170279102468831697562.c = cArr;
            t170279102468831697562.d = length;
            t170279102468831697562.e = i4;
            this.e = t170279102468831697562;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > t17027910246883169756.b - t17027910246883169756.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            q(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > t17027910246883169756.a()) {
            int iA = length2 - t17027910246883169756.a();
            int i9 = t17027910246883169756.b;
            do {
                i9 *= 2;
            } while (i9 - t17027910246883169756.b < iA);
            char[] cArr2 = new char[i9];
            O5378677881740157249.p0(t17027910246883169756.c, cArr2, 0, 0, t17027910246883169756.d);
            int i10 = t17027910246883169756.b;
            int i11 = t17027910246883169756.e;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            O5378677881740157249.p0(t17027910246883169756.c, cArr2, i13, i11, i12 + i11);
            t17027910246883169756.c = cArr2;
            t17027910246883169756.b = i9;
            t17027910246883169756.e = i13;
        }
        int i14 = t17027910246883169756.d;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = t17027910246883169756.c;
            O5378677881740157249.p0(cArr3, cArr3, t17027910246883169756.e - i15, i8, i14);
            t17027910246883169756.d = i7;
            t17027910246883169756.e -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = t17027910246883169756.a() + i7;
            int iA3 = t17027910246883169756.a() + i8;
            int i16 = t17027910246883169756.e;
            char[] cArr4 = t17027910246883169756.c;
            O5378677881740157249.p0(cArr4, cArr4, t17027910246883169756.d, i16, iA2);
            i7 = t17027910246883169756.d + (iA2 - i16);
            t17027910246883169756.d = i7;
            t17027910246883169756.e = iA3;
        } else {
            t17027910246883169756.e = t17027910246883169756.a() + i8;
            t17027910246883169756.d = i7;
        }
        str.getChars(0, str.length(), t17027910246883169756.c, i7);
        t17027910246883169756.d = str.length() + t17027910246883169756.d;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                T17027910246883169756 t17027910246883169756 = (T17027910246883169756) this.e;
                String str = (String) this.d;
                if (t17027910246883169756 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append(t17027910246883169756.c, 0, t17027910246883169756.d);
                char[] cArr = t17027910246883169756.c;
                int i = t17027910246883169756.e;
                sb.append(cArr, i, t17027910246883169756.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public I15162792415829416729(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        this.d = byteBuffer;
        this.e = byteBuffer2;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ I15162792415829416729() {
    }

    public I15162792415829416729(byte[] bArr) {
        int length = bArr.length;
        this.d = bArr;
        this.b = 0;
        this.c = length;
    }

    public I15162792415829416729(L11832743611999248019 l11832743611999248019, int i, int i2, WeakReference weakReference) {
        this.e = l11832743611999248019;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
