.class public final enum L〳ぜぞぜべっ/ぺづげぺが;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "L\u3033\u305c\u305e\u305c\u3079\u3063/\u307a\u3065\u3052\u307a\u304c;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic 〳ぜぞぜべっ:[L〳ぜぞぜべっ/ぺづげぺが;

.field public static final enum ぁごぐすすぃ:L〳ぜぞぜべっ/ぺづげぺが;

.field public static final enum くし〴〺ぅ:L〳ぜぞぜべっ/ぺづげぺが;

.field public static final enum づざかべべ:L〳ぜぞぜべっ/ぺづげぺが;

.field public static final enum なぎぱいぢぎ:L〳ぜぞぜべっ/ぺづげぺが;

.field public static final enum びぐびあび:L〳ぜぞぜべっ/ぺづげぺが;


# instance fields
.field public final 〺つふすそ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 12

    new-instance v0, L〳ぜぞぜべっ/ぺづげぺが;

    const-string v1, "TLS_1_3"

    const/4 v2, 0x0

    const-string v3, "TLSv1.3"

    invoke-direct {v0, v1, v2, v3}, L〳ぜぞぜべっ/ぺづげぺが;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, L〳ぜぞぜべっ/ぺづげぺが;->くし〴〺ぅ:L〳ぜぞぜべっ/ぺづげぺが;

    new-instance v1, L〳ぜぞぜべっ/ぺづげぺが;

    const-string v3, "TLS_1_2"

    const/4 v4, 0x1

    const-string v5, "TLSv1.2"

    invoke-direct {v1, v3, v4, v5}, L〳ぜぞぜべっ/ぺづげぺが;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, L〳ぜぞぜべっ/ぺづげぺが;->びぐびあび:L〳ぜぞぜべっ/ぺづげぺが;

    new-instance v3, L〳ぜぞぜべっ/ぺづげぺが;

    const-string v5, "TLS_1_1"

    const/4 v6, 0x2

    const-string v7, "TLSv1.1"

    invoke-direct {v3, v5, v6, v7}, L〳ぜぞぜべっ/ぺづげぺが;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, L〳ぜぞぜべっ/ぺづげぺが;->づざかべべ:L〳ぜぞぜべっ/ぺづげぺが;

    new-instance v5, L〳ぜぞぜべっ/ぺづげぺが;

    const-string v7, "TLS_1_0"

    const/4 v8, 0x3

    const-string v9, "TLSv1"

    invoke-direct {v5, v7, v8, v9}, L〳ぜぞぜべっ/ぺづげぺが;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, L〳ぜぞぜべっ/ぺづげぺが;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぺづげぺが;

    new-instance v7, L〳ぜぞぜべっ/ぺづげぺが;

    const-string v9, "SSL_3_0"

    const/4 v10, 0x4

    const-string v11, "SSLv3"

    invoke-direct {v7, v9, v10, v11}, L〳ぜぞぜべっ/ぺづげぺが;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, L〳ぜぞぜべっ/ぺづげぺが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぺづげぺが;

    const/4 v9, 0x5

    new-array v9, v9, [L〳ぜぞぜべっ/ぺづげぺが;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, L〳ぜぞぜべっ/ぺづげぺが;->〳ぜぞぜべっ:[L〳ぜぞぜべっ/ぺづげぺが;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, L〳ぜぞぜべっ/ぺづげぺが;->〺つふすそ:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)L〳ぜぞぜべっ/ぺづげぺが;
    .registers 2

    const-class v0, L〳ぜぞぜべっ/ぺづげぺが;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, L〳ぜぞぜべっ/ぺづげぺが;

    return-object p0
.end method

.method public static values()[L〳ぜぞぜべっ/ぺづげぺが;
    .registers 1

    sget-object v0, L〳ぜぞぜべっ/ぺづげぺが;->〳ぜぞぜべっ:[L〳ぜぞぜべっ/ぺづげぺが;

    invoke-virtual {v0}, [L〳ぜぞぜべっ/ぺづげぺが;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L〳ぜぞぜべっ/ぺづげぺが;

    return-object v0
.end method

.method public static げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ぺづげぺが;
    .registers 3

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_64

    goto :goto_45

    :sswitch_f
    const-string v1, "TLSv1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_45

    :cond_18
    const/4 v0, 0x4

    goto :goto_45

    :sswitch_1a
    const-string v1, "SSLv3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto :goto_45

    :cond_23
    const/4 v0, 0x3

    goto :goto_45

    :sswitch_25
    const-string v1, "TLSv1.3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto :goto_45

    :cond_2e
    const/4 v0, 0x2

    goto :goto_45

    :sswitch_30
    const-string v1, "TLSv1.2"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    goto :goto_45

    :cond_39
    const/4 v0, 0x1

    goto :goto_45

    :sswitch_3b
    const-string v1, "TLSv1.1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    goto :goto_45

    :cond_44
    const/4 v0, 0x0

    :goto_45
    packed-switch v0, :pswitch_data_7a

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected TLS version: "

    invoke-static {v1, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_54
    sget-object p0, L〳ぜぞぜべっ/ぺづげぺが;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぺづげぺが;

    return-object p0

    :pswitch_57
    sget-object p0, L〳ぜぞぜべっ/ぺづげぺが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぺづげぺが;

    return-object p0

    :pswitch_5a
    sget-object p0, L〳ぜぞぜべっ/ぺづげぺが;->くし〴〺ぅ:L〳ぜぞぜべっ/ぺづげぺが;

    return-object p0

    :pswitch_5d
    sget-object p0, L〳ぜぞぜべっ/ぺづげぺが;->びぐびあび:L〳ぜぞぜべっ/ぺづげぺが;

    return-object p0

    :pswitch_60
    sget-object p0, L〳ぜぞぜべっ/ぺづげぺが;->づざかべべ:L〳ぜぞぜべっ/ぺづげぺが;

    return-object p0

    nop

    :sswitch_data_64
    .sparse-switch
        -0x1dfc3f27 -> :sswitch_3b
        -0x1dfc3f26 -> :sswitch_30
        -0x1dfc3f25 -> :sswitch_25
        0x4b88569 -> :sswitch_1a
        0x4c38896 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_7a
    .packed-switch 0x0
        :pswitch_60
        :pswitch_5d
        :pswitch_5a
        :pswitch_57
        :pswitch_54
    .end packed-switch
.end method
