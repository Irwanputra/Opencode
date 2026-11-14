package dev.epro.r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z14196540908352053240 {
    public static final P5733283974459951585 a;

    static {
        P5733283974459951585 p5733283974459951585 = new P5733283974459951585((byte) 16);
        G11450220448113054352.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PhoneskyVerificationUtils");
        a = p5733283974459951585;
    }

    public static boolean a(Context context) {
        String strEncodeToString;
        P5733283974459951585 p5733283974459951585 = a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        p5733283974459951585.getClass();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            byte[] byteArray = signature.toByteArray();
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(byteArray);
                                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                            } catch (NoSuchAlgorithmException unused) {
                                strEncodeToString = "";
                            }
                            arrayList.add(strEncodeToString);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                return true;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ", ");
                            }
                        }
                        p5733283974459951585.getClass();
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    p5733283974459951585.getClass();
                }
            } else {
                p5733283974459951585.getClass();
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            p5733283974459951585.getClass();
        }
        return false;
    }
}
