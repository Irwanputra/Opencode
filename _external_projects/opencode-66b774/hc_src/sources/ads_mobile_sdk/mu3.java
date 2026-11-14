package ads_mobile_sdk;

import dev.epro.r0.C468629748621011703;
import dev.epro.r0.F15751422393861875968;
import dev.epro.r0.N2553658702658867020;
import dev.epro.r0.R12517428114166698439;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mu3 implements R12517428114166698439 {
    public final Serializable a;
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    public mu3(int[] iArr, int i) {
        int d = C468629748621011703.d(((~480298490) & 1376520936) | 743765285, (480298490 & 1378459336) | 569504804, -451892186, 1172755590) ^ (496987743 % 159259470);
        int length = iArr.length;
        if (length == d) {
            this.b = i;
            this.a = iArr;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44);
        String a = xt3.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k");
        String a2 = xt3.a("a0CvvBEaN339T0zNlXk=");
        sb.append(a);
        sb.append(length);
        sb.append(a2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void a(int i, byte[] bArr) {
        int i2 = 1777080124;
        int i3 = 1777080124;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        int i13 = 0;
        char c2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c3 = 0;
        while (true) {
            if (i3 == 719824015) {
                int i17 = (-235787554) + i3;
                i3 += 799411447;
                if (i4 == i5) {
                    i3 = i17;
                }
            } else if (i3 == 1519235462) {
                int[] iArr = (int[]) this.a;
                i7 += (((i6 << i8) ^ (i6 >>> i9)) + i6) ^ (i4 + iArr[i4 & i10]);
                i4 += i11;
                i6 += (iArr[(i4 >>> i12) & i10] + i4) ^ (((i7 << i8) ^ (i7 >>> i9)) + i7);
                i3 -= 799411447;
            } else {
                if (i3 != i2) {
                    bArr[0] = (byte) (i7 >> i16);
                    bArr[1] = (byte) ((((i7 >> i15) & i13) << i16) >> i16);
                    bArr[c3] = (byte) ((((i7 >> i14) & i13) << i16) >> i16);
                    bArr[i10] = (byte) (((i7 & i13) << i16) >> i16);
                    bArr[i8] = (byte) (i6 >> i16);
                    bArr[i9] = (byte) ((((i6 >> i15) & i13) << i16) >> i16);
                    bArr[c2] = (byte) ((((i6 >> i14) & i13) << i16) >> i16);
                    bArr[c] = (byte) (((i6 & i13) << i16) >> i16);
                    return;
                }
                i5 = C468629748621011703.d(1447011278, -1395425889, 328319491, 94255812) ^ 154407182;
                i7 = this.b;
                i3 -= 1057256109;
                i8 = 4;
                i9 = 5;
                i10 = 3;
                i11 = 1340169305;
                i12 = 11;
                i16 = 24;
                i13 = 255;
                c3 = 2;
                c2 = 6;
                c = 7;
                i15 = 16;
                i14 = 8;
                i6 = i;
                i4 = 0;
            }
            i2 = 1777080124;
        }
    }

    @Override // dev.epro.r0.R12517428114166698439
    public int getAmount() {
        return this.b;
    }

    @Override // dev.epro.r0.R12517428114166698439
    public String getType() {
        return (String) this.a;
    }

    public mu3() {
        int[] iArr = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
        int i = iArr[7] % iArr[8];
        this.a = new ArrayList();
        this.b = 0;
    }

    public mu3(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public int a(long j) {
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int d = C468629748621011703.d((i2 & (~i)) | iArr[2], (i & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = j >= 0 ? (this.b + d) - j : (((((((~j2) & j3) | j4) + ((j2 & j5) | jArr[4])) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8])) + (-j);
        if (j6 < 0 || j6 >= this.b) {
            throw new F15751422393861875968();
        }
        return (int) j6;
    }

    public void a(vu3 vu3Var) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int d = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i5 = this.b;
        if (i5 >= d) {
            throw new N2553658702658867020();
        }
        ArrayList arrayList = (ArrayList) this.a;
        if (i5 == arrayList.size()) {
            arrayList.add(vu3Var);
        } else {
            arrayList.set(this.b, vu3Var);
        }
        this.b++;
    }

    public vu3 a() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int d = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i5 = this.b;
        if (i5 <= 0) {
            throw new F15751422393861875968();
        }
        ArrayList arrayList = (ArrayList) this.a;
        vu3 vu3Var = (vu3) arrayList.get(i5 + d);
        arrayList.set(this.b + d, null);
        this.b += d;
        return vu3Var;
    }
}
