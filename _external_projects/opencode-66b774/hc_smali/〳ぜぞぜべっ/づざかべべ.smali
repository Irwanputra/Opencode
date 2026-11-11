.class public final L〳ぜぞぜべっ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/づざかべべ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final くし〴〺ぅ:L〳ぜぞぜべっ/づざかべべ;


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final げつ〴ぬぐ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, L〳ぜぞぜべっ/づざかべべ;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    const/4 v0, 0x0

    invoke-direct {v1, v2, v0}, L〳ぜぞぜべっ/づざかべべ;-><init>(Ljava/util/Set;L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;)V

    .line 3
    sput-object v1, L〳ぜぞぜべっ/づざかべべ;->くし〴〺ぅ:L〳ぜぞぜべっ/づざかべべ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;)V
    .registers 3
    .param p2    # L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079$\u3052\u3064\u3034\u306c\u3050;",
            ">;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3066\u305c\u304d\u307d\u304f/\u304f\u3057\u3034\u303a\u3045;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/util/Set;

    iput-object p2, p0, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;

    return-void
.end method

.method public static 〺つふすそ(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .registers 3

    instance-of v0, p0, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_2a

    const-string v0, "sha256/"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 1
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p0

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object p0

    invoke-static {p0}, Lぺぁあねじ/〳ぜぞぜべっ;->〳ぜぞぜべっ([B)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p0

    const-string v1, "SHA-256"

    .line 2
    invoke-virtual {p0, v1}, Lぺぁあねじ/〳ぜぞぜべっ;->びぐびあび(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Lぺぁあねじ/〳ぜぞぜべっ;->げつ〴ぬぐ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Certificate pinning requires X509 certificates"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, L〳ぜぞぜべっ/づざかべべ;

    if-eqz v1, :cond_1f

    iget-object v1, p0, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;

    check-cast p1, L〳ぜぞぜべっ/づざかべべ;

    iget-object v2, p1, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;

    invoke-static {v1, v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    iget-object v1, p0, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/util/Set;

    iget-object p1, p1, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1f

    goto :goto_20

    :cond_1f
    const/4 v0, 0x0

    :goto_20
    return v0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;Ljava/util/List;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_a1

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_18

    return-void

    :cond_18
    iget-object v1, p0, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;

    if-eqz v1, :cond_20

    invoke-virtual {v1, p2, p1}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    :cond_20
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_26
    if-ge v4, v1, :cond_41

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/security/cert/X509Certificate;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_37

    add-int/lit8 v4, v4, 0x1

    goto :goto_26

    :cond_37
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, L〳ぜぞぜべっ/づざかべべ$げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3

    :cond_41
    const-string v1, "Certificate pinning failure!"

    const-string v3, "\n  Peer certificate chain:"

    invoke-static {v1, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_4e
    const-string v5, "\n    "

    if-ge v4, v3, :cond_75

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v5

    invoke-interface {v5}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_4e

    :cond_75
    const-string p2, "\n  Pinned certificates for "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    :goto_86
    if-ge v2, p1, :cond_97

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, L〳ぜぞぜべっ/づざかべべ$げつ〴ぬぐ;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_86

    :cond_97
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_a1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, L〳ぜぞぜべっ/づざかべべ$げつ〴ぬぐ;

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_ac

    :goto_ab
    throw v3

    :goto_ac
    goto :goto_ab
.end method
