package dev.epro.r0;

import android.content.Context;
import android.os.IInterface;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class U11129707225609510868 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ P17112279574965248524 b;

    public /* synthetic */ U11129707225609510868(P17112279574965248524 p17112279574965248524, byte b) {
        this.a = b;
        this.b = p17112279574965248524;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        P17112279574965248524 p17112279574965248524 = this.b;
        switch (b) {
            case 0:
                if (((IInterface) p17112279574965248524.j) != null) {
                    Context context = (Context) p17112279574965248524.c;
                    P16318072974459194610 p16318072974459194610 = (P16318072974459194610) p17112279574965248524.i;
                    p16318072974459194610.getClass();
                    context.unbindService(p16318072974459194610);
                    p17112279574965248524.a = false;
                    p17112279574965248524.j = null;
                    p17112279574965248524.i = null;
                    ArrayList arrayList = (ArrayList) p17112279574965248524.d;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    p17112279574965248524.b();
                    return;
                }
                return;
            default:
                if (((IInterface) p17112279574965248524.j) != null) {
                    p17112279574965248524.j = null;
                    p17112279574965248524.b();
                    return;
                }
                return;
        }
    }
}
