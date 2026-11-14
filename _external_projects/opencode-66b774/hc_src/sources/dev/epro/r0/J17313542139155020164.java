package dev.epro.r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J17313542139155020164 extends N3901745123707141715 {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public J17313542139155020164(P16318072974459194610 p16318072974459194610, IBinder iBinder) {
        this.c = iBinder;
        this.d = p16318072974459194610;
    }

    @Override // dev.epro.r0.N3901745123707141715
    public final void b() {
        E17780051485341276699 j16132835055968791970;
        String str;
        byte b = this.b;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                K12238100791927223227 k12238100791927223227 = (K12238100791927223227) ((P16318072974459194610) obj).b;
                O12545633033254628644 o12545633033254628644 = k12238100791927223227.i;
                ArrayList arrayList = k12238100791927223227.d;
                P8755783434649014957 p8755783434649014957 = k12238100791927223227.b;
                IBinder iBinder = (IBinder) obj2;
                o12545633033254628644.getClass();
                int i2 = G6351063419681843157.j;
                if (iBinder == null) {
                    j16132835055968791970 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    j16132835055968791970 = queryLocalInterface instanceof E17780051485341276699 ? (E17780051485341276699) queryLocalInterface : new J16132835055968791970(iBinder);
                }
                k12238100791927223227.n = j16132835055968791970;
                p8755783434649014957.getClass();
                try {
                    ((J16132835055968791970) k12238100791927223227.n).a.linkToDeath(k12238100791927223227.k, 0);
                } catch (RemoteException unused) {
                }
                k12238100791927223227.g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((Runnable) obj3).run();
                }
                arrayList.clear();
                break;
            default:
                Context context = (Context) obj2;
                M17133811648581684718 m17133811648581684718 = ((S8093187219740136623) obj).c;
                P8755783434649014957 p87557834346490149572 = J5028754453798210355.a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        P8755783434649014957 p87557834346490149573 = J5028754453798210355.a;
                        if (signatureArr == null || (signatureArr.length) == 0) {
                            p87557834346490149573.getClass();
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Signature signature : signatureArr) {
                                byte[] byteArray = signature.toByteArray();
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                    messageDigest.update(byteArray);
                                    str = Base64.encodeToString(messageDigest.digest(), 11);
                                } catch (NoSuchAlgorithmException unused2) {
                                    str = "";
                                }
                                arrayList2.add(str);
                                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                                    String str2 = Build.TAGS;
                                    if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                                    }
                                }
                                i = packageInfo.versionCode;
                            }
                            StringBuilder sb = new StringBuilder();
                            Iterator it = arrayList2.iterator();
                            if (it.hasNext()) {
                                while (true) {
                                    sb.append((CharSequence) it.next());
                                    if (it.hasNext()) {
                                        sb.append((CharSequence) ", ");
                                    }
                                }
                            }
                            p87557834346490149573.getClass();
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                }
                m17133811648581684718.b(Integer.valueOf(i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J17313542139155020164(S8093187219740136623 s8093187219740136623, M17133811648581684718 m17133811648581684718, Context context) {
        super(m17133811648581684718);
        this.c = context;
        this.d = s8093187219740136623;
    }
}
