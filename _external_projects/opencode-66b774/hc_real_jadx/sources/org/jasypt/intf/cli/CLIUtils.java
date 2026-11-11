package org.jasypt.intf.cli;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class CLIUtils {
    private CLIUtils() {
    }

    public static Properties getArgumentValues(String str, String[] strArr, String[][] strArr2, String[][] strArr3) {
        HashSet hashSet = new HashSet();
        for (String[] strArr4 : strArr2) {
            hashSet.addAll(Arrays.asList(strArr4));
        }
        for (String[] strArr5 : strArr3) {
            hashSet.addAll(Arrays.asList(strArr5));
        }
        Properties properties = new Properties();
        for (int i = 0; i < strArr.length; i++) {
            String substringBefore = CommonUtils.substringBefore(strArr[i], "=");
            String substringAfter = CommonUtils.substringAfter(strArr[i], "=");
            if (CommonUtils.isEmpty(substringBefore) || CommonUtils.isEmpty(substringAfter)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Bad argument: ");
                stringBuffer.append(strArr[i]);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            if (!hashSet.contains(substringBefore)) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Bad argument: ");
                stringBuffer2.append(strArr[i]);
                throw new IllegalArgumentException(stringBuffer2.toString());
            }
            if (substringAfter.startsWith("\"") && substringAfter.endsWith("\"")) {
                properties.setProperty(substringBefore, substringAfter.substring(1, substringAfter.length() - 1));
            } else {
                properties.setProperty(substringBefore, substringAfter);
            }
        }
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            boolean z = false;
            for (int i3 = 0; i3 < strArr2[i2].length; i3++) {
                if (properties.containsKey(strArr2[i2][i3])) {
                    z = true;
                }
            }
            if (!z) {
                showUsageAndExit(str, strArr2, strArr3);
            }
        }
        return properties;
    }

    public static boolean getVerbosity(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String substringBefore = CommonUtils.substringBefore(strArr[i], "=");
            String substringAfter = CommonUtils.substringAfter(strArr[i], "=");
            if (!CommonUtils.isEmpty(substringBefore) && !CommonUtils.isEmpty(substringAfter) && ArgumentNaming.ARG_VERBOSE.equals(substringBefore)) {
                Boolean standardBooleanValue = CommonUtils.getStandardBooleanValue(substringAfter);
                if (standardBooleanValue != null) {
                    return standardBooleanValue.booleanValue();
                }
                return false;
            }
        }
        return true;
    }

    public static void showArgumentDescription(Properties properties, boolean z) {
        if (z) {
            PrintStream printStream = System.out;
            for (Map.Entry entry : properties.entrySet()) {
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(entry.getKey());
                stringBuffer.append(": ");
                stringBuffer.append(entry.getValue());
                stringBuffer.toString();
            }
            PrintStream printStream3 = System.out;
        }
    }

    public static void showEnvironment(boolean z) {
        if (z) {
            PrintStream printStream = System.out;
            System.getProperty("java.vm.vendor");
            System.getProperty("java.vm.name");
            System.getProperty("java.vm.version");
            PrintStream printStream2 = System.out;
        }
    }

    public static void showError(Throwable th, boolean z) {
        if (z) {
            PrintStream printStream = System.err;
            if (!(th instanceof EncryptionOperationNotPossibleException)) {
                if (th.getMessage() != null) {
                    PrintStream printStream2 = System.err;
                    th.getMessage();
                } else {
                    PrintStream printStream3 = System.err;
                    th.getClass().getName();
                }
            }
            PrintStream printStream4 = System.err;
            return;
        }
        PrintStream printStream5 = System.err;
        if (th instanceof EncryptionOperationNotPossibleException) {
            return;
        }
        if (th.getMessage() != null) {
            PrintStream printStream6 = System.err;
            th.getMessage();
        } else {
            PrintStream printStream7 = System.err;
            th.getClass().getName();
        }
    }

    public static void showOutput(String str, boolean z) {
        PrintStream printStream = System.out;
    }

    public static void showUsageAndExit(String str, String[][] strArr, String[][] strArr2) {
        PrintStream printStream = System.err;
        for (int i = 0; i < strArr.length; i++) {
            PrintStream printStream2 = System.err;
            if (strArr[i].length == 1) {
                String str2 = strArr[i][0];
            } else {
                for (int i2 = 0; i2 < strArr[i].length; i2++) {
                    if (i2 > 0) {
                        PrintStream printStream3 = System.err;
                    }
                    PrintStream printStream4 = System.err;
                    String str3 = strArr[i][i2];
                }
                PrintStream printStream5 = System.err;
            }
            PrintStream printStream6 = System.err;
        }
        PrintStream printStream7 = System.err;
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            PrintStream printStream8 = System.err;
            if (strArr2[i3].length == 1) {
                String str4 = strArr2[i3][0];
            } else {
                for (int i4 = 0; i4 < strArr2[i3].length; i4++) {
                    if (i4 > 0) {
                        PrintStream printStream9 = System.err;
                    }
                    PrintStream printStream10 = System.err;
                    String str5 = strArr2[i3][i4];
                }
                PrintStream printStream11 = System.err;
            }
            PrintStream printStream12 = System.err;
        }
        System.exit(1);
    }
}
