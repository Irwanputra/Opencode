.class public final L〳ぜぞぜべっ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〳ぜぞぜべっ:Ljava/net/Proxy;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final 〺つふすそ:L〳ぜぞぜべっ/てぜきぽく;

.field public final ぁごぐすすぃ:Ljava/net/ProxySelector;

.field public final いいにぽつ:Ljavax/net/ssl/HostnameVerifier;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljavax/net/SocketFactory;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

.field public final づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3076\u3067\u306b\u304f\u303c\u3033;",
            ">;"
        }
    .end annotation
.end field

.field public final なぎぱいぢぎ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:L〳ぜぞぜべっ/〺つふすそ;

.field public final ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;IL〳ぜぞぜべっ/てぜきぽく;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;L〳ぜぞぜべっ/づざかべべ;L〳ぜぞぜべっ/〺つふすそ;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .registers 26
    .param p5    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljavax/net/ssl/HostnameVerifier;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # L〳ぜぞぜべっ/づざかべべ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/net/Proxy;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f;",
            "Ljavax/net/SocketFactory;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Ljavax/net/ssl/HostnameVerifier;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u303a\u3064\u3075\u3059\u305d;",
            "Ljava/net/Proxy;",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3076\u3067\u306b\u304f\u303c\u3033;",
            ">;",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063;",
            ">;",
            "Ljava/net/ProxySelector;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;

    invoke-direct {v8}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;-><init>()V

    const-string v9, "https"

    const-string v10, "http"

    if-eqz v5, :cond_1d

    move-object v11, v9

    goto :goto_1e

    :cond_1d
    move-object v11, v10

    .line 1
    :goto_1e
    invoke-virtual {v11, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_26

    move-object v9, v10

    goto :goto_2c

    :cond_26
    invoke-virtual {v11, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_cf

    :goto_2c
    iput-object v9, v8, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    if-eqz v1, :cond_c7

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    .line 3
    invoke-static {p1, v10, v9, v10}, L〳ぜぞぜべっ/ざとぅぼこ〺;->てぜきぽく(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_bb

    .line 4
    iput-object v9, v8, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    if-lez v2, :cond_af

    const v1, 0xffff

    if-gt v2, v1, :cond_af

    .line 5
    iput v2, v8, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->づざかべべ:I

    .line 6
    invoke-virtual {v8}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/ざとぅぼこ〺;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    if-eqz v3, :cond_a7

    iput-object v3, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/てぜきぽく;

    if-eqz v4, :cond_9f

    iput-object v4, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Ljavax/net/SocketFactory;

    if-eqz v6, :cond_97

    iput-object v6, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/〺つふすそ;

    if-eqz p10, :cond_8f

    invoke-static/range {p10 .. p10}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    if-eqz p11, :cond_87

    invoke-static/range {p11 .. p11}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    if-eqz v7, :cond_7f

    iput-object v7, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    move-object/from16 v1, p9

    iput-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    iput-object v5, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    move-object/from16 v1, p6

    iput-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ:Ljavax/net/ssl/HostnameVerifier;

    move-object/from16 v1, p7

    iput-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;

    return-void

    :cond_7f
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "proxySelector == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_87
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "connectionSpecs == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8f
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "protocols == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_97
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "proxyAuthenticator == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9f
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "socketFactory == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a7
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "dns == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 7
    :cond_af
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "unexpected port: "

    invoke-static {v3, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 8
    :cond_bb
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "unexpected host: "

    invoke-static {v3, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c7
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "host == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_cf
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "unexpected scheme: "

    invoke-static {v2, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;

    if-eqz v0, :cond_18

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    check-cast p1, L〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {p0, p1}, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ(L〳ぜぞぜべっ/げつ〴ぬぐ;)Z

    move-result p1

    if-eqz p1, :cond_18

    const/4 p1, 0x1

    goto :goto_19

    :cond_18
    const/4 p1, 0x0

    :goto_19
    return p1
.end method

.method public hashCode()I
    .registers 4

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ざとぅぼこ〺;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/てぜきぽく;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/〺つふすそ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    const/4 v2, 0x0

    if-eqz v0, :cond_41

    invoke-virtual {v0}, Ljava/net/Proxy;->hashCode()I

    move-result v0

    goto :goto_42

    :cond_41
    const/4 v0, 0x0

    :goto_42
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_4e

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_4f

    :cond_4e
    const/4 v0, 0x0

    :goto_4f
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ:Ljavax/net/ssl/HostnameVerifier;

    if-eqz v0, :cond_5b

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_5c

    :cond_5b
    const/4 v0, 0x0

    :goto_5c
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;

    if-eqz v0, :cond_67

    invoke-virtual {v0}, L〳ぜぞぜべっ/づざかべべ;->hashCode()I

    move-result v2

    :cond_67
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "Address{"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 1
    iget-object v1, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 3
    iget v1, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    if-eqz v1, :cond_25

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    goto :goto_2c

    :cond_25
    const-string v1, ", proxySelector="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    :goto_2c
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(L〳ぜぞぜべっ/げつ〴ぬぐ;)Z
    .registers 4

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/てぜきぽく;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/てぜきぽく;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/〺つふすそ;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/〺つふすそ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/net/ProxySelector;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/net/Proxy;

    invoke-static {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;

    iget-object v1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;

    invoke-static {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    .line 1
    iget-object v0, p0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 2
    iget v0, v0, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 3
    iget-object p1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 4
    iget p1, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    if-ne v0, p1, :cond_66

    const/4 p1, 0x1

    goto :goto_67

    :cond_66
    const/4 p1, 0x0

    :goto_67
    return p1
.end method
