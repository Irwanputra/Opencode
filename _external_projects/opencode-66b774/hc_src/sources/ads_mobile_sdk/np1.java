package ads_mobile_sdk;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class np1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(cu0 cu0Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = cu0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), cu0.a(method2, cu0Var, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), cu0.a(method, cu0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object a2 = cu0.a(method4, cu0Var, new Object[0]);
                    if (method5 == null) {
                        if (a2 instanceof Boolean) {
                            equals = !((Boolean) a2).booleanValue();
                        } else if (a2 instanceof Integer) {
                            if (((Integer) a2).intValue() == 0) {
                            }
                            a(sb, i, substring, a2);
                        } else if (a2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) a2).floatValue()) == 0) {
                            }
                            a(sb, i, substring, a2);
                        } else if (a2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) a2).doubleValue()) == 0) {
                            }
                            a(sb, i, substring, a2);
                        } else if (a2 instanceof String) {
                            equals = a2.equals("");
                        } else if (a2 instanceof sq) {
                            equals = a2.equals(sq.b);
                        } else if (a2 instanceof g) {
                            if (a2 == cu0.a(((cu0) ((g) a2)).getClass())) {
                            }
                            a(sb, i, substring, a2);
                        } else {
                            if ((a2 instanceof Enum) && ((Enum) a2).ordinal() == 0) {
                            }
                            a(sb, i, substring, a2);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, a2);
                    } else {
                        if (!((Boolean) cu0.a(method5, cu0Var, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, a2);
                    }
                }
            }
            i2 = i3;
        }
        bm3 bm3Var = cu0Var.b;
        if (bm3Var != null) {
            for (int i5 = 0; i5 < bm3Var.a; i5++) {
                a(sb, i, String.valueOf(bm3Var.b[i5] >>> 3), bm3Var.c[i5]);
            }
        }
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        char[] cArr;
        int i2;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = i;
        while (true) {
            cArr = a;
            i2 = 0;
            int i4 = 80;
            if (i3 <= 0) {
                break;
            }
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(cArr, 0, i4);
            i3 -= i4;
        }
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            String str2 = (String) obj;
            String[] strArr = ke3.a;
            int length = str2.length();
            StringBuilder sb3 = null;
            int i6 = 0;
            while (true) {
                if (i2 < length) {
                    char charAt2 = str2.charAt(i2);
                    if (charAt2 > 127) {
                        str2 = ke3.a(str2.getBytes(StandardCharsets.UTF_8));
                        break;
                    }
                    String str3 = ke3.a[charAt2];
                    if (str3 != null) {
                        if (sb3 == null) {
                            sb3 = new StringBuilder(length + 16);
                        }
                        if (i6 < i2) {
                            sb3.append((CharSequence) str2, i6, i2);
                        }
                        sb3.append(str3);
                        i6 = i2 + 1;
                    }
                    i2++;
                } else if (sb3 != null) {
                    if (i6 < length) {
                        sb3.append((CharSequence) str2, i6, length);
                    }
                    str2 = sb3.toString();
                }
            }
            sb.append(str2);
            sb.append('\"');
            return;
        }
        if (obj instanceof sq) {
            sb.append(": \"");
            String[] strArr2 = ke3.a;
            sb.append(ke3.a(((sq) obj).c()));
            sb.append('\"');
            return;
        }
        if (obj instanceof cu0) {
            sb.append(" {");
            a((cu0) obj, sb, i + 2);
            sb.append("\n");
            while (i > 0) {
                int i7 = i > 80 ? 80 : i;
                sb.append(cArr, 0, i7);
                i -= i7;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i8 = i + 2;
            a(sb, i8, "key", entry.getKey());
            a(sb, i8, "value", entry.getValue());
            sb.append("\n");
            while (i > 0) {
                int i9 = i > 80 ? 80 : i;
                sb.append(cArr, 0, i9);
                i -= i9;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
