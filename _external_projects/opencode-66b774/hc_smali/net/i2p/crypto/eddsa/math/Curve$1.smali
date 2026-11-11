.class public synthetic Lnet/i2p/crypto/eddsa/math/Curve$1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/i2p/crypto/eddsa/math/Curve;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field public static final synthetic $SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    invoke-static {}, Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;->values()[Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;

    const/4 v0, 0x6

    new-array v0, v0, [I

    sput-object v0, Lnet/i2p/crypto/eddsa/math/Curve$1;->$SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation:[I

    const/4 v1, 0x1

    :try_start_9
    sget-object v2, Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;->P2:Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;

    const/4 v2, 0x0

    aput v1, v0, v2
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_e} :catch_e

    :catch_e
    const/4 v0, 0x2

    :try_start_f
    sget-object v2, Lnet/i2p/crypto/eddsa/math/Curve$1;->$SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation:[I

    sget-object v3, Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;->P3:Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;

    aput v0, v2, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_15} :catch_15

    :catch_15
    :try_start_15
    sget-object v1, Lnet/i2p/crypto/eddsa/math/Curve$1;->$SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation:[I

    sget-object v2, Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;->P3PrecomputedDouble:Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;

    const/4 v2, 0x3

    aput v2, v1, v0
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_1c} :catch_1c

    :catch_1c
    :try_start_1c
    sget-object v0, Lnet/i2p/crypto/eddsa/math/Curve$1;->$SwitchMap$net$i2p$crypto$eddsa$math$GroupElement$Representation:[I

    sget-object v1, Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;->PRECOMP:Lnet/i2p/crypto/eddsa/math/GroupElement$Representation;

    const/4 v1, 0x4

    aput v1, v0, v1
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_23} :catch_23

    :catch_23
    return-void
.end method
