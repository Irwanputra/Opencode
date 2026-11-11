.class public Ldev/epro/v2ray/bean/outbounds/OutboundBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public mux:Ldev/epro/v2ray/bean/outbounds/MuxBean;

.field public protocol:Ljava/lang/String;

.field public settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

.field public streamSettings:Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

.field public tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMux()Ldev/epro/v2ray/bean/outbounds/MuxBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->mux:Ldev/epro/v2ray/bean/outbounds/MuxBean;

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getServerAddress()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->VMESS:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_24

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getVnext()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_24
    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    sget-object v2, Ldev/epro/v2ray/util/EConfigType;->SHADOWSOCKS:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4b

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    sget-object v2, Ldev/epro/v2ray/util/EConfigType;->SOCKS:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_49

    goto :goto_4b

    :cond_49
    const/4 v0, 0x0

    return-object v0

    :cond_4b
    :goto_4b
    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getServers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServerPort()Ljava/lang/Integer;
    .registers 4

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->VMESS:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_28

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getVnext()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getPort()I

    move-result v0

    :goto_23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_28
    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    sget-object v2, Ldev/epro/v2ray/util/EConfigType;->SHADOWSOCKS:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4f

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    sget-object v2, Ldev/epro/v2ray/util/EConfigType;->SOCKS:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4d

    goto :goto_4f

    :cond_4d
    const/4 v0, 0x0

    return-object v0

    :cond_4f
    :goto_4f
    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getServers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;->getPort()I

    move-result v0

    goto :goto_23
.end method

.method public getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    return-object v0
.end method

.method public getStreamSettings()Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->streamSettings:Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public setMux(Ldev/epro/v2ray/bean/outbounds/MuxBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->mux:Ldev/epro/v2ray/bean/outbounds/MuxBean;

    return-void
.end method

.method public setProtocol(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    return-void
.end method

.method public setSettings(Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    return-void
.end method

.method public setStreamSettings(Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->streamSettings:Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->tag:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "OutboundBean{tag=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->tag:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", protocol=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->protocol:Ljava/lang/String;

    const-string v3, ", settings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->settings:Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streamSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->streamSettings:Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mux="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->mux:Ldev/epro/v2ray/bean/outbounds/MuxBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
