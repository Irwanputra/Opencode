.class public final enum Ldev/epro/v2ray/util/EConfigType;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldev/epro/v2ray/util/EConfigType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldev/epro/v2ray/util/EConfigType;

.field public static final enum CUSTOM:Ldev/epro/v2ray/util/EConfigType;

.field public static final enum SHADOWSOCKS:Ldev/epro/v2ray/util/EConfigType;

.field public static final enum SOCKS:Ldev/epro/v2ray/util/EConfigType;

.field public static final enum VMESS:Ldev/epro/v2ray/util/EConfigType;


# instance fields
.field public value:I


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    new-instance v0, Ldev/epro/v2ray/util/EConfigType;

    const-string v1, "VMESS"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ldev/epro/v2ray/util/EConfigType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldev/epro/v2ray/util/EConfigType;->VMESS:Ldev/epro/v2ray/util/EConfigType;

    new-instance v1, Ldev/epro/v2ray/util/EConfigType;

    const-string v4, "CUSTOM"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Ldev/epro/v2ray/util/EConfigType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ldev/epro/v2ray/util/EConfigType;->CUSTOM:Ldev/epro/v2ray/util/EConfigType;

    new-instance v4, Ldev/epro/v2ray/util/EConfigType;

    const-string v6, "SHADOWSOCKS"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Ldev/epro/v2ray/util/EConfigType;-><init>(Ljava/lang/String;II)V

    sput-object v4, Ldev/epro/v2ray/util/EConfigType;->SHADOWSOCKS:Ldev/epro/v2ray/util/EConfigType;

    new-instance v6, Ldev/epro/v2ray/util/EConfigType;

    const-string v8, "SOCKS"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Ldev/epro/v2ray/util/EConfigType;-><init>(Ljava/lang/String;II)V

    sput-object v6, Ldev/epro/v2ray/util/EConfigType;->SOCKS:Ldev/epro/v2ray/util/EConfigType;

    new-array v8, v9, [Ldev/epro/v2ray/util/EConfigType;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Ldev/epro/v2ray/util/EConfigType;->$VALUES:[Ldev/epro/v2ray/util/EConfigType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ldev/epro/v2ray/util/EConfigType;->value:I

    return-void
.end method

.method public static fromInt(I)Ldev/epro/v2ray/util/EConfigType;
    .registers 5

    invoke-static {}, Ldev/epro/v2ray/util/EConfigType;->values()[Ldev/epro/v2ray/util/EConfigType;

    move-result-object v0

    const/4 v1, 0x0

    :goto_5
    const/4 v2, 0x4

    if-ge v1, v2, :cond_12

    aget-object v2, v0, v1

    iget v3, v2, Ldev/epro/v2ray/util/EConfigType;->value:I

    if-ne v3, p0, :cond_f

    return-object v2

    :cond_f
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ldev/epro/v2ray/util/EConfigType;
    .registers 2

    const-class v0, Ldev/epro/v2ray/util/EConfigType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/util/EConfigType;

    return-object p0
.end method

.method public static values()[Ldev/epro/v2ray/util/EConfigType;
    .registers 1

    sget-object v0, Ldev/epro/v2ray/util/EConfigType;->$VALUES:[Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v0}, [Ldev/epro/v2ray/util/EConfigType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldev/epro/v2ray/util/EConfigType;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/util/EConfigType;->value:I

    return v0
.end method
