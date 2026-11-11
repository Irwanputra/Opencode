.class public Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public request:Ljava/lang/Object;

.field public response:Ljava/lang/Object;

.field public type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "none"

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->type:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getRequest()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->request:Ljava/lang/Object;

    return-object v0
.end method

.method public getResponse()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->response:Ljava/lang/Object;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setRequest(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->request:Ljava/lang/Object;

    return-void
.end method

.method public setResponse(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->response:Ljava/lang/Object;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->type:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "HeaderBean{type=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->type:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", request="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->request:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->response:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
