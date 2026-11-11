.class public final Lorg/jasypt/intf/service/JasyptStatelessService;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 39

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    move-object/from16 v15, p18

    new-instance v15, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;

    invoke-direct {v15}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;-><init>()V

    if-eqz v4, :cond_2c

    invoke-virtual {v15, v4}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setAlgorithmEnvName(Ljava/lang/String;)V

    :cond_2c
    if-eqz v5, :cond_31

    invoke-virtual {v15, v5}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setAlgorithmSysPropertyName(Ljava/lang/String;)V

    :cond_31
    if-eqz v3, :cond_36

    invoke-virtual {v15, v3}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setAlgorithm(Ljava/lang/String;)V

    :cond_36
    if-eqz v7, :cond_3b

    invoke-virtual {v15, v7}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setKeyObtentionIterationsEnvName(Ljava/lang/String;)V

    :cond_3b
    if-eqz v8, :cond_40

    invoke-virtual {v15, v8}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setKeyObtentionIterationsSysPropertyName(Ljava/lang/String;)V

    :cond_40
    if-eqz v6, :cond_45

    invoke-virtual {v15, v6}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setKeyObtentionIterations(Ljava/lang/String;)V

    :cond_45
    if-eqz v1, :cond_4a

    invoke-virtual {v15, v1}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setPasswordEnvName(Ljava/lang/String;)V

    :cond_4a
    if-eqz v2, :cond_4f

    invoke-virtual {v15, v2}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setPasswordSysPropertyName(Ljava/lang/String;)V

    :cond_4f
    if-eqz v0, :cond_54

    invoke-virtual {v15, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setPassword(Ljava/lang/String;)V

    :cond_54
    if-eqz v10, :cond_59

    invoke-virtual {v15, v10}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setSaltGeneratorClassNameEnvName(Ljava/lang/String;)V

    :cond_59
    if-eqz v11, :cond_5e

    invoke-virtual {v15, v11}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setSaltGeneratorClassNameSysPropertyName(Ljava/lang/String;)V

    :cond_5e
    if-eqz v9, :cond_63

    invoke-virtual {v15, v9}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :cond_63
    if-eqz v13, :cond_68

    invoke-virtual {v15, v13}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderNameEnvName(Ljava/lang/String;)V

    :cond_68
    if-eqz v14, :cond_6d

    invoke-virtual {v15, v14}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderNameSysPropertyName(Ljava/lang/String;)V

    :cond_6d
    if-eqz v12, :cond_72

    invoke-virtual {v15, v12}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderName(Ljava/lang/String;)V

    :cond_72
    move-object/from16 v0, p18

    move-object v1, v15

    if-eqz v0, :cond_7a

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderClassNameEnvName(Ljava/lang/String;)V

    :cond_7a
    move-object/from16 v0, p19

    if-eqz v0, :cond_81

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderClassNameSysPropertyName(Ljava/lang/String;)V

    :cond_81
    move-object/from16 v0, p17

    if-eqz v0, :cond_88

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderClassName(Ljava/lang/String;)V

    :cond_88
    move-object/from16 v0, p21

    if-eqz v0, :cond_8f

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->setStringOutputTypeEnvName(Ljava/lang/String;)V

    :cond_8f
    move-object/from16 v0, p22

    if-eqz v0, :cond_96

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->setStringOutputTypeSysPropertyName(Ljava/lang/String;)V

    :cond_96
    move-object/from16 v0, p20

    if-eqz v0, :cond_9d

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->setStringOutputType(Ljava/lang/String;)V

    :cond_9d
    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;-><init>()V

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public digest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 57

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    move-object/from16 v15, p18

    new-instance v15, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;

    invoke-direct {v15}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;-><init>()V

    if-eqz v1, :cond_2c

    invoke-virtual {v15, v1}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setAlgorithmEnvName(Ljava/lang/String;)V

    :cond_2c
    if-eqz v2, :cond_31

    invoke-virtual {v15, v2}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setAlgorithmSysPropertyName(Ljava/lang/String;)V

    :cond_31
    if-eqz v0, :cond_36

    invoke-virtual {v15, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setAlgorithm(Ljava/lang/String;)V

    :cond_36
    if-eqz v4, :cond_3b

    invoke-virtual {v15, v4}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setIterationsEnvName(Ljava/lang/String;)V

    :cond_3b
    if-eqz v5, :cond_40

    invoke-virtual {v15, v5}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setIterationsSysPropertyName(Ljava/lang/String;)V

    :cond_40
    if-eqz v3, :cond_45

    invoke-virtual {v15, v3}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setIterations(Ljava/lang/String;)V

    :cond_45
    if-eqz v7, :cond_4a

    invoke-virtual {v15, v7}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setSaltSizeBytesEnvName(Ljava/lang/String;)V

    :cond_4a
    if-eqz v8, :cond_4f

    invoke-virtual {v15, v8}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setSaltSizeBytesSysPropertyName(Ljava/lang/String;)V

    :cond_4f
    if-eqz v6, :cond_54

    invoke-virtual {v15, v6}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setSaltSizeBytes(Ljava/lang/String;)V

    :cond_54
    if-eqz v10, :cond_59

    invoke-virtual {v15, v10}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setSaltGeneratorClassNameEnvName(Ljava/lang/String;)V

    :cond_59
    if-eqz v11, :cond_5e

    invoke-virtual {v15, v11}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setSaltGeneratorClassNameSysPropertyName(Ljava/lang/String;)V

    :cond_5e
    if-eqz v9, :cond_63

    invoke-virtual {v15, v9}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :cond_63
    if-eqz v13, :cond_68

    invoke-virtual {v15, v13}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setProviderNameEnvName(Ljava/lang/String;)V

    :cond_68
    if-eqz v14, :cond_6d

    invoke-virtual {v15, v14}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setProviderNameSysPropertyName(Ljava/lang/String;)V

    :cond_6d
    if-eqz v12, :cond_72

    invoke-virtual {v15, v12}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setProviderName(Ljava/lang/String;)V

    :cond_72
    move-object/from16 v0, p18

    move-object v1, v15

    if-eqz v0, :cond_7a

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setProviderClassNameEnvName(Ljava/lang/String;)V

    :cond_7a
    move-object/from16 v0, p19

    if-eqz v0, :cond_81

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setProviderClassNameSysPropertyName(Ljava/lang/String;)V

    :cond_81
    move-object/from16 v0, p17

    if-eqz v0, :cond_88

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setProviderClassName(Ljava/lang/String;)V

    :cond_88
    move-object/from16 v0, p21

    if-eqz v0, :cond_8f

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigestingEnvName(Ljava/lang/String;)V

    :cond_8f
    move-object/from16 v0, p22

    if-eqz v0, :cond_96

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName(Ljava/lang/String;)V

    :cond_96
    if-eqz p20, :cond_9f

    invoke-static/range {p20 .. p20}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setInvertPositionOfSaltInMessageBeforeDigesting(Ljava/lang/Boolean;)V

    :cond_9f
    move-object/from16 v0, p24

    if-eqz v0, :cond_a6

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResultsEnvName(Ljava/lang/String;)V

    :cond_a6
    move-object/from16 v0, p25

    if-eqz v0, :cond_ad

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName(Ljava/lang/String;)V

    :cond_ad
    if-eqz p23, :cond_b6

    invoke-static/range {p23 .. p23}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setInvertPositionOfPlainSaltInEncryptionResults(Ljava/lang/Boolean;)V

    :cond_b6
    move-object/from16 v0, p27

    if-eqz v0, :cond_bd

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setUseLenientSaltSizeCheckEnvName(Ljava/lang/String;)V

    :cond_bd
    move-object/from16 v0, p28

    if-eqz v0, :cond_c4

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setUseLenientSaltSizeCheckSysPropertyName(Ljava/lang/String;)V

    :cond_c4
    if-eqz p26, :cond_cd

    invoke-static/range {p26 .. p26}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentDigesterConfig;->setUseLenientSaltSizeCheck(Ljava/lang/Boolean;)V

    :cond_cd
    move-object/from16 v0, p30

    if-eqz v0, :cond_d4

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setUnicodeNormalizationIgnoredEnvName(Ljava/lang/String;)V

    :cond_d4
    move-object/from16 v0, p31

    if-eqz v0, :cond_db

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setUnicodeNormalizationIgnoredSysPropertyName(Ljava/lang/String;)V

    :cond_db
    move-object/from16 v0, p29

    if-eqz v0, :cond_e2

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setUnicodeNormalizationIgnored(Ljava/lang/String;)V

    :cond_e2
    move-object/from16 v0, p33

    if-eqz v0, :cond_e9

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setStringOutputTypeEnvName(Ljava/lang/String;)V

    :cond_e9
    move-object/from16 v0, p34

    if-eqz v0, :cond_f0

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setStringOutputTypeSysPropertyName(Ljava/lang/String;)V

    :cond_f0
    move-object/from16 v0, p32

    if-eqz v0, :cond_f7

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setStringOutputType(Ljava/lang/String;)V

    :cond_f7
    move-object/from16 v0, p36

    if-eqz v0, :cond_fe

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setPrefixEnvName(Ljava/lang/String;)V

    :cond_fe
    move-object/from16 v0, p37

    if-eqz v0, :cond_105

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setPrefixSysPropertyName(Ljava/lang/String;)V

    :cond_105
    move-object/from16 v0, p35

    if-eqz v0, :cond_10c

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setPrefix(Ljava/lang/String;)V

    :cond_10c
    move-object/from16 v0, p39

    if-eqz v0, :cond_113

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setSuffixEnvName(Ljava/lang/String;)V

    :cond_113
    move-object/from16 v0, p40

    if-eqz v0, :cond_11a

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setSuffixSysPropertyName(Ljava/lang/String;)V

    :cond_11a
    move-object/from16 v0, p38

    if-eqz v0, :cond_121

    invoke-virtual {v1, v0}, Lorg/jasypt/digest/config/EnvironmentStringDigesterConfig;->setSuffix(Ljava/lang/String;)V

    :cond_121
    new-instance v0, Lorg/jasypt/digest/StandardStringDigester;

    invoke-direct {v0}, Lorg/jasypt/digest/StandardStringDigester;-><init>()V

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->setConfig(Lorg/jasypt/digest/config/DigesterConfig;)V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lorg/jasypt/digest/StandardStringDigester;->digest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public encrypt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 39

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    move-object/from16 v15, p18

    new-instance v15, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;

    invoke-direct {v15}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;-><init>()V

    if-eqz v4, :cond_2c

    invoke-virtual {v15, v4}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setAlgorithmEnvName(Ljava/lang/String;)V

    :cond_2c
    if-eqz v5, :cond_31

    invoke-virtual {v15, v5}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setAlgorithmSysPropertyName(Ljava/lang/String;)V

    :cond_31
    if-eqz v3, :cond_36

    invoke-virtual {v15, v3}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setAlgorithm(Ljava/lang/String;)V

    :cond_36
    if-eqz v7, :cond_3b

    invoke-virtual {v15, v7}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setKeyObtentionIterationsEnvName(Ljava/lang/String;)V

    :cond_3b
    if-eqz v8, :cond_40

    invoke-virtual {v15, v8}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setKeyObtentionIterationsSysPropertyName(Ljava/lang/String;)V

    :cond_40
    if-eqz v6, :cond_45

    invoke-virtual {v15, v6}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setKeyObtentionIterations(Ljava/lang/String;)V

    :cond_45
    if-eqz v1, :cond_4a

    invoke-virtual {v15, v1}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setPasswordEnvName(Ljava/lang/String;)V

    :cond_4a
    if-eqz v2, :cond_4f

    invoke-virtual {v15, v2}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setPasswordSysPropertyName(Ljava/lang/String;)V

    :cond_4f
    if-eqz v0, :cond_54

    invoke-virtual {v15, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setPassword(Ljava/lang/String;)V

    :cond_54
    if-eqz v10, :cond_59

    invoke-virtual {v15, v10}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setSaltGeneratorClassNameEnvName(Ljava/lang/String;)V

    :cond_59
    if-eqz v11, :cond_5e

    invoke-virtual {v15, v11}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setSaltGeneratorClassNameSysPropertyName(Ljava/lang/String;)V

    :cond_5e
    if-eqz v9, :cond_63

    invoke-virtual {v15, v9}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setSaltGeneratorClassName(Ljava/lang/String;)V

    :cond_63
    if-eqz v13, :cond_68

    invoke-virtual {v15, v13}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderNameEnvName(Ljava/lang/String;)V

    :cond_68
    if-eqz v14, :cond_6d

    invoke-virtual {v15, v14}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderNameSysPropertyName(Ljava/lang/String;)V

    :cond_6d
    if-eqz v12, :cond_72

    invoke-virtual {v15, v12}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderName(Ljava/lang/String;)V

    :cond_72
    move-object/from16 v0, p18

    move-object v1, v15

    if-eqz v0, :cond_7a

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderClassNameEnvName(Ljava/lang/String;)V

    :cond_7a
    move-object/from16 v0, p19

    if-eqz v0, :cond_81

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderClassNameSysPropertyName(Ljava/lang/String;)V

    :cond_81
    move-object/from16 v0, p17

    if-eqz v0, :cond_88

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentPBEConfig;->setProviderClassName(Ljava/lang/String;)V

    :cond_88
    move-object/from16 v0, p21

    if-eqz v0, :cond_8f

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->setStringOutputTypeEnvName(Ljava/lang/String;)V

    :cond_8f
    move-object/from16 v0, p22

    if-eqz v0, :cond_96

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->setStringOutputTypeSysPropertyName(Ljava/lang/String;)V

    :cond_96
    move-object/from16 v0, p20

    if-eqz v0, :cond_9d

    invoke-virtual {v1, v0}, Lorg/jasypt/encryption/pbe/config/EnvironmentStringPBEConfig;->setStringOutputType(Ljava/lang/String;)V

    :cond_9d
    new-instance v0, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;

    invoke-direct {v0}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;-><init>()V

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->setConfig(Lorg/jasypt/encryption/pbe/config/PBEConfig;)V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lorg/jasypt/encryption/pbe/StandardPBEStringEncryptor;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
