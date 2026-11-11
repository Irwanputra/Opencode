.class public final Lorg/jasypt/intf/cli/CLIUtils;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getArgumentValues(Ljava/lang/String;[Ljava/lang/String;[[Ljava/lang/String;[[Ljava/lang/String;)Ljava/util/Properties;
    .registers 13

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_7
    array-length v3, p2

    if-ge v2, v3, :cond_16

    aget-object v3, p2, v2

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_16
    const/4 v2, 0x0

    :goto_17
    array-length v3, p3

    if-ge v2, v3, :cond_26

    aget-object v3, p3, v2

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_26
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    const/4 v3, 0x0

    :goto_2c
    array-length v4, p1

    const/4 v5, 0x1

    if-ge v3, v4, :cond_a1

    aget-object v4, p1, v3

    const-string v6, "="

    invoke-static {v4, v6}, Lorg/jasypt/commons/CommonUtils;->substringBefore(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aget-object v7, p1, v3

    invoke-static {v7, v6}, Lorg/jasypt/commons/CommonUtils;->substringAfter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    const-string v8, "Bad argument: "

    if-nez v7, :cond_8a

    invoke-static {v6}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_8a

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_73

    const-string v7, "\""

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6d

    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6d

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v5

    invoke-virtual {v6, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_70

    :cond_6d
    invoke-virtual {v2, v4, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :goto_70
    add-int/lit8 v3, v3, 0x1

    goto :goto_2c

    :cond_73
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    aget-object p1, p1, v3

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    aget-object p1, p1, v3

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a1
    const/4 p1, 0x0

    :goto_a2
    array-length v0, p2

    if-ge p1, v0, :cond_c2

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_a7
    aget-object v4, p2, p1

    array-length v4, v4

    if-ge v0, v4, :cond_ba

    aget-object v4, p2, p1

    aget-object v4, v4, v0

    invoke-virtual {v2, v4}, Ljava/util/Properties;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b7

    const/4 v3, 0x1

    :cond_b7
    add-int/lit8 v0, v0, 0x1

    goto :goto_a7

    :cond_ba
    if-nez v3, :cond_bf

    invoke-static {p0, p2, p3}, Lorg/jasypt/intf/cli/CLIUtils;->showUsageAndExit(Ljava/lang/String;[[Ljava/lang/String;[[Ljava/lang/String;)V

    :cond_bf
    add-int/lit8 p1, p1, 0x1

    goto :goto_a2

    :cond_c2
    return-object v2
.end method

.method public static getVerbosity([Ljava/lang/String;)Z
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    array-length v2, p0

    if-ge v1, v2, :cond_36

    aget-object v2, p0, v1

    const-string v3, "="

    invoke-static {v2, v3}, Lorg/jasypt/commons/CommonUtils;->substringBefore(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aget-object v4, p0, v1

    invoke-static {v4, v3}, Lorg/jasypt/commons/CommonUtils;->substringAfter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_33

    invoke-static {v3}, Lorg/jasypt/commons/CommonUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_20

    goto :goto_33

    :cond_20
    const-string v4, "verbose"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-static {v3}, Lorg/jasypt/commons/CommonUtils;->getStandardBooleanValue(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_32

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_32
    return v0

    :cond_33
    :goto_33
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_36
    const/4 p0, 0x1

    return p0
.end method

.method public static showArgumentDescription(Ljava/util/Properties;Z)V
    .registers 4

    if-eqz p1, :cond_38

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/util/Properties;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    goto :goto_c

    :cond_36
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    :cond_38
    return-void
.end method

.method public static showEnvironment(Z)V
    .registers 1

    if-eqz p0, :cond_15

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p0, "java.vm.vendor"

    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    const-string p0, "java.vm.name"

    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    const-string p0, "java.vm.version"

    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    :cond_15
    return-void
.end method

.method public static showError(Ljava/lang/Throwable;Z)V
    .registers 2

    if-eqz p1, :cond_21

    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    instance-of p1, p0, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    if-eqz p1, :cond_9

    goto :goto_1e

    :cond_9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_15

    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto :goto_1e

    :cond_15
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    :goto_1e
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    goto :goto_3d

    :cond_21
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    instance-of p1, p0, Lorg/jasypt/exceptions/EncryptionOperationNotPossibleException;

    if-eqz p1, :cond_28

    goto :goto_3d

    :cond_28
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_34

    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto :goto_3d

    :cond_34
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    :goto_3d
    return-void
.end method

.method public static showOutput(Ljava/lang/String;Z)V
    .registers 2

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    return-void
.end method

.method public static showUsageAndExit(Ljava/lang/String;[[Ljava/lang/String;[[Ljava/lang/String;)V
    .registers 6

    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const/4 p0, 0x0

    const/4 v0, 0x0

    :goto_4
    array-length v1, p1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_2e

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    aget-object v1, p1, v0

    array-length v1, v1

    if-ne v1, v2, :cond_14

    aget-object v1, p1, v0

    aget-object v1, v1, p0

    goto :goto_29

    :cond_14
    const/4 v1, 0x0

    :goto_15
    aget-object v2, p1, v0

    array-length v2, v2

    if-ge v1, v2, :cond_27

    if-lez v1, :cond_1e

    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    :cond_1e
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    aget-object v2, p1, v0

    aget-object v2, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_27
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    :goto_29
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_2e
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const/4 p1, 0x0

    :goto_31
    array-length v0, p2

    if-ge p1, v0, :cond_5a

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    aget-object v0, p2, p1

    array-length v0, v0

    if-ne v0, v2, :cond_40

    aget-object v0, p2, p1

    aget-object v0, v0, p0

    goto :goto_55

    :cond_40
    const/4 v0, 0x0

    :goto_41
    aget-object v1, p2, p1

    array-length v1, v1

    if-ge v0, v1, :cond_53

    if-lez v0, :cond_4a

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    :cond_4a
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    aget-object v1, p2, p1

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_41

    :cond_53
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    :goto_55
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    add-int/lit8 p1, p1, 0x1

    goto :goto_31

    :cond_5a
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    return-void
.end method
