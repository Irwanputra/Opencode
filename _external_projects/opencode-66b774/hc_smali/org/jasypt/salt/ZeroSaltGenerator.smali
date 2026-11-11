.class public Lorg/jasypt/salt/ZeroSaltGenerator;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/jasypt/salt/SaltGenerator;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateSalt(I)[B
    .registers 3

    new-array p1, p1, [B

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([BB)V

    return-object p1
.end method

.method public includePlainSaltInEncryptionResults()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method
