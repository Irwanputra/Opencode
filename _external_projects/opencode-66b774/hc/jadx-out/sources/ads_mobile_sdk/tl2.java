package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import dev.epro.r0.W4415201450379021245;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tl2 {
    public static final d62 c = new d62();
    public static final Intent d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    public final k33 a;
    public final String b;

    public tl2(Context context) {
        int i;
        boolean z;
        String strEncodeToString;
        d62 d62Var = jf2.a;
        try {
            z = context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
            if (!z) {
                d62Var.getClass();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            d62Var.getClass();
        }
        if (z) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || signatureArr.length == 0) {
                    d62Var.getClass();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused2) {
                            strEncodeToString = "";
                        }
                        arrayList.add(strEncodeToString);
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        this.a = new k33(context.getApplicationContext(), c, d, new W4415201450379021245());
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ", ");
                            }
                        }
                    }
                    d62Var.getClass();
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                d62Var.getClass();
            }
            this.a = null;
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
}
