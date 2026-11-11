.class public final Lorg/jasypt/intf/cli/JasyptStringDigestCLI;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final VALID_OPTIONAL_ARGUMENTS:[[Ljava/lang/String;

.field private static final VALID_REQUIRED_ARGUMENTS:[[Ljava/lang/String;

.field public static synthetic class$org$jasypt$intf$cli$JasyptStringDigestCLI:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    const/4 v0, 0x1

    new-array v1, v0, [[Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "input"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    aput-object v2, v1, v4

    sput-object v1, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->VALID_REQUIRED_ARGUMENTS:[[Ljava/lang/String;

    const/16 v1, 0xe

    new-array v1, v1, [[Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "verbose"

    aput-object v3, v2, v4

    aput-object v2, v1, v4

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "algorithm"

    aput-object v3, v2, v4

    aput-object v2, v1, v0

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "iterations"

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "saltSizeBytes"

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "saltGeneratorClassName"

    aput-object v3, v2, v4

    const/4 v3, 0x4

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "providerName"

    aput-object v3, v2, v4

    const/4 v3, 0x5

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "providerClassName"

    aput-object v3, v2, v4

    const/4 v3, 0x6

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "invertPositionOfSaltInMessageBeforeDigesting"

    aput-object v3, v2, v4

    const/4 v3, 0x7

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "invertPositionOfPlainSaltInEncryptionResults"

    aput-object v3, v2, v4

    const/16 v3, 0x8

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "useLenientSaltSizeCheck"

    aput-object v3, v2, v4

    const/16 v3, 0x9

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "unicodeNormalizationIgnored"

    aput-object v3, v2, v4

    const/16 v3, 0xa

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "stringOutputType"

    aput-object v3, v2, v4

    const/16 v3, 0xb

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "prefix"

    aput-object v3, v2, v4

    const/16 v3, 0xc

    aput-object v2, v1, v3

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "suffix"

    aput-object v2, v0, v4

    const/16 v2, 0xd

    aput-object v0, v1, v2

    sput-object v1, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->VALID_OPTIONAL_ARGUMENTS:[[Ljava/lang/String;

    return-void
.end method

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

.method public static main([Ljava/lang/String;)V
    .registers 44

    move-object/from16 v0, p0

    invoke-static/range {p0 .. p0}, Lorg/jasypt/intf/cli/CLIUtils;->getVerbosity([Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    :try_start_7
    aget-object v3, v0, v2

    if-eqz v3, :cond_25

    aget-object v3, v0, v2

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_17

    goto :goto_25

    :cond_17
    aget-object v3, v0, v2

    array-length v4, v0

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    new-array v4, v4, [Ljava/lang/String;

    array-length v6, v0

    sub-int/2addr v6, v5

    invoke-static {v0, v5, v4, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v4

    goto :goto_35

    :cond_25
    :goto_25
    sget-object v2, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->class$org$jasypt$intf$cli$JasyptStringDigestCLI:Ljava/lang/Class;

    if-nez v2, :cond_31

    const-string v2, "org.jasypt.intf.cli.JasyptStringDigestCLI"

    invoke-static {v2}, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->class$org$jasypt$intf$cli$JasyptStringDigestCLI:Ljava/lang/Class;

    :cond_31
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    :goto_35
    sget-object v2, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->VALID_REQUIRED_ARGUMENTS:[[Ljava/lang/String;

    sget-object v4, Lorg/jasypt/intf/cli/JasyptStringDigestCLI;->VALID_OPTIONAL_ARGUMENTS:[[Ljava/lang/String;

    invoke-static {v3, v0, v2, v4}, Lorg/jasypt/intf/cli/CLIUtils;->getArgumentValues(Ljava/lang/String;[Ljava/lang/String;[[Ljava/lang/String;[[Ljava/lang/String;)Ljava/util/Properties;

    move-result-object v0

    invoke-static {v1}, Lorg/jasypt/intf/cli/CLIUtils;->showEnvironment(Z)V

    new-instance v2, Lorg/jasypt/intf/service/JasyptStatelessService;

    invoke-direct {v2}, Lorg/jasypt/intf/service/JasyptStatelessService;-><init>()V

    const-string v3, "input"

    invoke-virtual {v0, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1}, Lorg/jasypt/intf/cli/CLIUtils;->showArgumentDescription(Ljava/util/Properties;Z)V

    const-string v4, "algorithm"

    invoke-virtual {v0, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "iterations"

    invoke-virtual {v0, v7}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "saltSizeBytes"

    invoke-virtual {v0, v10}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "saltGeneratorClassName"

    invoke-virtual {v0, v13}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const-string v15, "providerName"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v15, "providerClassName"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v15, "invertPositionOfSaltInMessageBeforeDigesting"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-string v15, "invertPositionOfPlainSaltInEncryptionResults"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-string v15, "useLenientSaltSizeCheck"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-string v15, "unicodeNormalizationIgnored"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-string v15, "stringOutputType"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-string v15, "prefix"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-string v15, "suffix"

    invoke-virtual {v0, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/4 v0, 0x0

    move-object v15, v0

    invoke-virtual/range {v2 .. v42}, Lorg/jasypt/intf/service/JasyptStatelessService;->digest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lorg/jasypt/intf/cli/CLIUtils;->showOutput(Ljava/lang/String;Z)V
    :try_end_d0
    .catchall {:try_start_7 .. :try_end_d0} :catchall_d1

    goto :goto_d5

    :catchall_d1
    move-exception v0

    invoke-static {v0, v1}, Lorg/jasypt/intf/cli/CLIUtils;->showError(Ljava/lang/Throwable;Z)V

    :goto_d5
    return-void
.end method
