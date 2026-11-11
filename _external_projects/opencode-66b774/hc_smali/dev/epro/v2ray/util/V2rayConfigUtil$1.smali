.class public synthetic Ldev/epro/v2ray/util/V2rayConfigUtil$1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/epro/v2ray/util/V2rayConfigUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field public static final synthetic $SwitchMap$dev$epro$v2ray$util$EConfigType:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    invoke-static {}, Ldev/epro/v2ray/util/EConfigType;->values()[Ldev/epro/v2ray/util/EConfigType;

    const/4 v0, 0x4

    new-array v0, v0, [I

    sput-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil$1;->$SwitchMap$dev$epro$v2ray$util$EConfigType:[I

    :try_start_8
    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->VMESS:Ldev/epro/v2ray/util/EConfigType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_e} :catch_e

    :catch_e
    :try_start_e
    sget-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil$1;->$SwitchMap$dev$epro$v2ray$util$EConfigType:[I

    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->SHADOWSOCKS:Ldev/epro/v2ray/util/EConfigType;

    const/4 v1, 0x2

    aput v1, v0, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_15} :catch_15

    :catch_15
    :try_start_15
    sget-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil$1;->$SwitchMap$dev$epro$v2ray$util$EConfigType:[I

    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->SOCKS:Ldev/epro/v2ray/util/EConfigType;

    const/4 v1, 0x3

    aput v1, v0, v1
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_1c} :catch_1c

    :catch_1c
    return-void
.end method
