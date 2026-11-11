package org.jasypt.intf.cli;

import java.util.Properties;
import org.jasypt.intf.service.JasyptStatelessService;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class JasyptStringDigestCLI {
    public static /* synthetic */ Class class$org$jasypt$intf$cli$JasyptStringDigestCLI;
    private static final String[][] VALID_REQUIRED_ARGUMENTS = {new String[]{ArgumentNaming.ARG_INPUT}};
    private static final String[][] VALID_OPTIONAL_ARGUMENTS = {new String[]{ArgumentNaming.ARG_VERBOSE}, new String[]{ArgumentNaming.ARG_ALGORITHM}, new String[]{ArgumentNaming.ARG_ITERATIONS}, new String[]{ArgumentNaming.ARG_SALT_SIZE_BYTES}, new String[]{ArgumentNaming.ARG_SALT_GENERATOR_CLASS_NAME}, new String[]{ArgumentNaming.ARG_PROVIDER_NAME}, new String[]{ArgumentNaming.ARG_PROVIDER_CLASS_NAME}, new String[]{ArgumentNaming.ARG_INVERT_POSITION_OF_SALT_IN_MESSAGE_BEFORE_DIGESTING}, new String[]{ArgumentNaming.ARG_INVERT_POSITION_OF_PLAIN_SALT_IN_ENCRYPTION_RESULTS}, new String[]{ArgumentNaming.ARG_USE_LENIENT_SALT_SIZE_CHECK}, new String[]{ArgumentNaming.ARG_UNICODE_NORMALIZATION_IGNORED}, new String[]{ArgumentNaming.ARG_STRING_OUTPUT_TYPE}, new String[]{ArgumentNaming.ARG_PREFIX}, new String[]{ArgumentNaming.ARG_SUFFIX}};

    private JasyptStringDigestCLI() {
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static void main(String[] strArr) {
        String name;
        String[] strArr2 = strArr;
        boolean verbosity = CLIUtils.getVerbosity(strArr);
        try {
            if (strArr2[0] != null && strArr2[0].indexOf("=") == -1) {
                name = strArr2[0];
                String[] strArr3 = new String[strArr2.length - 1];
                System.arraycopy(strArr2, 1, strArr3, 0, strArr2.length - 1);
                strArr2 = strArr3;
                Properties argumentValues = CLIUtils.getArgumentValues(name, strArr2, VALID_REQUIRED_ARGUMENTS, VALID_OPTIONAL_ARGUMENTS);
                CLIUtils.showEnvironment(verbosity);
                JasyptStatelessService jasyptStatelessService = new JasyptStatelessService();
                String property = argumentValues.getProperty(ArgumentNaming.ARG_INPUT);
                CLIUtils.showArgumentDescription(argumentValues, verbosity);
                CLIUtils.showOutput(jasyptStatelessService.digest(property, argumentValues.getProperty(ArgumentNaming.ARG_ALGORITHM), null, null, argumentValues.getProperty(ArgumentNaming.ARG_ITERATIONS), null, null, argumentValues.getProperty(ArgumentNaming.ARG_SALT_SIZE_BYTES), null, null, argumentValues.getProperty(ArgumentNaming.ARG_SALT_GENERATOR_CLASS_NAME), null, null, argumentValues.getProperty(ArgumentNaming.ARG_PROVIDER_NAME), null, null, argumentValues.getProperty(ArgumentNaming.ARG_PROVIDER_CLASS_NAME), null, null, argumentValues.getProperty(ArgumentNaming.ARG_INVERT_POSITION_OF_SALT_IN_MESSAGE_BEFORE_DIGESTING), null, null, argumentValues.getProperty(ArgumentNaming.ARG_INVERT_POSITION_OF_PLAIN_SALT_IN_ENCRYPTION_RESULTS), null, null, argumentValues.getProperty(ArgumentNaming.ARG_USE_LENIENT_SALT_SIZE_CHECK), null, null, argumentValues.getProperty(ArgumentNaming.ARG_UNICODE_NORMALIZATION_IGNORED), null, null, argumentValues.getProperty(ArgumentNaming.ARG_STRING_OUTPUT_TYPE), null, null, argumentValues.getProperty(ArgumentNaming.ARG_PREFIX), null, null, argumentValues.getProperty(ArgumentNaming.ARG_SUFFIX), null, null), verbosity);
            }
            Class cls = class$org$jasypt$intf$cli$JasyptStringDigestCLI;
            if (cls == null) {
                cls = class$("org.jasypt.intf.cli.JasyptStringDigestCLI");
                class$org$jasypt$intf$cli$JasyptStringDigestCLI = cls;
            }
            name = cls.getName();
            Properties argumentValues2 = CLIUtils.getArgumentValues(name, strArr2, VALID_REQUIRED_ARGUMENTS, VALID_OPTIONAL_ARGUMENTS);
            CLIUtils.showEnvironment(verbosity);
            JasyptStatelessService jasyptStatelessService2 = new JasyptStatelessService();
            String property2 = argumentValues2.getProperty(ArgumentNaming.ARG_INPUT);
            CLIUtils.showArgumentDescription(argumentValues2, verbosity);
            CLIUtils.showOutput(jasyptStatelessService2.digest(property2, argumentValues2.getProperty(ArgumentNaming.ARG_ALGORITHM), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_ITERATIONS), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_SALT_SIZE_BYTES), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_SALT_GENERATOR_CLASS_NAME), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_PROVIDER_NAME), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_PROVIDER_CLASS_NAME), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_INVERT_POSITION_OF_SALT_IN_MESSAGE_BEFORE_DIGESTING), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_INVERT_POSITION_OF_PLAIN_SALT_IN_ENCRYPTION_RESULTS), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_USE_LENIENT_SALT_SIZE_CHECK), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_UNICODE_NORMALIZATION_IGNORED), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_STRING_OUTPUT_TYPE), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_PREFIX), null, null, argumentValues2.getProperty(ArgumentNaming.ARG_SUFFIX), null, null), verbosity);
        } catch (Throwable th) {
            CLIUtils.showError(th, verbosity);
        }
    }
}
