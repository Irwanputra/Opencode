package dev.epro.r0;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F4673815160636847046 extends Binder implements Q2763870222729229562 {
    public final Handler a;
    public final /* synthetic */ I3887072968740112330 b;

    public F4673815160636847046(I3887072968740112330 i3887072968740112330) {
        this.b = i3887072968740112330;
        attachInterface(this, Q2763870222729229562.Ro);
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = Q2763870222729229562.Ro;
        byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        byte b2 = 0;
        Handler handler = this.a;
        I3887072968740112330 i3887072968740112330 = this.b;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new F3433091394670544721(this, readInt, bundle));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Z12547059477375952878(this, readString, bundle2, b2));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Q8579767428416174170(this, bundle3, b));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Z12547059477375952878(this, readString2, bundle4, b));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) C12265524002282074474.a0(parcel, Uri.CREATOR);
                boolean z = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new I3863025946240164840(this, readInt2, uri, z, bundle5));
                    return true;
                }
                return true;
            case 7:
                String readString3 = parcel.readString();
                if (i3887072968740112330 != null) {
                    i3887072968740112330.extraCallbackWithResult(readString3);
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new I3863025946240164840(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Q8579767428416174170(this, bundle7, (byte) 2));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Q8579767428416174170(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Q8579767428416174170(this, bundle9, (byte) 4));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) C12265524002282074474.a0(parcel, Bundle.CREATOR);
                if (i3887072968740112330 != null) {
                    handler.post(new Q8579767428416174170(this, bundle10, b2));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
