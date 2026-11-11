.class public Ldev/epro/v2ray/model/outbounds/MuxObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public concurrency:I

.field public enabled:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConcurrency()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/outbounds/MuxObject;->concurrency:I

    return v0
.end method

.method public getEnabled()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/outbounds/MuxObject;->enabled:Z

    return v0
.end method

.method public setConcurrency(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/outbounds/MuxObject;->concurrency:I

    return-void
.end method

.method public setEnabled(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/outbounds/MuxObject;->enabled:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "MuxObject{enabled="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ldev/epro/v2ray/model/outbounds/MuxObject;->enabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", concurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/outbounds/MuxObject;->concurrency:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
