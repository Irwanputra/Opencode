package dev.epro.r0;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I3522225526927885074 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public I3522225526927885074(C9313471898943472652 c9313471898943472652, ArrayList arrayList) {
        this.a = (byte) 0;
        this.b = c9313471898943472652;
        this.c = arrayList;
        this.d = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((ArrayList) this.d).add(MessageDigest.getInstance(((H8778342479554112647) obj).a.b));
            } catch (NoSuchAlgorithmException e) {
                Q11088980322693754445.k(e);
                throw null;
            }
        }
        this.e = new F6942723054099263096((MessageDigest[]) ((ArrayList) this.d).toArray(new MessageDigest[0]), (byte) 21);
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                F6942723054099263096 f6942723054099263096 = (F6942723054099263096) obj;
                C9313471898943472652 c9313471898943472652 = (C9313471898943472652) obj4;
                byte[] bArr = new byte[5];
                bArr[0] = -91;
                try {
                    Y16414919402539525744 y16414919402539525744 = c9313471898943472652.get();
                    while (y16414919402539525744 != null) {
                        try {
                            ByteBuffer byteBuffer = (ByteBuffer) y16414919402539525744.c;
                            int i = y16414919402539525744.b;
                            if (i > 1048576) {
                                throw new RuntimeException("Chunk size greater than expected: " + i);
                            }
                            V933048422416352811.J(i, bArr);
                            f6942723054099263096.c(0, bArr, 5);
                            f6942723054099263096.b(byteBuffer);
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                H8778342479554112647 h8778342479554112647 = (H8778342479554112647) arrayList.get(i2);
                                MessageDigest messageDigest = (MessageDigest) ((ArrayList) obj2).get(i2);
                                byte[] bArr2 = h8778342479554112647.c;
                                byte b2 = h8778342479554112647.b;
                                int digest = messageDigest.digest(bArr2, (y16414919402539525744.a * b2) + 5, b2);
                                if (digest != b2) {
                                    throw new RuntimeException("Unexpected output size of " + h8778342479554112647.a + " digest: " + digest);
                                }
                            }
                            y16414919402539525744 = c9313471898943472652.b(byteBuffer);
                        } catch (DigestException e) {
                            e = e;
                            Q11088980322693754445.k(e);
                            return;
                        }
                    }
                    return;
                } catch (IOException | DigestException e2) {
                    e = e2;
                }
            case 1:
                T16502368487833955839 t16502368487833955839 = (T16502368487833955839) ((H12843822278061842084) obj).b;
                I4217019646703278835 i4217019646703278835 = (I4217019646703278835) obj3;
                A15735106322894363321 a15735106322894363321 = (A15735106322894363321) obj4;
                if (a15735106322894363321 != null) {
                    t16502368487833955839.z = true;
                    a15735106322894363321.b.c(false);
                    t16502368487833955839.z = false;
                }
                if (i4217019646703278835.isEnabled() && i4217019646703278835.hasSubMenu()) {
                    ((T8605657386197958581) obj2).q(i4217019646703278835, null, 4);
                    return;
                }
                return;
            case 2:
                V7994488537893142047.i((View) obj4, (Q12598757537405990809) obj3, (V10300877997588547986) obj2);
                ((ValueAnimator) obj).start();
                return;
            case 3:
                ((Activity) obj4).startActivityForResult(C468629748621011703.y((String) obj3, (String) obj2, (Map) obj), 0);
                return;
            default:
                R2847330884077978889 r2847330884077978889 = (R2847330884077978889) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                Bundle bundle = (Bundle) obj;
                try {
                    T8664623300549140039 t8664623300549140039 = (T8664623300549140039) ((IInterface) r2847330884077978889.b.j);
                    if (t8664623300549140039 == null) {
                        return;
                    }
                    ((V18155119740721705968) t8664623300549140039).e(r2847330884077978889.a.getPackageName(), str, str2, bundle, r2847330884077978889.d);
                    return;
                } catch (DeadObjectException | RemoteException unused) {
                    return;
                }
        }
    }

    public I3522225526927885074(H12843822278061842084 h12843822278061842084, A15735106322894363321 a15735106322894363321, I4217019646703278835 i4217019646703278835, T8605657386197958581 t8605657386197958581) {
        this.a = (byte) 1;
        this.e = h12843822278061842084;
        this.b = a15735106322894363321;
        this.c = i4217019646703278835;
        this.d = t8605657386197958581;
    }

    public /* synthetic */ I3522225526927885074(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
