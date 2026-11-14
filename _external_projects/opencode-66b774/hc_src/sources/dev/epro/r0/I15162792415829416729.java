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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        int indexOf = str.indexOf(": ");
        return indexOf == -1 ? new V17780983785905150922(str, "") : new V17780983785905150922(str.substring(0, indexOf), str.substring(indexOf + 2));
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
        StringBuilder p = E12098517352909843120.p(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        p.append(i3);
        p.append("]");
        T12055643479535528558.a(p.toString());
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
                D3638978315442423989 a = D3638978315442423989.a();
                if (a.c() != 1 || a.b(charSequence, i3) == -1) {
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
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (S10823041268949770285.t(of, unicodeBlock) && S10823041268949770285.t(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
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
            D3638978315442423989 a = D3638978315442423989.a();
            if (a.c() != 1 || a.b(charSequence, i) == -1) {
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
        int following = ((BreakIterator) this.e).following(i);
        return (h(following + (-1)) && h(following) && !g(following)) ? j(following) : following;
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
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = l11832743611999248019.j;
                if (isAttachedToWindow) {
                    textView.post(new F11468989804357310467(textView, typeface, i2));
                } else {
                    L11832743611999248019.d(textView, typeface, i2);
                }
            }
        }
    }

    public int m(int i) {
        b(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        return (h(preceding) && d(preceding) && !g(preceding)) ? m(preceding) : preceding;
    }

    public String n() {
        byte[] bArr = (byte[]) this.e;
        byte[] bArr2 = f;
        if (bArr == null || bArr.length != 0) {
            byte[] o2 = o();
            byte[] bArr3 = (byte[]) this.e;
            if (o2 == null) {
                if (bArr3 != null) {
                    this.e = null;
                    bArr2 = bArr3;
                } else {
                    bArr2 = null;
                }
            } else if (o2.length != 0) {
                if (bArr3 != null) {
                    if (o2.length == 0 || o2[0] != 32) {
                        this.e = o2;
                        bArr2 = bArr3;
                    } else {
                        this.e = null;
                        int length = o2.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(o2, 1, bArr4, bArr3.length, length);
                        o2 = bArr4;
                    }
                }
                while (true) {
                    byte[] o3 = o();
                    if (o3 == null) {
                        break;
                    }
                    if (o3.length != 0) {
                        if (o3[0] != 32) {
                            this.e = o3;
                            break;
                        }
                        int length2 = o3.length - 1;
                        byte[] bArr5 = new byte[o2.length + length2];
                        System.arraycopy(o2, 0, bArr5, 0, o2.length);
                        System.arraycopy(o3, 1, bArr5, o2.length, length2);
                        o2 = bArr5;
                    } else {
                        this.e = bArr2;
                        break;
                    }
                }
                bArr2 = o2;
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
        String n;
        do {
            i = this.b;
            n = n();
            if (n == null) {
                return null;
            }
        } while (n.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(l(n));
        while (true) {
            String n2 = n();
            if (n2 == null || n2.length() == 0) {
                break;
            }
            arrayList.add(l(n2));
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
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            T17027910246883169756 t170279102468831697562 = new T17027910246883169756((byte) 0);
            t170279102468831697562.b = max;
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
            int a = length2 - t17027910246883169756.a();
            int i9 = t17027910246883169756.b;
            do {
                i9 *= 2;
            } while (i9 - t17027910246883169756.b < a);
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
            int a2 = t17027910246883169756.a() + i7;
            int a3 = t17027910246883169756.a() + i8;
            int i16 = t17027910246883169756.e;
            char[] cArr4 = t17027910246883169756.c;
            O5378677881740157249.p0(cArr4, cArr4, t17027910246883169756.d, i16, a2);
            i7 = t17027910246883169756.d + (a2 - i16);
            t17027910246883169756.d = i7;
            t17027910246883169756.e = a3;
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
