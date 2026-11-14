package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class N3276714816608185757 extends E3422549137300678133 {
    public final /* synthetic */ byte p;

    public /* synthetic */ N3276714816608185757(byte b) {
        this.p = b;
    }

    @Override // dev.epro.r0.E3422549137300678133
    public Intent O(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.p) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType("application/octet-stream").putExtra("android.intent.extra.TITLE", str);
                putExtra.getClass();
                return putExtra;
            case 1:
                return f0(context, (String[]) obj);
            case 2:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 3:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra2.getClass();
                return putExtra2;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
                putExtra3.getClass();
                return putExtra3;
            case 5:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return intent2;
            default:
                X11530728323241563344 x11530728323241563344 = (X11530728323241563344) obj;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent4 = x11530728323241563344.b;
                if (intent4 != null && (bundleExtra = intent4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        x11530728323241563344 = new X11530728323241563344(x11530728323241563344.a, null, x11530728323241563344.c, x11530728323241563344.d);
                    }
                }
                intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", x11530728323241563344);
                return intent3;
        }
    }

    @Override // dev.epro.r0.E3422549137300678133
    public Z6787503239643758223 U(Context context, Object obj) {
        switch (this.p) {
            case 0:
                ((String) obj).getClass();
                return null;
            case 1:
                ((String[]) obj).getClass();
                return null;
            case 2:
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new Z6787503239643758223(X9852054718446117252.a);
                }
                for (String str : strArr) {
                    if (B5998207562248239613.l(context, str) != 0) {
                        return null;
                    }
                }
                int u0 = E4951175994894594588.u0(strArr.length);
                if (u0 < 16) {
                    u0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(u0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new Z6787503239643758223(linkedHashMap);
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                if (B5998207562248239613.l(context, str3) == 0) {
                    return new Z6787503239643758223(Boolean.TRUE);
                }
                return null;
            default:
                return super.U(context, obj);
        }
    }

    @Override // dev.epro.r0.E3422549137300678133
    public final Object Z(Intent intent, int i) {
        boolean z = false;
        switch (this.p) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 2:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 3:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        break;
                    }
                }
                break;
            case 4:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (intArrayExtra2[i3] == 0) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    break;
                }
        }
        return new H15446768409112154310(intent, i);
    }

    public Intent f0(Context context, String[] strArr) {
        strArr.getClass();
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        type.getClass();
        return type;
    }
}
