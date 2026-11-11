.class public Ldev/epro/v2ray/model/outbounds/OutboundObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public mux:Ldev/epro/v2ray/model/outbounds/MuxObject;

.field public protocol:Ljava/lang/String;

.field public proxySettings:Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;

.field public sendThrough:Ljava/lang/String;

.field public settings:Ljava/lang/Object;

.field public streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

.field public tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMux()Ldev/epro/v2ray/model/outbounds/MuxObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->mux:Ldev/epro/v2ray/model/outbounds/MuxObject;

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getProxySettings()Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->proxySettings:Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;

    return-object v0
.end method

.method public getSendThrough()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->sendThrough:Ljava/lang/String;

    return-object v0
.end method

.method public getSettings()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->settings:Ljava/lang/Object;

    return-object v0
.end method

.method public getStreamSettings()Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public setMux(Ldev/epro/v2ray/model/outbounds/MuxObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->mux:Ldev/epro/v2ray/model/outbounds/MuxObject;

    return-void
.end method

.method public setProtocol(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->protocol:Ljava/lang/String;

    return-void
.end method

.method public setProxySettings(Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->proxySettings:Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;

    return-void
.end method

.method public setSendThrough(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->sendThrough:Ljava/lang/String;

    return-void
.end method

.method public setSettings(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->settings:Ljava/lang/Object;

    return-void
.end method

.method public setStreamSettings(Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->tag:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "OutboundObject{sendThrough=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->sendThrough:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", protocol=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->protocol:Ljava/lang/String;

    const-string v3, ", settings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->settings:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->tag:Ljava/lang/String;

    const-string v3, ", streamSettings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->streamSettings:Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", proxySettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->proxySettings:Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mux="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/outbounds/OutboundObject;->mux:Ldev/epro/v2ray/model/outbounds/MuxObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
