.class public Lorg/jasypt/salt/RandomSaltGenerator;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/salt/SaltGenerator;


# static fields
.field public static final DEFAULT_SECURE_RANDOM_ALGORITHM:Ljava/lang/String; = "SHA1PRNG"


# instance fields
.field private final random:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "SHA1PRNG"

    invoke-direct {p0, v0}, Lorg/jasypt/salt/RandomSaltGenerator;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_3
    invoke-static {p1}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object p1

    iput-object p1, p0, Lorg/jasypt/salt/RandomSaltGenerator;->random:Ljava/security/SecureRandom;
    :try_end_9
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_9} :catch_a

    return-void

    :catch_a
    move-exception p1

    new-instance v0, Lorg/jasypt/exceptions/EncryptionInitializationException;

    invoke-direct {v0, p1}, Lorg/jasypt/exceptions/EncryptionInitializationException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public generateSalt(I)[B
    .registers 4

    new-array p1, p1, [B

    iget-object v0, p0, Lorg/jasypt/salt/RandomSaltGenerator;->random:Ljava/security/SecureRandom;

    monitor-enter v0

    :try_start_5
    iget-object v1, p0, Lorg/jasypt/salt/RandomSaltGenerator;->random:Ljava/security/SecureRandom;

    invoke-virtual {v1, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    monitor-exit v0

    return-object p1

    :catchall_c
    move-exception p1

    monitor-exit v0
    :try_end_e
    .catchall {:try_start_5 .. :try_end_e} :catchall_c

    throw p1
.end method

.method public includePlainSaltInEncryptionResults()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method
