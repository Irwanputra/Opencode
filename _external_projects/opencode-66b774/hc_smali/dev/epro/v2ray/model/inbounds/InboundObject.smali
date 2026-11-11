.class public Ldev/epro/v2ray/model/inbounds/InboundObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public allocate:Ldev/epro/v2ray/model/inbounds/AllocateObject;

.field public listen:Ljava/lang/String;

.field public port:Ljava/lang/String;

.field public protocol:Ljava/lang/String;

.field public settings:Ljava/lang/Object;

.field public sniffing:Ldev/epro/v2ray/model/inbounds/SniffingObject;

.field public streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

.field public tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAllocate()Ldev/epro/v2ray/model/inbounds/AllocateObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->allocate:Ldev/epro/v2ray/model/inbounds/AllocateObject;

    return-object v0
.end method

.method public getListen()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->listen:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->port:Ljava/lang/String;

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getSettings()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->settings:Ljava/lang/Object;

    return-object v0
.end method

.method public getSniffing()Ldev/epro/v2ray/model/inbounds/SniffingObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->sniffing:Ldev/epro/v2ray/model/inbounds/SniffingObject;

    return-object v0
.end method

.method public getStreamSettings()Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public setAllocate(Ldev/epro/v2ray/model/inbounds/AllocateObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->allocate:Ldev/epro/v2ray/model/inbounds/AllocateObject;

    return-void
.end method

.method public setListen(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->listen:Ljava/lang/String;

    return-void
.end method

.method public setPort(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->port:Ljava/lang/String;

    return-void
.end method

.method public setProtocol(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->protocol:Ljava/lang/String;

    return-void
.end method

.method public setSettings(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->settings:Ljava/lang/Object;

    return-void
.end method

.method public setSniffing(Ldev/epro/v2ray/model/inbounds/SniffingObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->sniffing:Ldev/epro/v2ray/model/inbounds/SniffingObject;

    return-void
.end method

.method public setStreamSettings(Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->tag:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "InboundObject{port=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->port:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", listen=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->listen:Ljava/lang/String;

    const-string v3, ", protocol=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->protocol:Ljava/lang/String;

    const-string v3, ", settings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->settings:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streamSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->tag:Ljava/lang/String;

    const-string v3, ", sniffing="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->sniffing:Ldev/epro/v2ray/model/inbounds/SniffingObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allocate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/InboundObject;->allocate:Ldev/epro/v2ray/model/inbounds/AllocateObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
