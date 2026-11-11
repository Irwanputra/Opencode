package org.jasypt.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class CommonUtils {
    public static final String STRING_OUTPUT_TYPE_BASE64 = "base64";
    public static final String STRING_OUTPUT_TYPE_HEXADECIMAL = "hexadecimal";
    private static final List STRING_OUTPUT_TYPE_HEXADECIMAL_NAMES = Arrays.asList("HEXADECIMAL", "HEXA", "0X", "HEX", "HEXADEC");
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private CommonUtils() {
    }

    public static byte[] appendArrays(byte[] bArr, byte[] bArr2) {
        validateNotNull(bArr, "Appended array cannot be null");
        validateNotNull(bArr2, "Appended array cannot be null");
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] fromHexadecimal(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 != 0) {
            throw new EncryptionOperationNotPossibleException();
        }
        try {
            byte[] bArr = new byte[str.length() / 2];
            for (int i = 0; i < str.length(); i += 2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("");
                stringBuffer.append(str.charAt(i));
                int parseInt = Integer.parseInt(stringBuffer.toString(), 16);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("");
                stringBuffer2.append(str.charAt(i + 1));
                bArr[i / 2] = (byte) (((parseInt & Base64.BASELENGTH) << 4) + 0 + (Integer.parseInt(stringBuffer2.toString(), 16) & Base64.BASELENGTH));
            }
            return bArr;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public static Boolean getStandardBooleanValue(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        if ("TRUE".equals(upperCase) || "ON".equals(upperCase) || "YES".equals(upperCase)) {
            return Boolean.TRUE;
        }
        if ("FALSE".equals(upperCase) || "OFF".equals(upperCase) || "NO".equals(upperCase)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String getStandardStringOutputType(String str) {
        if (str == null) {
            return null;
        }
        return STRING_OUTPUT_TYPE_HEXADECIMAL_NAMES.contains(str.toUpperCase()) ? STRING_OUTPUT_TYPE_HEXADECIMAL : "base64";
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return (str == null || str.length() == 0) ? false : true;
    }

    public static int nextRandomInt() {
        return (int) (Math.random() * 2.147483647E9d);
    }

    public static String[] split(String str) {
        return split(str, null);
    }

    public static String[] split(String str, String str2) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i3 = 0;
            z2 = false;
            i4 = 0;
            while (i3 < length) {
                if (Character.isWhitespace(str.charAt(i3))) {
                    if (z2) {
                        arrayList.add(str.substring(i4, i3));
                        z2 = false;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                } else {
                    i3++;
                    z2 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i = 0;
                z = false;
                i2 = 0;
                while (i < length) {
                    if (str.charAt(i) == charAt) {
                        if (z) {
                            arrayList.add(str.substring(i2, i));
                            z = false;
                        }
                        i2 = i + 1;
                        i = i2;
                    } else {
                        i++;
                        z = true;
                    }
                }
            } else {
                i = 0;
                z = false;
                i2 = 0;
                while (i < length) {
                    if (str2.indexOf(str.charAt(i)) >= 0) {
                        if (z) {
                            arrayList.add(str.substring(i2, i));
                            z = false;
                        }
                        i2 = i + 1;
                        i = i2;
                    } else {
                        i++;
                        z = true;
                    }
                }
            }
            i3 = i;
            z2 = z;
            i4 = i2;
        }
        if (z2) {
            arrayList.add(str.substring(i4, i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String substringAfter(String str, String str2) {
        int indexOf;
        return isEmpty(str) ? str : (str2 == null || (indexOf = str.indexOf(str2)) == -1) ? "" : str.substring(str2.length() + indexOf);
    }

    public static String substringBefore(String str, String str2) {
        if (isEmpty(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    public static String toHexadecimal(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            int i = b & 255;
            stringBuffer.append(hexDigits[i >> 4]);
            stringBuffer.append(hexDigits[i & 15]);
        }
        return stringBuffer.toString();
    }

    public static void validateIsTrue(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void validateNotEmpty(String str, String str2) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void validateNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
