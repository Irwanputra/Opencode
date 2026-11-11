package team.dev.epro.apkcustom.widgets;

import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SystemNative {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final String[] f4204;

    static {
        System.loadLibrary(Crypt.a(Crypt.xrc("MbiH3=\u001a3jNknA0i\u001ej;Hen\u001cbfO3g@`oK1")));
        f4204 = new String[]{Crypt.a(Crypt.xrc("KdoLcg\u001ca:\u0019gf\u00193;\u001c4h\u001a1fL0;\u001ek:\u001ed=Md")), Crypt.a(Crypt.xrc("Iei\u001ae;\u001bfl@e9Lc:\u00190=Kkf\u00193gNb;J1l\u001c39JehN6;\u001d1>\u001acgJeiO7<L`nN0;Af=Ic>\u0019")), Crypt.a(Crypt.xrc("Jbf\u00197oN3i@enH0>I6m\u001a3;\u0019eiA7o\u001a0g\u001ak")), Crypt.a(Crypt.xrc("JjhA6mJggI1l\u001affJd:\u001cckKkjI7hNfjH0g\u001dboOe>A6i\u001c7h\u0019e9O3lJa>\u001d1=@gm\u00190jL"))};
    }

    public static native String getCpuinfo();

    public static native boolean isMagiskPresentNative();
}
