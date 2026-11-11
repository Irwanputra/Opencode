package p131.p161.p211;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class EnumC2662 implements InterfaceC2653 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2662[] f10119;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final EnumC2662 f10120;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final EnumC2662 f10121;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final EnumC2662 f10122;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final EnumC2662 f10123;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final EnumC2662 f10124;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final EnumC2662 f10125;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public enum C2665 extends EnumC2662 {
        public C2665(String str, int i) {
            super(str, i, null);
        }

        @Override // p131.p161.p211.InterfaceC2653
        /* renamed from: げつ〴ぬぐ */
        public String mo4632(Field field) {
            return field.getName();
        }
    }

    static {
        C2665 c2665 = new C2665("IDENTITY", 0);
        f10120 = c2665;
        EnumC2662 enumC2662 = new EnumC2662("UPPER_CAMEL_CASE", 1) { // from class: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび.〺つふすそ
            @Override // p131.p161.p211.InterfaceC2653
            /* renamed from: げつ〴ぬぐ */
            public String mo4632(Field field) {
                return EnumC2662.m4641(field.getName());
            }
        };
        f10122 = enumC2662;
        EnumC2662 enumC26622 = new EnumC2662("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび.くし〴〺ぅ
            @Override // p131.p161.p211.InterfaceC2653
            /* renamed from: げつ〴ぬぐ */
            public String mo4632(Field field) {
                return EnumC2662.m4641(EnumC2662.m4640(field.getName(), " "));
            }
        };
        f10125 = enumC26622;
        EnumC2662 enumC26623 = new EnumC2662("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび.びぐびあび
            @Override // p131.p161.p211.InterfaceC2653
            /* renamed from: げつ〴ぬぐ */
            public String mo4632(Field field) {
                return EnumC2662.m4640(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f10123 = enumC26623;
        EnumC2662 enumC26624 = new EnumC2662("LOWER_CASE_WITH_DASHES", 4) { // from class: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび.づざかべべ
            @Override // p131.p161.p211.InterfaceC2653
            /* renamed from: げつ〴ぬぐ */
            public String mo4632(Field field) {
                return EnumC2662.m4640(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f10124 = enumC26624;
        EnumC2662 enumC26625 = new EnumC2662("LOWER_CASE_WITH_DOTS", 5) { // from class: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.びぐびあび.なぎぱいぢぎ
            @Override // p131.p161.p211.InterfaceC2653
            /* renamed from: げつ〴ぬぐ */
            public String mo4632(Field field) {
                return EnumC2662.m4640(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f10121 = enumC26625;
        f10119 = new EnumC2662[]{c2665, enumC2662, enumC26622, enumC26623, enumC26624, enumC26625};
    }

    public EnumC2662(String str, int i, C2665 c2665) {
    }

    public static EnumC2662 valueOf(String str) {
        return (EnumC2662) Enum.valueOf(EnumC2662.class, str);
    }

    public static EnumC2662[] values() {
        return (EnumC2662[]) f10119.clone();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m4640(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m4641(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
