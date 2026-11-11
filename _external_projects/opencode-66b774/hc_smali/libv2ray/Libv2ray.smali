.class public abstract Llibv2ray/Libv2ray;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llibv2ray/Libv2ray$proxyV2RayVPNServiceSupportsSet;
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .registers 0

    invoke-static {}, Lgo/Seq;->touch()V

    invoke-static {}, Llibv2ray/Libv2ray;->_init()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _init()V
.end method

.method public static native checkVersion()J
.end method

.method public static native checkVersionX()Ljava/lang/String;
.end method

.method public static native initV2Env(Ljava/lang/String;)V
.end method

.method public static native newV2RayPoint(Llibv2ray/V2RayVPNServiceSupportsSet;)Llibv2ray/V2RayPoint;
.end method

.method public static native testConfig(Ljava/lang/String;)V
.end method

.method public static touch()V
    .registers 0

    return-void
.end method
