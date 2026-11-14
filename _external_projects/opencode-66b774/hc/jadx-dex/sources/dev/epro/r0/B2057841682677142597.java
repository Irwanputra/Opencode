package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B2057841682677142597 extends dev.epro.r0.V2692587811920101313 {
    public static final android.os.Parcelable.Creator<dev.epro.r0.B2057841682677142597> CREATOR = new dev.epro.r0.P18169153813687183597((byte) 2);
    public int c;
    public boolean d;

    public B2057841682677142597(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
