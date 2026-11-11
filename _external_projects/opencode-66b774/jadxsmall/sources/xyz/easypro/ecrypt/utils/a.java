package xyz.easypro.ecrypt.utils;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    public Context a;
    public Class<?> b;
    public WeakReference<?> c;

    public a(Context context) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = context;
        try {
            Class<?> cls = Class.forName(Crypt.xrc("\u0019<;\n=6\u001c|>\b\"q91+\u0011$6\f+\u000b\u0010 :\u00196"));
            Object invoke = cls.getDeclaredMethod(Crypt.xrc("\u001b'-\n71\f\u0013<\f;)\u0011&&,:-\u001d3;"), new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(Crypt.xrc("\u0015\u0002>\u001b9>\u001f7,"));
            declaredField.setAccessible(true);
            this.c = (WeakReference) ((Map) declaredField.get(invoke)).get(context.getPackageName());
            this.b = Class.forName(Crypt.xrc("\u0019<;\n=6\u001c|>\b\"q4=>\u001c7;9\"4"));
        } catch (Exception unused) {
            throw new RuntimeException(Crypt.xrc("4=>\u001cr;\u001d*\u007f\u001d<<\n+/\f;0\u0016r:\n 0\n"));
        }
    }

    public static String c(String str) {
        try {
            char[] cArr = {'y', '}', 193, 186, 133, 184, 'u', 169, 28, 171, '%', '.', 'd', 65513, 168, 65513, 'c', 'v', 219, '5', 186, 11, 26, 0, 154, 186, '3', 209, '\"', 212, ' ', 143, '|', 141, 203, 'z', 157, '5', 230, 131, 172, 65510, 27, 2, '{', 'q', 65493, 162, 'K', 6, 'T', 65518, 133, 209, 219, 180, '}', 141, 205, 143, 178, 65516, 221, 160, 25, 65528, 178, '<', 222, 218, 21, 225, 'K', '|', 65521, '}', 'T', '\t', 65481, 65514, 181, '9', 175, 65521, '3', 128, 219, 177, 7, 65526, 229, 'L', 214, 65521, 199, 189, 65526, '?', 207, 186, '2', 'W', '~', '6', 203, 170, 192, 4, 169, '~', 65524, '&', 216, 240, 137, 'u', '%', 65491, 65515, '9', 138, '0', 'C', '<', 241, 174, 5, 216, 'L', 218, 23, 'y', 195, 'f', 187, 17, 'p', 'm', 65508, 215, ';', 65529, 'b', 203, 151, 19, 191, 180, 207, 211, 218, 176, 140, 224, 65529, 65534, 65524, 'h', 65456, '>', 241, 239, 'R', 'b', 131, '5', 19, '\b', '\'', 'e', 'b', 'S', ',', 208, 224, 152, 26, 0, '%', 'F', 182, 24, 145, '<', 152, 161, '{', 65511, 22, 'b', 231, 11, 65531, 'z', 65515, 183, '+', 200, 2, 157, 162, 'S', 65460, 5, 200, 'a', 150, 'R', '4', 'n', '*', 171, 156, 'H', 157, 65506, 172, 'O', '5', 188, 182, 183, 190, 197, 142, 'Z', 65475, '@', '{', 'M', 221, 162, 'k', '2', ',', 164, 221, 15, ' ', 65519, 158, 18, 190, 198, 144, 65514, 167, '`', 1, 'y', 'w', '>', '\b', 'W', 220, 151, '=', 146, 176, 203, 202, 181, 131, 169, 65511};
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) (str.charAt(i) ^ cArr[i % 265]));
            }
            return sb.toString();
        } catch (Exception unused) {
            try {
                new String(new byte[0], Crypt.xrc("-\u0006\u0019Uj"));
            } catch (UnsupportedEncodingException unused2) {
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.ClassLoader a(java.io.InputStream r9, java.lang.String r10, java.lang.ClassLoader r11) {
        /*
            r8 = this;
            android.content.Context r0 = r8.a
            java.lang.String r1 = "\u001d\u0011-\u0001\"+'=;\u001d*"
            java.lang.String r1 = xyz.easypro.ecrypt.utils.Crypt.xrc(r1)
            r2 = 0
            java.io.File r0 = r0.getDir(r1, r2)
            java.io.File r1 = new java.io.File
            android.content.Context r3 = r8.a
            java.lang.String r4 = "\u001d\u0011-\u0001\"+'6:\u0000"
            java.lang.String r4 = xyz.easypro.ecrypt.utils.Crypt.xrc(r4)
            java.io.File r3 = r3.getDir(r4, r2)
            r1.<init>(r3, r10)
            android.content.Context r10 = r8.a
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()
            java.lang.String r10 = r10.nativeLibraryDir
            java.io.File r3 = r1.getParentFile()
            boolean r4 = r3.exists()
            if (r4 != 0) goto L39
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L39
            r3.mkdirs()
        L39:
            r3 = 0
            boolean r4 = r1.exists()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L7f
            if (r4 == 0) goto L43
            r1.delete()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L7f
        L43:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L7f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L7f
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            r5 = 5242880(0x500000, float:7.34684E-39)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
        L51:
            int r6 = r9.read(r5)     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            r7 = -1
            if (r6 == r7) goto L5c
            r3.write(r5, r2, r6)     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            goto L51
        L5c:
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            byte[] r3 = xyz.easypro.ecrypt.utils.Crypt.load(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            int r5 = r3.length     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            r4.write(r3, r2, r5)     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            r4.flush()     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L75
            xyz.easypro.ecrypt.utils.b.a(r9)
            xyz.easypro.ecrypt.utils.b.a(r4)
            goto L85
        L72:
            r10 = move-exception
            r3 = r4
            goto L78
        L75:
            r3 = r4
            goto L7f
        L77:
            r10 = move-exception
        L78:
            xyz.easypro.ecrypt.utils.b.a(r9)
            xyz.easypro.ecrypt.utils.b.a(r3)
            throw r10
        L7f:
            xyz.easypro.ecrypt.utils.b.a(r9)
            xyz.easypro.ecrypt.utils.b.a(r3)
        L85:
            r1.exists()
            if (r11 == 0) goto L98
            dalvik.system.DexClassLoader r9 = new dalvik.system.DexClassLoader
            java.lang.String r2 = r1.getAbsolutePath()
            java.lang.String r3 = r0.getAbsolutePath()
            r9.<init>(r2, r3, r10, r11)
            goto Lab
        L98:
            dalvik.system.DexClassLoader r9 = new dalvik.system.DexClassLoader
            java.lang.String r11 = r1.getAbsolutePath()
            java.lang.String r2 = r0.getAbsolutePath()
            android.content.Context r3 = r8.a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r9.<init>(r11, r2, r10, r3)
        Lab:
            java.io.File r10 = r0.getAbsoluteFile()
            r8.b(r10)
            java.io.File r10 = r1.getParentFile()
            r8.b(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xyz.easypro.ecrypt.utils.a.a(java.io.InputStream, java.lang.String, java.lang.ClassLoader):java.lang.ClassLoader");
    }

    public final void b(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                file2.delete();
            } else {
                b(file2);
            }
        }
        file.delete();
    }

    public ClassLoader d(InputStream inputStream) {
        ClassLoader classLoader;
        String xrc = Crypt.xrc("\u0015\u00113\u0019!,4=>\u001c7-");
        try {
            Field declaredField = this.b.getDeclaredField(xrc);
            declaredField.setAccessible(true);
            classLoader = (ClassLoader) declaredField.get(this.c.get());
        } catch (Exception unused) {
            classLoader = null;
        }
        try {
            ClassLoader a = a(inputStream, Crypt.xrc("\u001b>>\u000b!:\u000b|;\u001d*"), classLoader);
            try {
                Field declaredField2 = this.b.getDeclaredField(xrc);
                declaredField2.setAccessible(true);
                declaredField2.set(this.c.get(), a);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused2) {
            }
            return a;
        } catch (Exception unused3) {
            return null;
        }
    }
}
