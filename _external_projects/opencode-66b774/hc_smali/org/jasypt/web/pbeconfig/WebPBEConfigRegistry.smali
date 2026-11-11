.class public final Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final instance:Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;


# instance fields
.field private final configs:Ljava/util/List;

.field private final names:Ljava/util/Set;

.field private webConfigurationDone:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;

    invoke-direct {v0}, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;-><init>()V

    sput-object v0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->instance:Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->names:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->configs:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->webConfigurationDone:Z

    return-void
.end method

.method public static getInstance()Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;
    .registers 1

    sget-object v0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->instance:Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized getConfigs()Ljava/util/List;
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->configs:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_9

    monitor-exit p0

    return-object v0

    :catchall_9
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isWebConfigurationDone()Z
    .registers 2

    iget-boolean v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->webConfigurationDone:Z

    if-nez v0, :cond_f

    iget-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->configs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_d

    goto :goto_f

    :cond_d
    const/4 v0, 0x0

    goto :goto_10

    :cond_f
    :goto_f
    const/4 v0, 0x1

    :goto_10
    return v0
.end method

.method public declared-synchronized registerConfig(Lorg/jasypt/encryption/pbe/config/WebPBEConfig;)V
    .registers 4

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->webConfigurationDone:Z

    if-nez v0, :cond_1d

    iget-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->names:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/jasypt/encryption/pbe/config/WebPBEConfig;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->configs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->names:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1b
    .catchall {:try_start_1 .. :try_end_1b} :catchall_25

    :cond_1b
    monitor-exit p0

    return-void

    :cond_1d
    :try_start_1d
    new-instance p1, Lorg/jasypt/exceptions/EncryptionInitializationException;

    const-string v0, "Cannot register: Web configuration is already done"

    invoke-direct {p1, v0}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_25
    .catchall {:try_start_1d .. :try_end_25} :catchall_25

    :catchall_25
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setWebConfigurationDone(Z)V
    .registers 2

    iput-boolean p1, p0, Lorg/jasypt/web/pbeconfig/WebPBEConfigRegistry;->webConfigurationDone:Z

    return-void
.end method
