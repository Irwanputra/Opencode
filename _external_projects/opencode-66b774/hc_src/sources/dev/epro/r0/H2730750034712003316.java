package dev.epro.r0;

import ads_mobile_sdk.lu2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H2730750034712003316 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2730750034712003316(lu2 lu2Var, R4833348786910499294 r4833348786910499294, F4096073349764486348 f4096073349764486348) {
        super(1, r4833348786910499294);
        this.t = (byte) 1;
        this.v = f4096073349764486348;
        this.w = lu2Var;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new H2730750034712003316(obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new H2730750034712003316((lu2) obj2, (R4833348786910499294) obj, (F4096073349764486348) this.v).invokeSuspend(o9245300239821758723);
            default:
                return new H2730750034712003316(obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.Closeable] */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        T7367429961324727973 t7367429961324727973;
        Throwable th2;
        FileInputStream fileInputStream;
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                J7128855986599981135 j7128855986599981135 = (J7128855986599981135) obj2;
                byte b2 = this.u;
                try {
                } catch (Throwable th3) {
                    I8259692294117767977 c = j7128855986599981135.c();
                    this.v = th3;
                    this.u = (byte) 2;
                    Integer a = c.a();
                    if (a == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                    obj = a;
                    th = th3;
                }
                if (b2 == 0) {
                    E17665849472693074628.k(obj);
                    this.u = (byte) 1;
                    obj = j7128855986599981135.h(true, this);
                    if (obj == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.v;
                        E17665849472693074628.k(obj);
                        t7367429961324727973 = new K4010471808440187464(((Number) obj).intValue(), th);
                        return new H9390398899829886498(t7367429961324727973, Boolean.TRUE);
                    }
                    E17665849472693074628.k(obj);
                }
                t7367429961324727973 = (T7367429961324727973) obj;
                return new H9390398899829886498(t7367429961324727973, Boolean.TRUE);
            case 1:
                lu2 lu2Var = (lu2) obj2;
                byte b3 = this.u;
                if (b3 == 0) {
                    E17665849472693074628.k(obj);
                    F4096073349764486348 f4096073349764486348 = (F4096073349764486348) this.v;
                    this.u = (byte) 1;
                    obj = f4096073349764486348.invoke(this);
                    if (obj == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            E17665849472693074628.k(obj);
                            return O9245300239821758723.a;
                        }
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                long g = E17093345031926825464.g(((E17093345031926825464) obj).a, lu2Var.b());
                this.u = (byte) 2;
                if (lu2.a(g, lu2Var, this) == z3437138737604933638) {
                    return z3437138737604933638;
                }
                return O9245300239821758723.a;
            default:
                D7689865999397106918 d7689865999397106918 = (D7689865999397106918) obj2;
                ?? r0 = this.u;
                try {
                    try {
                        try {
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                Z1953481206310471956.z(r0, th4);
                                throw th5;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        File file = d7689865999397106918.a;
                        C8804068735739007381 c8804068735739007381 = d7689865999397106918.b;
                        if (!file.exists()) {
                            return c8804068735739007381.getDefaultValue();
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(d7689865999397106918.a);
                        try {
                            this.v = fileInputStream2;
                            this.u = (byte) 2;
                            Object readFrom = c8804068735739007381.readFrom(fileInputStream2);
                            if (readFrom == z3437138737604933638) {
                                return z3437138737604933638;
                            }
                            obj = readFrom;
                            fileInputStream = fileInputStream2;
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileInputStream = fileInputStream2;
                            try {
                                throw th2;
                            } catch (Throwable th7) {
                                Z1953481206310471956.z(fileInputStream, th2);
                                throw th7;
                            }
                        }
                    }
                    if (r0 == 0) {
                        E17665849472693074628.k(obj);
                        FileInputStream fileInputStream3 = new FileInputStream(d7689865999397106918.a);
                        C8804068735739007381 c88040687357390073812 = d7689865999397106918.b;
                        this.v = fileInputStream3;
                        this.u = (byte) 1;
                        obj = c88040687357390073812.readFrom(fileInputStream3);
                        r0 = fileInputStream3;
                        if (obj == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    } else {
                        if (r0 != 1) {
                            if (r0 != 2) {
                                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileInputStream = (FileInputStream) this.v;
                            try {
                                E17665849472693074628.k(obj);
                                Z1953481206310471956.z(fileInputStream, null);
                                return obj;
                            } catch (Throwable th8) {
                                th2 = th8;
                                throw th2;
                            }
                        }
                        FileInputStream fileInputStream4 = (FileInputStream) this.v;
                        E17665849472693074628.k(obj);
                        r0 = fileInputStream4;
                    }
                    Z1953481206310471956.z(r0, null);
                    return obj;
                } catch (Exception e) {
                    if (e instanceof FileNotFoundException) {
                        throw Q13169198992966610970.s0(d7689865999397106918.a.getParent(), (FileNotFoundException) e);
                    }
                    throw e;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H2730750034712003316(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.w = obj;
    }
}
