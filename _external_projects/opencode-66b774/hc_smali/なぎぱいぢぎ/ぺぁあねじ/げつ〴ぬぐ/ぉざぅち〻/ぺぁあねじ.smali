.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぺぁあねじ;
.super Ljava/net/Authenticator;
.source ""


# instance fields
.field public final synthetic げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;)V
    .registers 3

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぺぁあねじ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    return-void
.end method


# virtual methods
.method public getPasswordAuthentication()Ljava/net/PasswordAuthentication;
    .registers 4

    new-instance v0, Ljava/net/PasswordAuthentication;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぺぁあねじ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v1, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/net/PasswordAuthentication;-><init>(Ljava/lang/String;[C)V

    return-object v0
.end method
