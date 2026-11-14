package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import dev.epro.r0.H12008688365557887712;
import dev.epro.r0.Q4740749949665887008;
import dev.epro.r0.X8326129805829997012;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(X8326129805829997012 x8326129805829997012) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Q4740749949665887008 q4740749949665887008 = remoteActionCompat.a;
        boolean z = true;
        if (x8326129805829997012.e(1)) {
            q4740749949665887008 = x8326129805829997012.g();
        }
        remoteActionCompat.a = (IconCompat) q4740749949665887008;
        CharSequence charSequence = remoteActionCompat.b;
        if (x8326129805829997012.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((H12008688365557887712) x8326129805829997012).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (x8326129805829997012.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((H12008688365557887712) x8326129805829997012).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) x8326129805829997012.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (x8326129805829997012.e(5)) {
            z2 = ((H12008688365557887712) x8326129805829997012).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!x8326129805829997012.e(6)) {
            z = z3;
        } else if (((H12008688365557887712) x8326129805829997012).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, X8326129805829997012 x8326129805829997012) {
        x8326129805829997012.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        x8326129805829997012.h(1);
        x8326129805829997012.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        x8326129805829997012.h(2);
        Parcel parcel = ((H12008688365557887712) x8326129805829997012).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        x8326129805829997012.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
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
