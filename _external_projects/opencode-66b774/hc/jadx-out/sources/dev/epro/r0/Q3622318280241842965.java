package dev.epro.r0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q3622318280241842965 {
    public static final Q3622318280241842965 c;
    public static final Q3622318280241842965 d;
    public static final Q3622318280241842965 e;
    public static final Q3622318280241842965 f;
    public static final Q3622318280241842965 g;
    public static final Q3622318280241842965 h;
    public static final Q3622318280241842965 i;
    public static final Q3622318280241842965 j;
    public static final Q3622318280241842965 k;
    public static final Q3622318280241842965 l;
    public static final Q3622318280241842965 m;
    public static final Q3622318280241842965 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Q3622318280241842965 f452o;
    public static final Q3622318280241842965 p;
    public static final HashSet q;
    public static final Q3622318280241842965 r;
    public static final HashMap s;
    public final String a;
    public final boolean b;

    static {
        Q3622318280241842965 q3622318280241842965 = new Q3622318280241842965("tag:yaml.org,2002:yaml");
        c = q3622318280241842965;
        Q3622318280241842965 q36223182802418429652 = new Q3622318280241842965("tag:yaml.org,2002:merge");
        d = q36223182802418429652;
        Q3622318280241842965 q36223182802418429653 = new Q3622318280241842965("tag:yaml.org,2002:set");
        e = q36223182802418429653;
        Q3622318280241842965 q36223182802418429654 = new Q3622318280241842965("tag:yaml.org,2002:pairs");
        f = q36223182802418429654;
        Q3622318280241842965 q36223182802418429655 = new Q3622318280241842965("tag:yaml.org,2002:omap");
        g = q36223182802418429655;
        Q3622318280241842965 q36223182802418429656 = new Q3622318280241842965("tag:yaml.org,2002:binary");
        h = q36223182802418429656;
        Q3622318280241842965 q36223182802418429657 = new Q3622318280241842965("tag:yaml.org,2002:int");
        i = q36223182802418429657;
        Q3622318280241842965 q36223182802418429658 = new Q3622318280241842965("tag:yaml.org,2002:float");
        j = q36223182802418429658;
        Q3622318280241842965 q36223182802418429659 = new Q3622318280241842965("tag:yaml.org,2002:timestamp");
        k = q36223182802418429659;
        Q3622318280241842965 q362231828024184296510 = new Q3622318280241842965("tag:yaml.org,2002:bool");
        l = q362231828024184296510;
        Q3622318280241842965 q362231828024184296511 = new Q3622318280241842965("tag:yaml.org,2002:null");
        m = q362231828024184296511;
        Q3622318280241842965 q362231828024184296512 = new Q3622318280241842965("tag:yaml.org,2002:str");
        n = q362231828024184296512;
        Q3622318280241842965 q362231828024184296513 = new Q3622318280241842965("tag:yaml.org,2002:seq");
        f452o = q362231828024184296513;
        Q3622318280241842965 q362231828024184296514 = new Q3622318280241842965("tag:yaml.org,2002:map");
        p = q362231828024184296514;
        HashSet hashSet = new HashSet(15);
        q = hashSet;
        hashSet.add(q3622318280241842965);
        hashSet.add(q36223182802418429652);
        hashSet.add(q36223182802418429653);
        hashSet.add(q36223182802418429654);
        hashSet.add(q36223182802418429655);
        hashSet.add(q36223182802418429656);
        hashSet.add(q36223182802418429657);
        hashSet.add(q36223182802418429658);
        hashSet.add(q36223182802418429659);
        hashSet.add(q362231828024184296510);
        hashSet.add(q362231828024184296511);
        hashSet.add(q362231828024184296512);
        hashSet.add(q362231828024184296513);
        hashSet.add(q362231828024184296514);
        r = new Q3622318280241842965("tag:yaml.org,2002:comment");
        HashMap map = new HashMap();
        s = map;
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Double.class);
        hashSet2.add(Float.class);
        hashSet2.add(BigDecimal.class);
        map.put(q36223182802418429658, hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(Integer.class);
        hashSet3.add(Long.class);
        hashSet3.add(BigInteger.class);
        map.put(q36223182802418429657, hashSet3);
        HashSet hashSet4 = new HashSet();
        hashSet4.add(Date.class);
        try {
            hashSet4.add(Class.forName("java.sql.Date"));
            hashSet4.add(Class.forName("java.sql.Timestamp"));
        } catch (ClassNotFoundException unused) {
        }
        s.put(k, hashSet4);
    }

    public Q3622318280241842965(String str) {
        int i2;
        String str2;
        int i3;
        char[] cArr;
        this.b = false;
        if (str == null) {
            Z3383101362411723454.k("Tag must be provided.");
            throw null;
        }
        if (str.isEmpty()) {
            S10973172697741180971.j("Tag must not be empty.");
            throw null;
        }
        if (str.trim().length() != str.length()) {
            S10973172697741180971.j("Tag must not contain leading or trailing spaces.");
            throw null;
        }
        boolean[] zArr = A993230717920875259.b.b;
        int length = str.length();
        int i4 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= length) {
                str2 = str;
                break;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            } else {
                i4++;
            }
        }
        int length2 = str.length();
        char[] cArr2 = (char[]) K17198996250266005227.a.get();
        int i5 = 0;
        int length3 = 0;
        while (i4 < length2) {
            if (i4 >= length2) {
                W4415201450379021245.a("Index exceeds specified range");
                throw null;
            }
            int i6 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            int codePoint = cCharAt2;
            if (cCharAt2 >= 55296) {
                codePoint = cCharAt2;
                if (cCharAt2 <= 57343) {
                    if (cCharAt2 > 56319) {
                        throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i4);
                    }
                    if (i6 == length2) {
                        codePoint = -cCharAt2;
                    } else {
                        char cCharAt3 = str.charAt(i6);
                        if (!Character.isLowSurrogate(cCharAt3)) {
                            throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt3 + "' with value " + ((int) cCharAt3) + " at index " + i6);
                        }
                        codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                    }
                }
            }
            if (codePoint < 0) {
                S10973172697741180971.j("Trailing high surrogate at end of input");
                throw null;
            }
            char[] cArr3 = D16524099442378852760.c;
            if (codePoint < zArr.length && zArr[codePoint]) {
                i3 = i2;
                cArr = null;
            } else if (codePoint <= 127) {
                cArr = new char[3];
                cArr[0] = '%';
                cArr[2] = cArr3[codePoint & 15];
                cArr[i2] = cArr3[codePoint >>> 4];
                i3 = i2;
            } else {
                i3 = i2;
                if (codePoint <= 2047) {
                    char[] cArr4 = new char[6];
                    cArr4[0] = '%';
                    cArr4[3] = '%';
                    cArr4[5] = cArr3[codePoint & 15];
                    cArr4[4] = cArr3[((codePoint >>> 4) & 3) | 8];
                    cArr4[2] = cArr3[(codePoint >>> 6) & 15];
                    cArr4[i3] = cArr3[12 | (codePoint >>> 10)];
                    cArr = cArr4;
                } else if (codePoint <= 65535) {
                    cArr = new char[9];
                    cArr[0] = '%';
                    cArr[i3] = 'E';
                    cArr[3] = '%';
                    cArr[6] = '%';
                    cArr[8] = cArr3[codePoint & 15];
                    cArr[7] = cArr3[((codePoint >>> 4) & 3) | 8];
                    cArr[5] = cArr3[(codePoint >>> 6) & 15];
                    cArr[4] = cArr3[((codePoint >>> 10) & 3) | 8];
                    cArr[2] = cArr3[codePoint >>> 12];
                } else {
                    if (codePoint > 1114111) {
                        S10973172697741180971.j(G6547577305291411977.n(codePoint, "Invalid unicode character value "));
                        throw null;
                    }
                    cArr = new char[12];
                    cArr[0] = '%';
                    cArr[i3] = 'F';
                    cArr[3] = '%';
                    cArr[6] = '%';
                    cArr[9] = '%';
                    cArr[11] = cArr3[codePoint & 15];
                    cArr[10] = cArr3[((codePoint >>> 4) & 3) | 8];
                    cArr[8] = cArr3[(codePoint >>> 6) & 15];
                    cArr[7] = cArr3[((codePoint >>> 10) & 3) | 8];
                    cArr[5] = cArr3[(codePoint >>> 12) & 15];
                    cArr[4] = cArr3[((codePoint >>> 16) & 3) | 8];
                    cArr[2] = cArr3[(codePoint >>> 18) & 7];
                }
            }
            if (cArr != null) {
                int i7 = i4 - i5;
                int i8 = length3 + i7;
                int length4 = cArr.length + i8;
                if (cArr2.length < length4) {
                    char[] cArr5 = new char[(length2 - i4) + length4 + 32];
                    if (length3 > 0) {
                        System.arraycopy(cArr2, 0, cArr5, 0, length3);
                    }
                    cArr2 = cArr5;
                }
                if (i7 > 0) {
                    str.getChars(i5, i4, cArr2, length3);
                    length3 = i8;
                }
                if (cArr.length > 0) {
                    System.arraycopy(cArr, 0, cArr2, length3, cArr.length);
                    length3 += cArr.length;
                }
            }
            i5 = i4 + (Character.isSupplementaryCodePoint(codePoint) ? 2 : i3);
            i4 = i5;
            while (i4 < length2) {
                char cCharAt4 = str.charAt(i4);
                if (cCharAt4 >= zArr.length || !zArr[cCharAt4]) {
                    break;
                } else {
                    i4++;
                }
            }
            i2 = i3;
        }
        int i9 = length2 - i5;
        if (i9 > 0) {
            int i10 = i9 + length3;
            if (cArr2.length < i10) {
                char[] cArr6 = new char[i10];
                if (length3 > 0) {
                    System.arraycopy(cArr2, 0, cArr6, 0, length3);
                }
                cArr2 = cArr6;
            }
            str.getChars(i5, length2, cArr2, length3);
            length3 = i10;
        }
        str2 = new String(cArr2, 0, length3);
        this.a = str2;
        this.b = !str.startsWith("tag:yaml.org,2002:");
    }

    public final boolean a() {
        return (this.b || q.contains(this)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q3622318280241842965)) {
            return false;
        }
        return this.a.equals(((Q3622318280241842965) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
