.class public final L〳ぜぞぜべっ/ぇぬぎばつ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/なぎぱいぢぎ;

.field public final くし〴〺ぅ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/ぺづげぺが;

.field public final びぐびあび:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぺづげぺが;L〳ぜぞぜべっ/なぎぱいぢぎ;Ljava/util/List;Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u307a\u3065\u3052\u307a\u304c;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u306a\u304e\u3071\u3044\u3062\u304e;",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぺづげぺが;

    iput-object p2, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->〺つふすそ:L〳ぜぞぜべっ/なぎぱいぢぎ;

    iput-object p3, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    iput-object p4, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->びぐびあび:Ljava/util/List;

    return-void
.end method

.method public static げつ〴ぬぐ(Ljavax/net/ssl/SSLSession;)L〳ぜぞぜべっ/ぇぬぎばつ;
    .registers 5

    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_42

    invoke-static {v0}, L〳ぜぞぜべっ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/なぎぱいぢぎ;

    move-result-object v0

    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3a

    invoke-static {v1}, L〳ぜぞぜべっ/ぺづげぺが;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ぺづげぺが;

    move-result-object v1

    :try_start_14
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v2
    :try_end_18
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_14 .. :try_end_18} :catch_19

    goto :goto_1a

    :catch_19
    const/4 v2, 0x0

    :goto_1a
    if-eqz v2, :cond_21

    invoke-static {v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぇぬぎばつ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_25

    :cond_21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_25
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object p0

    if-eqz p0, :cond_30

    invoke-static {p0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぇぬぎばつ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_34

    :cond_30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    :goto_34
    new-instance v3, L〳ぜぞぜべっ/ぇぬぎばつ;

    invoke-direct {v3, v1, v0, v2, p0}, L〳ぜぞぜべっ/ぇぬぎばつ;-><init>(L〳ぜぞぜべっ/ぺづげぺが;L〳ぜぞぜべっ/なぎぱいぢぎ;Ljava/util/List;Ljava/util/List;)V

    return-object v3

    :cond_3a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "tlsVersion == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_42
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "cipherSuite == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, L〳ぜぞぜべっ/ぇぬぎばつ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, L〳ぜぞぜべっ/ぇぬぎばつ;

    iget-object v0, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぺづげぺが;

    iget-object v2, p1, L〳ぜぞぜべっ/ぇぬぎばつ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぺづげぺが;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    iget-object v0, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->〺つふすそ:L〳ぜぞぜべっ/なぎぱいぢぎ;

    iget-object v2, p1, L〳ぜぞぜべっ/ぇぬぎばつ;->〺つふすそ:L〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    iget-object v0, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    iget-object v2, p1, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    iget-object v0, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->びぐびあび:Ljava/util/List;

    iget-object p1, p1, L〳ぜぞぜべっ/ぇぬぎばつ;->びぐびあび:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    const/4 v1, 0x1

    :cond_31
    return v1
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぺづげぺが;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->〺つふすそ:L〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/ぇぬぎばつ;->びぐびあび:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
