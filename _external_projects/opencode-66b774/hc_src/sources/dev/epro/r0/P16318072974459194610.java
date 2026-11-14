package dev.epro.r0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P16318072974459194610 implements ServiceConnection {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ P16318072974459194610(K12238100791927223227 k12238100791927223227) {
        Objects.requireNonNull(k12238100791927223227);
        this.b = k12238100791927223227;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                K12238100791927223227 k12238100791927223227 = (K12238100791927223227) obj;
                k12238100791927223227.b.getClass();
                k12238100791927223227.a().post(new J17313542139155020164(this, iBinder));
                break;
            default:
                ((P17112279574965248524) obj).c(new I3863025946240164840(this, iBinder, (byte) 23));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                K12238100791927223227 k12238100791927223227 = (K12238100791927223227) obj;
                k12238100791927223227.b.getClass();
                k12238100791927223227.a().post(new D3626849491593542492(this));
                break;
            default:
                ((P17112279574965248524) obj).c(new U3594978070141619353((Object) this, (byte) 18));
                break;
        }
    }

    public /* synthetic */ P16318072974459194610(P17112279574965248524 p17112279574965248524) {
        this.b = p17112279574965248524;
    }
}
