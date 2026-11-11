.class public Ldev/epro/v2ray/model/protocols/blackhole/OutboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public response:Ldev/epro/v2ray/model/protocols/blackhole/ResponseObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getResponse()Ldev/epro/v2ray/model/protocols/blackhole/ResponseObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/blackhole/OutboundConfigurationObject;->response:Ldev/epro/v2ray/model/protocols/blackhole/ResponseObject;

    return-object v0
.end method

.method public setResponse(Ldev/epro/v2ray/model/protocols/blackhole/ResponseObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/blackhole/OutboundConfigurationObject;->response:Ldev/epro/v2ray/model/protocols/blackhole/ResponseObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "ConfigurationObject{response="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/blackhole/OutboundConfigurationObject;->response:Ldev/epro/v2ray/model/protocols/blackhole/ResponseObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
