.class public Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

.field public httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

.field public kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

.field public network:Ljava/lang/String;

.field public quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

.field public security:Ljava/lang/String;

.field public sockopt:Ldev/epro/v2ray/model/transport/sock/SockoptObject;

.field public tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

.field public tlsSettings:Ldev/epro/v2ray/model/transport/tls/TLSObject;

.field public wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDsSettings()Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

    return-object v0
.end method

.method public getHttpSettings()Ldev/epro/v2ray/model/transport/http/HttpObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

    return-object v0
.end method

.method public getKcpSettings()Ldev/epro/v2ray/model/transport/kcp/KcpObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

    return-object v0
.end method

.method public getNetwork()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->network:Ljava/lang/String;

    return-object v0
.end method

.method public getQuicSettings()Ldev/epro/v2ray/model/transport/quic/QuicObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

    return-object v0
.end method

.method public getSecurity()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->security:Ljava/lang/String;

    return-object v0
.end method

.method public getSockopt()Ldev/epro/v2ray/model/transport/sock/SockoptObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->sockopt:Ldev/epro/v2ray/model/transport/sock/SockoptObject;

    return-object v0
.end method

.method public getTcpSettings()Ldev/epro/v2ray/model/transport/tcp/TcpObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

    return-object v0
.end method

.method public getTlsSettings()Ldev/epro/v2ray/model/transport/tls/TLSObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->tlsSettings:Ldev/epro/v2ray/model/transport/tls/TLSObject;

    return-object v0
.end method

.method public getWsSettings()Ldev/epro/v2ray/model/transport/ws/WebSocketObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;

    return-object v0
.end method

.method public setDsSettings(Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

    return-void
.end method

.method public setHttpSettings(Ldev/epro/v2ray/model/transport/http/HttpObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

    return-void
.end method

.method public setKcpSettings(Ldev/epro/v2ray/model/transport/kcp/KcpObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

    return-void
.end method

.method public setNetwork(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->network:Ljava/lang/String;

    return-void
.end method

.method public setQuicSettings(Ldev/epro/v2ray/model/transport/quic/QuicObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

    return-void
.end method

.method public setSecurity(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->security:Ljava/lang/String;

    return-void
.end method

.method public setSockopt(Ldev/epro/v2ray/model/transport/sock/SockoptObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->sockopt:Ldev/epro/v2ray/model/transport/sock/SockoptObject;

    return-void
.end method

.method public setTcpSettings(Ldev/epro/v2ray/model/transport/tcp/TcpObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

    return-void
.end method

.method public setTlsSettings(Ldev/epro/v2ray/model/transport/tls/TLSObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->tlsSettings:Ldev/epro/v2ray/model/transport/tls/TLSObject;

    return-void
.end method

.method public setWsSettings(Ldev/epro/v2ray/model/transport/ws/WebSocketObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "StreamSettingsObject{network=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->network:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", security=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->security:Ljava/lang/String;

    const-string v3, ", tlsSettings="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->tlsSettings:Ldev/epro/v2ray/model/transport/tls/TLSObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tcpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", kcpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wsSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", httpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dsSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quicSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sockopt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/inbounds/StreamSettingsObject;->sockopt:Ldev/epro/v2ray/model/transport/sock/SockoptObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
