package dev.epro.r0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H12008688365557887712 extends X8326129805829997012 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public H12008688365557887712(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new O827298036535440209(0), new O827298036535440209(0), new O827298036535440209(0));
    }

    @Override // dev.epro.r0.X8326129805829997012
    public final H12008688365557887712 a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new H12008688365557887712(parcel, iDataPosition, i, G6547577305291411977.u(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // dev.epro.r0.X8326129805829997012
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 >= this.g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
    }

    @Override // dev.epro.r0.X8326129805829997012
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public H12008688365557887712(Parcel parcel, int i, int i2, String str, O827298036535440209 o827298036535440209, O827298036535440209 o8272980365354402092, O827298036535440209 o8272980365354402093) {
        super(o827298036535440209, o8272980365354402092, o8272980365354402093);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
