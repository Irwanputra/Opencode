package dev.epro.r0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G16655509873589283974 extends R14062301455140331524 implements F4096073349764486348 {
    public FileOutputStream t;
    public FileOutputStream u;
    public boolean v;
    public final /* synthetic */ G6679190287479383402 w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G16655509873589283974(G6679190287479383402 g6679190287479383402, Object obj, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.w = g6679190287479383402;
        this.x = obj;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        return new G16655509873589283974(this.w, this.x, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        G6679190287479383402 g6679190287479383402 = this.w;
        File file = g6679190287479383402.a;
        boolean z = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        try {
            if (!z) {
                E17665849472693074628.k(obj);
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                Object obj2 = this.x;
                try {
                    C8804068735739007381 c8804068735739007381 = g6679190287479383402.b;
                    Z11123542482871484238 z11123542482871484238 = new Z11123542482871484238(fileOutputStream3);
                    this.t = fileOutputStream3;
                    this.u = fileOutputStream3;
                    this.v = true;
                    c8804068735739007381.writeTo(obj2, z11123542482871484238);
                    Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                    if (o9245300239821758723 == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                    fileOutputStream = fileOutputStream3;
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } else {
                if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileOutputStream2 = this.u;
                fileOutputStream = this.t;
                try {
                    E17665849472693074628.k(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        Z1953481206310471956.z(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            Z1953481206310471956.z(fileOutputStream, null);
            return o9245300239821758723;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw Q13169198992966610970.s0(file.getParent(), (FileNotFoundException) e);
            }
            throw e;
        }
    }
}
