.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic げつ〴ぬぐ:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    :try_start_9
    const-string v0, "Ka>\u001bal\u001a4=\u001e6mH1:IgfAahI1j\u0019bhI7kMj"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;
    :try_end_16
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_9 .. :try_end_16} :catch_17

    goto :goto_1c

    :catch_17
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    :goto_1c
    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    return-void
.end method
