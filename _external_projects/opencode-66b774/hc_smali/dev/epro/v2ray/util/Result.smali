.class public Ldev/epro/v2ray/util/Result;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public content:Ljava/lang/String;

.field public status:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/epro/v2ray/util/Result;->status:Ljava/lang/Boolean;

    iput-object p2, p0, Ldev/epro/v2ray/util/Result;->content:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/Result;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/Boolean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/Result;->status:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setContent(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/Result;->content:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/Result;->status:Ljava/lang/Boolean;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "Result{status="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/util/Result;->status:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", content=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/util/Result;->content:Ljava/lang/String;

    const/16 v2, 0x27

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
