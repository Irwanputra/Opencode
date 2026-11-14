package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(dev.epro.r0.X8326129805829997012 x8326129805829997012) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        java.lang.Object objG = remoteActionCompat.a;
        boolean z = true;
        if (x8326129805829997012.e(1)) {
            objG = x8326129805829997012.g();
        }
        remoteActionCompat.a = (androidx.core.graphics.drawable.IconCompat) objG;
        java.lang.CharSequence charSequence = remoteActionCompat.b;
        if (x8326129805829997012.e(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((dev.epro.r0.H12008688365557887712) x8326129805829997012).e);
        }
        remoteActionCompat.b = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.c;
        if (x8326129805829997012.e(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((dev.epro.r0.H12008688365557887712) x8326129805829997012).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (android.app.PendingIntent) x8326129805829997012.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (x8326129805829997012.e(5)) {
            z2 = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!x8326129805829997012.e(6)) {
            z = z3;
        } else if (((dev.epro.r0.H12008688365557887712) x8326129805829997012).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, dev.epro.r0.X8326129805829997012 x8326129805829997012) {
        x8326129805829997012.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.a;
        x8326129805829997012.h(1);
        x8326129805829997012.i(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.b;
        x8326129805829997012.h(2);
        android.os.Parcel parcel = ((dev.epro.r0.H12008688365557887712) x8326129805829997012).e;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.c;
        x8326129805829997012.h(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        android.app.PendingIntent pendingIntent = remoteActionCompat.d;
        x8326129805829997012.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        x8326129805829997012.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        x8326129805829997012.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
