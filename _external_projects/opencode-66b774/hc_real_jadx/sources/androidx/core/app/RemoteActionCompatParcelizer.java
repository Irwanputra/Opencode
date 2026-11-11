package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p034.p077.AbstractC1484;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1484 abstractC1484) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1045;
        if (abstractC1484.mo3230(1)) {
            obj = abstractC1484.m3231();
        }
        remoteActionCompat.f1045 = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1043;
        if (abstractC1484.mo3230(2)) {
            charSequence = abstractC1484.mo3215();
        }
        remoteActionCompat.f1043 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1044;
        if (abstractC1484.mo3230(3)) {
            charSequence2 = abstractC1484.mo3215();
        }
        remoteActionCompat.f1044 = charSequence2;
        remoteActionCompat.f1048 = (PendingIntent) abstractC1484.m3234(remoteActionCompat.f1048, 4);
        boolean z = remoteActionCompat.f1046;
        if (abstractC1484.mo3230(5)) {
            z = abstractC1484.mo3227();
        }
        remoteActionCompat.f1046 = z;
        boolean z2 = remoteActionCompat.f1047;
        if (abstractC1484.mo3230(6)) {
            z2 = abstractC1484.mo3227();
        }
        remoteActionCompat.f1047 = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1484 abstractC1484) {
        abstractC1484.getClass();
        IconCompat iconCompat = remoteActionCompat.f1045;
        abstractC1484.mo3219(1);
        abstractC1484.m3236(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1043;
        abstractC1484.mo3219(2);
        abstractC1484.mo3228(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1044;
        abstractC1484.mo3219(3);
        abstractC1484.mo3228(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1048;
        abstractC1484.mo3219(4);
        abstractC1484.mo3223(pendingIntent);
        boolean z = remoteActionCompat.f1046;
        abstractC1484.mo3219(5);
        abstractC1484.mo3220(z);
        boolean z2 = remoteActionCompat.f1047;
        abstractC1484.mo3219(6);
        abstractC1484.mo3220(z2);
    }
}
