package p000.p001.p004;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import p000.EnumC0721;
import p000.p001.C0629;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0627 extends C0626 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Class<?> f4332;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Method f4333;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Method f4334;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Class<?> f4335;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Method f4336;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0628 implements InvocationHandler {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f4337;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public String f4338;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<String> f4339;

        public C0628(List<String> list) {
            this.f4339 = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C0629.f4341;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f4337 = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f4339;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f4338 = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj2 = this.f4339.get(0);
                    break;
                }
                if (this.f4339.contains(list.get(i))) {
                    obj2 = list.get(i);
                    break;
                }
                i++;
            }
            String str = (String) obj2;
            this.f4338 = str;
            return str;
        }
    }

    public C0627(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f4333 = method;
        this.f4336 = method2;
        this.f4334 = method3;
        this.f4335 = cls;
        this.f4332 = cls2;
    }

    @Override // p000.p001.p004.C0626
    @Nullable
    /* renamed from: 〳ぜぞぜべっ */
    public String mo1781(SSLSocket sSLSocket) {
        try {
            C0628 c0628 = (C0628) Proxy.getInvocationHandler(this.f4336.invoke(null, sSLSocket));
            boolean z = c0628.f4337;
            if (!z && c0628.f4338 == null) {
                C0626.f4331.mo1793(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return c0628.f4338;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0629.m1812("unable to get selected protocol", e);
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: げつ〴ぬぐ */
    public void mo1802(SSLSocket sSLSocket) {
        try {
            this.f4334.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0629.m1812("unable to remove alpn", e);
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: づざかべべ */
    public void mo1784(SSLSocket sSLSocket, String str, List<EnumC0721> list) {
        try {
            this.f4333.invoke(null, sSLSocket, Proxy.newProxyInstance(C0626.class.getClassLoader(), new Class[]{this.f4335, this.f4332}, new C0628(C0626.m1800(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0629.m1812("unable to set alpn", e);
        }
    }
}
