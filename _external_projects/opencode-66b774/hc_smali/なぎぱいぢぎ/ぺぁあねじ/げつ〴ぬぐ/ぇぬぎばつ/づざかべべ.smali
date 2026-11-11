.class public abstract Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U::",
        "Ljava/security/PublicKey;",
        "R::",
        "Ljava/security/PrivateKey;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/String;

.field public final くし〴〺ぅ:Ljava/security/Provider;

.field public final げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TR;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->くし〴〺ぅ:Ljava/security/Provider;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/security/Provider;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Ljava/security/Provider;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Ljava/lang/String;

    iput-object p4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->くし〴〺ぅ:Ljava/security/Provider;

    return-void
.end method


# virtual methods
.method public abstract 〺つふすそ([B)[B
.end method

.method public abstract くし〴〺ぅ()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/trilead/ssh2/crypto/CertificateDecoder;",
            ">;"
        }
    .end annotation
.end method

.method public abstract げつ〴ぬぐ([B)Ljava/security/PublicKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TU;"
        }
    .end annotation
.end method
