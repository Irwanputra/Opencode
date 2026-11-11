.class public final Lorg/jasypt/normalization/Normalizer;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final ICU_NORMALIZER_CLASS_NAME:Ljava/lang/String; = "com.ibm.icu.text.Normalizer"

.field private static final JDK_NORMALIZER_CLASS_NAME:Ljava/lang/String; = "java.text.Normalizer"

.field private static final JDK_NORMALIZER_FORM_CLASS_NAME:Ljava/lang/String; = "java.text.Normalizer$Form"

.field public static synthetic class$java$lang$CharSequence:Ljava/lang/Class;

.field private static javaTextNormalizerFormNFCConstant:Ljava/lang/Object;

.field private static javaTextNormalizerMethod:Ljava/lang/reflect/Method;

.field private static useIcuNormalizer:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic class$(Ljava/lang/String;)Ljava/lang/Class;
    .registers 2

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method public static initializeIcu4j()V
    .registers 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "com.ibm.icu.text.Normalizer"

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lorg/jasypt/normalization/Normalizer;->useIcuNormalizer:Ljava/lang/Boolean;

    return-void
.end method

.method public static initializeJavaTextNormalizer()V
    .registers 5

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "java.text.Normalizer"

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "java.text.Normalizer$Form"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Lorg/jasypt/normalization/Normalizer;->class$java$lang$CharSequence:Ljava/lang/Class;

    if-nez v3, :cond_2b

    const-string v3, "java.lang.CharSequence"

    invoke-static {v3}, Lorg/jasypt/normalization/Normalizer;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lorg/jasypt/normalization/Normalizer;->class$java$lang$CharSequence:Ljava/lang/Class;

    :cond_2b
    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const-string v3, "normalize"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lorg/jasypt/normalization/Normalizer;->javaTextNormalizerMethod:Ljava/lang/reflect/Method;

    const-string v0, "NFC"

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/jasypt/normalization/Normalizer;->javaTextNormalizerFormNFCConstant:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lorg/jasypt/normalization/Normalizer;->useIcuNormalizer:Ljava/lang/Boolean;

    return-void
.end method

.method public static normalizeToNfc(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-static {p0}, Lorg/jasypt/normalization/Normalizer;->normalizeToNfc([C)[C

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static normalizeToNfc([C)[C
    .registers 3

    const-string v0, "Cannot find a valid UNICODE normalizer: java.text.Normalizer$Form has been found at the classpath, but seems to have no \'NFC\' value."

    sget-object v1, Lorg/jasypt/normalization/Normalizer;->useIcuNormalizer:Ljava/lang/Boolean;

    if-nez v1, :cond_2a

    :try_start_6
    invoke-static {}, Lorg/jasypt/normalization/Normalizer;->initializeIcu4j()V
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_9} :catch_a

    goto :goto_2a

    :catch_a
    :try_start_a
    invoke-static {}, Lorg/jasypt/normalization/Normalizer;->initializeJavaTextNormalizer()V
    :try_end_d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_d} :catch_22
    .catch Ljava/lang/NoSuchMethodException; {:try_start_a .. :try_end_d} :catch_1a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_a .. :try_end_d} :catch_14
    .catch Ljava/lang/IllegalAccessException; {:try_start_a .. :try_end_d} :catch_e

    goto :goto_2a

    :catch_e
    new-instance p0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {p0, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_14
    new-instance p0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {p0, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1a
    new-instance p0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Cannot find a valid UNICODE normalizer: java.text.Normalizer has been found at the classpath, but has an incompatible signature for its \'normalize\' method."

    invoke-direct {p0, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_22
    new-instance p0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Cannot find a valid UNICODE normalizer: neither java.text.Normalizer nor com.ibm.icu.text.Normalizer have been found at the classpath. If you are using a version of the JDK older than JavaSE 6, you should include the icu4j library in your classpath."

    invoke-direct {p0, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2a
    :goto_2a
    sget-object v0, Lorg/jasypt/normalization/Normalizer;->useIcuNormalizer:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-static {p0}, Lorg/jasypt/normalization/Normalizer;->normalizeWithIcu4j([C)[C

    move-result-object p0

    return-object p0

    :cond_37
    invoke-static {p0}, Lorg/jasypt/normalization/Normalizer;->normalizeWithJavaNormalizer([C)[C

    move-result-object p0

    return-object p0
.end method

.method public static normalizeWithIcu4j([C)[C
    .registers 6

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    :goto_5
    sget-object v1, Lcom/ibm/icu/text/Normalizer;->NFC:Lcom/ibm/icu/text/Normalizer$Mode;

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lcom/ibm/icu/text/Normalizer;->normalize([C[CLcom/ibm/icu/text/Normalizer$Mode;I)I

    move-result v1

    array-length v3, v0

    if-gt v1, v3, :cond_1e

    new-array p0, v1, [C

    invoke-static {v0, v2, p0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x0

    :goto_15
    array-length v3, v0

    if-ge v1, v3, :cond_1d

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_1d
    return-object p0

    :cond_1e
    const/4 v3, 0x0

    :goto_1f
    array-length v4, v0

    if-ge v3, v4, :cond_27

    aput-char v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1f

    :cond_27
    new-array v0, v1, [C

    goto :goto_5
.end method

.method public static normalizeWithJavaNormalizer([C)[C
    .registers 5

    sget-object v0, Lorg/jasypt/normalization/Normalizer;->javaTextNormalizerMethod:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2f

    sget-object v0, Lorg/jasypt/normalization/Normalizer;->javaTextNormalizerFormNFCConstant:Ljava/lang/Object;

    if-eqz v0, :cond_2f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    :try_start_d
    sget-object p0, Lorg/jasypt/normalization/Normalizer;->javaTextNormalizerMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    sget-object v3, Lorg/jasypt/normalization/Normalizer;->javaTextNormalizerFormNFCConstant:Ljava/lang/Object;

    aput-object v3, v2, v0

    invoke-virtual {p0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_21} :catch_26

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    return-object p0

    :catch_26
    move-exception p0

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v1, "Could not perform a valid UNICODE normalization"

    invoke-direct {v0, v1, p0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2f
    new-instance p0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Cannot use: java.text.Normalizer$Form, as JDK-based normalization has not been initialized! (check previous execution errors)"

    invoke-direct {p0, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
