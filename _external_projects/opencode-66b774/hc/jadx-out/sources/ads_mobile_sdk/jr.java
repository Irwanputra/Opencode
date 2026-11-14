package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.H5336160545165318150;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class jr extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr(Intent intent, byte b) {
        super(1);
        this.i = b;
        this.a = intent;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.i;
        Intent intent = this.a;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return intent.setData(Uri.parse(str));
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                return intent.setAction(str2);
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                return intent.setType(str3);
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                return intent.setPackage(str4);
            default:
                String str5 = (String) obj;
                str5.getClass();
                String[] strArr = (String[]) new H5336160545165318150("/").i(2, str5).toArray(new String[0]);
                if (strArr.length == 2) {
                    intent.setComponent(new ComponentName(strArr[0], strArr[1]));
                }
                return O9245300239821758723.a;
        }
    }
}
