package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6836344041339734677 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<dev.epro.r0.B6836344041339734677> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 2);
    public final int[] a;
    public final java.util.ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final java.lang.String f;
    public final int g;
    public final int h;
    public final java.lang.CharSequence i;
    public final int j;
    public final java.lang.CharSequence k;
    public final java.util.ArrayList l;
    public final java.util.ArrayList m;
    public final boolean n;

    public B6836344041339734677(dev.epro.r0.W10130330342449691688 w10130330342449691688) {
        int size = w10130330342449691688.a.size();
        this.a = new int[size * 6];
        if (!w10130330342449691688.g) {
            dev.epro.r0.S10973172697741180971.m("Not on back stack");
            throw null;
        }
        this.b = new java.util.ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dev.epro.r0.M12888013728560752810 m12888013728560752810 = (dev.epro.r0.M12888013728560752810) w10130330342449691688.a.get(i2);
            int i3 = i + 1;
            this.a[i] = m12888013728560752810.a;
            java.util.ArrayList arrayList = this.b;
            dev.epro.r0.C13374971588771233833 c13374971588771233833 = m12888013728560752810.b;
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
        this.n = w10130330342449691688.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        android.text.TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        android.text.TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public B6836344041339734677(android.os.Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        android.os.Parcelable.Creator creator = android.text.TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
