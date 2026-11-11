.class public Ldev/epro/v2ray/model/inbounds/AllocateObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public concurrency:I

.field public refresh:I

.field public strategy:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConcurrency()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->concurrency:I

    return v0
.end method

.method public getRefresh()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->refresh:I

    return v0
.end method

.method public getStrategy()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->strategy:Ljava/lang/String;

    return-object v0
.end method

.method public setConcurrency(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->concurrency:I

    return-void
.end method

.method public setRefresh(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->refresh:I

    return-void
.end method

.method public setStrategy(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->strategy:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "AllocateObject{strategy=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->strategy:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", refresh="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->refresh:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", concurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/inbounds/AllocateObject;->concurrency:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
