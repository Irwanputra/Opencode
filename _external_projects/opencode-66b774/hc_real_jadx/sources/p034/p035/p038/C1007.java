package p034.p035.p038;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p034.p035.p040.C1027;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1066;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1007 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public ConcurrentHashMap<Long, C1062> f5384 = new ConcurrentHashMap<>();

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.いいにぽつ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1008<T> {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        boolean mo2346(T t);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        int mo2347(T t);
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1009 implements InterfaceC1008<C1027.C1029> {
        public C1009(C1007 c1007) {
        }

        @Override // p034.p035.p038.C1007.InterfaceC1008
        /* renamed from: 〺つふすそ */
        public boolean mo2346(C1027.C1029 c1029) {
            return c1029.f5437;
        }

        @Override // p034.p035.p038.C1007.InterfaceC1008
        /* renamed from: げつ〴ぬぐ */
        public int mo2347(C1027.C1029 c1029) {
            return c1029.f5434;
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static long m2342(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static <T> T m2343(T[] tArr, int i, InterfaceC1008<T> interfaceC1008) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC1008.mo2347(t2) - i2) * 2) + (interfaceC1008.mo2346(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: 〺つふすそ */
    public Typeface mo2333(Context context, CancellationSignal cancellationSignal, C1027.C1029[] c1029Arr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c1029Arr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2345(c1029Arr, i).f5435);
            try {
                Typeface mo2344 = mo2344(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return mo2344;
            } catch (IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Typeface mo2344(Context context, InputStream inputStream) {
        File m4780 = C2786.m4780(context);
        if (m4780 == null) {
            return null;
        }
        try {
            if (C2786.m4823(m4780, inputStream)) {
                return Typeface.createFromFile(m4780.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4780.delete();
        }
    }

    /* renamed from: げつ〴ぬぐ */
    public Typeface mo2336(Context context, C1062 c1062, Resources resources, int i) {
        C1066 c1066 = (C1066) m2343(c1062.f5512, i, new C1021(this));
        if (c1066 == null) {
            return null;
        }
        Typeface m2362 = C1019.m2362(context, resources, c1066.f5525, c1066.f5523, i);
        long m2342 = m2342(m2362);
        if (m2342 != 0) {
            this.f5384.put(Long.valueOf(m2342), c1062);
        }
        return m2362;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1027.C1029 mo2345(C1027.C1029[] c1029Arr, int i) {
        return (C1027.C1029) m2343(c1029Arr, i, new C1009(this));
    }

    /* renamed from: びぐびあび */
    public Typeface mo2339(Context context, Resources resources, int i, String str, int i2) {
        File m4780 = C2786.m4780(context);
        if (m4780 == null) {
            return null;
        }
        try {
            if (C2786.m4801(m4780, resources, i)) {
                return Typeface.createFromFile(m4780.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4780.delete();
        }
    }
}
