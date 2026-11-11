.class public Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public request:Ldev/epro/v2ray/model/transport/tcp/HTTPRequestObject;

.field public response:Ldev/epro/v2ray/model/transport/tcp/HTTPResponseObject;

.field public type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRequest()Ldev/epro/v2ray/model/transport/tcp/HTTPRequestObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->request:Ldev/epro/v2ray/model/transport/tcp/HTTPRequestObject;

    return-object v0
.end method

.method public getResponse()Ldev/epro/v2ray/model/transport/tcp/HTTPResponseObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->response:Ldev/epro/v2ray/model/transport/tcp/HTTPResponseObject;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setRequest(Ldev/epro/v2ray/model/transport/tcp/HTTPRequestObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->request:Ldev/epro/v2ray/model/transport/tcp/HTTPRequestObject;

    return-void
.end method

.method public setResponse(Ldev/epro/v2ray/model/transport/tcp/HTTPResponseObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->response:Ldev/epro/v2ray/model/transport/tcp/HTTPResponseObject;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->type:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "HttpHeaderObject{type=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->type:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", request="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->request:Ldev/epro/v2ray/model/transport/tcp/HTTPRequestObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tcp/HttpHeaderObject;->response:Ldev/epro/v2ray/model/transport/tcp/HTTPResponseObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
