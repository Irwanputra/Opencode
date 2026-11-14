package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B6836344041339734677 implements Parcelable {
    public static final Parcelable.Creator<B6836344041339734677> CREATOR = new A16739659649845694970((byte) 2);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public B6836344041339734677(W10130330342449691688 w10130330342449691688) {
        int size = w10130330342449691688.a.size();
        this.a = new int[size * 6];
        if (!w10130330342449691688.g) {
            S10973172697741180971.m("Not on back stack");
            throw null;
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            M12888013728560752810 m12888013728560752810 = (M12888013728560752810) w10130330342449691688.a.get(i2);
            int i3 = i + 1;
            this.a[i] = m12888013728560752810.a;
            ArrayList arrayList = this.b;
            C13374971588771233833 c13374971588771233833 = m12888013728560752810.b;
            arrayList.add(c13374971588771233833 != null ? c13374971588771233833.e : null);
            int[] iArr = this.a;
            iArr[i3] = m12888013728560752810.c ? 1 : 0;
            iArr[i + 2] = m12888013728560752810.d;
            iArr[i + 3] = m12888013728560752810.e;
            int i4 = i + 5;
            iArr[i + 4] = m12888013728560752810.f;
            i += 6;
            iArr[i4] = m12888013728560752810.g;
            this.c[i2] = m12888013728560752810.h.ordinal();
            this.d[i2] = m12888013728560752810.i.ordinal();
        }
        this.e = w10130330342449691688.f;
        this.f = w10130330342449691688.h;
        this.g = w10130330342449691688.r;
        this.h = w10130330342449691688.i;
        this.i = w10130330342449691688.j;
        this.j = w10130330342449691688.k;
        this.k = w10130330342449691688.l;
        this.l = w10130330342449691688.m;
        this.m = w10130330342449691688.n;
        this.n = w10130330342449691688.f550o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public B6836344041339734677(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
